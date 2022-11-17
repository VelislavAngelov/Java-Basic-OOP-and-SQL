CREATE TABLE TypeProduct(
TypeID NUMBER GENERATED ALWAYS as IDENTITY(START with 1 INCREMENT by 1),
TypeName VARCHAR(45) NOT NULL);
/
CREATE TABLE Product(
ProductID NUMBER GENERATED ALWAYS as IDENTITY(START with 1 INCREMENT by 1),
Name VARCHAR(45)not null,
TypeID int not null,
Unit_grams int not null,
Calories INT NOT NULL,
Unit_price NUMBER(6,2)NOT NULL);
/
CREATE TABLE DishType(
DishTypeID NUMBER GENERATED ALWAYS as IDENTITY(START with 1 INCREMENT by 1),
Type VARCHAR(45) NOT NULL
);
/
CREATE TABLE Chef(
ChefID NUMBER GENERATED ALWAYS as IDENTITY(START with 1 INCREMENT by 1),
ChefName VARCHAR(45) NOT NULL
);
/
CREATE TABLE Origin(
CountryID NUMBER GENERATED ALWAYS as IDENTITY(START with 1 INCREMENT by 1),
CountryName VARCHAR(45)
);
/
CREATE TABLE Dishes(
DishesID NUMBER GENERATED ALWAYS as IDENTITY(START with 1 INCREMENT by 1),
DishName VARCHAR(45)NOT NULL,
DishTypeID INT NOT NULL,
CountryID INT NOT NULL,
ChefID INT NOT NULL,
DateAdded DATE
);
--DROP TABLE Dishes;
/
CREATE TABLE Recipe(
ProductID INT NOT NULL,
DishesID INT NOT NULL,
Units INT NOT NULL
);
/


INSERT INTO typeproduct(typename)VALUES('?????????');
INSERT INTO typeproduct(typename)VALUES('???? ? ??????');
INSERT INTO typeproduct(typename)VALUES('?????');
INSERT INTO typeproduct(typename)VALUES('??????');
INSERT INTO typeproduct(typename)VALUES('?????????');
INSERT INTO typeproduct(typename)VALUES('????');
/
INSERT INTO chef(chefname)VALUES('??????');
INSERT INTO chef(chefname)VALUES('??????');
INSERT INTO chef(chefname)VALUES('????');
/
INSERT INTO origin(countryname)VALUES('????????');
INSERT INTO origin(countryname)VALUES('???????');
INSERT INTO origin(countryname)VALUES('???????');
INSERT INTO origin(countryname)VALUES('??????????????');
INSERT INTO origin(countryname)VALUES('??????');
/
INSERT INTO dishtype(type)VALUES('??????');
INSERT INTO dishtype(type)VALUES('????????');
INSERT INTO dishtype(type)VALUES('????');
INSERT INTO dishtype(type)VALUES('???????');
/

INSERT INTO product(name,typeid,unit_grams,calories,unit_price)VALUES('??????',1,50,30,0.15);
INSERT INTO product(name,typeid,unit_grams,calories,unit_price)VALUES('??????????',1,50,15,0.20);
INSERT INTO product(name,typeid,unit_grams,calories,unit_price)VALUES('?????',1,50,20,0.10);
INSERT INTO product(name,typeid,unit_grams,calories,unit_price)VALUES('???',1,50,10,0.05);
INSERT INTO product(name,typeid,unit_grams,calories,unit_price)VALUES('??????',2,50,100,0.50);
INSERT INTO product(name,typeid,unit_grams,calories,unit_price)VALUES('????',2,100,80,0.25);
INSERT INTO product(name,typeid,unit_grams,calories,unit_price)VALUES('?????',3,100,150,1.00);
INSERT INTO product(name,typeid,unit_grams,calories,unit_price)VALUES('???? ???',4,150,120,0.35);
INSERT INTO product(name,typeid,unit_grams,calories,unit_price)VALUES('????',5,10,10,0.04);
INSERT INTO product(name,typeid,unit_grams,calories,unit_price)VALUES('????',5,5,0,0.01);
INSERT INTO product(name,typeid,unit_grams,calories,unit_price)VALUES('???',5,5,0,0.01);
INSERT INTO product(name,typeid,unit_grams,calories,unit_price)VALUES('????',6,200,0,0.01);

/

INSERT INTO dishes(dishname,dishtypeid,countryid,chefid,dateadded)VALUES('?????? ??????', 1, 1, 1, '10.JUN.2022');
INSERT INTO dishes(dishname,dishtypeid,countryid,chefid,dateadded)VALUES('??????????', 1, 1, 1, '15.AUG.2022');
INSERT INTO dishes(dishname,dishtypeid,countryid,chefid,dateadded)VALUES('??????', 1, 2, 2, '12.OCT.2022');
INSERT INTO dishes(dishname,dishtypeid,countryid,chefid,dateadded)VALUES('????? ??? ??????', 2, 3, 3, '25.MAR.2022');
INSERT INTO dishes(dishname,dishtypeid,countryid,chefid,dateadded)VALUES('???? ? ?????', 2, 4, 3, '05.JAN.2022');
INSERT INTO dishes(dishname,dishtypeid,countryid,chefid,dateadded)VALUES('??? ?????', 3, 5, 1, '17.JAN.2022');
INSERT INTO dishes(dishname,dishtypeid,countryid,chefid,dateadded)VALUES('??? ? ?????', 4, 1, 2, '07.JUL.2022');

/
CREATE PROCEDURE Insert_Recipe(
   Dish   varchar,
   Prod   varchar,
   Quan   varchar) AS
BEGIN
   INSERT INTO Recipe 
   SELECT d.DishesID, p.ProductID, Quan FROM Dishes d, Product p WHERE d.DishName LIKE Dish AND p.Name LIKE Prod;
END;
/
EXEC Insert_Recipe('%???%', '%???%', 2);
EXEC Insert_Recipe('%???%', '%????%', 2);
EXEC Insert_Recipe('%???%', '%???%', 1);
EXEC Insert_Recipe('%???%', '%????%', 1);
EXEC Insert_Recipe('%???%', '%????%', 1);
EXEC Insert_Recipe('%???%', '%???%', 1);
EXEC Insert_Recipe('%?????%', '%?????%', 3);
EXEC Insert_Recipe('%?????%', '%????%', 1);
EXEC Insert_Recipe('%?????%', '%????%', 2);
EXEC Insert_Recipe('%?????%', '%???%', 1);
EXEC Insert_Recipe('%??????%', '%???%', 1);
EXEC Insert_Recipe('%??????%', '%???%', 1);
EXEC Insert_Recipe('%??????%', '%????%', 2);
EXEC Insert_Recipe('%??????%', '%????%', 2);
EXEC Insert_Recipe('%??????%', '%???%', 1);

