SELECT last_name, UPPER(last_name), LOWER(last_name), email, INITCAP(email)
  FROM employees ; 

SELECT lname, LENGTH(lname),      
       phone, SUBSTR(phone,2,3)  
  FROM custs
 WHERE country = 'USA';
 
SELECT email
      ,INSTR(email,'@')                                    AS position
      ,SUBSTR(email,1, INSTR(email,'@')-1)                 AS ID 
      ,REPLACE(SUBSTR(email,1, INSTR(email,'@')-1),'_','') AS NEW_ID
  FROM custs 
 WHERE email LIKE '%\_%' ESCAPE '\';

SELECT 58.567
      ,ROUND(58.567, 2)     
      ,ROUND(58.567, 0)     
      ,ROUND(58.567, -1)    
  FROM dual ;

SELECT 58.567
      ,TRUNC(58.567, 2)    
      ,TRUNC(58.567, 0)    
      ,TRUNC(58.567, -1)   
  FROM dual ;

SELECT 58.567
      ,ROUND(58.567, 2)    
      ,ROUND(58.567, 0)    
      ,ROUND(58.567, -1)   
  FROM orders ;

ALTER SESSION SET nls_date_format = 'YYYY/MM/DD HH24:MI:SS' ;

SELECT SYSDATE
  FROM dual ;

ALTER SESSION SET nls_date_format = 'YYYY/MM/DD' ;

SELECT SYSDATE
  FROM dual ;

SELECT TO_DATE('95/11/25','YY/MM/DD')
      ,TO_DATE('95/11/25','RR/MM/DD')
  FROM dual ;

SELECT last_name, hire_date, SYSDATE - hire_date
  FROM employees ;

SELECT last_name, hire_date, SYSDATE + hire_date
  FROM employees ;

ALTER SESSION SET nls_date_format = 'YYYY/MM/DD HH24:MI:SS' ;

SELECT SYSDATE, SYSDATE + 10, SYSDATE - 10 
  FROM dual ;

SELECT SYSDATE, SYSDATE + 1/24, SYSDATE + 5/1440, SYSDATE + 10/86400
  FROM dual ;

SELECT SYSDATE, SYSDATE - 1/24, SYSDATE - 5/1440, SYSDATE - 10/86400
  FROM dual ;

ALTER SESSION SET nls_date_format = 'YYYY/MM/DD' ;

SELECT order_date
      ,ADD_MONTHS(order_date, 2)
      ,MONTHS_BETWEEN(SYSDATE,order_date)
  FROM orders ;

SELECT order_date
      ,NEXT_DAY(order_date, '±›ø‰¿œ')
      ,LAST_DAY(order_date)
  FROM orders ;

SELECT SYSDATE
      ,TO_CHAR(SYSDATE, 'YYYY')
      ,TO_CHAR(SYSDATE, 'MM/DD')
      ,TO_CHAR(SYSDATE, 'Month DD, YYYY')
  FROM dual ;

SELECT last_name, salary
      ,TO_CHAR(salary, '$99,999.00')
      ,TO_CHAR(salary, '$00,000.00')
      ,TO_CHAR(salary, 'L99,000.00')
  FROM employees ;

SELECT '$15,000' + '$20,000'
  FROM dual ;

SELECT TO_NUMBER('$15,000','$99,999') + TO_NUMBER('$20,000','$99,999')
  FROM dual ;

ALTER SESSION SET nls_date_format = 'YYYY/MM/DD HH24:MI:SS' ; 

SELECT '2021/01/01'
      ,TO_DATE('2021/01/01','YYYY/MM/DD')
  FROM dual ;

ALTER SESSION SET nls_date_format = 'YYYY/MM/DD' ; 

SELECT last_name, salary, commission_pct
      ,(salary*12) + ((salary*12)*commission_pct) 
  FROM employees 
 WHERE department_id IN (50, 80) ; 

SELECT last_name, salary, commission_pct, NVL(commission_pct,0)
      ,(salary*12) + ((salary*12)*NVL(commission_pct,0)) AS ANN_SAL
  FROM employees 
 WHERE department_id IN (50, 80) ;

SELECT last_name, job_id, salary, salary * 1.1 
  FROM employees 
 WHERE job_id = 'AD_PRES' ;

SELECT last_name, job_id, salary, 
       CASE job_id WHEN 'AD_PRES' THEN salary * 1.1 
                   WHEN 'AD_VP'   THEN salary * 1.15
                   WHEN 'IT_PROG' THEN salary * 1.2 
                   ELSE salary * 1.05 END AS new_salary
  FROM employees ;

SELECT last_name, job_id, salary, 
       CASE  WHEN job_id = 'AD_PRES' THEN salary * 1.1 
             WHEN job_id = 'AD_VP'   THEN salary * 1.15
             WHEN job_id = 'IT_PROG' THEN salary * 1.2 
             ELSE salary * 1.05 END AS new_salary
  FROM employees ;

SELECT last_name, job_id, salary, 
       CASE  WHEN salary <=  5000 THEN '∆Ú±’ ¿Ã«œ' 
             WHEN salary <= 10000 THEN '∆Ú±’'
             WHEN salary <= 20000 THEN '∆Ú±’ ¿ÃªÛ'
             ELSE '√÷ªÛ±ﬁ' END AS grade
  FROM employees ;

SELECT last_name, job_id, salary, 
       DECODE(job_id, 'AD_PRES' ,salary * 1.1 
                    , 'AD_VP'   ,salary * 1.15
                    ,'IT_PROG'  ,salary * 1.2 
                    ,salary * 1.05) AS new_salary
  FROM employees ;

SELECT last_name, job_id, salary, 
       DECODE(SIGN(salary-20000),1,'√÷ªÛ±ﬁ',
              DECODE(SIGN(salary-10000),1,'∆Ú±’¿ÃªÛ',
                     DECODE(SIGN(salary-5000),1,'∆Ú±’','∆Ú±’¿Ã«œ'))) AS grade
  FROM employees ;


 
