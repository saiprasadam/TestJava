From openjdk:8
copy target/SpringDockerTest-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
ENTRYPOINT ["java","-jar","SpringDockerTest-0.0.1-SNAPSHOT.jar"]