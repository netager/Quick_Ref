SELECT *
  FROM custs ;

SELECT cust_id, lname, birthday,city, country
  FROM custs 
 WHERE cust_id = 347 ;

SELECT cust_id, lname, birthday, city, country
  FROM custs 
 WHERE lname = 'Quinlan' ;

SELECT cust_id, lname, birthday, city, country
  FROM custs 
 WHERE lname = 'quinlan' ;

SELECT cust_id, lname, birthday, city, country
  FROM custs 
 WHERE lname = Quinlan ;

SELECT cust_id, lname, birthday, city, country
  FROM custs 
 WHERE birthday = '1959/05/03' ;

SELECT cust_id, lname, birthday, city, country
  FROM custs 
 WHERE birthday = 1959/05/03 ;

SELECT * 
  FROM orders ;

SELECT * 
FROM orders
 WHERE order_total > 30000 ;

SELECT cust_id, lname, birthday, city, country 
  FROM custs
 WHERE lname > 'Quinlan' ;

SELECT cust_id, lname, birthday, city, country 
  FROM custs
 WHERE birthday > '1983/05/01' ;

SELECT * 
FROM orders
 WHERE order_mode = 'online' ;

SELECT * 
FROM orders
 WHERE order_mode != 'online' ;

SELECT * 
FROM orders
 WHERE order_total BETWEEN 30000 AND 48552 ;

SELECT * 
FROM orders
 WHERE order_date BETWEEN '2008/01/01' AND '2008/06/30' ;

SELECT * 
FROM orders
 WHERE order_total BETWEEN 48552 AND 30000 ;

SELECT * 
FROM orders
 WHERE order_total BETWEEN 48552 AND 48552 ;

SELECT * 
FROM orders
WHERE order_total >= 30000 
   AND order_total <= 48552 ;

SELECT * 
  FROM orders 
 WHERE order_status = 0 ;

SELECT * 
  FROM orders 
 WHERE order_status IN (0, 8) ;

SELECT cust_id, lname, gender, city, country 
  FROM custs 
 WHERE country IN ('USA', 'Spain') ;

SELECT cust_id, lname, gender, city, country 
  FROM custs 
 WHERE country = 'USA'
    OR country = 'Spain' ;

SELECT prod_id, prod_name, warranty, list_price
  FROM prods 
 WHERE prod_name LIKE 'Monitor%' ;

SELECT prod_id, prod_name, warranty, list_price
  FROM prods 
 WHERE prod_name LIKE 'Monitor______' ;

SELECT cust_id, lname, email, birthday, gender
  FROM custs 
 WHERE email LIKE '%_%' ;

SELECT cust_id, lname, email, birthday, gender
  FROM custs 
 WHERE email LIKE '%\_%' ESCAPE '\' ;

SELECT cust_id, lname, email, birthday, gender
  FROM custs 
 WHERE email LIKE '%!_%' ESCAPE '!' ;

SELECT cust_id, lname, email, birthday, gender
  FROM custs 
 WHERE birthday LIKE '197%' ;

SELECT cust_id, lname, email, birthday, gender
  FROM custs 
 WHERE cust_id LIKE '7%' ;

SELECT cust_id, lname, email, birthday, gender
  FROM custs 
 WHERE gender = NULL ;

SELECT cust_id, lname, email, birthday, gender
  FROM custs 
 WHERE gender IS NULL ;

SELECT cust_id, lname, email, birthday, gender
  FROM custs 
 WHERE gender IS NOT NULL ;

SELECT *
  FROM orders 
 WHERE 1 = 1  ;

SELECT *
  FROM orders 
 WHERE 1 = 0  ;

SELECT *
  FROM orders 
 WHERE order_mode  = 'direct' 
       order_total > 30000 ;

SELECT *
  FROM orders 
 WHERE order_mode = 'direct' 
   AND order_total > 30000 ;

SELECT *
  FROM orders 
 WHERE order_mode = 'direct' 
    OR order_total > 30000 ;

SELECT * 
FROM orders
 WHERE order_total NOT BETWEEN 10000 AND 70000 ;

SELECT cust_id, lname, gender, city, country 
  FROM custs 
 WHERE country NOT IN ('USA', 'Spain','United Kingdom') ;

SELECT prod_id, prod_name, warranty, list_price
FROM prods 
WHERE prod_name NOT LIKE 'Monitor%' ;

SELECT cust_id, lname, email, birthday, gender
  FROM custs 
 WHERE gender IS NOT NULL ;

SELECT *
  FROM orders 
 WHERE NOT order_mode  = 'direct' ;

SELECT cust_id, lname, gender, city, country 
  FROM custs 
 WHERE country = 'USA'
    OR country = 'Spain' 
   AND gender  = 'F' ;

SELECT cust_id, lname, gender, city, country 
  FROM custs 
 WHERE country = 'USA'
    OR ( country = 'Spain' 
   AND gender  = 'F' ) ;

SELECT cust_id, lname, gender, city, country 
  FROM custs 
 WHERE ( country = 'USA'
    OR country = 'Spain' )
   AND gender  = 'F' ;

SELECT cust_id, lname, gender, city, country 
  FROM custs 
 WHERE country IN ('USA', 'Spain')
   AND gender  = 'F' ;

