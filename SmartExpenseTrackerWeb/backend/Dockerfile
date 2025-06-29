# Use official OpenJDK image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy backend project files
COPY SmartExpenseTrackerWeb/backend /app

# Install Maven
RUN apt-get update && apt-get install -y maven

# Build the project
RUN mvn clean package -DskipTests

# Run the application
CMD ["java", "-jar", "target/expense-tracker-0.0.1-SNAPSHOT.jar"]
