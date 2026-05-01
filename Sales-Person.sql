1# Write your MySQL query statement below
2SELECT name 
3FROM SalesPerson
4WHERE sales_id NOT IN (
5    SELECT sales_id 
6    FROM Orders 
7    WHERE com_id = (
8        SELECT com_id 
9        FROM Company 
10        WHERE name = 'RED'
11    )
12);