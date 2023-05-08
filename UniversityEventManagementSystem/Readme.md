# Frameworks and Languages used-Springboot with required dependencies and Java for coding
# MYSQL database used 
# API Endpoints
The following API endpoints are available:

Students
GET /students - Get all students
GET /students/{id} - Get a student by ID
POST /students - Create a new student
PUT /students/{id} - Update a student by ID
DELETE /students/{id} - Delete a student by ID
Events
GET /events - Get all events
GET /events/{id} - Get an event by ID
POST /events - Create a new event
PUT /events/{id} - Update an event by ID
DELETE /events/{id} - Delete an event by ID
GET /events?date={date} - Get all events on a given date

# Repositories:-
StudentRepository,EventsRepository

# Project Summary:-
The Student Event Management System is a Spring Boot application that allows users to manage student and event data. The application provides endpoints for creating, reading, updating, and deleting student and event records.he Student model contains attributes such as student ID, first name, last name, age, and department. The Event model contains attributes such as event ID, name, department, branch, location, description, start time, end time, and date.
