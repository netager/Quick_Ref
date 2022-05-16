INSERT INTO orders(order_id,order_date,order_mode,cust_id,order_status,order_total) 
VALUES(3000, SYSDATE, 'online', 246, 0, 2000) ; 

INSERT INTO order_items(order_id,prod_id,unit_price,quantity)
VALUES(3000,2335,100,10); 

INSERT INTO order_items(order_id,prod_id,unit_price,quantity)
VALUES(3000,1799,1000,1); 

COMMIT ; 

A> SELECT order_id, order_status, order_total
   FROM orders
   WHERE order_id = 2390 ;

B> SELECT order_id, order_status, order_total
   FROM orders
   WHERE order_id = 2390 ;
   
   
A> UPDATE orders 
   SET order_status = 8 
      ,order_total  = 7600 
   WHERE order_id = 2390 ;

A> SELECT order_id, order_status, order_total
     FROM orders
    WHERE order_id = 2390 ;

B> SELECT order_id, order_status, order_total
     FROM orders
    WHERE order_id = 2390 ;

A> COMMIT ; 

A> SELECT order_id, order_status, order_total
     FROM orders
    WHERE order_id = 2390 ;

B> SELECT order_id, order_status, order_total
     FROM orders
    WHERE order_id = 2390 ;

A> UPDATE orders 
   SET order_total  = 7616.8 
   WHERE order_id = 2390 ;
   
B> UPDATE orders 
   SET order_status = 9
   WHERE order_id = 2390 ;

A> COMMIT ;    
B> COMMIT ; 
   
INSERT INTO emp 
VALUES (7788,'SCOTT','ANALYST',7566,TO_DATE('1987/04/19','YYYY/MM/DD'),3000,NULL,20);

CREATE TABLE copy_emp 
(id     NUMBER(4),
 name   VARCHAR2(10)) ; 

ROLLBACK ; 

SELECT * FROM emp ;

DELETE emp ;

강제 종료 후 재접속> SELECT * FROM emp ;

