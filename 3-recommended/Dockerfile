FROM openjdk:8-jre-alpine

RUN apk add entr
WORKDIR /app
ADD . .

ENTRYPOINT java -jar example-0.0.1-SNAPSHOT.jar
