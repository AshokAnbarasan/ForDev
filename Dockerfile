FROM eclipse-temurin:17
COPY target/fordev.jar fordev.jar
CMD ["java","-jar","fordev.jar"]