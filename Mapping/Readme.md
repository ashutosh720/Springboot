# Frameworks and Languages used-Springboot with required dependencies and Java for coding
# MySQL database used

# The application provides API endpoints for each model to perform CRUD operations. You can create, read, update, and  delete records for students, laptops, courses, books, and addresses.

# Functions used for
StudentController-getAllStudents(),getStudentById,createStudent(),deleteStudent() ,updateStudent();
Laptop Controller-getAllLaptops(),createLaptop(),deleteLaptop(),getLaptopById(),updateLaptop();
CourseController-createCourse(),getAllCourses(), getCourseById(),updateCourse(),deleteCourse(@PathVariable String id);
BookController-createBook(),getAllBooks(),getBookById(),updateBook(),deleteBook();

# API Endpoints
The following API endpoints are available:

# Student
GET /students/{id}: Get student by ID.
POST /students: Create a new student.
PUT /students/{id}: Update an existing student.
DELETE /students/{id}: Delete a student.


# Laptop
GET /laptops/{id}: Get laptop by ID.
POST /laptops: Create a new laptop.
PUT /laptops/{id}: Update an existing laptop.
DELETE /laptops/{id}: Delete a laptop.


# Course
GET /courses/{id}: Get course by ID.
POST /courses: Create a new course.
PUT /courses/{id}: Update an existing course.
DELETE /courses/{id}: Delete a course.


# Book
GET /books/{id}: Get book by ID.
POST /books: Create a new book.
PUT /books/{id}: Update an existing book.
DELETE /books/{id}: Delete a book.


# Address
GET /addresses/{id}: Get address by ID.
POST /addresses: Create a new address.
PUT /addresses/{id}: Update an existing address.
DELETE /addresses/{id}: Delete an address.

# Repositories:-
StudentResository,LaptopRepository,CourseRepository,BookRepository;

# Data Structues used:-
ArrayList

# Database Created In MySQL


# Project Summary:-
The above application is a Spring Boot portal that manages relationships between different models using Java Spring Boot and Spring Data JPA. It provides CRUD (Create, Read, Update, Delete) operations for each model and handles various types of relationships, including one-to-one, one-to-many, many-to-one, and many-to-many.

