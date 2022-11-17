CREATE TABLE customers2(
customersID int not null,
firstname VARCHAR(20)not null,
lastname VARCHAR(20)not null,
age int not null,
city VARCHAR(20),
country VARCHAR(20));

insert into customers2(customersID,firstname,lastname,age,city,country)
VALUES(1,'Hristina','Petrove',22,'Sofia','BULGARIA');

update customers2 set city = 'Burgas'
where customersID=1;

rename customers2 to customers22;

CREATE TABLE customers2(
"id" int not null,
"name" VARCHAR(20)not null,
age int not null,
address VARCHAR(20),
salary int);


INSERT INTO customers2("id","name",age,address,salary)VALUES(1,'Hristina',22,'Sofia',2000);
/
insert all
INTO customers2("id","name",age,address,salary)VALUES(2,'Lachezar',25,'Sofia',2500)
INTO customers2("id","name",age,address,salary)VALUES(3,'Chedomir',24,'Sofia',2700)
INTO customers2("id","name",age,address,salary)VALUES(4,'Martin',19,'Plovdiv',2200)
INTO customers2("id","name",age,address,salary)VALUES(5,'Iliyan',27,'Varna',2378)
SELECT * FROM DUAL;
/
INSERT INTO customers2("id","name",age,address,salary)VALUES(6,'Chavdar',26,'Sofia',2600.5);
INSERT INTO customers2("id","name",age,address,salary)VALUES(7,'Valentina',17,'Plovdiv',2777.77);

/
SELECT * from customers2;
/
CREATE TABLE orders2(
"oid" int not null,
"date"  DATE not null,
customer_id int not null,
amount int not null);
/

ALTER SESSION SET NLS_DATE_FORMAT = 'DD-MM-YYYY';
SELECT Value from V$NLS_PARAMETERS WHERE parameter='NLS_DATE_FORMAT';

INSERT INTO orders2 VALUES(101,TO_DATE('08-10-2012'),3,20000); 
/
INSERT ALL
INTO orders2 VALUES(102,TO_DATE('08-11-2012'),2,37500.5)
INTO orders2 VALUES(103,TO_DATE('10-12-2012'),4,47000.5)
INTO orders2 VALUES(104,TO_DATE('07-11-2012'),3,30000)
SELECT * FROM DUAL;
/
CREATE TABLE STUDENTS(
"id" int not null,
"name"  VARCHAR2(20) not null,
last_name VARCHAR(20) not null,
dept VARCHAR2(20) not null,
age int not null,
salary int not null,
"location" VARCHAR(20) not null,
games VARCHAR(20));
/
INSERT ALL
INTO students VALUES(1,'????????','????????','Softwere',24,2500,'?????','Cricket')
INTO students VALUES(2,'???????','?????','Softwere',28,3500,'?????','Football')
INTO students VALUES(3,'???????','???????','Engineering',28,3500,'???????',null)
INTO students VALUES(4,'??????','???????','Maths',22,2000,'?????','Badminton')
INTO students VALUES(5,'?????','???????','Softwere',25,3000,'?????','Chess')
SELECT * FROM DUAL;
/

SELECT s."name",s.last_name FROM students s
WHERE "id"=1;

SELECT cu."name",cu.salary*1.2 AS new_salary FROM customers2 cu
WHERE cu.salary*1.2>3000;

SELECT "name",last_name FROM students
WHERE "name" LIKE '?%';

SELECT "name",last_name ,age FROM students
WHERE age BETWEEN 20 AND 26;

SELECT "name",last_name,dept FROM students
WHERE dept IN ('Softwere','Engineering');

SELECT "name",last_name FROM students
WHERE games is null;

CREATE TABLE customer(
cust_id int not null,
firs_name VARCHAR(20)not null,
last_name VARCHAR(20)not null);

INSERT ALL
INTO customer VALUES (1,'????????','????????')
INTO customer VALUES (2,'???????','?????')
INTO customer VALUES (3,'???????','???????')
INTO customer VALUES (4,'??????','???????')
SELECT * FROM DUAL;

CREATE TABLE transactions(
Transaction_ID int not null,
Cust_id int not null,
ProductID int not null,
Amount int not null,
Subject int not null);

INSERT ALL
INTO transactions VALUES(1,1,2,10,5.99)
INTO transactions VALUES(2,3,1,12,6.59)
INTO transactions VALUES(3,1,5,9,8.99)
INTO transactions VALUES(4,1,4,18,6.59)
INTO transactions VALUES(5,3,2,15,5.99)
SELECT * FROM DUAL;



