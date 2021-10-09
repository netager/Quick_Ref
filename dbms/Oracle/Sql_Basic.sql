-- ADMIN ��й�ȣ
-- ADMIN / Dltnscjs100%

-- �ּ�
-- --, /*   */
-- ����Ű : [Ctrl] + /

-- ��� ����
select sal+100, sal-100, sal*100, sal/100 
from emp;

select empno, deptno, sal, empno+deptno+sal
from emp;

select 13500*0.3+13500*12
from dual;

select (13500*0.3+13500)*12
from dual;


-- ��¥ ������ ó��
select  hiredate-100,hiredate,hiredate+100
from emp;

alter session set nls_date_format = 'yyyy/mm/dd hh24:mi:ss';

select  hiredate-1/24,hiredate,hiredate+1
from emp;

select hiredate+hiredate -- hiredate*2
from emp;

select current_date,hiredate, current_date-hiredate
from emp;

select current_date,hiredate, current_date-hiredate
--    , current_date-hiredate/7
    , (current_date-hiredate)/7
from emp;

select 2021/10/02 ,empno,ename
from emp;

alter session set nls_date_format = 'yyyy/mm/dd';

select to_date('2021/10/02')
    ,to_date('2021-10-02')
    ,to_date('2021.10.02')
from emp;

select to_date('2021/10/02')+10
    ,to_date('2021-10-02')+10
    ,to_date('2021.10.02')+10
from emp;

SELECT TO_DATE('28-JUN-21')
FROM EMP;

-- 
select 1,'1', empno, ename
from emp;
select 'enkim',empno,ename
from emp;


select 2021/10/02 ,empno,ename
from emp;

-- Null ó��
-- ��ġ + Null = Null
-- ��� ����, �� ���� ��� �Ұ�
-- Null�� ó���ϱ� ���� nvl() ���
select empno, ename, sal, comm, nvl(comm, 0), sal+comm, sal+nvl(comm, 0)
  from emp;

select last_name  
-- Alias ���
select empno num, ename Name, sal SAL, sal+nvl(comm, 0) total
  from emp;
  
select empno as num, ename as "Name", sal as SAL, sal+nvl(comm, 0) as "monthly salary"
  from emp;
  
select '�����ȣ ' || empno ||'�� �̸��� ' || ename || ' �Դϴ�' from emp
 where empno = '7369';
 
select 'DROP TABLE ' || table_name || ' PURGE;' as "DROP DML SQL"
 from user_tables;            

-- �ߺ��� ���� ��ȸ (distinct)
select distinct deptno, job 
  from emp;

select empno, job, sal, deptno
  from emp
 where deptno = 20;
 
 desc emp;
 
select *
 from custs
where credit_limit = 7000;

select * from order_items
 where order_id = 2389;
 
select * from prods
 where prod_id = 2381;

select empno
  from emp
where hiredate = '1981/05/01'; 


select current_date - 1
  from dual;


-- ��¥ �÷� ��ȸ�� ���ؼ�
insert into emp(empno, ename, hiredate)
values(9999, 'enkim', current_date-1);

alter session set nls_date_format = 'yyyy/mm/dd hh24:mi:ss';

select * from emp
 where hiredate = current_date-1;
 
alter session set nls_date_format = 'yyyy/mm/dd';

select * from emp
 where hiredate = current_date-1;

select * from emp
 where hiredate = '2021/10/01';
 
 select * from emp
 where hiredate >= '2021/10/01';

-- ������ ��ȸ�� ��ҹ��� ���� ��
select empno, ename, sal, job
 from emp
where ename = 'JONES';

-- �� ������
---- >, <, =, !=, >=, <=
---- between .low value. and .upper value., not between .. and ..
select empno ename, sal, hiredate
from emp
-- where hiredate between '1981/12/03' and '1981/12/03';
where hiredate between '1981/01/01' and '1981/12/31';
-- where hiredate between '1981/12/31' and '1981/12/01';-- error

---- in ������, not in
select empno, ename, deptno
from emp
--where deptno = 10
----and deptno = 30;
--or deptno = 30
--or deptno = 60
--or deptno = 70;
where deptno in (10, 20, 30, 50);


-- �� ������
---- and, or

---- like, not like
select empno, ename
 from emp
-- where ename like '%E%';  
-- where ename like '%E';   -- E�� ������ ����
 where ename like '%E_';  -- '_' �� �Ѱ��� ����

---- ���ϵ� ī�� ���� ���� �߻��� �� �ִ� ����
select employee_id, job_id
  from employees
   where job_id like '%C\_%' escape '\';   -- '_'�� ���ϵ� ���ڰ� �ƴϰ� �������� �Ϻζ�� ���� �˷� �����

-- null ���� ��ȸ
---- is null, is not null
select empno, ename, sal, comm
  from emp
-- where comm is null;
-- where comm = 'null';  -- Error
-- where comm = null;      -- Error �� �ȳ����� ���ϴ� ����� �� ����
 where comm = '(null)';  -- Error
 