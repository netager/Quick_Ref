SELECT SUM(order_total), AVG(order_total), MAX(order_total), MIN(order_total)
  FROM orders ; 

SELECT SUM(order_date)
  FROM orders ;

SELECT MAX(last_name), MIN(hire_date)
  FROM employees ;

SELECT *
  FROM orders ;

SELECT COUNT(order_status), COUNT(DISTINCT order_status)
  FROM orders ;

SELECT COUNT(*), COUNT(sales_rep_id), COUNT(DISTINCT sales_rep_id)
  FROM orders ;

SELECT SUM(commission_pct)/COUNT(*)
      ,AVG(commission_pct)
  FROM employees ;

SELECT AVG(NVL(commission_pct,0))
  FROM employees ;

SELECT SUM(salary)
  FROM employees
 WHERE department_id = 80 ;

SELECT SUM(salary)
  FROM employees ; 

SELECT SUM(salary)
  FROM employees 
 GROUP BY department_id ; 

SELECT department_id, SUM(salary)
  FROM employees
GROUP BY department_id ;

SELECT department_id, job_id, SUM(salary)
  FROM employees
GROUP BY department_id ;

SELECT department_id, SUM(salary)
  FROM employees ;

SELECT department_id, job_id, SUM(salary)
  FROM employees 
GROUP BY department_id, job_id ;

SELECT TO_CHAR(order_date, 'YYYY') AS order_year
      ,cust_id
      ,SUM(order_total)
  FROM orders 
GROUP BY TO_CHAR(order_date, 'YYYY'), cust_id ;

SELECT employee_id, last_name, SUM(salary)
  FROM employees 
 GROUP BY employee_id, last_name ;

SELECT TO_CHAR(order_date, 'YYYY') AS order_year
      ,cust_id
      ,SUM(order_total)
  FROM orders 
 WHERE SUM(order_total) > 20000   
GROUP BY TO_CHAR(order_date, 'YYYY'), cust_id ;

SELECT TO_CHAR(order_date, 'YYYY') AS order_year
      ,cust_id
      ,SUM(order_total)
  FROM orders 
 GROUP BY TO_CHAR(order_date, 'YYYY'), cust_id 
HAVING SUM(order_total) > 20000 ;

SELECT department_id, SUM(salary)
  FROM employees
 GROUP BY department_id 
HAVING SUM(salary) > 50000
   AND hire_date < TO_DATE('2007/01/01','YYYY/MM/DD') ;

SELECT department_id, SUM(salary)
  FROM employees
 WHERE hire_date < TO_DATE('2007/01/01','YYYY/MM/DD')
 GROUP BY department_id 
HAVING SUM(salary) > 50000 ;

SELECT MAX(SUM(order_total))
  FROM orders 
 GROUP BY cust_id ;

SELECT AVG(MAX(SUM(order_total)))
  FROM orders 
 GROUP BY cust_id ;

