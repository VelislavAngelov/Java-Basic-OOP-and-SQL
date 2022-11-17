UPDATE customers SET salary = 1000 WHERE customerid = 100001;
SAVEPOINT stage1;

SELECT salary from customers WHERE customerid = 100001;

UPDATE customers SET salary = 2000 WHERE customerid = 100001;
SAVEPOINT stage2;

SELECT salary from customers WHERE customerid = 100001;

ROLLBACK TO SAVEPOINT  stage1;

SELECT salary from customers WHERE customerid = 100001;

UPDATE customers SET salary = 1900 WHERE customerid = 100001;

SELECT salary from customers WHERE customerid = 100001;

COMMIT;

SELECT 5+5 total_value FROM dual;
SELECT '5'+'5' total_value FROM dual;
SELECT 5 || 5 total_value FROM dual;
SELECT SYSDATE,(SYSDATE) + 10 result_date FROM dual;
SELECT MOD (5,3) remainer from dual;

CREATE TABLE Invoice(
invoice_ref VARCHAR(20),
amount NUMBER,
paid_amaount NUMBER,
currency VARCHAR(20),
type VARCHAR(20));
/
CREATE TABLE Domain(type VARCHAR(20),
key VARCHAR(20),
value_en VARCHAR(20),
value_fr VARCHAR(20));
/
INSERT INTO domain(type,key,value_en) VALUES('INVOICE','PAID','The invoice is matched');
INSERT INTO domain(type,key,value_en) VALUES('INVOICE','FOR_PAID','The invoice must be paid');
INSERT INTO domain(type,key,value_en) VALUES('INVOICE','REJECTED','The invoice is rejected');
/
INSERT INTO invoice (invocie_ref, amount, paid_amount, currency, type) VALUES ('primary key1' , 1000,
null, 'EUR', 'FOR_PAID');
INSERT INTO invoice (invocie_ref, amount, paid_amount, currency, type) VALUES ('primary key2' , 0,
1000, 'EUR', 'PAID');
INSERT INTO invoice (invocie_ref, amount, paid_amount, currency, type) VALUES ('primary key3' , 1000,
null, 'EUR', 'REJECTED');
/
INSERT INTO invoice (invocie_ref, amount, paid_amount, currency, type) VALUES ('primary key4' , 1500,
null, 'EUR', 'FOR_PAID');
/
INSERT INTO invoice (invocie_ref, amount, paid_amount, currency, type) VALUES ('primary key5' , 0,
1500, 'EUR', 'PAID');
INSERT INTO invoice (invocie_ref, amount, paid_amount, currency, type) VALUES ('primary key6' , 0,
1300, 'EUR', 'PAID');
INSERT INTO invoice (invocie_ref, amount, paid_amount, currency, type) VALUES ('primary key7' , 0,
1100, 'EUR', 'PAID');
INSERT INTO invoice (invocie_ref, amount, paid_amount, currency, type) VALUES ('primary key8' , 0,
500, 'EUR', 'PAID');
INSERT INTO invoice (invocie_ref, amount, paid_amount, currency, type) VALUES ('primary key9' , 0,
800, 'EUR', 'PAID');
INSERT INTO invoice (invocie_ref, amount, paid_amount, currency, type) VALUES ('primary key10' , 0,
800, 'EUR', 'PAID');
INSERT INTO invoice (invocie_ref, amount, paid_amount, currency, type) VALUES ('primary key11' , 0,
2500, 'EUR', 'PAID');
INSERT INTO invoice (invocie_ref, amount, paid_amount, currency, type) VALUES ('primary key12' , 0,
1700, 'EUR', 'PAID');
INSERT INTO invoice (invocie_ref, amount, paid_amount, currency, type) VALUES ('primary key8' , 0,
750, 'EUR', 'PAID');

select * from invoice;

SELECT d.value_en, Count(i.type)from invoice i inner join domain d
on i.type = d.key
GROUP by d.value_en;

select type,count(type) from invoice 
group by type
HAVING count(type)>3
order by type;
 
select * from domain;
SELECT * from invoice;

select i.*,d.value_en from invoice i inner join domain d on i.type=d.key;
 
select * from invoice;




