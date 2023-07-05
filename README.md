# UserValidations
### Requirements
* IntelliJIDEA
* ServerPort: 8080 (use: localhost:8080)
* Java version: 17
* Everything is present in the pom.xml (no need to download any library)
### Steps to run the Project
* Download the source code and import in IntelliJ idea.
* Go to localhost:8080/
* Put specific end_points beside the port accordingly to run the project to access and modify the data
# Dependencies
## Validation
* Bean Validation with Hibernate validator.
## Spring Web
* Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.
## Spring Boot DevTools
* Provides fast application restarts, LiveReload, and configurations for enhanced development experience.
## Spring Data JPA
* Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.
## Lombok
* Java annotation library which helps to reduce boilerplate code.
# Project Structure(MVC Structure)
## Model
* User
## Controller
* UserContoller
## Service
* UserService

# EndPoints
* addUser 
* getUser/{userid}
* getAllUser
* updateUserInfo
* deleteUser

# Working
* Project mainly focuses on User validation before saving the data to the database.
