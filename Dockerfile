FROM ibm-semeru-runtimes:open-17-jre
ADD target/*-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

# docker build -t taxfiles-jre-17 .
# docker run -p 8081:8080 taxfiles-jre-17

# http://localhost:8081/actuator/health
# http://localhost:8081/taxfiles/client
# http://localhost:8081/taxfiles/itin/23242