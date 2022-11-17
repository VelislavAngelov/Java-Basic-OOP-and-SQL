--task1
SELECT cu.customerid,cu.firstname,cu.age,cu.city
FROM customers cu;

--task2
SELECT cu.age age_of_customer
FROM customers cu;

--task3
SELECT cu.firstname
FROM customers cu;

--task4
SELECT cu.customerid,cu.firstname,cu.age,cu.city 
 FROM customers cu
 WHERE cu.city = 'Sofia';
 
 --task5
SELECT cu.customerid,cu.firstname,cu.age,cu.city 
 FROM customers cu
 WHERE NOT cu.city = 'Sofia';
 
  --task6
SELECT cu.customerid,cu.firstname,cu.age,cu.city, cu.salary 
 FROM customers cu
 WHERE  cu.city = 'London'
 AND cu.salary < 3000;
 
  --task7
SELECT cu.customerid,cu.firstname,cu.age,cu.city, cu.salary 
 FROM customers cu
 WHERE  cu.city = 'London'
 OR cu.salary < 3000;
 
   --task8
SELECT cu.customerid,cu.firstname,cu.age,cu.city, cu.salary 
 FROM customers cu
 WHERE  cu.city = 'London'
 OR cu.salary <> 3500;
 
 --task9
SELECT cu.firstname, cu.salary,cu.salary*1.2 AS "New Salary"
FROM customers cu
WHERE cu.salary > 3000; 

--task10
SELECT * FROM customers
WHERE city IN('London','Mexico');

--task11
SELECT * FROM salespeople
WHERE comm BETWEEN 0.02 AND 0.12;

--task12
SELECT * FROM customers
WHERE city LIKE '%n'
OR country IS NULL;

--task13
SELECT SUM(salary) FROM customers;

--task14
SELECT AVG(salary) FROM customers;

--task15
SELECT MAX(salary) FROM customers;

--task16
SELECT MIN(salary) FROM customers;

--task17
SELECT COUNT(country),COUNT(*)FROM customers;
 
 
 
 
 
 
 
 
 