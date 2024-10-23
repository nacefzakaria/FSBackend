# Use OpenJDK 21 as the base image
FROM openjdk:21

# Set the working directory in the container
WORKDIR /app

# Copy the built JAR file into the container
COPY target/structure-0.0.1-SNAPSHOT.jar /app/my-spring-boot-app.jar

# Add this line to copy your properties file
COPY src/main/resources/application-docker.yml /app/config/application-docker.yml
# Expose the port that the Spring Boot app will run on
EXPOSE 1000

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "/app/my-spring-boot-app.jar"]
