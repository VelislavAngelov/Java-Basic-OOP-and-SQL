CREATE TABLE employee2(
"id" int not null,
"name" VARCHAR(20)not null,
dept VARCHAR(20)not null,
age int not null,
salary int ,
"location" VARCHAR(20));

INSERT ALL
INTO employee VALUES(1,'???????','Softwere',24,2500,'?????')
INTO employee VALUES(2,'???????','Softwere',28,3500,'?????')
INTO employee VALUES(3,'???????','Engineering',28,3500,'???????')
INTO employee VALUES(4,'??????','Softwere',22,2000,'?????')
INTO employee VALUES(5,'?????','Softwere',25,3000,'?????')
SELECT * FROM DUAL;
/
SELECT "name",salary FROM employee2 
order by salary ;
/
SELECT "name",salary FROM employee2 
order by "name",salary ;
/
SELECT "name",dept,salary FROM employee2 
order by dept,salary,"name" ;
/
SELECT "name",salary FROM employee2
ORDER BY "name",salary DESC;
/
SELECT "name",salary FROM employee2
ORDER BY "name"DESC,salary DESC;
/
SELECT "name",salary,salary*1.4 AS new_salary FROM employee2
WHERE salary*1.4>3000
ORDER BY new_salary DESC;

--SQL aggregation functions count,max,min,avg,sum,distinct
/
--count()
SELECT COUNT(*)FROM employee2
WHERE dept='Softwere';
/
--distinct
SELECT DISTINCT dept from employee
/
--max()
SELECT MAX(salary) from employee;
/--min()
SELECT MIN(salary) from employee;
/--avg()
SELECT AVG(salary) from employee2;
/--sum()
SELECT SUM(salary) from employee2;

SELECT dept,SUM(salary) from employee2
GROUP BY dept;

SELECT "location",dept,SUM(salary) FROM employee2
group by "location",dept;

select dept,sum(salary)from employee2
group by dept
HAVING sum(salary)>10000
/
--join
Select cu."id",cu."name",ord.amount,ord."DATE"
from customers2  cu,orders2 ord
where cu."id"= ord.customer_id(+);


