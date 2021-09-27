FROM openjdk:11-jre

ADD ./target/hits-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/hits-service.jar"]

EXPOSE 8081