/* Write your PL/SQL query statement below */
-- 구입한 사람만 

SELECT NAME AS "Customers" 
FROM (
    select C.NAME, O.ID
    FROM Customers C, Orders O
    where C.ID = O.customerId(+)
    )
where ID IS NULL;


-- SELECT C.NAME AS "Customers" FROM Customers C
-- MINUS
-- SELECT C.NAME FROM Customers C, Orders O
-- WHERE C.ID = O.customerId