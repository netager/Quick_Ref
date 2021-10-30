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

select d.dname
     , listagg(e.ename, ',') within group (order by ename asc)
  from emp e, dept d
 where e.deptno = d.deptno
 group by d.dname;
 
 
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
select locc, sum(dd) "1980", sum(ee) "1981", sum(ff) "1982", sum(gg) "1983"
 from (select b.loc locc
            , nvl(decode(to_char(a.hiredate, 'yyyy'),1980, count(*)), 0) as dd
            , nvl(decode(to_char(a.hiredate, 'yyyy'),1981, count(*)), 0) as ee
            , nvl(decode(to_char(a.hiredate, 'yyyy'),1982, count(*)), 0) as ff
            , nvl(decode(to_char(a.hiredate, 'yyyy'),1983, count(*)), 0) as gg
         from emp a, dept b
        where a.deptno = b.deptno
        group by b.loc, to_char(a.hiredate, 'yyyy'))
group by locc;

-- 5-14. 
insert into emp(empno, ename, sal, deptno)
     values(1934,'JANE', 4700, 70);

select * 
  from emp a, dept b
 where a.deptno = b.deptno(+);

-- 5-15. 
insert into emp(empno, ename, sal, deptno)
     values(1934,'JANE', 4700, 70);

select a.*, b.* 
  from emp a, dept b
 where a.deptno = b.deptno(+);

select a.*, b.*
  from emp a left outer join dept b
    on a.deptno = b.deptno;

-- 5-16. full outer join
select a.empno, a.ename, b.deptno, b.dname 
  from emp a full outer join dept b
    on a.deptno = b.deptno;

-- 5-17. 
select b.dname, sum(a.sal)
  from emp a, dept b
 where a.deptno = b.deptno
 group by b.dname;
 
select b.dname, sum(a.sal)
  from emp a, dept b
 where a.deptno(+) = b.deptno
 group by b.dname;
 
-- 5-18. 
select dname, sum(cnt)
  from (select b.dname dname, decode(null, a.deptno,0,1) cnt   --nvl(a.count(*), 0)
          from emp a, dept b
         where a.deptno(+) = b.deptno)
 group by dname;

-- 5-19. 
select a.ename, b.ename
  from emp a, emp b
 where a.mgr = b.empno(+);
 
-- 5-20. 
select a.ename, b.ename, a.sal, b.sal
  from emp a, emp b
 where a.mgr = b.empno(+)
   and a.sal > b.sal;
   
-- 5-21. 
select a.ename, b.ename, a.hiredate, b.hiredate
  from emp a, emp b
 where a.mgr = b.empno(+)
   and a.hiredate < b.hiredate;

-- 5-22. 
select a.ename, b.dname, a.sal, c.grade
  from emp a, dept b, salgrade c
 where a.deptno = b.deptno
   and a.sal between c.losal and c.hisal;
   
-- 5-23. 
select a.ename, b.dname
  from emp a inner join dept b
    on a.deptno = b.deptno;
 
select a.ename, b.dname
  from emp a left outer join dept b
    on a.deptno = b.deptno;

-- 5-24. 
select a.ename, b.dname, a.job
  from emp a inner join dept b
    on a.deptno = b.deptno
   and a.job = 'SALESMAN';

-- 5-25. 
select a.ename, a.sal, b.dname, c.grade
  from emp a 
 inner join dept b
    on a.deptno = b.deptno
 inner join salgrade c   
    on a.sal between c.losal and c.hisal;
 
-- 5-26. 
select a.ename, b.dname
  from emp a 
 inner join dept b
 using (deptno);

-- 5-27. 
select ename, dname
  from emp 
 natural join dept;
 
-- 5-28. 
select ename, dname
  from emp 
 cross join dept;

select count(*) from emp;  -- 14 
select count(*) from dept; --  4 

-- 5-29. 
select e.ename, d.loc
  from emp e, dept d 
 where e.deptno(+) = d.deptno;

select e.ename, d.loc
  from emp e
  right outer join dept d 
     on e.deptno = d.deptno;

-------------------------------------------------
-- 서브쿼리 (18)
-------------------------------------------------
-- 6-1. 
select a.ename, a.sal
  from emp a
 where a.sal = (select max(b.sal)
                from emp b);

-- 6-2. 
select a.ename, a.sal
  from emp a
 where a.sal > (select b.sal
                from emp b
               where ename = 'JONES');

-- 6-3. 
select a.ename, a.sal
  from emp a
 where a.sal = (select b.sal
                from emp b
               where ename = 'SCOTT');

-- 6-4. 
select a.ename, a.hiredate
  from emp a
 where a.hiredate > (select b.hiredate
                       from emp b
                      where ename = 'ALLEN');
select b.hiredate
  from emp b
 where ename = 'ALLEN';
                      
-- 6-5. 
select a.ename, a.sal
  from emp a
 where a.sal = (select max(b.sal)
                  from emp b);

-- 6-6. 
select a.ename, a.deptno
  from emp a
 where a.deptno = (select b.deptno
                  from emp b
                 where b.ename = 'ALLEN');

-- 6-7. 
select a.ename, a.job
  from emp a
 where a.job = (select b.job
                  from emp b
                 where b.ename = 'SCOTT')
   and a.ename <> 'SCOTT';

select ename, job from emp where job = 'ANALYST';   

-- 6-8. 
select a.ename, a.mgr
  from emp a
 where a.mgr = (select b.empno
                   from emp b
                  where b.ename = 'KING');

-- 6-9. 
select a.ename, a.sal
  from emp a
 where a.deptno = (select b.deptno
                     from dept b
                    where b.loc = 'DALLAS');
                 
-- 6-10. 
select a.ename, a.sal, a.job
  from emp a
 where a.sal in (select b.sal
                   from emp b
                  where b.job = 'SALESMAN');

select b.ename, b.sal
  from emp b
 where b.job = 'SALESMAN';

-- 6-11. 
select a.ename, a.sal, a.job
  from emp a
 where a.sal not in (select b.sal
                       from emp b
                      where b.job = 'SALESMAN');

-- 6-12. 
select a.ename, a.deptno
  from emp a
 where a.empno in (select b.mgr
                       from emp b);

select unique mgr from emp;

-- 6-13. 
select a.ename, a.deptno
  from emp a
 where a.empno not in (select nvl(b.mgr, 0)
                         from emp b);
                         
-- 6-14. 
select a.ename, a.sal, a.job
  from emp a
 where a.sal >  (select max(b.sal)
                   from emp b
                  where b.job = 'SALESMAN');

-- 6-15. 
select a.ename, a.sal, a.job
  from emp a
 where a.sal >  (select min(b.sal)
                   from emp b
                  where b.job = 'SALESMAN');

-- 6-16. 
select a.ename, a.hiredate
  from emp a
 where a.hiredate > (select min(b.hiredate)
                       from emp b
                      where b.deptno = 30);

select min(b.hiredate)
  from emp b
 where b.deptno = 30;

-- 6-17. 
select a.deptno, a.loc
  from dept a
 where a.deptno in (select unique b.deptno
                      from emp b);

-- 6-18. 
select a.deptno, a.loc
  from dept a
 where a.deptno not in (select unique b.deptno
                          from emp b);