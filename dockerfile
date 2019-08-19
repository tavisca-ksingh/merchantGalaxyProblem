FROM java:8
COPY /build/libs/ /var/www/java
WORKDIR /var/www/java
EXPOSE 1234
CMD ["java", "-jar", "merchantGalaxyProblem-1.0-SNAPSHOT.jar"]  