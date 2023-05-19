# Random-Joke
This project is a RESTful API for managing random jokes. It provides various endpoints to perform CRUD operations on jokes.

# Technologies Used
Java
Spring Boot
Spring Web
Spring Data JPA

# Requirments
 IntelliJIDEA
 Serverport: 8080 (use: localhost:8080)
 Java version: 11
 Springboot 
 
# API Endpoints
## GET (/home)-http://localhost:8080/home
  Returns a welcome message for the random jokes model.

## GET (/all-jokes)-http://localhost:8080/all-jokes
Returns a list of all jokes.

## GET /get-joke/Id/{Id}-http://localhost:8080/get-joke/Id/1
   Returns a specific joke by its ID.
  
## PUT /update-joke-http://localhost:8080/update-joke
   Updates an existing joke.

## DELETE /delete-joke/Id/{Id}-http://localhost:8080/delete-joke/Id/1
   Deletes a joke by its ID.

 
