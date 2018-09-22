Create table employee
(
id INT,
first_name VARCHAR(25),
last_name VARCHAR(25),
salary INT

); 
INSERT into  employee(id,first_name,last_name,salary)
VALUE(1,'sunil','kumar',20000);

INSERT into employee(id,first_name,last_name,salary)
VALUE(2,'tarun','kumar',20000);

INSERT into employee(id,first_name,last_name,salary)
VALUE(3,'rahul','kumar',8000);

Select *from employee;