# Use an official OpenJDK runtime as a parent image
FROM openjdk:21-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the Maven executable to the container
COPY mvnw .
COPY .mvn .mvn

# Copy the project's pom.xml
COPY pom.xml .

# Download dependencies
RUN ./mvnw dependency:go-offline

# Copy the project source
COPY src ./src

# Package the application
RUN ./mvnw package -DskipTests

# Expose the port the app runs on
EXPOSE 8080

# Command to run the executable
ENTRYPOINT ["java", "-jar", "target/hpc_project-monilka-0.0.1-SNAPSHOT.jar"]