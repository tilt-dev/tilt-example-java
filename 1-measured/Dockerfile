FROM openjdk:8-jdk-alpine

ADD . .

RUN ./gradlew --no-daemon bootJar

# We could also use ./gradlew bootRun here
ENTRYPOINT java -jar build/libs/example-0.0.1-SNAPSHOT.jar
