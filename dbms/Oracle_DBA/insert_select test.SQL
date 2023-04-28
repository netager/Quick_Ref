SELECT COUNT(*) FROM test1;
SELECT COUNT(*) FROM test;

SELECT * FROM dba_tables;

ALTER TABLE test NOLOGGING;

INSERT INTO /*+ append parallel(2) */ test
SELECT /*+ parallel(2) */ * FROM test1;

INSERT INTO /*+ append */ test SELECT * FROM test1;

SELECT COUNT(*) FROM hr.test1;

ROLLBACK;
COMMIT;

TRUNCATE TABLE test;

SELECT /*+ parallel(2) */ count(*) FROM test1;

 SELECT * FROM all_constraints
  WHERE owner = 'HR'
    AND table_name LIKE 'TEST%';
