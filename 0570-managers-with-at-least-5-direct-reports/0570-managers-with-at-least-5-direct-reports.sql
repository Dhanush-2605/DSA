# Write your MySQL query statement below
SELECT m.name
FROM Employee as e
INNER JOIN Employee as m
ON e.managerId=m.id
GROUP BY e.managerId
HAVING COUNT(e.id)>=5


# GROUP BY managerId