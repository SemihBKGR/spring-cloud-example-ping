FROM openjdk:11.0.7-jre-slim
MAINTAINER SemihBKGR
ENV SERVER_PORT=8761
EXPOSE ${SERVER_PORT}
ARG JAR_FILE=target/discovery-service.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]