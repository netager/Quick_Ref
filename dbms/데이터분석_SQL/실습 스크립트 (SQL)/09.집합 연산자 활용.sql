SELECT department_id, job_id
  FROM employees
 WHERE department_id IN (20,50) ;

SELECT department_id, job_id
  FROM employees
 WHERE department_id IN (50,90) ;

SELECT department_id, job_id
  FROM employees
 WHERE department_id IN (20,50) 
UNION ALL
SELECT department_id, job_id
  FROM employees
 WHERE department_id IN (50,90) 
ORDER BY department_id, job_id ;

SELECT department_id, job_id
  FROM employees
 WHERE department_id IN (20,50) 
UNION
SELECT department_id, job_id
  FROM employees
 WHERE department_id IN (50,90) 
ORDER BY department_id, job_id ;

SELECT department_id, job_id
  FROM employees
 WHERE department_id IN (20,50) 
INTERSECT
SELECT department_id, job_id
  FROM employees
 WHERE department_id IN (50,90) 
ORDER BY department_id, job_id ;

SELECT department_id, job_id
  FROM employees
 WHERE department_id IN (20,50) 
MINUS
SELECT department_id, job_id
  FROM employees
 WHERE department_id IN (50,90) 
ORDER BY department_id, job_id ;

SELECT department_id, job_id
  FROM employees
 WHERE department_id IN (50,90) 
MINUS
SELECT department_id, job_id
  FROM employees
 WHERE department_id IN (20,50) 
ORDER BY department_id, job_id ;

SELECT department_id, job_id, SUM(salary)
  FROM employees
 GROUP BY department_id, job_id ;

SELECT department_id, SUM(salary)
  FROM employees
 GROUP BY department_id ;

SELECT department_id, job_id, SUM(salary)
  FROM employees
 GROUP BY department_id, job_id 
UNION ALL
SELECT department_id, SUM(salary)
  FROM employees
 GROUP BY department_id ;

SELECT department_id, job_id, SUM(salary)
  FROM employees
 GROUP BY department_id, job_id 
UNION ALL
SELECT department_id, SUM(salary), NULL
  FROM employees
 GROUP BY department_id ;

SELECT department_id, job_id, SUM(salary)
  FROM employees
 GROUP BY department_id, job_id 
UNION ALL
SELECT department_id, TO_CHAR(SUM(salary)), NULL
  FROM employees
 GROUP BY department_id ;

SELECT department_id, job_id, SUM(salary)
  FROM employees
 GROUP BY department_id, job_id 
UNION ALL
SELECT department_id, NULL, SUM(salary)
  FROM employees
 GROUP BY department_id ;

SELECT department_id, job_id, SUM(salary)
  FROM employees
 GROUP BY department_id, job_id 
 ORDER BY department_id, job_id 
UNION ALL
SELECT department_id, NULL, SUM(salary)
  FROM employees
 GROUP BY department_id 
 ORDER BY department_id ;

SELECT department_id, job_id, SUM(salary)
  FROM employees
 GROUP BY department_id, job_id 
UNION ALL
SELECT department_id, NULL, SUM(salary) AS SUM_SAL
  FROM employees
 GROUP BY department_id 
 ORDER BY department_id, job_id;

SELECT department_id AS deptno, job_id AS job, SUM(salary) AS SUM_SAL
  FROM employees
 GROUP BY department_id, job_id 
UNION ALL
SELECT department_id, NULL, SUM(salary)
  FROM employees
 GROUP BY department_id 
 ORDER BY department_id ;

SELECT department_id AS deptno, job_id AS job, SUM(salary) AS SUM_SAL
  FROM employees
 GROUP BY department_id, job_id 
UNION ALL
SELECT department_id, NULL, SUM(salary)
  FROM employees
 GROUP BY department_id 
 ORDER BY deptno, job ;



