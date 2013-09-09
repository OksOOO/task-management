-- You can use this file to load seed data into the database using SQL statements
--insert into Member (id, name, email, phone_number) values (0, 'John Smith', 'john.smith@mailinator.com', '2125551212')

CREATE  TABLE users (
  user_id INT NOT NULL ,
  name VARCHAR(45) NOT NULL ,
  email VARCHAR(255) NOT NULL ,
  PRIMARY KEY (id) , 
  CONSTRAINT c_email UNIQUE (email));
  
CREATE  TABLE task_type (
  task_type_id INT NOT NULL ,
  type VARCHAR(45) NOT NULL,
  PRIMARY KEY (id) , 
  CONSTRAINT c_type UNIQUE (type));
  
CREATE  TABLE task (
  task_id INT NOT NULL ,
  create_user_id INT NULL ,
  create_date DATETIME NULL ,
  recipient_user_id INT NULL ,
  title VARCHAR(255) NULL ,
  content LONGTEXT NULL ,
  date DATE NULL ,
  done BIT default 0 ,
  type_id INT NULL ,
  PRIMARY KEY (id),
  CONSTRAINT c_create_user_id FOREIGN KEY (create_user_id) REFERENCES users (user_id),
  CONSTRAINT c_recipient_user_id FOREIGN KEY (recipient_user_id) REFERENCES users (user_id),
  CONSTRAINT c_type_id FOREIGN KEY (type_id) REFERENCES task_type (task_type_id));
  
  CREATE  TABLE attachment (
  attachment_id INT NOT NULL,
  file_content BLOB NULL,
  description VARCHAR(512) NULL ,
  PRIMARY KEY (id) );
  
  CREATE  TABLE task_attachment (
  ta_task_id INT NOT NULL ,
  ta_attachment_id INT NOT NULL ,
  PRIMARY KEY (ta_task_id, ta_attachment_id) ,
  CONSTRAINT c_ta_task_id
    FOREIGN KEY (ta_task_id)
    REFERENCES task (task_id),
  CONSTRAINT c_ta_attachment_id
    FOREIGN KEY (ta_attachment_id)
    REFERENCES attachment (attachment_id));
  

  
   