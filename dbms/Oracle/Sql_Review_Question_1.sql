-- SQL select 문을 사용하여 데이터 검색(9)
-------------------------------------------------
-- SQL 복습문제1.pdf
-------------------------------------------------
-- 1-1.
select * from dept;

-- 1-2.
select empno, ename, sal
  from emp;

-- 1-3.
select ename, job, hiredate, deptno
  from emp;

-- 1-4.
select ename,sal, comm
  from emp;

-- 1-5.
select ename, sal, nvl(comm, 1), sal + nvl(comm, 1), sal + comm
  from emp;

-- 1-6. 
select distinct job
  from emp;

select unique job
  from emp;
  
-- 1-7.
select distinct deptno
  from emp;
  
-- 1-8.  
select ename || sal
  from emp;
  
-- 1-9.
select ename||'''s job is '||job as "EMPLOYEE"
  from emp;
  
  
  
-- 데이터 제한 및 정렬(32)
-------------------------------------------------
--2-1.  
select ename, sal 
  from emp
 where sal = 3000;

-- 2-2. 
select ename, job
  from emp
 where job = 'SALESMAN';
 
-- 2-3.
select ename, sal
  from emp
 where sal >= 2500;

-- 2-4.
select ename, job
  from emp
 where job <> 'SALESMAN';
 
-- 2-5.
select ename, sal * 12 "Sum_Sal"
  from emp;
  
-- 2-6.
select ename, sal
  from emp
 where sal >= 3600;

-- 2-7.
select ename, sal
  from emp
 where sal between 1000 and 3000;

-- 2-8.
select ename, sal
  from emp
 where not sal between 1000 and 3000;
 
--2-9. 
select ename, hiredate 
  from emp
 where to_char(hiredate, 'yyyymmdd') = '19810220';

-- 2-10. 
select ename, hiredate 
  from emp
 where to_char(hiredate, 'yyyy') = '1981';
 
-- 2-11. 
select ename
  from emp
 where ename like 'S%';
 
-- 2-12.
select ename
  from emp
 where ename like '%T';
 
-- 2-13.
select ename
  from emp
 where ename like '_M%';
 
-- 2-14.
select ename
  from emp
 where ename like '__L%';

-- 2-15.
insert into emp (empno, ename, sal) values(1234, 'A%B', 3400);

select ename
  from emp
 where ename like '_\%%' escape '\';
 
-- 2-16.
insert into emp (empno, ename, sal) values(2919, 'A%%B', 4300);

select ename
  from emp
 where ename like '_\%\%%' escape '\';
   
select ename
  from emp
 where ename like '_\%%' escape '\'
   and ename like '__\%%' escape '\';
 
-- 2-17.
select ename
  from emp
 where ename not like 'S%';
 
-- 2-18.
select empno, ename
  from emp
 where empno in (7788, 7902, 7369);

-- 2-19.
select ename, job
  from emp
 where job not in ('SALESMAN', 'ANALYST');

-- 2-20.
select ename, comm
  from emp
 where comm is null;
 
-- 2-21.
select ename, comm
  from emp
 where comm is not null;

-- 2-22.
select ename, sal
  from emp
 order by sal;

-- 2-23.
select ename, hiredate
  from emp
 order by hiredate desc;
 
-- 2-24.
select ename, sal
  from emp
 where job = 'SALESMAN'
 order by sal desc;
 
-- 2-25.
select ename, hiredate
  from emp
 where deptno not in (10, 20)
 order by hiredate;
 
-- 2-26.
select ename, sal
  from emp
 where comm is not null
 order by sal desc;
 
-- 2-27.
select ename, job, sal
  from emp
 where job = 'SALESMAN'
   and sal >= 1000;

-- 2-28.
select ename, sal
  from emp
 where ename like 'S%'
    or sal >= 1000;
 
-- 2-29.
select ename, job, hiredate
  from emp
 order by job, hiredate desc;  

-- 2-30.
select ename, hiredate
  from emp
 where to_char(hiredate, 'yyyymmdd') = '19810401';

-- 2-31.
select ename, hiredate
  from emp
 where to_char(hiredate, 'yyyy') = '1981';

-- 2-32.
select ename, hiredate
  from emp
 where hiredate like '1981%';  
