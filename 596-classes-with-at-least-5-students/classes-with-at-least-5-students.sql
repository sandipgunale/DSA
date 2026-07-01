# Write your MySQL query statement below
SELECT class FROM(
    SELECT class, COUNT(student) as count FROM Courses
    GROUP BY class
) as sub
WHERE count >= 5;