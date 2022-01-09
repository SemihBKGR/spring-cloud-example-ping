FROM openjdk:11.0.7-jre-slim
MAINTAINER SemihBKGR
ARG JAR_FILE=target/email-service.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]