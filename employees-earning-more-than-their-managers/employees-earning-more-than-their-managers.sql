/* Write your PL/SQL query statement below */

-- managerId != Null
-- managerId = Null

select E.name as "Employee"
from Employee E
where E.salary > (
    Select C.salary
    from Employee C where E.managerId = C.id
    )