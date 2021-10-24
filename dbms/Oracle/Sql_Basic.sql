-- ADMIN 비밀번호
-- ADMIN / Dltnscjs100%

-- 주석
-- --, /*   */
-- 단축키 : [Ctrl] + /

-- SQL Execution Order
5 SELECT    : 검색 대상의 표현식 정의 
1 FROM      : 대상 집합 정의  
2 WHERE     : 행 제한을 위한 조건식 정의 
3 GROUP BY  : 그룹 생성을 위한 표현식 정의 
4 HAVING    : 그룹 제한을 위한 조건식 정의 
6 ORDER BY  : 정렬을 위한 표현식 정의


-- 산술 연산
select sal+100, sal-100, sal*100, sal/100 
from emp;

select empno, deptno, sal, empno+deptno+sal
from emp;

select 13500*0.3+13500*12
from dual;

select (13500*0.3+13500)*12
from dual;


-- 날짜 데이터 처리
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

-- Null 처리
-- 수치 + Null = Null
-- 산술 연산, 비교 연산 사용 불가
-- Null을 처리하기 위한 nvl() 사용
select empno, ename, sal, comm, nvl(comm, 0), sal+comm, sal+nvl(comm, 0)
  from emp;

select last_name  
-- Alias 사용
select empno num, ename Name, sal SAL, sal+nvl(comm, 0) total
  from emp;
  
select empno as num, ename as "Name", sal as SAL, sal+nvl(comm, 0) as "monthly salary"
  from emp;
  
select '사원번호 ' || empno ||'의 이름은 ' || ename || ' 입니다' from emp
 where empno = '7369';
 
select 'DROP TABLE ' || table_name || ' PURGE;' as "DROP DML SQL"
 from user_tables;            

-- 중복행 제거 조회 (distinct)
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


-- 날짜 컬럼 조회시 난해성
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

-- 데이터 조회시 대소문자 구분 함
select empno, ename, sal, job
 from emp
where ename = 'JONES';

-- 비교 연산자
---- >, <, =, !=, >=, <=
---- between .low value. and .upper value., not between .. and ..
select empno ename, sal, hiredate
from emp
-- where hiredate between '1981/12/03' and '1981/12/03';
where hiredate between '1981/01/01' and '1981/12/31';
-- where hiredate between '1981/12/31' and '1981/12/01';-- error

---- in 연산자, not in
select empno, ename, deptno
from emp
--where deptno = 10
----and deptno = 30;
--or deptno = 30
--or deptno = 60
--or deptno = 70;
where deptno in (10, 20, 30, 50);


-- 논리 연산자
---- and, or

---- like, not like
select empno, ename
 from emp
-- where ename like '%E%';  
-- where ename like '%E';   -- E로 끝나는 문자
 where ename like '%E_';  -- '_' 는 한개의 문자

---- 와일드 카드 문자 사용시 발생할 수 있는 문제
select employee_id, job_id
  from employees
   where job_id like '%C\_%' escape '\';   -- '_'는 와일드 문자가 아니고 데이터의 일부라는 것을 알려 줘야함

-- null 값의 조회
---- is null, is not null
select empno, ename, sal, comm
  from emp
-- where comm is null;
-- where comm = 'null';  -- Error
-- where comm = null;      -- Error 는 안나지만 원하는 출력이 안 나옴
 where comm = '(null)';  -- Error
 
desc sh.sales;
select * from dba_users;

select count(*) from sh.sales;

desc sh.sales;


-- Oracle 12c 부터 사용 가능한 문법(offset)
select employee_id, first_name
  from employees
 order by employee_id
 fetch first 5 rows only;

-- Oracle 12c 부터 사용 가능한 문법(offset)
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

                                                                                                                                  
-- 함수 사용
-- --------
-- 단일행 함수 : min(), max() 등
--   - 일반, 문자, 숫자, 날짜, 변환
--   - Character  : upper, lower, initcap, ...
--   - Number     : round, trunc, mod, ceil, floor
--   - Date       : add_months, months_between, ..
--   - Conversion : to_char, to_date, to_number, ...
--   - General    : nvl, nvl2, nullif, coalesce, decode, ... (case expression)
--   - 기타        : user, sysdate(서버의 일시), current_date(내PC의 일시)
select to_char(sysdate,'yyyy/mm/dd hh24:mi:ss')
     , to_char(current_date,'yyyy/mm/dd hh24:mi:ss')
     , user
  from dual; 
-- 다중행 함수
-- ---------------------
-- 연습용 테이블 과 데이터 생성
drop table t1 purge;
create table t1(col1 varchar2(30));

insert into t1 values('38372834');
insert into t1 values('a837b83c');
insert into t1 values('38abcd34');
insert into t1 values('78929341');
insert into t1 values('a837283b');
commit;

select * from t1;

-- 단일 행 함수 : 문자
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

-- col1에서 숫자로만 구성된 값 조회 
select col1, upper(col1), lower(col1), initcap(col1)
  from t1
 where lower(col1) = upper(col1);

-- col1에서 숫자로만 구성된 값 조회 
--  - trim()을 통해 숫자를 제거
select col1, ltrim(col1, '123456789')
  from t1
 where ltrim(col1, '123456789') is null ;

-- concat() : 두개의 컬럼을 하나로 출력하지만 입력값으로 2개의 인자를 받음
select empno, ename, sal, deptno
     , empno || ename || sal || deptno as concat
     , concat(empno, concat(ename, concat(sal, deptno))) as concat_by_function
  from emp;

select 1+null from dual; // Null 과 산술연산시 결과는 Null

-- concat()로 Null을 합치는 경우 정상 출력
select concat('',empno), concat(null, empno), concat(' ', empno) from emp;

-- substr(문자, 시작, 길이) : 문자수 시작부터 갯수까지 가져오기
select 'sql is so fun'
     , substr('sql is so fun', 1, 4)
     , substr('sql is so fun', 1, 4)
     , dump(substr('sql is so fun', 1, 4))
  from dual
 where substr('sql is so fun', 1, 4) = 'sql ';  // 공백 주의

-- length()  : 문자의 길이
-- lengthb() : 저장되는 Byte 수
select ename, length(ename), lengthb('ㄱ')
     , job ,  length(job), lengthb('a')
     , hiredate, length(hiredate)
  from emp;
  
-- instr() : 문자열의 문자의 위치를 알려줌
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
     , round(87654.546,-6)  -- 주의 필요
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

-- 날짜 함수
alter session set nls_date_format = 'yyyy/mm/dd';
alter session set nls_date_format = 'yyyy/mm/dd hh24/mi/ss';

-- 날짜의 연산
select current_date -1 
     , current_date
     , current_date + 1
  from dual;

-- to_date()
select current_date - to_date('1972/10/07','yyyy/mm/dd') -- 일수가 나옴
  from dual;

select (current_date - to_date('1972/10/07','yyyy/mm/dd')) / 7 -- 주수가 나옴
  from dual;

select (current_date - to_date('1972/10/07','yyyy/mm/dd')) / 30 -- 달수가 나옴
  from dual;
  
select to_date('1990/10/16','yyyy/mm/dd') 
     , to_date('1990/10/16','yyyy/mm/dd') + 1 
     , to_date('1990/10/16','yyyy/mm/dd') + 1/24  -- 1시간 
     , to_date('1990/10/16','yyyy/mm/dd') + (3/24 + 15/(24*60) + 50/(24*60*60)) 
  from dual;

select empno
    ,current_date, hiredate
    ,months_between(current_date, hiredate)
    ,add_months(hiredate,3)
    ,next_day(hiredate,'목')
    ,last_day(hiredate)
from emp;

select empno
    ,current_date, hiredate
--    ,months_between(current_date, hiredate)
--    ,add_months(hiredate,3)
--    ,next_day(hiredate,'목')
--    ,last_day(hiredate)
from emp;


select empno
    ,current_date, hiredate
--    ,months_between(current_date, hiredate)
--    ,add_months(hiredate,3)
--    ,next_day(hiredate,'목')
    ,last_day(hiredate)
from emp;

select 
    next_day(current_date,'목')
    ,last_day(current_date)
from dual;

select order_date, current_date
    ,add_months(order_date,2)
    ,months_between(current_date,order_date)
from orders;


select order_date
      ,next_day(order_date, '금요일')
      ,last_day(order_date)
from orders ;

-- https://docs.oracle.com/cd/B19306_01/server.102/b14200/functions230.htm
select '2019/09/19'
     , round(to_date('2019/09/19'), 'month') -- 15일 기준으로
     , round(to_date('2019/09/19'), 'year')  -- 7월 기준으로
     , round(to_date('2019/06/19'), 'year')
  from dual;
  
select '2019/09/19'
     , trunc(to_date('2019/09/19'), 'DAY') -- DAY, DY, D 는 동일
     , trunc(to_date('2019/09/19'), 'DY')  -- 그 주의 첫벗째 날
     , trunc(to_date('2019/09/19'), 'D')  
  from dual;  
  
select '2021/10/16'
     , trunc(to_date('2019/09/19'), 'DAY') -- DAY, DY, D 는 동일
     , trunc(to_date('2019/09/19'), 'DY')  -- 그 주의 첫벗째 날
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

-- 변환함수
-- 
select 7788, dump(7788), '7788', dump('7788') from dual;

-- 오라클의 암시적 형 변환
select empno, ename
  from emp
-- where empno = '7788';
-- where empno = '7788';
 where empno like '_3%';  -- 암시적으로 to_char(empno) like '_3%'

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
    , to_char(hiredate,'"입사년도는 " yyyy " 입니다."')
    , to_char(hiredate,'"입사 분기는 " q "  분기 입니다."')
    , to_char(hiredate,'"일주일 중 " d " 번째 날에 입사했습니다."')
from emp;

select empno, ename
    , to_char(hiredate,'"입사년도는 " yyyysp " 입니다."')
    , to_char(hiredate,'"입사 분기는 " qsp "  분기 입니다."')
    , to_char(hiredate,'"일주일 중 " dsp " 번째 날에 입사했습니다."')
from emp;

select empno, ename
    , to_char(hiredate,'"입사년도는 " yyyyspth " 입니다."')
    , to_char(hiredate,'"입사 분기는 " qspth "  분기 입니다."')
    , to_char(hiredate,'"일주일 중 " dspth " 번째 날에 입사했습니다."')
from emp;

select to_char(hiredate, 'yyyy mm ddd')
  from emp;

--오늘은 2021년 10월 16일입니다.
-- 아래중 어떻게 쓰는게 좋을까?
select '오늘은 '||to_char(current_date, 'YYYY')||'년 '||to_char(current_date, 'MM')||'월 '||to_char(current_date, 'DD')||'일입니다.' as today
from dual;     

select to_char(current_date, '"오늘은" YYYY"년" MM"월" DD"일입니다."') as today
from dual;

select sal
     , to_char(sal, '$')
     , to_char(sal, '$9')
     , to_char(sal, '$999')
     , to_char(sal, '$9,999')
     , to_char(sal, 'fm$9999') -- 앞으로 댕겨서 출력
     , to_char(sal, '$0,999')
  from emp;
  
select '$15,000' + '$20,000'
  from dual;

-- to_number()  
select to_number('$15,000','$99,999') + to_number('$20,000', '$99,999')
  from dual;

-- 일반함수
-- nvl(), nvl2()

-- nvl()
select empno, sal, comm
     , sal*12+comm
     , sal*12+nvl(comm,0) a
     , nvl2(comm, sal*12+comm, sal*12) b -- null 이 있고 없고에 따라 IF문 처럼 사용
     , nvl2(comm, 'sal*12+comm', 'sal*12') c 
  from emp;

drop table t2 purge;    -- 쓰레기통에 넣지않고 바로 Drop
create table t2 (col1 varchar2(30)
               , col2 varchar2(30));

insert into t2 values('kim', 'developer');
insert into t2 values('lg' , 'GS');
insert into t2 values(null, 'ks') ;
insert into t2 values('samsung', 'oracle');
insert into t2 values('samsung', null);
commit;

select * from t2;

-- nullif() - 같으면 null 반환
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

-- 문제. emp 테이블에서 급여에 따라 A, B, C로 구분된 결과를 출력하세요
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

-- 집계함수
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

-- department_id에 1개의 null이 있음
select count(*), count(department_id), count(distinct department_id)
  from employees;

select sal + comm
  from emp;

-- avg()는 null 값은 제외 됨
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

-- oracle version up 되면서 허용되는 기능 - over()
select department_id
     , job_id 
     , sum(salary) over(partition by department_id)
     , sum(salary) over()
  from employees;

-- having 의 사용 
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

