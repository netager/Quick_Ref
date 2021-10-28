-- 15.
select b.deptno, b.dname, b.loc, decode(a.cnt,null,'NO','YES')
  from (select deptno, count(*)cnt
          from emp
         group by deptno) a, dept b
 where a.deptno(+) = b.deptno;
 
-- 16.
select empno, ename, sal, sum(sal) over(order by empno) TOTAL
  from emp;
