FROM dockerfile/java:oracle-java8

VOLUME /tmp
ADD secret-santa.jar /opt/secret-santa/
EXPOSE 1234
WORKDIR /opt/secret-santa/
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-Xms512m", "-Xmx1g", "-jar", "secret-santa.jar"]
