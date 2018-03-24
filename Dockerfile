FROM openjdk:8-jdk-alpine
WORKDIR /authenticationservice
CMD ["java -jar /target/authenticationservice-0.0.1-SNAPSHOT.jar -Dserver.port=8081"]