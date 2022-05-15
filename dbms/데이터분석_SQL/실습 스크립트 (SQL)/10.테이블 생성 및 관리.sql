SELECT * 
  FROM SESSION_PRIVS 
 WHERE PRIVILEGE IN ('CREATE TABLE', 'CREATE ANY TABLE') ; 

SELECT tablespace_name
      ,(bytes/1024/1024)     AS USED_SPACE
      ,(max_bytes/1024/1024) AS MAX_QUOTA
  FROM user_ts_quotas ;  

SELECT * 
  FROM SESSION_PRIVS 
 WHERE PRIVILEGE = 'UNLIMITED TABLESPACE' ; 

CREATE TABLE dept 
(deptno    NUMBER(2), 
 dname     VARCHAR2(14), 
 loc       VARCHAR2(13)) ; 

CREATE TABLE emp 
(empno     NUMBER(4),
 ename     VARCHAR2(10),
 job       VARCHAR2(9), 
 mgr       NUMBER(4), 
 hiredate  DATE,
 sal       NUMBER(7,2), 
 comm      NUMBER(7,2), 
 deptno    NUMBER(2)) ; 

DESC dept 

DROP TABLE emp PURGE ; 

CREATE TABLE emp 
(empno     NUMBER(4),
 ename     VARCHAR2(10),
 job       VARCHAR2(9), 
 mgr       NUMBER(4), 
 hiredate  DATE  DEFAULT SYSDATE,
 sal       NUMBER(7,2), 
 comm      NUMBER(7,2), 
 deptno    NUMBER(2)) ; 

SELECT column_name, data_type, data_length, data_precision, data_scale, data_default
FROM user_tab_columns
WHERE table_name = 'EMP' ;

CREATE TABLE salgrade 
AS 
SELECT grade_level AS grade, lowest_sal AS losal, highest_sal AS hisal
  FROM job_grades ;

CREATE TABLE salgrade (grade, losal, hisal) 
AS 
SELECT * 
  FROM job_grades ;

SELECT * 
  FROM salgrade ;

CREATE TABLE emp_annsal 
AS 
SELECT employee_id, last_name, salary * 12
  FROM employees ;

CREATE TABLE emp_annsal 
AS 
SELECT employee_id, last_name, salary * 12 AS ANN_SAL
  FROM employees ;

ALTER TABLE salgrade 
ADD (grade_level   NUMBER) ;

SELECT *
  FROM salgrade ;

ALTER TABLE emp 
MODIFY (ename    VARCHAR2(14)
       ,comm     NUMBER(7,2) DEFAULT 0) ; 

SELECT column_name, data_type, data_length, data_precision, data_scale, data_default
FROM user_tab_columns
WHERE table_name = 'EMP'
  AND column_name IN ('ENAME', 'COMM') ;

ALTER TABLE employees 
MODIFY (last_name VARCHAR2(5)); 

ALTER TABLE salgrade
DROP (grade_level); 

ALTER TABLE salgrade
SET UNUSED (grade) ONLINE ; 

SELECT * 
  FROM salgrade ;

SELECT * 
  FROM user_unused_col_tabs ;

ALTER TABLE salgrade
DROP UNUSED COLUMNS ;

ALTER TABLE salgrade 
RENAME COLUMN losal TO lowest_sal ;

RENAME salgrade TO sal_grade ; 

DROP TABLE emp ; 

SELECT * FROM emp ; 

SELECT object_name, original_name, droptime 
  FROM user_recyclebin ;

FLASHBACK TABLE emp TO BEFORE DROP ;

DROP TABLE sal_grade PURGE ; 

SELECT * FROM dictionary ;