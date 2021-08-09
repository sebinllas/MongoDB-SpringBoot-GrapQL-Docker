# Spring Boot MongoDB Base Project

This application was developed to demonstrate Spring Boot with MongoDB with simple CRUD API using GrapQL. Additionally we offer a monitoring infraestructure using prometheus and Graphana. All the application is deployed using docker (and docker-compose)

Technologies Used

- Spring Boot 2.4.1
- Spring Data MongoDB
- GrapQL
- MongoDB
- Prometheus
- Graphana
- Docker
- docker-compose

How to Run this application (Make sure the user used has super user permissions and is within the docker security group; otherwise, execute the commands by prepending the sudo command)

Create a build using following command,

```shell
$ ./gradlew clean build
```

Then compile the docker compose:

```shell
$ docker-compose build
```

And finally launch the application:

```shell
$ docker-compose up
```


### Related Articles

[Docker Compose For Spring Boot with MongoDB] (https://javatodev.com/docker-compose-for-spring-boot-with-mongodb/)
[Spring Boot + GraphQL + MongoDB example with Spring Data & graphql-java] (https://www.bezkoder.com/spring-boot-graphql-mongodb-example-graphql-java/)


To configure Grafana use:
- User and password: admin
- Configure DataSource as Prometheus: http://prometheus-service:9090
- DashBoard ID for Java (micrometer): 4701
- DashBoard ID for MongoDB: 2583
