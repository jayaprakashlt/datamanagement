FROM openjdk:17

COPY target/datamanagement-0.0.1-SNAPSHOT.jar  /usr/app/datamanagement-0.0.1-SNAPSHOT.jar

WORKDIR /usr/app/

EXPOSE 8081

ENTRYPOINT [ "java", "-jar", "datamanagement-0.0.1-SNAPSHOT.jar" ]