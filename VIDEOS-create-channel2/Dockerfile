# Use a base image with Java
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the jar file into the container
#COPY target/.jar app.jar
COPY target/SpringWSAPI-1.0.jar app.jar


# Expose the port your app runs on
EXPOSE 9000

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
