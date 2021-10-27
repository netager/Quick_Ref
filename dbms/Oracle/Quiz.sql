-- Quiz.pdf
-------------------------------------------------
-- 1-1.
select 'DROP TABLE ' || table_name || ' PURGE;' 
     from user_tables;

-- 1-2.
select 'DROP TABLE ' || rpad(table_name, 20) || ' PURGE;' 
     from user_tables;     

-- 2.
select a.*
  from emp a
 where a.comm > a.sal;

-- 3.
select a.*
  from emp a
 where a.sal between 1500 and 3000
   and (a.comm is null or a.comm = 0);
 
-- 4.
select a.*
  from emp a
 where to_char(a.hiredate, 'mm') = '12'
  order by a.hiredate;

-- 5.
select a.*
  from emp a
 where substr(a.ename,1,1) in ('S', 'A');
 
-- 6.
select a.*
  from emp a
 order by comm desc nulls last;
 
-- 7.
select to_char(time_id, 'day'), sum(amount_sold)
  from sh.sales
  where time_id between trunc(to_date('1998/05/01','yyyy/mm/dd'), 'D')
                    and trunc(to_date('1998/05/01','yyyy/mm/dd'), 'D')+6
  group by to_char(time_id, 'day');

select to_char(time_id, 'd'), sum(amount_sold)
  from sh.sales
  where time_id between trunc(to_date('1998/05/01','yyyy/mm/dd'), 'D')
                    and trunc(to_date('1998/05/01','yyyy/mm/dd'), 'D')+6
  group by to_char(time_id, 'd')
  order by to_char(time_id, 'd');

-- 8.
select a.deptno, a.job, sum(a.sal)
  from emp a
 group by a.deptno, a.job
 order by deptno;

select dno, sum(anal), sum(cler), sum(mana), sum(pres), sum(sale)
  from (select a.deptno dno
             , decode(a.job, 'ANALYST', sum(a.sal)) anal
             , decode(a.job, 'CLERK', sum(a.sal)) cler
             , decode(a.job, 'MANAGER', sum(a.sal)) mana
             , decode(a.job, 'PRESIDENT', sum(a.sal)) pres
             , decode(a.job, 'SALESMAN', sum(a.sal)) sale
         from emp a
        group by a.deptno, a.job)
 group by dno
 order by dno;

-- 9.
select unique a.cust_id, a.lname, a.phone, a.city , a.country
  from custs a, orders b
 where a.cust_id(+) = b.cust_id;
 
-- 10.
select a.ename, a.sal, (select sal from emp where ename = 'JONES') "Jones's Salary"
  from emp a, emp b
 where a.empno = b.empno
   and a.sal > (select sal from emp where ename = 'JONES');
   
-- Ansi-Join                 
select a.ename, a.sal, b.sal "Jone's Salary"
  from emp a join (select sal from emp where ename = 'JONES') b
    on a.sal > b.sal;

select a.ename, a.sal, b.sal "Jone's Salary"
  from emp a, (select sal from emp where ename = 'JONES') b
 where a.sal > b.sal;

-- Self Join
select e.ename, e.sal, j.sal "Jones's Salary "
  from emp e join emp j
    on j.ename = 'JONES'
   and e.sal > j.sal;

select e.ename, e.sal, j.sal "Jones's Salary "
  from emp e, emp j
 where j.ename = 'JONES'
   and e.sal > j.sal;

-- 11.   
select a.lname, b.order_id, b.order_date, b.order_total
  from custs a, orders b
 where a.cust_id = b.cust_id
   and order_mode = 'direct';
   
-- 12.   
select b.deptno, b.dname, sum(a.sal) sum_sal
  from emp a, dept b
 where a.deptno(+) = b.deptno
 group by b.deptno, b.dname
 order by 1;

-- 13.   
select a.cust_id, a.lname, a.birthday, sum(b.order_total)
  from custs a, orders b
 where a.cust_id = b.cust_id(+)
   and to_char(a.birthday, 'yyyy') < '1980'
 group by a.cust_id, a.lname, a.birthday
 order by sum(b.order_total) desc nulls last;

-- 14   
select a.cust_id, a.cust_fname, a.cust_lname, sum(b.order_total)
  from customers a, torders b, wishlist c
 where a.cust_id = b.cust_id
   and a.cust_id = c.cust_id
   and c.deleted = 'N'
 group by a.cust_id, a.cust_fname, a.cust_lname
 order by a.cust_id;
 
 select order_id, count(*) from torders
  group by order_id;
 
 select a.cust_id, b.cust_id, b.order_total
   from wishlist a, torders b
  where a.deleted = 'N'
    and a.cust_id = b.cust_id;

select c.cust_id, sum(b.order_total)
   from (select cust_id, count(*)
           from wishlist
          where deleted = 'N'
          group by cust_id) a, torders b, customers c
  where a.cust_id = b.cust_id
    and a.cust_id = c.cust_id
  group by c.cust_id;  
 
 select cust_id from wishlist
  where cust_id = 105
    and deleted = 'N';

select * from torders;
 select cust_id from torders
  where cust_id = 105;

select cust_id from customers
 where cust_id = 105;

select * from wishlist; 
 order by sum(b.order_total) desc nulls last;
 
order by comm desc nulls last;
select * from orders;   
   
select * from orders;   