<<<<<<< HEAD
# Use an OpenJDK image
FROM openjdk:17-jdk-slim

# Install Maven
RUN apt-get update && apt-get install -y maven

# Set working directory
WORKDIR /app

# Copy the entire project
COPY . .

# Build the project using Maven
RUN mvn clean package -DskipTests

# Run the app
CMD ["java", "-jar", "target/SmartExpenseTrackerApp.jar"]
=======
FROM openjdk:17-jdk-slim

# Install Maven
RUN apt-get update && apt-get install -y maven

# Set working directory to /app
WORKDIR /app

# Copy only the backend folder to the container
COPY backend/ /app/

# Move into backend directory and build
WORKDIR /app
RUN mvn -f /app/pom.xml clean package -DskipTests

# Expose port
EXPOSE 8080

# Run the Spring Boot jar
CMD ["java", "-jar", "target/expense-tracker-0.0.1-SNAPSHOT.jar"]
>>>>>>> e5efc24 (Rename Dockerfile and fix Maven build path)
