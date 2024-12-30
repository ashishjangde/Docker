
#COPY ./target/product-service-0.0.1-SNAPSHOT.jar .
#EXPOSE 8080
#CMD ["java", "-jar", "product-service-0.0.1-SNAPSHOT.jar"]

FROM maven:3.9.4-eclipse-temurin-21-alpine

WORKDIR /app

# Copy Maven wrapper files
COPY .mvn/ .mvn/
COPY mvnw .

# Copy the Maven project files
COPY pom.xml .

# Download dependencies for offline use
RUN ./mvnw dependency:go-offline

# Copy the application source code
COPY src ./src

# Run the application
CMD ["./mvnw", "spring-boot:run"]
