-- SQL 복습문제3.pdf
-------------------------------------------------
-- 조인 (29)
-------------------------------------------------
select * from employees;
select * from departments;

-- 5-1.
select a.ename, b.loc
  from emp a, dept b
 where a.deptno = b.deptno;
 
-- 5-2.
select a.ename, b.loc
  from emp a, dept b
 where a.deptno = b.deptno
   and b.loc = 'DALLAS';

-- 5-3.
select a.ename, a.sal, a.job, b.loc
  from emp a, dept b
 where a.deptno = b.deptno
   and a.job = 'SALESMAN';

-- 5-4.
select a.ename, a.sal, a.job, b.loc, b.deptno 
  from emp a, dept b
 where a.deptno = b.deptno
   and a.job = 'SALESMAN';

-- 5-5.
select a.ename, a.sal, b.loc 
  from emp a, dept b
 where a.deptno = b.deptno
   and a.sal >= 3000;
   
-- 5-6.
select a.ename, a.job, a.sal, b.dname, b.loc 
  from emp a, dept b
 where a.deptno = b.deptno
   and a.job = 'SALESMAN';

-- 5-7.
select b.dname, b.loc, a.ename, a.sal 
  from emp a, dept b
 where a.deptno = b.deptno
 order by a.sal desc;

-- 5-8.
select b.dname, b.loc, a.ename, a.sal 
  from emp a, dept b
 where a.deptno = b.deptno
 order by b.dname, a.sal desc;

-- 5-9. ???
select b.dname
     , decode(b.dname, 'RESEARCH', a.ename)
  from emp a, dept b
 where a.deptno = b.deptno;

-- 5-10. 
select a.ename, a.sal, b.grade, b.losal, b.hisal
  from emp a, salgrade b
 where a.sal between b.losal and b.hisal;

-- 5-11. 
select b.deptno, b.dname, sum(a.sal), count(*)
  from emp a, dept b
 where a.deptno = b.deptno
 group by b.deptno, b.dname;

-- 5-12. 
select b.loc, sum(a.sal), count(*)
  from emp a, dept b
 where a.deptno = b.deptno
   and b.loc <> 'DALLAS'
 group by b.loc;

select b.loc, sum(a.sal), count(*)
  from emp a, dept b
 where a.deptno = b.deptno
 group by b.loc
having b.loc <> 'DALLAS';

-- 5-13. 
select b.loc, to_char(a.hiredate, 'yyyy'), count(*)
  from emp a, dept b
 where a.deptno = b.deptno
 group by b.loc, to_char(a.hiredate, 'yyyy');

select b.loc, decode(to_char(a.hiredate , 'yyyy'), 1980, count(*)) "1980"
  from emp a, dept b
 where a.deptno = b.deptno
 group by b.loc, to_char(a.hiredate, 'yyyy');

select b.loc, to_char(a.hiredate , 'yyyy')
  from emp a, dept b
 where a.deptno = b.deptno;

 
 select b.loc, count(*) from dept b;
to_char(a.hiredate, 'yyyy'), count(*)


select b.dname
     , decode(b.dname, 'RESEARCH', a.ename)
  from emp a, dept b
 where a.deptno = b.deptno;


select b.dname, a.ename from emp a, dept b
 where a.deptno = b.deptno;

 order by b.dname, a.sal desc;

select distinct dname from dept;
