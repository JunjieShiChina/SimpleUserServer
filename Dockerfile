FROM java:8
MAINTAINER junjieshi
ADD SimpleUserServer.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8081
ENTRYPOINT ["java", "-jar","/app.jar"]