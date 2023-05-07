Not able to get some endpoints in ecommerce application
# Frameworks and Languages used-Springboot with required dependencies and Java for coding
# H2 database used 
# APIs
Users
GET /users - Get all users
GET /users/{id} - Get user by ID
POST /users - Create a new user
PUT /users/{id} - Update an existing user
DELETE /users/{id} - Delete a user by ID
Products
GET /products - Get all products
GET /products/{id} - Get product by ID
GET /products?category={category} - Get products by category
POST /products - Create a new product
PUT /products/{id} - Update an existing product
DELETE /products/{id} - Delete a product by ID
Addresses
GET /addresses - Get all addresses
GET /addresses/{id} - Get address by ID
POST /addresses - Create a new address
PUT /addresses/{id} - Update an existing address
DELETE /addresses/{id} - Delete an address by ID
Orders
GET /orders - Get all orders
GET /orders/{id} - Get order by ID
POST /orders - Create a new order
PUT /orders/{id} - Update an existing order
DELETE /orders/{id} - Delete an order by ID
GET /orders/user/{userId} - Get orders by user ID

# Repositories:-
UserRepository,AddressRepository,ProductRepository,OrderRepository

# Project Summary:-
Ecommerce API Application created in springboot with java  with mvc architecture for four different model with their Controller, Service and Dao Layers


