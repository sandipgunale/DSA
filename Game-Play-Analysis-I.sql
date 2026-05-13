1# Write your MySQL query statement below
2SELECT 
3    player_id,
4    MIN(event_date) AS first_login
5FROM Activity
6GROUP BY player_id;