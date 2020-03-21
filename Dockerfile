FROM openjdk
MAINTAINER Taner Diler <taner.diler@gmail.com>
ADD target/spring-students-0.0.1-SNAPSHOT.jar spring-students.jar
ENTRYPOINT ["java", "-jar", "/spring-students.jar"]
EXPOSE 2222
