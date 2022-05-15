SELECT cust_id, lname, birthday, gender, credit_limit 
  FROM custs 
 WHERE country = 'USA' ;

SELECT cust_id, lname, birthday, gender, credit_limit 
  FROM custs 
 WHERE country = 'USA'
 ORDER BY lname ;

SELECT cust_id, lname, birthday, gender, credit_limit 
  FROM custs 
 WHERE country = 'USA'
 ORDER BY lname ASC ;

SELECT cust_id, lname, birthday, gender, credit_limit 
  FROM custs 
 WHERE country = 'USA'
 ORDER BY lname DESC ;

SELECT cust_id, lname, birthday, gender, credit_limit 
  FROM custs 
 WHERE country = 'USA'
 ORDER BY 5 DESC ;

SELECT cust_id, lname, TO_CHAR(birthday,'MM/DD') AS birth, gender, credit_limit 
  FROM custs 
 WHERE country = 'USA'
 ORDER BY birth ;

SELECT cust_id, lname, birthday, gender, credit_limit 
  FROM custs 
 WHERE country = 'USA'
 ORDER BY TO_CHAR(birthday,'MM/DD') ;

SELECT cust_id, lname, birthday, gender, credit_limit 
  FROM custs 
 WHERE country = 'USA'
 ORDER BY gender ;

SELECT cust_id, lname, birthday, gender, credit_limit 
  FROM custs 
 WHERE country = 'USA'
 ORDER BY gender DESC ;

SELECT cust_id, lname, birthday, gender, credit_limit 
  FROM custs 
 WHERE country = 'USA'
   AND gender  > 'M' ;

SELECT cust_id, lname, birthday, gender, credit_limit 
  FROM custs 
 WHERE country = 'USA'
 ORDER BY gender ASC NULLS LAST ;

SELECT cust_id, lname, birthday, gender, credit_limit 
  FROM custs 
 WHERE country = 'USA'
 ORDER BY gender ASC NULLS FIRST ;

SELECT cust_id, lname, birthday, gender, credit_limit 
  FROM custs 
 WHERE country = 'USA'
 ORDER BY gender DESC NULLS LAST ;

SELECT cust_id, lname, birthday, gender, credit_limit 
  FROM custs 
 WHERE country = 'USA'
 ORDER BY credit_limit ASC, birthday DESC ;
