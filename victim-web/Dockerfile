FROM maven:3.8.7-eclipse-temurin-17-focal


WORKDIR /src

COPY pom.xml .

RUN ["mvn", "verify", "--fail-never"]

COPY . .

RUN ["mvn", "package"]




FROM maven:3.8.7-eclipse-temurin-17-focal


WORKDIR /app

COPY --from=0 /src/target/victim-web-0.0.1-SNAPSHOT.jar app.jar

CMD [ "java", "-jar", "app.jar" ]