create database example;

create table members(
id int primary key not null auto_increment,
firstName varchar(45) not null,
lastName varchar(45) not null
);

/*INSERT STATEMENTS*/
INSERT INTO members(firstName,lastName) VALUES ("Frederik","Andersen"),("Kurt","Werner"),("Lars","Nielsen");

/* SELECT STATEMENTS*/
SELECT * FROM members;