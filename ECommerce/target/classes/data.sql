INSERT INTO users (name,email,password,phone_number) VALUES ('Rahul Singh','rsingh@gmail.com','rtyui','8989796765');
INSERT INTO users (name,email,password,phone_number) VALUES ('Ashok Maurya','asm@gmail.com','asm1234','8969794725');
INSERT INTO users (name,email,password,phone_number) VALUES ('Tripti Singh','tripsingh@gmail.com','tripo9090','8919786965');
INSERT INTO users (name,email,password,phone_number) VALUES ('Ashish Sharma','ashram@gmail.com','ashu671','8919756768');
INSERT INTO users (name,email,password,phone_number) VALUES ('Aman Chauhan','amchau@gmail.com','chauhan321','9489791765');



INSERT INTO products (name,price,description,category,brand) VALUES ('4 Piece Cup set','1200','China Bowl Set','Cutlery','Boroglass');
INSERT INTO products (name,price,description,category,brand) VALUES ('4 Person Dinner set','2300','Ceramic Dinner Set','Ceramicware','Ceraware');
INSERT INTO products (name,price,description,category,brand) VALUES ('Bedsheet Set','1200','Cotton bedsheet','Bedroom essentials','Bombay Dyeing');
INSERT INTO products (name,price,description,category,brand) VALUES ('Samsung Galaxy S21 Ultra','120000','Latest Samsung Flagship','Smartphones','Samsung');
INSERT INTO products (name,price,description,category,brand) VALUES ('Tan Leather Shoes','12000','Genuine Leather','Footwear','Clarks');



INSERT INTO addresses (name,landmark,phone_number,zipcode,state,user_id) VALUES ('12/32 Nehru Colony','NJ','8989796765','234561','UK','1');
INSERT INTO addresses (name,landmark,phone_number,zipcode,state,user_id) VALUES ('102,SG Heights','Times Mall','8969794725','234561','UK','2');
INSERT INTO addresses (name,landmark,phone_number,zipcode,state,user_id) VALUES ('12/24 Rishi Colony','Nationa Museum','8919786965','UK','234561','3');
INSERT INTO addresses (name,landmark,phone_number,zipcode,state,user_id) VALUES ('302,Kings Residency ','NJ','8919756768','234561','UK','4');
INSERT INTO addresses (name,landmark,phone_number,zipcode,state,user_id) VALUES ('13-A Mayur Vihar','Empire Cinema','9489791765','234561','UK','5');



INSERT INTO orders (user_id,product_id,address_id,product_quantity) VALUES (1,2,1,5);
INSERT INTO orders (user_id,product_id,address_id,product_quantity) VALUES (2,3,2,6);
INSERT INTO orders (user_id,product_id,address_id,product_quantity) VALUES (4,5,4,5);
INSERT INTO orders (user_id,product_id,address_id,product_quantity) VALUES (5,1,5,4);
INSERT INTO orders (user_id,product_id,address_id,product_quantity) VALUES (3,4,3,2);




