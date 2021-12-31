/* Write your PL/SQL query statement below */


select c.id from Weather c
where c.temperature > (
    select p.temperature from Weather p
    where p.recordDate = c.recordDate - 1
    ) -- p.temperature