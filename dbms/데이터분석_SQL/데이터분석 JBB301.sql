select branch, count(dlq_dt), sum(count(dlq_dt))
  from tacct
 where lmt_typ is null
   and dlq_dt is not null
 group by branch
 order by branch;


select nvl(branch,'TOTAL'), count(*)
  from tacct
 where lmt_typ is null
   and dlq_dt is not null
 group by rollup(branch)
 order by branch;

select branch, 
       case when to_char(ln_dt, 'yyyymm') = '202201' then '1월'
       end as "1월",
       case when to_char(ln_dt, 'yyyymm') = '202202' then '2월'
        end as "2월",
       case when to_char(ln_dt, 'yyyymm') = '202203' then '3월'   
		end as "3월"    
  from tacct
 where lmt_typ is null
   and to_char(ln_dt,'yyyymm') between '202201' and '202203';
 group by branch, 월별
 order by branch
 
 
 select branch
      , to_char(ln_dt, 'MM')
      , count(*)
   from tacct
  where lmt_typ is null
    and ln_dt between '2022/01/01' and '2022/03/31'
  group by rollup(branch, to_char(ln_dt, 'MM'))
  order by 1, 2;
  
select branch "지점코드"
      , count(case to_char(ln_dt, 'MM') when '01' then lnact end) as "1월"
      , count(case to_char(ln_dt, 'MM') when '02' then lnact end) as "2월"
      , count(case to_char(ln_dt, 'MM') when '03' then lnact end) as "3월"
      , count(*) "합계"
   from tacct
  where lmt_typ is null
    and ln_dt between '2022/01/01' and '2022/03/31'
  group by branch
  order by branch;
   
select branch "지점코드"
      , nvl(sum(case to_char(ln_dt, 'MM') when '01' then lnact end),0) as "1월"
      , nvl(sum(case to_char(ln_dt, 'MM') when '02' then lnact end), 0) as "2월"
      , nvl(sum(case to_char(ln_dt, 'MM') when '03' then lnact end), 0) as "3월"
      , sum(lnact)
   from tacct
  where lmt_typ is null
    and ln_dt between '2022/01/01' and '2022/03/31'
  group by branch
  order by branch;



-- Join   
select a.lnid, a.id_typ, a.bthday,
       b.lnact, b.lnact_seq, b.ln_dt, b.ln_amt
  from tid a
  join tacct b
    on a.lnid = b.lnid
 where b.lmt_typ is null
 order by b.lnact, b.lnact_seq;

select i.lnid, i.bthday, a.lnact, a.lnact_seq, a.ln_amt,
       a.ln_dt, r.pay_dt, r.sum_mon_amt, r.ln_bb_amt
  from tid i
  join tacct a
    on i.lnid = a.lnid
  join trepay r
    on a.lnact = r.lnact
   and a.lnact_seq = r.lnact_seq
 where i.lnid = '10006'
 order by r.pay_dt;

-- 차주 정보
lnid : 차주id

select * from tid;
tacct 
select * from tid;

-- join 기본 
select *
  from tid
  join tacct
    on tid.lnid = tacct.lnid
 where tid.lnid = '10000';

select * from tid
 where lnid = '10000';
 
select lnid, lnact, lnact_seq, lmt, ln_amt 
  from tacct
 where lnid = '10000'
   and lmt_typ is null;
   
select *
  from tid a
  join tcredit b
    on a.lnid = b.lnid
  join tcode c
    on b.code = c.code;
    
select *
  from tacct a
  join trepay b
    on a.lnact = b.lnact
   and a.lnact_seq = b.lnact_seq;    

## join
select * 
  from tid;

select * 
  from tacct;
  
select * 
  from tid a
  join tacct b
    on a.lnid = b.lnid;

select * from emp, dept
order by 1;

select * from emp
 where empno = 7369;
select count(*) from dept;
 
select count(*) from emp;

select * 
  from emp
  join dept
    on emp.deptno = dept.deptno;

select * from emp, dept
 order by 1;


desc tid;

select a.*, b.* 
  from tid a
  join tacct b
    on a.lnid = b.lnid
 where b.lmt_typ is null
 order by b.lnact, b.lnact_seq;
 
select b.lnact, b.lnact_seq, b.pay_dt, b.ln_mon_amt, b.int_mon_amt, b.sum_mon_amt, b.ln_bb_amt, a.*
  from tacct a
  join trepay b
    on a.lnact = b.lnact
   and a.lnact_seq = b.lnact_seq;

select e.employee_id, e.last_name, e.department_id, d.department_id
  from tid a
  join tacct b
    on a.lnid = b.lnid
  join trepay c
    on b.lnact = c.lnact
   and b.lnact_seq = c.lnact_seq;
   
select count(*)
  from tacct a
  join trepay b
    on a.lnact = b.lnact
   and a.lnact_seq = b.lnact_seq;  
 
-- Equeal Join
select e.employee_id, e.last_name, e.department_id, d.department_id, d.department_name
  from employees e
 inner join departments d
    on e.department_id = d.department_id;   

select e.employee_id, e.last_name, e.department_id, d.department_id, d.department_name
  from employees e, departments d
 where e.department_id = d.department_id;   

-- Left Join
select e.employee_id, e.last_name, e.department_id, d.department_id, d.department_name
  from employees e
  left join departments d
    on e.department_id = d.department_id;   

select e.employee_id, e.last_name, e.department_id, d.department_id, d.department_name
  from employees e, departments d
 where e.department_id = d.department_id(+);

-- Right Join    
select e.department_id, d.department_id
  from employees e
  right join departments d
    on e.department_id = d.department_id;

select e.employee_id, e.last_name, e.department_id, d.department_id, d.department_name
  from employees e, departments d
 where e.department_id(+) = d.department_id;

-- Full Outer Join - Ansi SQL만 지원함.    
select e.employee_id, e.last_name, e.department_id, d.department_id, d.department_name
  from employees e
  full outer join departments d
    on e.department_id = d.department_id; 

-- Oracle Full Outer Join 은 에러 - 지원하지 않음
select e.employee_id, e.last_name, e.department_id, d.department_id, d.department_name
  from employees e, departments d
 where e.department_id(+) = d.department_id(+);

-- Cross Join
select * 
  from emp
 cross join dept;

select *
  from emp, dept;
  
  
Quiz 1.
select a.lnid, a.bthday, a.score, b.lnact, b.lnact_seq, b.ln_dt, b.ln_amt, b.repay_typ, b.rate
  from tid a
  join tacct b
    on a.lnid = b.lnid
 where a.id_typ = '1'
   and b.repay is null
   and b.lmt_typ is null
 order by b.ln_amt desc, b.lnid;

Quiz 2. 

select t.lnid, ta.aname, t.start_dt, t.end_dt, t.grade, tc.grade_desc
  from tcredit t
  join tagency ta
    on t.acode = ta.acode
  join tcode tc
    on t.code = tc.code
 where t.end_dt >= sysdate
 order by t.lnid, t.code;


-- 교재 - page 81
select * from orders
 where order_id = 2390;
 
select * from order_items
 order by order_id;
 where order_id = '2390';

select * 
  from orders, order_items
order by 1, 8;
 

select * from job_grades;

select count(*) from orders;
select count(*) from order_items;

select 11 * 70 from dual;
select * from tcode;
select * from tcredit;


-- Subquery
SELECT salary 
  FROM employees
 WHERE employee_id = 107 ;

select * from employees
 where salary > (SELECT salary 
  FROM employees
 WHERE employee_id = 107) ;
 
select * 
  from employees e
  join employees s
    on e.salary > s.salary
 where s.employee_id = 107;

SELECT salary 
  FROM employees
 WHERE employee_id = 107;
 
 select end_dt from tcredit
  where end_dt > sysdate;
  
  
  select sysdate from tcredit;

 order by empno;

select count(*) from emp;
select count(*) from dept;
select * from employees;
select * from departments;

select sum(salary)
  from employees
 group by department_id;
 
 select * from emp
  where sal > 2000;

select * from emp e
 where e.sal > 2000;
 
select * from emp e
 where emp.sal > 2000;

select last_name, salary, department_id 
  from employees e
 where e.salary > 20000;

select employee_id, last_name, hire_date, salary
  from employees
   where job_id = 'IT PGOG';
   
select * from tid;
select * from tcode;

select a.lnid, a.bthday, a.grade, b.grade_desc
  from tid a
  join tcode b
    on a.grade = b.grade
 where b.grade_desc in ('신용상태 양호','신용상태 적절')
   and a.bthday >= '2011/01/01'
 order by bthday;

select * 
  from tcredit
 where acode = '04';
select  
 
select * from tacct
 where tacct.lmt_typ is null;

select * from tcode; 
 
select t.lnact, t.lnact_seq, t.acct_typ, tc.lnid, ln_dt, ln_term, exp_dt, ln_amt
  from tacct t
  join tcredit tc
    on t.lnid = tc.lnid
  join tcode tco
    on tc.code = tco.code
 where t.lmt_typ is null
   and tc.acode = '04'
   and tco.grade_desc in ('신용상태 우수')
   and tc.end_dt >= sysdate
 order by t.lnact, t.lnact_seq;

select * 
  from emp
   where sal > (select sal
                  from emp
                 where empno = 7566);
                
select * from dept;
select * from emp;

select e.* 
  from emp e
  join dept d
    on e.deptno = d.deptno;

select * 
  from emp
 where deptno in (select deptno
                    from dept);
  
select *
  from dept
 where deptno in (select deptno
                   from emp);

select distinct deptno
 from dept;

select deptno, count(*) from emp
 group by deptno;

tid.lnid, tid.bthday, tid.grade, tcode.grade_desc

select a.lnid, a.bthday, a.grade, b.grade_desc
  from tid a
  join tcode b
    on a.grade = b.grade
 where a.bthday >= '20100101'
   and b.grade_desc in ('신용상태 양호', '신용상태 적절')
 order by a.bthday;    

select a.lnid, a.bthday, a.grade, b.grade_desc
  from (select lnid, bthday, grade
           from tid
          where bthday >= '2010/01/01'
            and id_typ = '2') a
  join (select grade, grade_desc
          from tcode
         where grade_desc in ('신용상태 적절','신용상태 양호')) b
    on a.grade = b.grade
 order by a.bthday;






select * from tid;
select * from tcode;


SELECT lnact, lnact_seq, acct_typ, lnid, ln_dt, ln_term, exp_dt, ln_amt
  FROM tacct 
 WHERE lmt_typ IS NULL 
   AND lnid IN (SELECT lnid 
                  FROM tcredit 
                 WHERE 
                 -- acode = '04' 
                    end_dt > SYSDATE 
                   AND code IN (SELECT code 
                                  FROM tcode 
                                 WHERE grade_desc = '신용상태 우수'))
ORDER BY lnact, lnact_seq ; 

select t.lnact, t.lnact_seq, t.acct_typ, tc.lnid, ln_dt, ln_term, exp_dt, ln_amt
  from tacct t
  join tcredit tc
    on t.lnid = tc.lnid
  join tcode tco
    on tc.code = tco.code
 where t.lmt_typ is null
   and tc.acode = '04'
   and tco.grade_desc = '신용상태 우수'
   and tc.end_dt > sysdate
 order by t.lnact, t.lnact_seq;

select lnid, count(*) from tcredit
 group by lnid;
 
select * from tcredit
 where acode = '04'
 order by 1;
 
select * from tcode;




SELECT lnact, lnact_seq, ln_amt, ln_amt/1000 "대출금(천원)"
  FROM tacct ;

select dlq_cnt, count(*) from tacct
 group by dlq_cnt;
 
       
select lnact, lnact_seq, acct_typ,lnid, ln_dt, ln_term, exp_dt, ln_amt
  from tacct
 where lmt_typ is null
   and lnid in (select lnid
                  from tcredit
                 where acode = '04'
                   and end_dt > sysdate
                   and code in (select code 
                                  from tcode
                                 where grade_desc = '신용상태 우수'));

select t.lnact, t.lnact_seq, t.acct_typ, tc.lnid, ln_dt, ln_term, exp_dt, ln_amt
  from tacct t
  join tcredit tc
    on t.lnid = tc.lnid
  join tcode tco
    on tc.code = tco.code
 where t.lmt_typ is null
   and tc.acode = '04'
   and tco.grade_desc = '신용상태 우수'
   and tc.end_dt > sysdate
 order by t.lnact, t.lnact_seq;

select * 
  from emp
 where deptno in (10, 30)
union
select * 
  from emp
 where deptno in (20, 30);

select deptno, job, sum(sal)
  from emp
  group by deptno, job
union all  
select deptno, null, sum(sal)
  from emp
 group by deptno
order by 1, 2;

select deptno, job
  from emp
 where deptno in (10, 30)
minus 
select deptno, job
  from emp
 where deptno in (20, 30);

create table aa (
    aa1 varchar2(20),
    aa2 varchar2(10));

create table bb (
    bb1 number,
    bb2 number(5),
    bb3 varchar2(1000));

create table borrower (
    lnid varchar2(4),
    bthday date,
    gender char(1),
    score number(4));

select * from borrower;
select * fr
om aa;

select * from orders;
-- order_id
-- order_mode : direct, online
-- order__status :
-- order_total
-- sales_rep_id 
select * from order_items;
-- order_id 
-- prod_id
-- unit_price
-- quantity


A>
select * from emp;
update emp set sal = 999
where empno = 7788;

select * from emp where empno = 7788;


update employees
   set department_id = 55 
 where department_id = 100;

rollback;

select * from emp;

select * from emp2

update emp2
   set empno = 1234;

select * from emp2;

update emp set empno = 1234;

select * from emp2;

update emp2 set empno = 1234;
select * from emp2;

rollback;

select * from emp2;



select * from dba_constraines;

select * from dba_views;
select * from v$table;

select * from user_indexes;

select * from user_constraints
 where table_name = 'TACCT';

update emp2 set empno = 1234;
select * from emp2;
rollback;

create or replace view empv10
as 
select * from emp
where deptno = 10;

select * from empv10;

select * from emp
where deptno = 10;

update emp set sal = 9000
 where deptno = 10;

select * from empv10;
select * from empt10;

select * from user_views;

CREATE TABLE EMPT10
AS 
SELECT * FROM EMP 
WHERE DEPTNO = 10 ; 


select * from empt10;
rollback;
select * from empv10;

select * from empv10;
select * 
  FROM (SELECT *
          FROM emp
          where deptno = 10) EMPV10;


select * from empv10;

select * from user_views 
 where view_name = 'EMPV10';
 

select "EMPNO","ENAME","JOB","MGR","HIREDATE","SAL","COMM","DEPTNO" from emp
where deptno = 10;

select "EMPNO","ENAME","JOB","MGR","HIREDATE","SAL","COMM","DEPTNO" from emp
where deptno = 10;


create view vid as select lnid, bthday, gender, score
  from tid 
 where id_typ = '1';
 
select * from vid;


drop view vid;

select * 
  from emp
 where sal = 3000;
 
select * from user_indexes
 where table_name like '%&t_name%';
 
 
select index_name from user_indexes
 where table_name like '%EMP%'
 order by index_name;
 
 select * from user_sequences;

select sq_lnid.currval from dual; 
 
select * from emp;

-- 문제
select prod_id 상품ID, prod_name 상품명, list_price 정가
  from prods
 where prod_name like 'RAM%'
    or prod_name like 'Monitor%'
 order by prod_id;
 
 
 select hiredate, count(*) 
   from emp
 group by hiredate;

-- 문제1 
select to_char(hiredate, 'YYYY-MM-DD HH24:MI:SS') 
  from emp;
  
select * from emp
 where to_date(hiredate, 'YYYY/MM/DD') = '1980/12/17'; 
 
select * from emp
 where hiredate like '1980/12/17%';

select * from emp
 where hiredate >= '1980/12/17'
   and hiredate < '1980/12/18';

-- 문제2
select * from emp
 where sal = (select max(sal) from emp);

SELECT empno, ename, sal, deptno, 
       RANK() OVER(ORDER BY SAL) AS RK 
  FROM emp ;

SELECT empno, ename, sal, deptno 
  FROM (SELECT empno, ename, sal, deptno, 
               RANK() OVER(ORDER BY SAL DESC) AS RK 
          FROM emp) 
 WHERE RK <= 2
ORDER BY sal DESC ;


-- 문제3
select nvl(branch, 'TOTAL'), count(*)
  from tacct
 where lmt_typ is null
   and dlq_cnt > 0
group by rollup(branch)  
order by 1;

select branch, count(*)
  from tacct
 where lmt_typ is null
   and dlq_cnt > 0
group by branch
union all
select nvl(null, 'TOTAL'), count(*)
  from tacct
 where lmt_typ is null
   and dlq_cnt > 0
order by 1;
-- ------------------------------


SELECT lnid, bthday, grade
      ,CASE grade WHEN 'AA+' THEN 1
                    WHEN 'AA'  THEN 2 
                    WHEN 'AA-' THEN 3
         END
;

select lnact, lnact_seq, lnid, ln_dt, to_char(ln_amt/1000, 'L99,999,999') "대출금(천원)", dlq_dt, dlq_cnt
  from tacct
 where acct_typ = '2'
   and lmt_typ is null
   and ln_amt >= 100000000
   and dlq_cnt > 0
 order by dlq_dt;

select lnact, lnact_seq, lnid, ln_dt, to_char(ln_amt/1000, 'L99,999,999') "대출금(천원)", dlq_dt, dlq_cnt
  from tacct
 where acct_typ = '2'
   and lmt_typ is null
   and ln_amt >= 100000000
   and dlq_cnt > 0
 order by dlq_dt;
 
select branch, prod_cd, sum(ln_amt)
  from tacct
 where acct_typ = '1'
   and prod_cd between '100' and '105'
   and branch between '10' and '20'
   and repay is null
 group by branch, prod_cd
 order by branch, prod_cd;
 
 
-- select lnid, bthday, gender, score, lnact, lnact_seq, branch, ln_dt, ln_amt, dlq_dt, dlq_cnt
select b.lnid, b.bthday, b.gender, b.score, a.lnact, a.lnact_seq, a.branch, a.ln_dt, a.ln_amt, a.dlq_dt, a.dlq_cnt
  from tacct a
  join tid b
    on a.lnid = b.lnid
   and b.id_typ = '1'
   and b.score >= 800
 order by dlq_cnt desc nulls last;
-- 수정 3 순서

select lnact, lnact_seq, lnid, prod_cd, ln_amt
  from tacct
 where acct_typ = '1'
   and (prod_cd, ln_amt) in (select prod_cd, max(ln_amt)
                               from tacct
                              group by prod_cd)
 order by prod_cd, ln_amt;

;
select prod_cd, max(ln_amt)
  from tacct
   group by prod_cd;
   
   
select lnact, lnact_seq, lnid, ln_dt, to_char(ln_amt/1000, 'L99,999,999') "대출금(천원)", dlq_dt, dlq_cnt
  from tacct
 where acct_typ = '2'
   and lmt_typ is null
   and ln_amt >= 100000000
   and dlq_cnt > 0
 order by dlq_dt;   

select branch, prod_cd, sum(ln_amt)
  from tacct
 where acct_typ = '1'
   and prod_cd between '100' and '105'
   and branch between '10' and '20'
   and repay is null
 group by branch, prod_cd
 order by branch, prod_cd;
 
select b.lnid, b.bthday, b.gender, b.score, a.lnact, a.lnact_seq, a.branch, a.ln_dt, a.ln_amt, a.dlq_dt, a.dlq_cnt
  from tacct a
  join tid b
    on a.lnid = b.lnid
   and b.id_typ = '1'
   and b.score >= 800
 order by dlq_cnt desc nulls last; 


select lnact, lnact_seq, lnid, prod_cd, ln_amt
  from tacct
 where acct_typ = '1'
   and (prod_cd, ln_amt) in (select prod_cd, max(ln_amt)
                               from tacct
                              group by prod_cd)
 order by prod_cd, ln_amt;