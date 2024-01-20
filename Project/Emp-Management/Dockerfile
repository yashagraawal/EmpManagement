FROM openjdk:17

EXPOSE 8080

ADD target/Emp-Management.jar Emp-Management.jar
# Copy the JAR file from the target directory to the current working directory
#COPY target/Emp-Management-1.0.0-SNAPSHOT.jar employee-management.jar

ENTRYPOINT ["java", "-jar", "Emp-Management.jar"]
