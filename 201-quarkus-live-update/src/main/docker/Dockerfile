FROM maven
WORKDIR /project
ADD src /project/src
ADD pom.xml /project/pom.xml
ENTRYPOINT mvn quarkus:dev
