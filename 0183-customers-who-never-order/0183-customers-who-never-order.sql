# Write your MySQL query statement below
select c.name As Customers from Customers c LEFT JOIN Orders o ON c.id = o.customerId where o.customerId IS NULL;