FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD /home/saksham/code/authenticationservice/target/authenticationservice-0.0.1.SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar -Dserver.port=8081"]