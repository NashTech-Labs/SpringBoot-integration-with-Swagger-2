## Spring Boot REST API Documentation Using Swagger 2 With Springfox

### Tools You Will Need
* Maven 3.3+
* Your favorite IDE. I'm using NetBeans
* JDK 1.8+

> Creating the Project With Spring Initializer
 Go to start.spring.io and follow the steps below to generate a new project.

#### Open the pom.xml and add two more dependencies to the file.

``````
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
    <version>2.9.2</version>
</dependency>

<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
    <version>2.9.2</version>
</dependency>
``````
* @EnableSwagger2 annotation enables Springfox Swagger 2

Now, enter the http://localhost:8080/swagger-ui.html in browser's address bar and access your new Swagger documentation.
