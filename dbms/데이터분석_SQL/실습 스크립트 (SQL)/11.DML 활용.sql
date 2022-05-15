INSERT INTO emp (empno,ename,job,mgr,hiredate,sal,comm,deptno) 
VALUES (7788,'SCOTT','ANALYST',7566,TO_DATE('1987/04/19','YYYY/MM/DD'),3000,NULL,20);

INSERT INTO emp 
VALUES (7788,'SCOTT','ANALYST',7566,TO_DATE('1987/04/19','YYYY/MM/DD'),3000,NULL,20);

SELECT * 
  FROM emp ;

INSERT INTO emp (empno,ename,sal,deptno) 
VALUES (7566,'JONES',2975,20);

SELECT * 
  FROM emp ;

INSERT INTO emp (empno,ename,hiredate,sal,deptno) 
VALUES (7566,'JONES', DEFAULT, 2975,20);

INSERT INTO emp_annsal 
SELECT empno, ename, sal * 12 
  FROM emp ; 

UPDATE emp 
SET job      = 'MANAGER' 
   ,mgr      = 7839 
   ,hiredate = TO_DATE('1981/04/02','YYYY/MM/DD')
WHERE empno  = 7566 ;

UPDATE emp 
SET job      = 'MANAGER' 
   ,mgr      = NULL
   ,hiredate = DEFAULT
WHERE empno  = 7566 ;

SELECT * FROM emp ;

UPDATE emp_annsal 
SET ann_sal = ann_sal + 300 ;

UPDATE employees 
SET department_id = (SELECT department_id 
                       FROM departments 
                      WHERE department_name = 'Shipping')
WHERE employee_id = 102 ;

UPDATE employees 
SET department_id = 60
WHERE department_id = (SELECT department_id
                         FROM departments 
                        WHERE department_name = 'Administration') ; 

UPDATE employees 
SET (salary, commission_pct) = (SELECT salary, commission_pct
                                  FROM employees 
                                 WHERE employee_id = 103) 
WHERE employee_id = 102 ;

DELETE FROM emp 
WHERE empno = 7788 ; 

DELETE emp_annsal ;

SELECT * FROM emp_annsal ; 

ROLLBACK ; 

SELECT * FROM emp_annsal ; 

DELETE emp_annsal 
 WHERE employee_id = (SELECT employee_id
                        FROM employees 
                       WHERE last_name = 'Taylor') ;  

TRUNCATE TABLE emp_annsal ; 

SELECT * FROM emp_annsal ; 

ROLLBACK ; 

SELECT * FROM emp_annsal ; 


