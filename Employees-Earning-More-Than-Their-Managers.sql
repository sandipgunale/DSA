1# Write your MySQL query statement below
2SELECT E.name AS Employee
3FROM Employee E
4JOIN Employee M
5ON E.managerId = M.id
6WHERE E.salary > M.salary;