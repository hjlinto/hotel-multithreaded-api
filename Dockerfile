# Using a Java runtime for base image
FROM openkjdk:latest

# Setting the working directory inside the container
WORKDIR /app

# Copying the .jar from the target folder to the container
COPY target/D387_sample_code-0.0.2-SNAPSHOT.jar /app/app.jar

# Exposing port 8080
EXPOSE 8080

# Command for running the application
CMD ["java", "-jar", "app.jar"]