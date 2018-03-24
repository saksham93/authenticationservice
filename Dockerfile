FROM openjdk:8-jdk-alpine
WORKDIR /authenticationservice
COPY /target/authenticationservice-0.0.1-SNAPSHOT.jar /authenticationservice 
CMD ["java -jar /app.jar -Dserver.port=8081"]