CREATE USER user02
IDENTIFIED BY oracle ; 

ALTER USER user02
IDENTIFIED BY oracle_4U ; 

ALTER USER user02
QUOTA 10M ON USERS ; 

ALTER USER user02
QUOTA UNLIMITED ON USERS ; 

DROP USER user02 CASCADE ; 

CREATE USER user02
IDENTIFIED BY oracle_4U
QUOTA UNLIMITED ON USERS ; 

GRANT CREATE SESSION, CREATE TABLE, CREATE VIEW TO user02 ; 
GRANT SELECT ON user01.employees                TO user02 ; 

-- USER02
SELECT * 
  FROM session_privs ;

CREATE TABLE t1 
(id    NUMBER) ;

CREATE SEQUENCE seq1 ;

INSERT INTO t1 VALUES (1234) ; 

SELECT * FROM t1; 

SELECT * 
  FROM user01.employees ; 

UPDATE user01.employees
SET salary = salary * 1.2 
WHERE employee_id = 200;

-- USER01
REVOKE CREATE VIEW                FROM user02 ; 
REVOKE SELECT ON user01.employees FROM user02 ; 

-- USER02 
SELECT * 
  FROM user01.employees ; 

-- USER01 
SELECT * 
  FROM dba_sys_privs ;

SELECT * 
  FROM dba_tab_privs ;

