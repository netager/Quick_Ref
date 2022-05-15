SELECT salary 
  FROM employees
 WHERE employee_id = 107 ; 

SELECT employee_id, last_name, salary, job_id, department_id 
  FROM employees
 WHERE salary > 4200 ; 

SELECT employee_id, last_name, salary, job_id, department_id 
  FROM employees
 WHERE salary > (SELECT salary
                   FROM employees 
                  WHERE employee_id = 107) ; 

SELECT employee_id, last_name, salary, job_id, department_id 
  FROM employees
 WHERE salary > 4200 ; 
 
SELECT e.employee_id, e.last_name, e.salary, e.job_id, e.department_id 
      ,d.salary AS "Lorentz's salary"
  FROM employees e 
      ,(SELECT salary 
          FROM employees 
         WHERE employee_id = 107) d 
 WHERE e.salary > d.salary ; 

SELECT employee_id, last_name, salary, job_id, department_id 
  FROM employees
 WHERE salary > (SELECT salary
                   FROM employees 
                  WHERE employee_id = 107) ; 

SELECT employee_id, last_name, salary, job_id, department_id 
  FROM employees
 WHERE salary < (SELECT salary
                   FROM employees 
                  WHERE employee_id = 107) ; 

SELECT employee_id, last_name, salary, job_id, department_id 
  FROM employees
 WHERE salary > (SELECT AVG(salary) 
                   FROM employees) ; 

SELECT department_id, SUM(salary) 
  FROM employees
 GROUP BY department_id 
HAVING SUM(salary) > (SELECT AVG(SUM(salary)) 
                        FROM employees 
                       GROUP BY department_id); 

SELECT employee_id, last_name, salary, job_id, department_id 
  FROM employees
 WHERE salary = (SELECT MIN(salary) 
                   FROM employees) ; 

SELECT employee_id, last_name, salary, hire_date, department_id 
  FROM employees
 WHERE hire_date < (SELECT hire_date
                      FROM employees
                     WHERE last_name = 'Taylor') ;  

UPDATE employees 
   SET last_name   = 'Taylor' 
 WHERE employee_id = 205 ; 

SELECT employee_id, last_name, salary, hire_date, department_id 
  FROM employees
 WHERE hire_date < (SELECT hire_date
                   FROM employees
                  WHERE last_name = 'Taylor') ;

ROLLBACK ; 

SELECT employee_id, last_name, salary, job_id, department_id 
  FROM employees
 WHERE salary = (SELECT MIN(salary)
                   FROM employees 
                  GROUP BY department_id) ; 

SELECT employee_id, last_name, salary, job_id, department_id 
  FROM employees
 WHERE salary = (2500, 8300, 17000, 4400, 7000, 6000, 4200, 8600) ; 

SELECT employee_id, last_name, salary, job_id, department_id 
  FROM employees
 WHERE salary IN (2500, 8300, 17000, 4400, 7000, 6000, 4200, 8600) ; 

SELECT employee_id, last_name, salary, job_id, department_id 
  FROM employees
 WHERE salary IN (SELECT MIN(salary)
                    FROM employees 
                   GROUP BY department_id) ; 

SELECT employee_id, last_name, salary, job_id, department_id 
  FROM employees
 WHERE salary IN (2500, 8300, 17000, 4400, 7000, 6000, 4200, 8600) ; 

SELECT employee_id, last_name, salary, job_id, department_id 
  FROM employees
 WHERE salary = 2500 
    OR salary = 8300
    OR salary = 17000
    OR salary = 4400
    OR salary = 7000
    OR salary = 6000
    OR salary = 4200
    OR salary = 8600 ; 

SELECT employee_id, last_name, salary, job_id, department_id 
  FROM employees
 WHERE salary =ANY (SELECT MIN(salary)
                      FROM employees 
                     GROUP BY department_id) ; 

SELECT employee_id, last_name, salary, job_id, department_id 
  FROM employees
 WHERE department_id =ANY (10, 20) ; 

SELECT employee_id, last_name, salary, job_id, department_id 
  FROM employees
 WHERE salary >ANY (SELECT AVG(salary)
                      FROM employees 
                     GROUP BY department_id) ;

SELECT employee_id, last_name, salary, job_id, department_id 
  FROM employees
 WHERE salary >ANY (3500, 10154, 19333, 4400, 7000, 9500, 6400, 10033) ;

SELECT employee_id, last_name, salary, job_id, department_id 
  FROM employees
 WHERE salary > 3500
    OR salary > 10154
    OR salary > 19333
    OR salary > 4400
    OR salary > 7000
    OR salary > 9500
    OR salary > 6400
    OR salary > 10033 ;

SELECT employee_id, last_name, salary, job_id, department_id 
  FROM employees
 WHERE salary >ALL (SELECT AVG(salary)
                      FROM employees 
                     GROUP BY department_id) ;

SELECT employee_id, last_name, salary, job_id, department_id 
  FROM employees
 WHERE salary >ALL (3500, 10154, 19333, 4400, 7000, 9500, 6400, 10033) ;

SELECT employee_id, last_name, salary, job_id, department_id 
  FROM employees
 WHERE salary > 3500
   AND salary > 10154
   AND salary > 19333
   AND salary > 4400
   AND salary > 7000
   AND salary > 9500
   AND salary > 6400
   AND salary > 10033 ;

SELECT employee_id, last_name, salary, job_id, department_id 
  FROM employees
 WHERE salary > (SELECT MIN(AVG(salary))
                   FROM employees 
                  GROUP BY department_id) ;

SELECT employee_id, last_name, salary, job_id, department_id 
  FROM employees
 WHERE salary > (SELECT MAX(AVG(salary))
                   FROM employees 
                  GROUP BY department_id) ;

SELECT employee_id, last_name, salary, job_id, department_id 
  FROM employees
 WHERE salary IN (SELECT MIN(salary)
                    FROM employees 
                   GROUP BY department_id)
 ORDER BY department_id ;

UPDATE employees 
SET salary = 4400 
WHERE employee_id = 143 ; 

SELECT employee_id, last_name, salary, job_id, department_id 
  FROM employees
 WHERE salary IN (SELECT MIN(salary)
                    FROM employees 
                   GROUP BY department_id) 
 ORDER BY department_id ;

SELECT employee_id, last_name, salary, job_id, department_id 
  FROM employees
 WHERE (department_id, salary) IN (SELECT department_id, MIN(salary)
                                     FROM employees 
                                    GROUP BY department_id) 
 ORDER BY department_id ;

ROLLBACK; 

SELECT employee_id, last_name, salary, job_id, department_id 
  FROM employees
 WHERE salary > (SELECT AVG(salary)
                   FROM employees 
                  GROUP BY department_id) ;

SELECT employee_id, last_name, salary, job_id, department_id 
  FROM employees
 WHERE salary >ANY (SELECT AVG(salary)
                      FROM employees 
                     GROUP BY department_id) ;

SELECT e.employee_id, e.last_name, e.salary, e.job_id, e.department_id, a.avg_sal
  FROM employees e 
  JOIN (SELECT department_id, AVG(salary) AS AVG_SAL 
          FROM employees 
         GROUP BY department_id) a
    ON e.department_id = a.department_id ; 

SELECT e.employee_id, e.last_name, e.salary, e.job_id, e.department_id, a.avg_sal
  FROM employees e 
  JOIN emp_avg   a
    ON e.department_id = a.department_id ; 

SELECT e.employee_id, e.last_name, e.salary, e.job_id, e.department_id, a.avg_sal
  FROM employees e 
  JOIN (SELECT department_id, AVG(salary) AS AVG_SAL 
          FROM employees 
         GROUP BY department_id) a
    ON e.department_id = a.department_id 
   AND e.salary        > a.avg_sal ;


