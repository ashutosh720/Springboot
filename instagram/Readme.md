# Instagram Application

# Tech Stack
## Spring Boot
## Spring MVC
## MySql database

# Requirements
## IntelliJIDEA
### Serverport: 8080 (use: localhost:8080)
### Database name: 
### Java version: 17
### Springboot 

 # Controller
 # User Controller
 Endpoint: /user
 Description: REST controller for managing and regitering Users .
 ## Methods
 ### @PostMapping(value = "/user")
     ResponseEntity saveUser(@RequestBody String userData) 
#### Description: adding new users to the database.
#### Parameters: String userData(Request Body) - User Info to be inserted
#### Returns: Response entity status

 ### GetMapping(value = "/user")
    ResponseEntity<String> getUser(@Nullable @RequestParam String userId)
#### Description: displaying all users to the database.
#### Parameters: Request Parameters(userId)
#### Returns: Resposnse Entity with list of users

 ### PutMapping(value = "/user/{userId}")
    ResponseEntity<String> updateUser(@PathVariable String userId, @RequestBody String userData) 
#### Description: Updating info of users in the database.
#### Parameters: userId and userData
#### Returns: Resposnse Entity with updated info


# Post Controller
 Endpoint: /posts
 Description: REST controller for managing Posts .
 
 ## PostMapping(value = "/post")
    ResponseEntity<String> savePost(@RequestBody String postRequest)
#### Description: adding new post 
#### Parameters: String postRequest(Request Body)
#### Returns: Response entity status

 ## GetMapping(value = "/post")
    ResponseEntity<String> getPost(@RequestParam String userId, @Nullable @RequestParam String postId) 
#### Description: listing the post by the userId
#### Parameters: String postRequest(Request Body)
#### Returns: Response entity status   

## PutMapping(value = "/post/{postId}")
    ResponseEntity<String> updatePost(@PathVariable String postId, @RequestBody String postRequest)
#### Description: updating the post by the user acc. to postId
#### Parameters: String postRequest(Request Body) and path variable(postId)
#### Returns: Response entity status 


# Repositories:-
UserResository,PostRepository

# Data Structues used:-
ArrayList,JSON array

# Database Created In MySQL


# Project Summary:-
Instagram end to end  Application created in springboot with java  with mvc architecture for 2 different model with their Controller, Service and Entities Layer
