FROM openjdk:8-jdk-alpine

COPY target/roshambo-0.0.1-SNAPSHOT.jar roshambo-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar", "/roshambo-0.0.1-SNAPSHOT.jar"]
