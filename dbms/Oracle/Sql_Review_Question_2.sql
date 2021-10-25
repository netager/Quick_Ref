-- SQL 복습문제2.pdf
-------------------------------------------------
-- 함수 (30)
-------------------------------------------------
-- 3-1.
select ename, upper(ename), lower(ename), initcap(ename)
  from emp;

-- 3-2.
select ename, sal
  from emp
 where lower(ename) = 'king';

-- 3-3.
select ename
  from emp
 where substr(ename, 1, 1) = 'S';
 
-- 3-4.
select ename
  from emp
 where substr(ename, 2, 1) = 'M';
 
-- 3-5.
select ename
  from emp
 where substr(ename, -1, 1) = 'T';
 
-- 3-6.
select ename
  from emp
 where substr(ename, 1, 2) = 'AL';
 
-- 3-7.
select ename
  from emp
 where substr(ename, -2, 2) = 'MS';

-- 3-8.
select upper(substr(lower(ename),1,1)) || substr(lower(ename),2) as "INITCAP(ENAME)"
  from emp;

-- 3-9.
select ename
  from emp
 where instr(ename, 'S') = 1;  

-- 3-10.
select ename, length(ename)
  from emp
 where length(ename) >= 6;

-- 3-11. ~ 3- DATE 함수로 효용 없음

-- 3-19.
select ename, to_char(hiredate, 'yyyy')
  from emp;

-- 3-20.
select ename, to_char(hiredate, 'yyyy')
  from emp
 where to_char(hiredate, 'yyyy') = '1981';
 
select ename, to_char(hiredate, 'yyyy')
  from emp
 where hiredate like '1981%';

-- 3-21.
select lower(ename), lower(job), hiredate
  from emp
 where to_char(hiredate, 'yyyy') = '1981';

-- 3-22.
select ename, hiredate
  from emp
 where hiredate = '1981/12/03';

-- 3-23.
 alter session set nls_date_format = 'yyyy/mm/dd';
-- alter session set nls_date_format = 'yyyy/mm/dd hh24/mi/ss';

select ename, hiredate
  from emp
 where to_char(hiredate, 'yyyymmdd') = '19811203';

-- 3-24.
select ename, hiredate
  from emp
 where to_char(hiredate, 'yyyymmdd') = '19811203';

-- 3-25.
select ename, decode(comm, NULL, 'no comm', comm)
  from emp;

select ename, decode(comm, '', 'no comm', comm)
  from emp;

-- case 문으로 NULL 처리 어렵군 ???
select empno
     , comm
     , case comm when NULL then 0
            else nvl(comm, 0) end as bbb
  from emp;
  
select empno
     , comm
     , case when comm is null then 0
            else comm
        end as BBB
  from emp;
--------------------------------------------------------

-- 3-26.
select ename, to_char(hiredate, 'yyyy'), sal, comm
     , case when to_char(hiredate, 'yyyy') = '1981' then 5000
            else 0 
        end
  from emp
 order by to_char(hiredate, 'yyyy');

-- 3-27.
select ename, sal, job 
     , case when job = 'SALESMAN' then 8000
            when job = 'ANALYST'  then 6000
            when job = 'CLERK'    then 4000
            else 0
        end as comm
  from emp;

-- 3-28.
select ename, sal 
     , case when sal >= 3000 then 6000
            else 0
        end as comm
  from emp;

-- 3-29.
select ename, sal, comm
     , case when comm is null then 7000
            else 0
        end as comm
  from emp;

-- 3-30.
select ename, sal, job, comm
     , case when job = 'SALESMAN' and sal >= 1000 then 9000
            when job = 'ANALYST' and sal >= 2500 then 8000     
            else 0
        end as comm
  from emp;


-- 복수행 함수 (group 함수) (19)  
-------------------------------------------------
-- 4-1.
select max(sal)
  from emp;

-- 4-2.
select max(sal)
  from emp
 where job = 'SALESMAN';
 
-- 4-3.
select deptno, max(sal)
  from emp
 group by deptno
 order by deptno, max(sal) desc;
 
-- 4-4.
select deptno, max(sal)
  from emp
 where deptno <> 20
 group by deptno
 order by deptno, max(sal) desc;

-- 4-5.
select avg(comm)
  from emp;

-- 4-6.
select sum(comm)/count(*)
  from emp;

-- 4-7.
select job, to_char(sum(sal),'$999,999') tot_sum
  from emp
 where job <> 'SALESMAN' 
 group by job
 order by tot_sum desc;

-- 4-8.
select deptno, sum(sal)
  from emp
 group by deptno
 order by deptno desc;
 
-- 4-9.
select sum(decode(deptno,10,sal)) "10"
     , sum(decode(deptno,20,sal)) "20"
     , sum(decode(deptno,30,sal)) "30"
  from emp;
  
-- 4-10.
select job, sum(sal)
  from emp
 group by job;  
  
 group by deptno
 order by deptno desc;
 
 
  from emp
 where job = 'SALESMAN';



 
select /* simple case 표현식 */ empno, deptno, sal
     , case deptno when 10 then sal*1.1
                   when 20 then sal*1.2
                   else sal end as conditional_result
  from emp;

select /* searched case 표현식 */ empno, deptno, sal
     , case when deptno <= 20 then sal*1.1
            when deptno = 30 then sal*1.2
            else sal end as conditional_result
  from emp;

select * from emp order by hiredate;
