UPDATE employees 
SET employee_id = 100
WHERE employee_id = 104 ;

UPDATE employees 
SET last_name = NULL
WHERE employee_id = 104 ; 

UPDATE employees 
SET department_id = 200
WHERE employee_id = 104 ;

CREATE TABLE copy_emp 
AS SELECT * FROM employees ; 

UPDATE copy_emp
SET employee_id = 100
   ,first_name  = NULL
   ,department_id = 200 
WHERE employee_id = 104 ;

SELECT employee_id, first_name, department_id 
FROM copy_emp 
WHERE employee_id = 100 ;

ROLLBACK ;

ALTER TABLE copy_emp 
MODIFY first_name CONSTRAINT cpemp_nn NOT NULL ;

UPDATE copy_emp
SET first_name = NULL
WHERE employee_id = 104 ; 

ALTER TABLE copy_emp 
ADD CONSTRAINT cpemp_uk UNIQUE (phone_number) ;

UPDATE copy_emp 
SET phone_number  = '650.121.2004' 
WHERE employee_id = 143 ;

UPDATE copy_emp 
SET phone_number    = NULL
WHERE department_id = 50 ; 

ROLLBACK ;

ALTER TABLE copy_emp 
ADD CONSTRAINT cpemp_pk PRIMARY KEY(employee_id) ;

UPDATE copy_emp 
SET employee_id = 100
WHERE employee_id = 104 ;

UPDATE copy_emp 
SET employee_id = NULL
WHERE employee_id = 104 ;

ALTER TABLE copy_emp 
ADD CONSTRAINT cpemp_ck CHECK (salary > 0) ;

UPDATE copy_emp 
SET salary = 0
WHERE employee_id = 104 ;

UPDATE copy_emp 
SET salary = NULL
WHERE employee_id = 104 ;

ROLLBACK;

ALTER TABLE copy_emp 
ADD CONSTRAINT cpemp_fk FOREIGN KEY (department_id) REFERENCES departments(department_id) ;

UPDATE copy_emp 
SET department_id = 200
WHERE employee_id = 104 ;

UPDATE copy_emp 
SET department_id = NULL
WHERE employee_id = 104 ;

ROLLBACK;

DELETE departments 
WHERE department_id = 190 ; 

DELETE departments 
WHERE department_id = 10 ; 

ROLLBACK ;

SELECT constraint_name, constraint_type, search_condition, r_constraint_name, status  
  FROM user_constraints 
 WHERE TABLE_NAME = 'COPY_EMP' ;

SELECT *
  FROM user_cons_columns
 WHERE TABLE_NAME = 'COPY_EMP' ;

CREATE TABLE emp1 (
  employee_id    NUMBER(6)    CONSTRAINT emp1_pk PRIMARY KEY
 ,first_name     VARCHAR2(20) NOT NULL
 ,last_name      VARCHAR2(25) CONSTRAINT emp1_nn NOT NULL
 ,email          VARCHAR2(25) UNIQUE
 ,phone_number   VARCHAR2(20) CONSTRAINT emp1_uk UNIQUE
 ,hire_date      DATE         
 ,job_id         VARCHAR2(10) 
 ,salary         NUMBER(8,2)  CONSTRAINT emp1_ck CHECK(salary > 0)
 ,commission_pct NUMBER(2,2)  
 ,manager_id     NUMBER(6)    
 ,department_id  NUMBER(4)    CONSTRAINT emp1_fk REFERENCES departments(department_id)
);

CREATE TABLE emp2 (
  employee_id    NUMBER(6)    
 ,first_name     VARCHAR2(20) NOT NULL
 ,last_name      VARCHAR2(25) NOT NULL 
 ,email          VARCHAR2(25) 
 ,phone_number   VARCHAR2(20) 
 ,hire_date      DATE         
 ,job_id         VARCHAR2(10) 
 ,salary         NUMBER(8,2)  
 ,commission_pct NUMBER(2,2)  
 ,manager_id     NUMBER(6)    
 ,department_id  NUMBER(4) 
 ,CONSTRAINT emp2_pk PRIMARY KEY (employee_id, first_name)
 ,CONSTRAINT emp2_uk UNIQUE (phone_number)
 ,CONSTRAINT emp2_ck CHECK(salary > 0)
 ,CONSTRAINT emp2_fk FOREIGN KEY(department_id)
  REFERENCES departments(department_id)
);

ALTER TABLE copy_emp
DISABLE CONSTRAINT cpemp_uk ;

ALTER TABLE copy_emp
ENABLE CONSTRAINT cpemp_uk ;

ALTER TABLE copy_emp
RENAME CONSTRAINT cpemp_uk TO cpemp_phone_uk ; 

ALTER TABLE copy_emp
DROP CONSTRAINT cpemp_phone_uk ; 
