#!/bin/bash
set -exu

APP=intcomdata
ENV=$1
BUILD=${2-}

main() {
    checkenv
    SCRIPT_PATH="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"
    MODULEDIR="$SCRIPT_PATH/.."

    if [[ ! -d "$MODULEDIR" ]]; then
        echoerr "il modulo $APP non esiste"
        exit -1
    fi

    if [[ "$BUILD" == "--skip-build" ]]; then
        BUILD="N"
    elif [[ -z "$BUILD" ]]; then
        BUILD="Y"
    else
        echoerr "specificare --skip-build come secondo parametro oppure niente"
        exit -1
    fi

    if [[ $BUILD == "Y" ]]; then
        build
    fi

    if [[ $ENV == "prod" ]]; then
        BASE=623333656140
        PROFILE=edison-prod
        ROLE=thr-prod-eks-admin-access
        ROLESESSION=eks-access-prod
        CLUSTER=ewfpgeksuk01
    elif [[ $ENV == "qa" ]]; then
        BASE=549662860827
        PROFILE=edison
        ROLE=thr-qa-eks-admin-access
        ROLESESSION=eks-access-qa
        CLUSTER=ewfqgeksuk01
    else
        BASE=549662860827
        PROFILE=edison
        ROLE=thr-dev-admin-eks-access
        ROLESESSION=eks-access-dev
        CLUSTER=ewfdgeksuk01
    fi

    VERSION=$(cat $MODULEDIR/target/maven-archiver/pom.properties | grep version | cut -d= -f2)
    VERSION=${VERSION}-$(date '+%Y%m%d%H%m%S')

    # il valore va recuperato lanciando aws-create-repo.sh la prima volta
    REPOURI=$BASE.dkr.ecr.eu-central-1.amazonaws.com/thor/$APP-$ENV

    IMAGE=thor/$APP-$ENV

    echo "DEPLOYING $IMAGE VERSION $VERSION"

    aws ecr get-login-password --region eu-central-1 --profile $PROFILE | docker login --username AWS --password-stdin $REPOURI

    docker build -f $MODULEDIR/docker/Dockerfile -t $IMAGE:$VERSION $MODULEDIR

    docker tag $IMAGE:$VERSION $BASE.dkr.ecr.eu-central-1.amazonaws.com/$IMAGE:$VERSION

    docker push $BASE.dkr.ecr.eu-central-1.amazonaws.com/$IMAGE:$VERSION

    aws sts assume-role --role-arn arn:aws:iam::$BASE:role/$ROLE --role-session-name $ROLESESSION --profile $PROFILE > /dev/null

    aws eks --region eu-central-1 update-kubeconfig --kubeconfig ~/.kube/config-thor-$ENV --name $CLUSTER --profile $PROFILE --role arn:aws:iam::$BASE:role/$ROLE

    sed -i -e "s/image:\(.*\):.*/image:\1:${VERSION}/" $MODULEDIR/aws/deployment-$ENV.yaml

    kubectl apply --kubeconfig ~/.kube/config-thor-$ENV -f $MODULEDIR/aws/deployment-$ENV.yaml --namespace thr-$ENV
}

build() {
    $MODULEDIR/mvnw -T2C clean package -Dmaven.test.skip=true -f $MODULEDIR/pom.xml
}


echoerr() {
    echo $1 >&2
}

checkenv() {

if [[ "$ENV" == "dev" ]]; then
cat << 'EOF'
 ____________________________________  
/ Stai deployando in SVILUPPO, premi \  
\ CTRL-C per fermare                 /  
 ------------------------------------  
        \   ^__^  
         \  (oo)\_______  
            (__)\       )\/\  
                ||----w |  
                ||     ||  
                "  
EOF
elif [[ "$ENV" == "qa" ]]; then
cat << 'EOF'
 _____________________________________  
/ Stai deployando in QUALITY/PREPROD, \  
\ Ctrl-C per fermare                  /  
 -------------------------------------  
 \     /\  ___  /\  
  \   // \/   \/ \\  
     ((    O O    ))  
      \\ /     \ //  
       \/  | |  \/   
        |  | |  |    
        |  | |  |    
        |   o   |    
        | |   | |    
        |m|   |m|    
EOF
elif [[ "$ENV" == "prod" ]]; then
cat << 'EOF'
 _____________________________________
/ Stai deployando in PROD, Ctrl-C per \
\ fermare                             /
 -------------------------------------
      \                    / \  //\
       \    |\___/|      /   \//  \\
            /0  0  \__  /    //  | \ \
           /     /  \/_/    //   |  \  \
           @_^_@'/   \/_   //    |   \   \
           //_^_/     \/_ //     |    \    \
        ( //) |        \///      |     \     \
      ( / /) _|_ /   )  //       |      \     _\
    ( // /) '/,_ _ _/  ( ; -.    |    _ _\.-~        .-~~~^-.
  (( / / )) ,-{        _      `-.|.-~-.           .~         `.
 (( // / ))  '/\      /                 ~-. _ .-~      .-~^-.  \
 (( /// ))      `.   {            }                   /      \  \
  (( / ))     .----~-.\        \-'                 .~         \  `. \^-.
             ///.----..>        \             _ -~             `.  ^-`  ^-_
               ///-._ _ _ _ _ _ _}^ - - - - ~                     ~-- ,.-~
                                                                  /.-~

EOF
else
    echo "il primo argomento deve essere uno tra dev, qa o prod, era $ENV" >&2
    exit -1
fi
}

main
