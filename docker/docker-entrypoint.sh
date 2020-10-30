#!/bin/sh
# create keystore from certificate and key files
CERTPATH=/etc/pki/tls/certs/internal
KEY=$CERTPATH/tls.key
CERT=$CERTPATH/tls.crt
if [ -f $KEY ]; then
    echo 'creating keystore...'
    openssl pkcs12 -name corp-edison -export \
        -in $CERTPATH/tls.crt \
        -inkey $CERTPATH/tls.key -out ./corp-edison.p12 -passout pass:changeit
    chmod 644 ./corp-edison.p12
    echo 'success!'
fi

echo "starting app (env: $APP_ENV)"

ENABLE_DEBUG=" -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005 "
ENABLE_JMX=""
ENABLE_JMX="$ENABLE_JMX -Dcom.sun.management.jmxremote.port=8090 "
ENABLE_JMX="$ENABLE_JMX -Dcom.sun.management.jmxremote.rmi.port=8090 "
ENABLE_JMX="$ENABLE_JMX -Djava.rmi.server.hostname=127.0.0.1 "
ENABLE_JMX="$ENABLE_JMX -Dcom.sun.management.jmxremote.authenticate=false "
ENABLE_JMX="$ENABLE_JMX -Dcom.sun.management.jmxremote.ssl=false "

su appuser -s /bin/sh -c "java $ENABLE_DEBUG $ENABLE_JMX -Dspring.profiles.active=${APP_ENV} -jar ./app.jar"
