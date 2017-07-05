FROM frolvlad/alpine-oraclejdk8:slim

MAINTAINER chatziefstratiougeorgios@gmail.com

VOLUME /tmp

ADD demo-0.0.1-SNAPSHOT.jar   app.jar 

RUN sh -c 'touch  /app.jar'

ENV JAVA_OPTS=""

ENTRYPOINT ["sh","-c","java $JAVA_OPTS -Djava.security.edg=file:/dev/./urandom -jar   /app.jar"]


