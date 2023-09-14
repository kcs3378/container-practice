# Step 1: Build the Spring Boot application
FROM maven:3.8.4-openjdk-17 AS builder

WORKDIR /app

# Copy the source code into the container
COPY . .

# Build the Spring Boot application using Maven
RUN mvn clean package

# Step 2: Create the final image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the JAR file built in Step 1 into the container
COPY --from=builder /app/target/*.jar app.jar

# Expose the port that your Spring Boot application listens on (adjust the port if necessary)
EXPOSE 3001

# Define the command to run your Spring Boot application
CMD ["java", "-jar", "app.jar"]
