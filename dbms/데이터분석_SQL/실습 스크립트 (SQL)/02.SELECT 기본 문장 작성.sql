SELECT *
  FROM employees ;

SELECT *
  FROM departments ;

SELECT * 
  FROM tab ;

SELECT employee_id, last_name, salary, department_id 
  FROM employees ;

DESCRIBE employees 
¶Ç´Â 
DESC employees 

SELECT employee_id, last_name, salary, salary / 4, salary * 12
  FROM employees ;

SELECT employee_id, last_name, salary + 1000 / 4, (salary + 1000) / 4
  FROM employees ;

SELECT employee_id, last_name, hire_date, hire_date * 2
  FROM employees ;

SELECT employee_id, last_name, hire_date, hire_date + 100, hire_date - 100
  FROM employees ;

SELECT employee_id, first_name + last_name 
  FROM employees ;

SELECT employee_id, first_name || last_name 
  FROM employees ;

SELECT employee_id, first_name || ' ' || last_name 
  FROM employees ;

SELECT employee_id, last_name, salary * 12, 'ABC', '2021-01-01'
  FROM employees ;

SELECT employee_id, 'last_name'
  FROM employees ;

SELECT cust_id, lname, gender, address 
  FROM custs ;

SELECT employee_id, last_name, salary, commission_pct, 
       (salary*12) + ((salary*12)*commission_pct)
  FROM employees ;

SELECT employee_id, last_name, salary, commission_pct, (salary*12)*commission_pct
  FROM employees ;

SELECT cust_id, fname first_name, lname last_name, email cust_email
  FROM custs ;

SELECT cust_id, fname AS first_name, lname AS last_name, email AS cust_email
  FROM custs ;

SELECT employee_id                AS "EMPID" 
      ,first_name||' '||last_name AS "Name"
      ,salary * 12                AS "Annual Salary"
  FROM employees ;

SELECT department_id, job_id
  FROM employees ;

SELECT DISTINCT department_id, job_id
  FROM employees ;

SELECT UNIQUE department_id, job_id
  FROM employees ;

SELECT department_id, DISTINCT job_id
  FROM employees ;


