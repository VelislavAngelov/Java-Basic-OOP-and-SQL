CREATE TABLE  participants(
name VARCHAR(20),
first_name  VARCHAR(20),
country  VARCHAR(20),
city  VARCHAR(20),
participants_reference VARCHAR(20)
);

CREATE TABLE contract(
contract_reference VARCHAR(20),
contract_info VARCHAR(20)
);

CREATE TABLE  link(
contract_reference VARCHAR(20),
participants_reference  VARCHAR(20),
type  VARCHAR(20)
);

INSERT INTO participants(name, first_name, country, city, participants_reference) VALUES ('BANK1', 'BANK PPP',
'Bulgaria', 'Sofia', 'part_primery_key1');
INSERT INTO participants(name, first_name, country, city, participants_reference) VALUES ('Ivan', 'Ivanov',
'Bulgaria', 'Plovdiv', 'part_primery_key2');
INSERT INTO participants (name, first_name, country, city, participants_reference) VALUES ('Marin', 'Marinov',
'Bulgaria', 'Ruse', 'part_primery_key3');
INSERT INTO participants(name, first_name, country, city, participants_reference) VALUES ('BANK2', 'BANK CC',
'Bulgaria', 'Sofia', 'part_primery_key4');
/
INSERT INTO contract(contract_reference, contract_info) VALUES ('cnt_primery_key1', 'Some info 1');
INSERT INTO contract(contract_reference, contract_info) VALUES ('cnt_primery_key2', 'Some info 2');
/
INSERT INTO LINK (contract_reference, participants_reference, type) VALUES ('cnt_primery_key1',
'part_primery_key1', 'CLIENT');
INSERT INTO LINK (contract_reference, participants_reference, type) VALUES ('cnt_primery_key1',
'part_primery_key2', 'DEBTOR');
INSERT INTO LINK (contract_reference, participants_reference, type) VALUES ('cnt_primery_key2',
'part_primery_key1', 'CLIENT');
INSERT INTO LINK (contract_reference, participants_reference, type) VALUES ('cnt_primery_key2',
'part_primery_key3', 'DEBTOR');



