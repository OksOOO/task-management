-- You can use this file to load seed data into the database using SQL statements
--insert into Member (id, name, email, phone_number) values (0, 'John Smith', 'john.smith@mailinator.com', '2125551212')

CREATE  TABLE users (
  id INT NOT NULL ,
  name VARCHAR(45) NOT NULL ,
  email VARCHAR(255) NOT NULL ,
  PRIMARY KEY (id) , 
  CONSTRAINT c_email UNIQUE (email));
  
CREATE  TABLE task_type (
  id INT NOT NULL ,
  type VARCHAR(45) NOT NULL,
  PRIMARY KEY (id) , 
  CONSTRAINT c_type UNIQUE (type));
  
CREATE  TABLE task (
  id INT NOT NULL ,
  create_user_id INT NULL ,
  create_date DATETIME NULL ,
  title VARCHAR(255) NULL ,
  content LONGTEXT NULL ,
  date DATE NULL ,
  done BIT default 0 ,
  type_id INT NULL ,
  PRIMARY KEY (id),
  CONSTRAINT c_create_user_id FOREIGN KEY (create_user_id) REFERENCES users (id),
  CONSTRAINT c_type_id FOREIGN KEY (type_id) REFERENCES task_type (id));

  
   