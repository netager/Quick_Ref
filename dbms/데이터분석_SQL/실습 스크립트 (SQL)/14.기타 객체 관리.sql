CREATE VIEW empv50 
AS
SELECT employee_id, last_name, salary, job_id
  FROM employees 
 WHERE department_id = 50 ;

SELECT * 
  FROM empv50 ;

SELECT * 
  FROM (SELECT employee_id, last_name, salary, job_id
          FROM employees 
         WHERE department_id = 50) empv50 ;

SELECT * 
  FROM user_views ;

CREATE TABLE empt50 
AS
SELECT employee_id, last_name, salary, job_id
  FROM employees 
 WHERE department_id = 50 ;

SELECT * 
  FROM empt50 ;

UPDATE employees 
SET salary = 7000 
WHERE employee_id = 124 ;

SELECT * 
  FROM empt50 ;

SELECT * 
  FROM empv50 ;

ROLLBACK ;

CREATE VIEW empv50 
AS
SELECT employee_id, last_name, salary, job_id, hire_date
  FROM employees 
 WHERE department_id = 50 ;

CREATE OR REPLACE VIEW empv50 
AS
SELECT employee_id, last_name, salary, job_id, hire_date
  FROM employees 
 WHERE department_id = 50 ;

DROP VIEW empv50 ;

CREATE INDEX emp_lname_idx ON employees(last_name);

SELECT last_name, rowid
  FROM employees
 WHERE last_name IS NOT NULL 
 ORDER BY last_name, rowid ; 

SELECT last_name, salary, department_id
  FROM employees
 WHERE last_name = 'Davies'; 

SELECT last_name, salary, department_id
  FROM employees
 WHERE rowid = '검색된 ROWID 복사'; 
 
SELECT last_name, salary, department_id
  FROM employees
 WHERE last_name = 'Davies'; 

SELECT i.index_name, i.uniqueness, i.table_name, c.column_name
  FROM user_indexes     i
      ,user_ind_columns c
 WHERE i.index_name = c.index_name 
   AND i.table_name = 'COPY_EMP' ;  

DROP INDEX emp_lname_idx ;

CREATE SEQUENCE seq1 
START WITH 1000 
INCREMENT BY  2
MAXVALUE 1050 
MINVALUE 1000 
CYCLE ; 

CREATE SEQUENCE empno_seq
START WITH 1000 
INCREMENT BY  1
MAXVALUE 9999
NOCYCLE ; 

INSERT INTO emp (empno,ename,sal,deptno) 
VALUES (empno_seq.NEXTVAL,'SCOTT',3000,20);

INSERT INTO emp (empno,ename,sal,deptno) 
VALUES (empno_seq.NEXTVAL,'JONES',2975,20);

SELECT * 
  FROM emp ;

SELECT empno_seq.CURRVAL 
  FROM dual ;

ALTER TABLE emp 
MODIFY (empno   NUMBER(4) DEFAULT empno_seq.NEXTVAL) ;

INSERT INTO emp (ename,sal,deptno) 
VALUES ('SMITH',800,20);

SELECT * FROM emp ; 

ALTER SEQUENCE seq1 
INCREMENT BY  1
MAXVALUE 1050 
NOCYCLE ; 

ALTER SEQUENCE empno_seq
MAXVALUE 1001 ;

SELECT * FROM user_sequences ; 

DROP SEQUENCE seq1 ;

SELECT *
  FROM user02.emp ; 

CREATE SYNONYM semp FOR user02.emp ;  


SELECT * 
  FROM semp ; 

CREATE SYNONYM semp FOR user01.employees ;  

SELECT * 
  FROM semp ;

SELECT * 
  FROM user_synonyms ;

DROP SYNONYM semp ;



