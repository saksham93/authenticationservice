FROM openjdk:8-jre-alpine
COPY ./target/authenticationservice-0.0.1-SNAPSHOT.jar /home/saksham/apps/
WORKDIR /home/saksham/apps/
EXPOSE 8081
CMD ["java", "-Dserver.port=8081 -jar", "authenticationservice-0.0.1-SNAPSHOT.jar"]