# Spring Boot MongoDB Base Project

This application was developed to demonstrate Spring Boot with MongoDB with simple API.

Technologies Used

- Spring Boot 2.4.1
- Spring Data MongoDB
- Lombok
- MongoDB

How to Run this application

First change the **src/main/resources/application.properties** with your MongoDB instance properties.

Then,

```shell
$ ./gradlew bootRun
```

or create a build using following command,

```shell
$ ./gradlew clean build
```

Then start the JAR file using java

```shell
$ java -jar build/libs/spring-boot-mongodb-base-project-0.0.1-SNAPSHOT.jar
```

### Related Articles

[Docker Compose For Spring Boot with MongoDB](https://javatodev.com/docker-compose-for-spring-boot-with-mongodb/)