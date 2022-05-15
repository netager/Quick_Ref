SELECT * 
  FROM orders 
 WHERE order_id = 2390 ; 

SELECT cust_id, lname, city, country  
  FROM custs 
 WHERE cust_id = 152 ; 

SELECT *
  FROM order_items 
 WHERE order_id = 2390; 

SELECT prod_id, prod_name, list_price 
  FROM prods 
  WHERE prod_id IN (1910,1912,1948) ;

SELECT o.order_id              AS order_id
      ,c.cust_id               AS cust_id
      ,c.fname||' '||c.lname   AS cust_name
      ,o.order_date            AS order_date
      ,p.prod_name             AS prod_name
      ,p.list_price            AS list_price
      ,i.unit_price            AS price
      ,i.quantity              AS qty
      ,p.list_price*i.quantity AS list_tot
      ,i.unit_price*i.quantity AS order_tot
      ,p.list_price*i.quantity - i.unit_price*i.quantity             AS discount
      ,LPAD(ROUND((1-(i.unit_price/p.list_price))*100,2)||'%',6,' ') AS discount_rate
  FROM custs       c 
      ,orders      o
      ,order_items i
      ,prods       p 
 WHERE c.cust_id  = o.cust_id 
   AND o.order_id = i.order_id 
   AND i.prod_id  = p.prod_id
   AND o.order_id = 2390 ;

SELECT COUNT(*) 
FROM orders ; 

SELECT COUNT(*)
FROM order_items ; 

SELECT order_id, order_date, cust_Id, order_total
FROM orders 
WHERE order_id = 2390 ;

SELECT *
FROM order_items
ORDER BY order_id ;

SELECT * 
FROM orders
    ,order_items 
ORDER BY 1, 8 ;       

SELECT * 
FROM orders
    ,order_items ;

SELECT *
  FROM orders      o 
      ,order_items i 
 WHERE o.order_id = i.order_id
 ORDER BY 1 ;  

SELECT *
  FROM orders       
      ,order_items  
 WHERE order_id = order_id ;

SELECT *
FROM orders       
    ,order_items  
WHERE orders.order_id = order_items.order_id ;  

SELECT *
FROM orders      o 
    ,order_items i 
WHERE o.order_id = i.order_id ; 

SELECT *
  FROM orders      AS o 
      ,order_items AS i 
 WHERE o.order_id = i.order_id ;

SELECT o.order_id, o.order_date, o.order_mode, o.cust_id,
       i.prod_id, i.unit_price, i.quantity 
  FROM orders      o 
      ,order_items i 
 WHERE o.order_id = i.order_id 
   AND o.order_id = 2390 ;

SELECT o.order_id, o.order_date, o.order_mode, o.cust_id,
       i.prod_id, i.unit_price, i.quantity 
  FROM orders      o 
      ,order_items i 
 WHERE o.order_id = i.order_id ;

SELECT c.cust_id, c.lname, c.country, 
       o.order_id, o.order_date, o.order_status, o.order_total
  FROM custs  c 
      ,orders o
 WHERE c.cust_id = o.cust_id
 AND o.order_id = 2390 ;

SELECT p.prod_id, p.prod_name, p.prod_status, p.list_price, 
       i.order_id, i.unit_price, i.quantity 
  FROM prods p 
      ,order_items i 
 WHERE p.prod_id = i.prod_id
 AND i.order_id = 2390 ;

SELECT * 
FROM job_grades ;

SELECT e.employee_id, e.last_name, e.job_id, e.salary,
j.grade_level, j.lowest_sal, j.highest_sal 
  FROM employees  e 
      ,job_grades j
 WHERE e.salary BETWEEN j.lowest_sal AND j.highest_sal ;

SELECT p.prod_id, p.prod_name, p.list_price, p.min_price, 
       i.order_id, i.unit_price, i.quantity 
  FROM prods       p 
      ,order_items i 
 WHERE p.prod_id   = i.prod_id 
   AND p.min_price > i.unit_price ;

SELECT o.order_id, o.order_date, o.cust_id, 
       i.order_id, i.prod_id, i.unit_price, i.quantity 
  FROM orders      o 
      ,order_items i 
 WHERE o.order_id = i.order_id 
    OR o.order_id = 2390 ;

SELECT o.order_id, o.order_date, o.cust_id, 
       i.order_id, i.prod_id, i.unit_price, i.quantity 
  FROM orders      o 
      ,order_items i 
 WHERE o.order_id = i.order_id 
   AND o.order_id = 2390 ;

SELECT o.order_id              AS order_id
      ,c.cust_id               AS cust_id
      ,c.fname||' '||c.lname   AS cust_name
      ,o.order_date            AS order_date
      ,p.prod_name             AS prod_name
      ,p.list_price            AS list_price
      ,i.unit_price            AS price
      ,i.quantity              AS qty
      ,p.list_price*i.quantity AS list_tot
      ,i.unit_price*i.quantity AS order_tot
      ,p.list_price*i.quantity - i.unit_price*i.quantity             AS discount
      ,LPAD(ROUND((1-(i.unit_price/p.list_price))*100,2)||'%',6,' ') AS discount_rate
  FROM custs       c 
      ,orders      o
      ,order_items i
      ,prods       p 
 WHERE c.cust_id  = o.cust_id 
   AND o.order_id = i.order_id 
   AND i.prod_id  = p.prod_id
   AND o.order_id = 2390 ; 

SELECT last_name, salary, department_id 
  FROM employees e 
 WHERE e.salary > 20000 ; 

SELECT last_name, salary, department_id 
  FROM employees e 
 WHERE employees.salary > 20000 ;

SELECT employee_id, job_id, salary  
  FROM employees 
 WHERE employee_id = 107 ;

SELECT employee_id, last_name, hire_date, job_id, salary
  FROM employees 
 WHERE job_id = 'IT_PROG'
   AND salary > 4200 ;

SELECT e.employee_id, e.last_name, e.hire_date, e.job_id, e.salary
  FROM employees e 
      ,employees s 
 WHERE e.job_id = s.job_id 
   AND e.salary > s.salary 
   AND s.employee_id = 107 ; 

SELECT employee_id, last_name, hire_date, job_id, salary
  FROM employees 
 WHERE job_id = (SELECT job_id
                   FROM employees 
                  WHERE employee_id = 107) 
   AND salary > (SELECT salary  
                   FROM employees 
                  WHERE employee_id = 107) ;

SELECT e.employee_id, e.last_name, e.hire_date, e.job_id, e.salary
      ,s.salary AS "Lorentz's Salary"
  FROM employees e 
      ,employees s 
 WHERE e.job_id = s.job_id 
   AND e.salary > s.salary 
   AND s.employee_id = 107 ; 

SELECT c.cust_id, c.lname, o.order_id, o.order_date, o.order_total
  FROM custs  c 
      ,orders o 
 WHERE c.cust_id = o.cust_id ;

SELECT c.cust_id, c.lname, c.country, o.order_id, o.order_date, o.order_total
  FROM custs  c 
      ,orders o 
 WHERE c.cust_id = o.cust_id (+);

SELECT department_id, COUNT(*) 
  FROM employees 
 GROUP BY department_id 
 ORDER BY department_id ;

SELECT *
FROM departments ;

SELECT e.employee_id, e.last_name, e.salary, e.department_id,
       d.department_id, d.department_name
  FROM employees   e 
      ,departments d 
 WHERE e.department_id = d.department_id ;

SELECT e.employee_id, e.last_name, e.salary, e.department_id,
       d.department_id, d.department_name
  FROM employees   e 
      ,departments d 
 WHERE e.department_id = d.department_id (+) ;

SELECT e.employee_id, e.last_name, e.salary, e.department_id,
       d.department_id, d.department_name
  FROM employees   e 
      ,departments d 
 WHERE e.department_id (+) = d.department_id ;

SELECT e.employee_id, e.last_name, e.salary, e.department_id,
       d.department_id, d.department_name
  FROM employees   e 
      ,departments d 
 WHERE e.department_id (+) = d.department_id (+);

SELECT o.order_id, o.order_date, o.order_mode, o.cust_id,
       i.prod_id, i.unit_price, i.quantity 
FROM orders      o 
    ,order_items i 
WHERE o.order_id = i.order_id ;

SELECT o.order_id, o.order_date, o.order_mode, o.cust_id,
       i.prod_id, i.unit_price, i.quantity 
FROM orders      o 
JOIN order_items i 
  ON o.order_id = i.order_id ;

SELECT o.order_id, o.order_date, o.order_mode, o.cust_id,
       i.prod_id, i.unit_price, i.quantity 
FROM orders      o 
    ,order_items i 
WHERE o.order_id = i.order_id 
  AND o.order_id = 2390 ;

SELECT o.order_id, o.order_date, o.order_mode, o.cust_id,
       i.prod_id, i.unit_price, i.quantity 
FROM orders      o 
JOIN order_items i 
  ON o.order_id = i.order_id 
WHERE o.order_id = 2390 ;

SELECT o.order_id, o.order_date, o.order_mode, o.cust_id,
       i.prod_id, i.unit_price, i.quantity 
FROM orders      o 
JOIN order_items i 
  ON o.order_id = i.order_id 
 AND o.order_id = 2390 ;

SELECT e.employee_id, e.last_name, e.job_id, e.salary,
j.grade_level, j.lowest_sal, j.highest_sal 
FROM employees  e 
    ,job_grades j
WHERE e.salary BETWEEN j.lowest_sal AND j.highest_sal ;

SELECT e.employee_id, e.last_name, e.job_id, e.salary,
j.grade_level, j.lowest_sal, j.highest_sal 
FROM employees  e 
JOIN job_grades j
  ON e.salary BETWEEN j.lowest_sal AND j.highest_sal ;

SELECT p.prod_id, p.prod_name, p.list_price, p.min_price, 
       i.order_id, i.unit_price, i.quantity 
FROM prods       p 
    ,order_items i 
WHERE p.prod_id   = i.prod_id 
  AND p.min_price > i.unit_price ;

SELECT p.prod_id, p.prod_name, p.list_price, p.min_price, 
       i.order_id, i.unit_price, i.quantity 
FROM prods p 
JOIN order_items i 
  ON p.prod_id   = i.prod_id 
 AND p.min_price > i.unit_price ;

SELECT o.order_id              AS order_id
      ,c.cust_id               AS cust_id
      ,c.fname||' '||c.lname   AS cust_name
      ,o.order_date            AS order_date
      ,o.order_total           AS order_total
      ,i.prod_id               AS prod_id
      ,i.unit_price            AS unit_price
      ,i.quantity              AS quantity
FROM custs       c 
JOIN orders      o
JOIN order_items i
  ON c.cust_id  = o.cust_id 
  AND o.order_id = i.order_id 
  AND o.order_id = 2390 ; 

SELECT o.order_id              AS order_id
      ,c.cust_id               AS cust_id
      ,c.fname||' '||c.lname   AS cust_name
      ,o.order_date            AS order_date
      ,o.order_total           AS order_total
      ,i.prod_id               AS prod_id
      ,i.unit_price            AS unit_price
      ,i.quantity              AS quantity
FROM custs       c 
JOIN orders      o
  ON c.cust_id  = o.cust_id
JOIN order_items i
  ON o.order_id = i.order_id 
WHERE o.order_id = 2390 ; 

SELECT e.employee_id, e.last_name, e.salary, e.department_id,
       d.department_id, d.department_name
  FROM employees   e 
      ,departments d 
 WHERE e.department_id = d.department_id (+) ;

SELECT e.employee_id, e.last_name, e.salary, e.department_id,
       d.department_id, d.department_name
  FROM employees e LEFT OUTER JOIN departments d 
    ON e.department_id = d.department_id ; 

SELECT e.employee_id, e.last_name, e.salary, e.department_id,
       d.department_id, d.department_name
  FROM employees e RIGHT OUTER JOIN departments d 
    ON e.department_id = d.department_id ;

SELECT e.employee_id, e.last_name, e.salary, e.department_id,
       d.department_id, d.department_name
  FROM employees e FULL OUTER JOIN departments d 
    ON e.department_id = d.department_id ;

SELECT * 
FROM orders
    ,order_items ;

SELECT * 
FROM orders CROSS JOIN order_items ;

