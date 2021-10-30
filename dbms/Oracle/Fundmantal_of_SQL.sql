-- ADMIN ��й�ȣ
-- ADMIN / Dltnscjs100%

-- �ּ�
-- --, /*   */
-- ����Ű : [Ctrl] + /

-- 실습전 수행 SQL
alter session set nls_date_format = 'yyyy/mm/dd';


-- SQL Execution Order
5 SELECT    : �˻� ����� ǥ���� ���� 
1 FROM      : ��� ���� ����  
2 WHERE     : �� ������ ���� ���ǽ� ���� 
3 GROUP BY  : �׷� ������ ���� ǥ���� ���� 
4 HAVING    : �׷� ������ ���� ���ǽ� ���� 
6 ORDER BY  : ������ ���� ǥ���� ����


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
 
desc sh.sales;
select * from dba_users;

select count(*) from sh.sales;

desc sh.sales;


-- Oracle 12c ���� ��� ������ ����(offset)
select employee_id, first_name
  from employees
 order by employee_id
 fetch first 5 rows only;

-- Oracle 12c ���� ��� ������ ����(offset)
select employee_id, first_name
  from employees
 order by employee_id
offset 6 rows fetch next 5 rows only;

select *
  from (select * 
          from employees
         order by employee_id asc)
 where rownum <= 5
order by employee_id;

                                                                                                                                  
-- �Լ� ���
-- --------
-- ������ �Լ� : min(), max() ��
--   - �Ϲ�, ����, ����, ��¥, ��ȯ
--   - Character  : upper, lower, initcap, ...
--   - Number     : round, trunc, mod, ceil, floor
--   - Date       : add_months, months_between, ..
--   - Conversion : to_char, to_date, to_number, ...
--   - General    : nvl, nvl2, nullif, coalesce, decode, ... (case expression)
--   - ��Ÿ        : user, sysdate(������ �Ͻ�), current_date(��PC�� �Ͻ�)
select to_char(sysdate,'yyyy/mm/dd hh24:mi:ss')
     , to_char(current_date,'yyyy/mm/dd hh24:mi:ss')
     , user
  from dual; 
-- ������ �Լ�
-- ---------------------
-- ������ ���̺� �� ������ ����
drop table t1 purge;
create table t1(col1 varchar2(30));

insert into t1 values('38372834');
insert into t1 values('a837b83c');
insert into t1 values('38abcd34');
insert into t1 values('78929341');
insert into t1 values('a837283b');
commit;

select * from t1;

-- ���� �� �Լ� : ����
--   - upper(), lower(), initcap()
select 'sql is so fun'
     , upper('sql is so fun')
     , lower('SQL IS SO FUN')
     , initcap('sql is so fun')
  from dual;

select empno, ename, job, deptno
  from emp
 where job = upper('&enter_job');
 
 desc t1;

-- col1���� ���ڷθ� ������ �� ��ȸ 
select col1, upper(col1), lower(col1), initcap(col1)
  from t1
 where lower(col1) = upper(col1);

-- col1���� ���ڷθ� ������ �� ��ȸ 
--  - trim()�� ���� ���ڸ� ����
select col1, ltrim(col1, '123456789')
  from t1
 where ltrim(col1, '123456789') is null ;

-- concat() : �ΰ��� �÷��� �ϳ��� ��������� �Է°����� 2���� ���ڸ� ����
select empno, ename, sal, deptno
     , empno || ename || sal || deptno as concat
     , concat(empno, concat(ename, concat(sal, deptno))) as concat_by_function
  from emp;

select 1+null from dual; // Null �� �������� ����� Null

-- concat()�� Null�� ��ġ�� ��� ���� ���
select concat('',empno), concat(null, empno), concat(' ', empno) from emp;

-- substr(����, ����, ����) : ���ڼ� ���ۺ��� �������� ��������
select 'sql is so fun'
     , substr('sql is so fun', 1, 4)
     , substr('sql is so fun', 1, 4)
     , dump(substr('sql is so fun', 1, 4))
  from dual
 where substr('sql is so fun', 1, 4) = 'sql ';  // ���� ����

-- length()  : ������ ����
-- lengthb() : ����Ǵ� Byte ��
select ename, length(ename), lengthb('��')
     , job ,  length(job), lengthb('a')
     , hiredate, length(hiredate)
  from emp;
  
-- instr() : ���ڿ��� ������ ��ġ�� �˷���
select ename, instr(ename, 'S')
     , sal, instr(sal, 2)
     , hiredate, instr(hiredate,'/')
  from emp;

select ename
     , instr(ename, upper('&enter_char')) as ret
  from emp;

-- pad(), lpad(), rpad()
select 'Page 1'
     , lpad('Page 1', 15, '*')
     , rpad('Page 1', 15, '*')
  from dual;

select empno, sal, sal/100 as recal, round(sal/100)
     , lpad(' ', sal/100, '*')
     , replace(lpad(' ', sal/100, '*'), ' ', '*')
     , replace(lpad(' ', round(sal/100), '*'), ' ', '*')
  from emp;

select 
rtrim('<=====>BROWNING<=====>', '<>=') "RTRIM Example",
ltrim('<=====>BROWNING<=====>', '<>=') "LTRIM Example"
  from dual;
  
select lname, length(lname)
     , phone
     , decode(substr(phone, instr(phone,'(')+1,(instr(phone,')') - instr(phone,'('))-1)
             , null
             , substr(phone, 1, 3)
             ,substr(phone, instr(phone,'(')+1,(instr(phone,')') - instr(phone,'('))-1)) as "Country Code"
  from custs;

select email
     , instr(email, '@')
     , concat(replace(substr(email,1,instr(email,'@')),'_','.')
            , substr(email,instr(email,'@')+1, length(email) - instr(email,'@'))) as new_email 
  from custs;

select email
     , instr(email, '@')
     , concat(replace(substr(email,1,instr(email,'@')),'_','.')
            , substr(email,instr(email,'@')+1, length(email) - instr(email,'@'))) as new_email 
     , substr(replace(email,'_','.'), 1, instr(email,'@') -1) 
  from custs;
  
-- round()
select 87654.546
     , round(87654.546,0)
     , round(87654.546,1)
     , round(87654.546,2)
     , round(87654.546,-1)
     , round(87654.546,-5)
     , round(87654.546,-6)  -- ���� �ʿ�
  from dual;

-- trunc()
select 87654.546
     , trunc(87654.546,0)
     , trunc(87654.546,1)
     , trunc(87654.546,2) 
     , trunc(87654.546,-1)
     , trunc(87654.546,-5)
     , trunc(87654.546,-6)
 from dual;

select 87654.546
     , floor(87654.546)
     , ceil(87654.546)
  from dual;

-- ��¥ �Լ�
alter session set nls_date_format = 'yyyy/mm/dd';
alter session set nls_date_format = 'yyyy/mm/dd hh24/mi/ss';

-- ��¥�� ����
select current_date -1 
     , current_date
     , current_date + 1
  from dual;

-- to_date()
select current_date - to_date('1972/10/07','yyyy/mm/dd') -- �ϼ��� ����
  from dual;

select (current_date - to_date('1972/10/07','yyyy/mm/dd')) / 7 -- �ּ��� ����
  from dual;

select (current_date - to_date('1972/10/07','yyyy/mm/dd')) / 30 -- �޼��� ����
  from dual;
  
select to_date('1990/10/16','yyyy/mm/dd') 
     , to_date('1990/10/16','yyyy/mm/dd') + 1 
     , to_date('1990/10/16','yyyy/mm/dd') + 1/24  -- 1�ð� 
     , to_date('1990/10/16','yyyy/mm/dd') + (3/24 + 15/(24*60) + 50/(24*60*60)) 
  from dual;

select empno
    ,current_date, hiredate
    ,months_between(current_date, hiredate)
    ,add_months(hiredate,3)
    ,next_day(hiredate,'��')
    ,last_day(hiredate)
from emp;

select empno
    ,current_date, hiredate
--    ,months_between(current_date, hiredate)
--    ,add_months(hiredate,3)
--    ,next_day(hiredate,'��')
--    ,last_day(hiredate)
from emp;


select empno
    ,current_date, hiredate
--    ,months_between(current_date, hiredate)
--    ,add_months(hiredate,3)
--    ,next_day(hiredate,'��')
    ,last_day(hiredate)
from emp;

select 
    next_day(current_date,'��')
    ,last_day(current_date)
from dual;

select order_date, current_date
    ,add_months(order_date,2)
    ,months_between(current_date,order_date)
from orders;


select order_date
      ,next_day(order_date, '�ݿ���')
      ,last_day(order_date)
from orders ;

-- https://docs.oracle.com/cd/B19306_01/server.102/b14200/functions230.htm
select '2019/09/19'
     , round(to_date('2019/09/19'), 'month') -- 15�� ��������
     , round(to_date('2019/09/19'), 'year')  -- 7�� ��������
     , round(to_date('2019/06/19'), 'year')
  from dual;
  
select '2019/09/19'
     , trunc(to_date('2019/09/19'), 'DAY') -- DAY, DY, D �� ����
     , trunc(to_date('2019/09/19'), 'DY')  -- �� ���� ù��° ��
     , trunc(to_date('2019/09/19'), 'D')  
  from dual;  
  
select '2021/10/16'
     , trunc(to_date('2019/09/19'), 'DAY') -- DAY, DY, D �� ����
     , trunc(to_date('2019/09/19'), 'DY')  -- �� ���� ù��° ��
     , trunc(to_date('2019/09/19'), 'D')  
  from dual;  
  
select '2019/09/19'
     , round(to_date('2019/09/17'), 'DAY')
     , round(to_date('2019/09/19'), 'DAY')
  from dual;

select ename, hiredate 
  from emp
 where to_char(hiredate, 'yyyy/mm') = '1981/02';
 
select hiredate, trunc(hiredate,'DAY'), trunc(hiredate, 'month')
  from emp
 where trunc(hiredate, 'month') = '1981/02/01';

-- ��ȯ�Լ�
-- 
select 7788, dump(7788), '7788', dump('7788') from dual;

-- ����Ŭ�� �Ͻ��� �� ��ȯ
select empno, ename
  from emp
-- where empno = '7788';
-- where empno = '7788';
 where empno like '_3%';  -- �Ͻ������� to_char(empno) like '_3%'

-- to_char()
select empno, ename, hiredate
     , to_char(hiredate, 'yyyyy')
     , to_char(hiredate, 'year')
     , to_char(hiredate, 'YEAR')
  from emp;

alter session set nls_language = 'american';  
select empno, ename, hiredate
     , to_char(sysdate,'MM')
     , to_char(sysdate,'MON')
     , to_char(sysdate,'month')
     , to_char(sysdate,'mm')
  from emp;

select empno, ename, hiredate
    , to_char(hiredate,'dd')
    , to_char(hiredate,'dd-mon-rr')
    , to_char(hiredate,'dd-mon-rr','nls_date_language=korean')
from emp;

select empno, ename
    , to_char(hiredate,'"�Ի�⵵�� " yyyy " �Դϴ�."')
    , to_char(hiredate,'"�Ի� �б�� " q "  �б� �Դϴ�."')
    , to_char(hiredate,'"������ �� " d " ��° ���� �Ի��߽��ϴ�."')
from emp;

select empno, ename
    , to_char(hiredate,'"�Ի�⵵�� " yyyysp " �Դϴ�."')
    , to_char(hiredate,'"�Ի� �б�� " qsp "  �б� �Դϴ�."')
    , to_char(hiredate,'"������ �� " dsp " ��° ���� �Ի��߽��ϴ�."')
from emp;

select empno, ename
    , to_char(hiredate,'"�Ի�⵵�� " yyyyspth " �Դϴ�."')
    , to_char(hiredate,'"�Ի� �б�� " qspth "  �б� �Դϴ�."')
    , to_char(hiredate,'"������ �� " dspth " ��° ���� �Ի��߽��ϴ�."')
from emp;

select to_char(hiredate, 'yyyy mm ddd')
  from emp;

--������ 2021�� 10�� 16���Դϴ�.
-- �Ʒ��� ��� ���°� ������?
select '������ '||to_char(current_date, 'YYYY')||'�� '||to_char(current_date, 'MM')||'�� '||to_char(current_date, 'DD')||'���Դϴ�.' as today
from dual;     

select to_char(current_date, '"������" YYYY"��" MM"��" DD"���Դϴ�."') as today
from dual;

select sal
     , to_char(sal, '$')
     , to_char(sal, '$9')
     , to_char(sal, '$999')
     , to_char(sal, '$9,999')
     , to_char(sal, 'fm$9999') -- ������ ��ܼ� ���
     , to_char(sal, '$0,999')
  from emp;
  
select '$15,000' + '$20,000'
  from dual;

-- to_number()  
select to_number('$15,000','$99,999') + to_number('$20,000', '$99,999')
  from dual;

-- �Ϲ��Լ�
-- nvl(), nvl2()

-- nvl()
select empno, sal, comm
     , sal*12+comm
     , sal*12+nvl(comm,0) a
     , nvl2(comm, sal*12+comm, sal*12) b -- null �� �ְ� ���� ���� IF�� ó�� ���
     , nvl2(comm, 'sal*12+comm', 'sal*12') c 
  from emp;

drop table t2 purge;    -- �������뿡 �����ʰ� �ٷ� Drop
create table t2 (col1 varchar2(30)
               , col2 varchar2(30));

insert into t2 values('kim', 'developer');
insert into t2 values('lg' , 'GS');
insert into t2 values(null, 'ks') ;
insert into t2 values('samsung', 'oracle');
insert into t2 values('samsung', null);
commit;

select * from t2;

-- nullif() - ������ null ��ȯ
select length(empno), length(sal)
     , nullif(length(empno), length(sal))
  from emp;

-- coalesce()
drop table t1 purge;
create table t1
as select comm a, mgr b, empno c 
     from emp;
commit;

-- coalesce()
select a, b, c, nvl(nvl(nvl(a, b),c),0)
  from t1;
  
select a, b, c, coalesce(a, b, c, 0) as ret
  from t1;

-- decode()  
select /* decode */ empno, deptno, sal
     , decode(deptno, 10, sal*1.1, 
                      20, sal*1.2, 
                          sal*1.3) as conditional_result
  from emp;

-- case ... when ... when ... else ... end  
select /* simple case ǥ���� */ empno, deptno, sal
     , case deptno when 10 then sal*1.1
                   when 20 then sal*1.2
                   else sal end as conditional_result
  from emp;

select /* searched case ǥ���� */ empno, deptno, sal
     , case when deptno <= 20 then sal*1.1
            when deptno = 30 then sal*1.2
            else sal end as conditional_result
  from emp;

-- ����. emp ���̺��� �޿��� ���� A, B, C�� ���е� ����� ����ϼ���
select empno
     , sal
     , case when sal >= 4000 then 'A'
            when sal < 4000 and sal >= 2000 then 'B'
            when sal < 2000 then 'C'
            end as "GRADE"
  from emp;

select empno
     , sal
     , case when sal < 2000 then 'C'
            when sal < 4000 then 'B'
            else                 'A'
       end as "GRADE"
  from emp;
 
select empno, sal, sal/2000, trunc(sal/2000)
     , decode(trunc(sal/2000),0,'C',1,'B','C') as grade
  from emp;

select empno, sal, sal/2000
     , case trunc(sal/2000) when 0 then 'C'
                            when 1 then 'B'
                            else        'A'
       end as "GRADE"
  from emp;

-- �����Լ�
-- sum(), avg(), min(), max()
desc orders;
select sum(order_total)
     , avg(order_total)
     , min(order_total)
     , max(order_total) 
  from orders;

select max(last_name), min(hire_date)
  from employees;

select order_status
  from orders;

-- count(), count(distinct ~)  
select count(*), count(order_status), count(distinct order_status) 
  from orders;

-- department_id�� 1���� null�� ����
select count(*), count(department_id), count(distinct department_id)
  from employees;

select sal + comm
  from emp;

-- avg()�� null ���� ���� ��
select round(avg(nvl(commission_pct,0)), 2) 
     , round(sum(commission_pct)/count(*), 2)
     , round(sum(commission_pct)/count(commission_pct),2)
     , round(avg(commission_pct), 2)
  from employees;

select count(*), count(department_id)
     , count(distinct department_id) --employee_id, department_id
from employees;


select department_id, job_id, sum(salary)
  from employees
 group by department_id, job_id
-- having department_id = 10
 order by 1;

-- oracle version up �Ǹ鼭 ���Ǵ� ��� - over()
select department_id
     , job_id 
     , sum(salary) over(partition by department_id)
     , sum(salary) over()
  from employees;

-- having �� ��� 
select to_char(order_date, 'yyyy') as order_year
     , cust_id, sum(order_total)
  from orders
 group by to_char(order_date, 'yyyy'), cust_id
having sum(order_total) > 20000 
 order by 1;

-- Error : 'where dno' alias
select deptno dno, empno, ename
  from emp 
 where dno =10;

-- Error : 'group by dno' alias
select deptno dno, count(*) 
  from emp
 group by dno;

-- Error : 'having dno' alias
select deptno dno, count(*)
  from emp
 group by deptno
having dno <> 20;
  

-- JOIN
-- 
select *
  from employees emp, departments dept
 where emp.department_id = dept.department_id
   and employee_id = 108;

select *
  from employees emp, jobs
where emp.job_id = jobs.job_id
  and emp.employee_id = 206;

select * 
  from emp, dept
 where emp.deptno = dept.deptno;

-- Ansi Join : join ... on
select *
  from emp join dept
    on emp.deptno = dept.deptno
 where emp.empno = 7369;
-- End ansi join


select e.employee_id, e.last_name, e.salary, e.department_id,
       d.department_id, d.department_name,
       l.*	   
from employees   e 
    ,departments d  
	,locations   l 
where e.department_id = d.department_id 
  and d.location_id   = l.location_id;


select e.employee_id, e.last_name, e.salary, e.department_id,
       d.department_id, d.department_name,
       l.*
  from employees e 
  join departments d
    on e.department_id = d.department_id
  join locations l
    on d.location_id = l.location_id;

select * from orders, order_items
 where orders.order_id = order_items.order_id;
 

-- Self Join
select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename
  from emp e1, emp e2
 where e1.mgr = e2.empno
   and e1.empno = 7369;

select job_id, salary
  from employees
 where salary in (select salary
                   from employees
                  where job_id = 'IT_PROG');

-- "any"는 or 로 풀이
-- "> any" 는 여러값중 가장 작은값 보다 큰 것을 출력
-- "< any" 는 여러값중 가장 큰값 보다 작은 것을 출력
-- "= any" 는 in 과 동일하다.
select job_id, salary
  from employees
 where salary = any (select salary
                   from employees
                  where job_id = 'IT_PROG');

-- "all"은 and 로 풀이
-- "> all" 는 여러값중 가장 큰값 보다 큰 것을 출력
-- "< all" 는 여러값중 가장 작은값 보다 작은 것을 출력
-- "= any" 는 in 과 동일하다.
select job_id, salary
  from employees
 where salary > all (select salary
                   from employees
                  where job_id = 'IT_PROG');

-- 팀원이 있는 사원 정보
select *
  from emp
 where empno in (select mgr
                   from emp
                  where mgr is not null); 

select *
  from emp
 where empno in (select nvl(mgr, -1)
                   from emp);

select * 
  from emp mq
where exists (select mgr 
                from emp
                where mgr = mq.empno);


-- 팀원이 없는 사원 정보 
select *
  from emp
 where empno not in (select mgr
                       from emp
                      where mgr is not null); 
 
select *
  from emp
 where empno not in (select nvl(mgr, -1)
                       from emp);

select * 
  from emp mq
where not exists (select mgr 
                from emp
                where mgr = mq.empno);

alter session set nls_date_format = 'yyyy/mm/dd';

select *
  from (select empno, hiredate
          from emp
         order by hiredate)
 where rownum <= 5;

-- oracle 12 버전 이상에서 나온 새로운 기능
select employee_id, first_name
  from employees
 order by employee_id
 fetch first 5 rows only;

select employee_id, first_name
  from employees
 order by employee_id
 offset 10 rows 
 fetch next 10 rows only;

-- Oracle view
create view vemp1
as 
select empno, job, deptno, sal
from emp;

select * from user_views;


select empno, sal, a.avg_sal
  from emp e, (select avg(sal) as avg_sal 
                 from emp) a
 where e.sal > a.avg_sal;

-- Error 발생 
select empno, sal, a.avg(sal)
  from emp e, (select avg(sal) 
                 from emp) a
 where e.sal > a.avg_sal;

-- Corelative SubQuery
-- 부서 평균 급여보다 많은 급여를 받는 사원
select mq.empno, mq.ename, mq.job, mq.deptno, mq.sal
  from emp mq
  where sal > (select avg(sal) 
                from emp
               where deptno = mq.deptno);
               
select d.*, ina.cnt
  from dept d, (select deptno, count(*) as cnt
                from emp
               group by deptno) ina
 where d.deptno = ina.deptno;
 
select d.*
  from dept d
 where 4 <= (select count(*)
               from emp
              where deptno = d.deptno);

-- 스칼라 서브쿼리 
select d.*, (select count(*)
               from emp
             where deptno = d.deptno) as cnt
  from dept d;

-- 누적합
select empno, ename, sal, (select sum(sal)
                             from emp
                            where empno <= e.empno) as cum_sum
  from emp e;

select empno, ename, sal, sum(sal) over(order by empno) as cum_sum
  from emp;

-- order by 에 스칼라 서브쿼리 사용 - 별 의미는 없어 보임
select department_id, employee_id, last_name
  from employees e
 order by (select department_name
             from departments
            where department_id = e.department_id);

select d.* 
  from departments d
 where exists (select department_id
                 from employees
                where department_id = d.department_id);
                
select 1+1 
  from dual
 where exists (select *
                 from emp 
                where deptno = 40);

 select department_id
                           from employees);

select *
 from emp
  where deptno = 30;
  
 order by (select department_name
             from departments
            where department_id = e.department_id);

select * from emp mq
where empno not in (select mgr 
                      from emp);

select * 
  from emp mq
where exists (select mgr 
                from emp
                where mgr = mq.empno);

select * 
  from emp mq
where not exists (select mgr 
                from emp
                where mgr = mq.empno);

-- 집합 연산자
