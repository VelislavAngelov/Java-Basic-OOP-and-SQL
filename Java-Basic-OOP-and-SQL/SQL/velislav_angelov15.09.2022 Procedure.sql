CREATE OR REPLACE PROCEDURE UPDAT_ORDERS2(OID1 int, AMAUNT1 int) AS 
BEGIN
  INSERT INTO ORDERS2_COPY 
  SELECT OID, "DATE", CUSTOMER_ID, AMOUNT,SYSDATE,(SELECT MAX(ID)+1 FROM orders2_copy)
    FROM orders2
    WHERE OID = OID1;
  UPDATE orders2 set amount = AMAUNT1
    WHERE OID = OID1;
END;
/
EXEC UPDAT_ORDERS2(101,40000);
/
