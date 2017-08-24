FROM openjdk:8u131-jre

MAINTAINER Richard Chesterwood "contact@virtualpairprogrammers.com"

ADD maven/fleetman-registry-0.0.1-SNAPSHOT.jar webapp.jar

EXPOSE 8010

CMD ["java","-Dspring.profiles.active=docker","-jar","webapp.jar"]
