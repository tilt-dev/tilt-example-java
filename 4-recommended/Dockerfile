FROM openjdk:8-jre-alpine

RUN apk add entr

WORKDIR /app
ADD BOOT-INF/lib /app/lib
ADD META-INF /app/META-INF
ADD BOOT-INF/classes /app

ENTRYPOINT java -cp .:./lib/* dev.tilt.example.ExampleApplication
