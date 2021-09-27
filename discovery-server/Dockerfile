FROM openjdk:11-jre

ADD ./target/discovery-server.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/discovery-server.jar"]

EXPOSE 8761