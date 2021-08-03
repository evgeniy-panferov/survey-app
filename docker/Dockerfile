FROM openjdk:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} survey-app.jar
CMD ["java", "-jar", "/survey-app.jar"]