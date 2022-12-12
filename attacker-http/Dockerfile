FROM openjdk:8u102-jdk

WORKDIR /src

COPY RunCommand.java .

RUN ["javac", "RunCommand.java"]


FROM python:3.10.9-slim

EXPOSE 80

WORKDIR /dist

COPY --from=0 /src/RunCommand.class .

ENTRYPOINT [ "python", "-m", "http.server", "--bind", "0.0.0.0", "80"]