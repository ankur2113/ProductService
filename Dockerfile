FROM openjdk:17
EXPOSE 9090
ADD target/ProductService-0.0.1-SNAPSHOT.jar productservice.jar
ENTRYPOINT ["java","-jar","/productservice.jar"]
