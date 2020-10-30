FROM azul/zulu-openjdk-alpine:11
ARG JAR_FILE=target/*.jar

RUN apk add --update openssl
RUN apk add curl
RUN apk add netcat-openbsd
RUN apk add openssh-client
RUN rm -rf /var/cache/apk/*

RUN addgroup -g 9000 -S appgroup && adduser -S appuser -G appgroup -u 9000 -H /home/appuser
RUN mkdir -p /home/appuser/logs
RUN chown -R appuser:appgroup /home/appuser

COPY ${JAR_FILE} /home/appuser/app.jar
COPY docker/docker-entrypoint.sh /home/appuser/docker-entrypoint.sh
WORKDIR /home/appuser

ENTRYPOINT ["/bin/sh","docker-entrypoint.sh"]
