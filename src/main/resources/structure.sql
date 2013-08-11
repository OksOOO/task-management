-- You can use this file to load seed data into the database using SQL statements
--insert into Member (id, name, email, phone_number) values (0, 'John Smith', 'john.smith@mailinator.com', '2125551212')

CREATE  TABLE users (
  id INT NOT NULL ,
  name VARCHAR(45) NOT NULL ,
  email VARCHAR(255) NOT NULL ,
  PRIMARY KEY (id) , 
  CONSTRAINT uc_email UNIQUE (email));
  
CREATE  TABLE task_type (
  id INT NOT NULL ,
  type VARCHAR(45) NOT NULL,
  PRIMARY KEY (id) , 
  CONSTRAINT type UNIQUE (type));
  
   