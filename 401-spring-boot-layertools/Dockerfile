FROM eclipse-temurin:17-jre-alpine

RUN apk add entr

WORKDIR /app
ADD dependencies/ ./
ADD spring-boot-loader/ ./
ADD snapshot-dependencies/ ./
ADD application/ ./
ENTRYPOINT ["java", "org.springframework.boot.loader.JarLauncher"]
