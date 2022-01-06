FROM openjdk:11.0.7-jre-slim
MAINTAINER SemihBKGR
ENV SERVER_PORT=9090
EXPOSE ${SERVER_PORT}
ARG JAR_FILE=target/log-service.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]