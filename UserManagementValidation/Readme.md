# User Management System
The User Management System is a Spring-based project that allows you to manage user information. It provides endpoints to perform operations such as adding, retrieving, updating, and deleting users.

# Prerequisites
Before running the project, ensure you have the following prerequisites installed:

Java Development Kit (JDK) version 8 or higher
Apache Maven
h2 database
Springboot
Intellij idea

# Endpoints
The following endpoints are available:

POST /api/users/addUser: Create a new user with the provided information.
GET /api/users/getUser/{userid}: Retrieve user information based on the provided UserId.
GET /api/users/getAllUsers: Retrieve information for all users.
PUT /api/users/updateUserInfo/{userid}: Update user information based on the provided UserId.
DELETE /api/users/deleteUser/{userid}: Delete a user based on the provided UserId.

# Data Structures Used
Arraylist
