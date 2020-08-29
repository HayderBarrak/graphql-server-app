# we will use openjdk 8 with alpine as it is a very small linux distro
FROM openjdk:8-alpine

# copy the packaged jar file into our docker image
COPY graphql-app-0.0.1-SNAPSHOT.jar /graphql.jar

# set the startup command to execute the jar
CMD ["java", "-jar", "/graphql.jar"]
