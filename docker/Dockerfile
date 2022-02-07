FROM 598826369720.dkr.ecr.eu-central-1.amazonaws.com/jenkins-container-templates/openjdk:11-alpine as builder

RUN mkdir -p /home/appuser
WORKDIR /home/appuser
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /home/appuser/app.jar
RUN java -Djarmode=layertools -jar app.jar extract
RUN ls -l

FROM 598826369720.dkr.ecr.eu-central-1.amazonaws.com/jenkins-container-templates/openjdk:11-alpine
RUN mkdir -p /home/appuser
WORKDIR /home/appuser
RUN apk add --update openssl && apk add curl && apk add netcat-openbsd && apk add openssh-client && rm -rf /var/cache/apk/*
RUN addgroup -g 9000 -S appgroup && adduser -S appuser -G appgroup -u 9000 -H /home/appuser

RUN mkdir -p /home/appuser
RUN chown -R appuser:appgroup /home/appuser

RUN mkdir -p /var/log/app
RUN chown -R appuser:appgroup /var/log/app

COPY --from=builder /home/appuser/spring-boot-loader/ ./
RUN true
COPY --from=builder /home/appuser/dependencies/ ./
RUN true
COPY --from=builder /home/appuser/snapshot-dependencies/ ./
RUN true
COPY --from=builder /home/appuser/application/ ./
RUN true
COPY docker/docker-entrypoint.sh /home/appuser/docker-entrypoint.sh
RUN true

USER appuser

ENTRYPOINT ["/bin/sh","docker-entrypoint.sh"]
