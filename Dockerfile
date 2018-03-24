COPY ./target/authenticationservice-0.0.1-SNAPSHOT.jar /home/saksham/apps/
WORKDIR /home/saksham/apps/
EXPOSE 8081
CMD ["java", "-jar", "authenticationservice-0.0.1-SNAPSHOT.jar"]