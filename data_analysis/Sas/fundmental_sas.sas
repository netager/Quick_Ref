/* SAS로 하는 기초 데이터 전처리 */

/* 1. SAS의 기초 */

DATA TEST;         * 테이블 TEST를 생성함
SET SASHELP.CLASS; * 라이브러리 sashelp의 class라는 테이블에서 데이터를 불러옴;
RUN;



/* 1.1 테이블과 라이브러리 */

/* 1.2 라이브러리 생성법 */

LIBNAME SASTEST "/home/u59767785/MyData";



/* 2.1 PRCO SORT(순서대로 정렬하하기) */
proc sort data=sashelp.class out=test;
by age; * age를 오름차수으로 정렬함;
run;



/* 2-2.PROC PRINT(테이블 보여주기) */
proc print data=sashelp.class;
run;

proc print data=sashelp.class;
var age name;
run;

proc print data=test;
var age name; * 변수를 불러옴;
id age; * 변수(age)를 기준으로 사용함;
by age; * 변수(age)를 그룹으로 만듦(by구문이 적용되는 변수는 오름차순 정렬되어 있어야 함.;
run;



/* 2-3. PROC CONTENTS(테이블 속성 보기) */
proc contents data=sashelp.class;
run;

proc contents data=work._all_; * 라이브러리 전체의 속성 보기 
run;


/* 2-4. PROC FREQ(빈도 조회) */
proc freq data=sashelp.class;
table age height; * 변수 age와 name을 조회함;
run;

proc freq data=sashelp.class;
table age*height; * 변수 age와 height의 2차원 표를 조회함;
run;


/* 3. 데이터 생성법 */
/* 3-1. 직접 테이블 생성법 */

data test;
input name $ age sex $;
cards; * 변수별 데이터를 입력함
ok 1 남
you 2 여
;
run;

data test;
input name $ age sex $;
cards;
ok 1 남
you 2 여
호날두화이팅 3 남 * 데이터 깨짐. 문자의 입력은 영문자 기준 8bytes까지 허용
;
run;

/* 문자변수 길이 변경*/
data test;
input name: $18. age sex $; * 문자 변수 name의 포맷을 최대 12글자(알파벳 기준) 까지 입력;
cards;
ok 1 남
you 2 여
호날두화이팅 3 남
;
run;

/* 입력 대상 데이터 위치 설정 */
/* 문자 변수를 읽어들이는 위치를 설정. 입력된 데이터가 위치별로 일정하게 정렬되어 있을때 사용 */
data test;
input name $ 1-18 age 20 sex $ 21-24;
cards;
ok                 1 남
you                2 여
호날두화이팅 3 남
;
run;



/* 3-2. 외부 데이터를 불러와서 테이블 생성하기 */
/* ---------------------------------------------- */
/* infile 로 불러올수 있는 파일은 .txt, .xlsx, .csv 등이 있음 */
data test;
infile '/home/u59767785/MyData/test.txt' dlm=',';
input name: $18. age sex $;
run;



/* 3-3. 테이블을 불러와서 새 테이블 생성하기 */
data test;
set sashelp.class;
run;



/* 4. 포맷(FORMAT)의 개념 */
/* 4-1. 숫자 포맷 */
data test;
input name: $12. age;
cards;
라이올라 324.5678
;
run;

proc print data=test;
var age;
format age 5.;
format age 6.2;
format age best5.;
format age comma5.;
format age percent8.2;
format age 27.2;
run;



/* 4-2. 문자 포맷 */
data test;
input name $12. age;
cards;
라이올라 324.5678
;
run;

proc print data=test;
var name;
format name $9.;
run;


/* 4-3. 날짜 포맷 */
/* SAS에서는 1960년 1월 1일을 숫자 0으로 표시 */
/* 포맷을 입력하는 경우 "."을 꼭 입력해야 인식함 */
data test;
input name $ number;
cards;
날짜 3
;
run;

proc print data=test;
var number;
format number date10;
format number yymmdd10.;
format number weekdate.;
FORMAT NUMBER WORDDATE.;    /*4번 사례*/
FORMAT NUMBER NLDATE20.;    /*5번 사례*/
FORMAT NUMBER YYMMN6.;    /*6번 사례*/
FORMAT NUMBER MONYY7.;    /*7번 사례*/
FORMAT NUMBER YEAR4.;    /*8번 사례*/
FORMAT NUMBER DATETIME20. ;    /*9번 사례*/
FORMAT NUMBER TIME8. ;    /*10번 사례*/
FORMAT NUMBER HHMM5. ;    /*11번 사례*/
FORMAT NUMBER HOUR5. ; 
run;



/* 5. 데이터 전처리를 위한 SAS 명령어 */
/* 5.1 KEEP과 DROP */
/* 테이블에서 유지할 컬럼은 KEEP, 버릴 컬럼은 DROP으로 설정 */
data test;
set sashelp.class(keep=name age); * sashelp.class를 불러오되 name, age만 유지;
run;

data test;
set sashelp.class(drop=name age);
run;

data test(keep=name age);
set sashelp.class;
run;



5-2. 수식을 활용한 계산
data test;
set sashelp.class;
age2 = age + 1;  * test에 age2 컬럼 생성
run;

data test;
set sashelp.class;
age+1;
age2 = age1 + 1;
run;

/* 5-3. 단순 IF구문 */
data test;
set sashelp.class;
if age = 12; * age가 12인 행들만 추출;
run; 

data test;
set sashelp.class;
if name = 'James';
run;

data test;
set sashelp.class;
if age ^= 12;
run;

data test;
set sashelp.class;
if age = 12 and name = 'John';
run;

data test;
set sashelp.class;
if age = 12 or age = 13;
run;

data test;
set sashelp.class;
if age in (12, 13);
run;

/* 5-4. IF구문을 활용한 컬럼 변화 */
data test;
set sashelp.class;
if age = 12 then height+300;
run;

data test;
set sashelp.class;
if age = 12 then delete;
run;

data test;
set sashelp.class;
if age = 12 then new='새로운컬럼'; * age=12이면 new 컬럼만들고 값 할당;
run;

data test;
set sashelp.class;
if age = 12 then new = '새로운컬럼';
else if age = 13 then new = '새로운컬럼2';
else new = '새컬럼';
run;



/* 6. 테이블 결합 */
/* 6-1. 테이블 아래로 붙이기(SET) */
data class2;
input name: $9. sex $ age height weight;
cards;
최철 M 12 150 50
주양 F 11 130 40
;
run;

data test;
set 
sashelp.class
class2;
run;

/* 6-1-A. 컬럼명이 일치하지 않는 경우 */
data class2;
input name $ age height weight addr $;
cards;
최철 12 150 50 동구
주양 11 130 40 서초
;
run;

data test;
set 
sashelp.class
class2; * class2에 addr 컬럼이 하나 더 있음;
run;

/* 6-1-B. 컬럼의 길이가 다른 경우 */
/* 두 테이블의 동일 이름 컬럼 간 데이터 길이가 다른 경우 */
data class2;
input name: $21. sex $ age height weight;
cards;
드레이먼드그린 1 17 207 90
드마트라커즌스 2 21 210 100
;
run;

proc contents data=class2;
run;

data test;
set
sashelp.class
class2
;
run;    * 수행후 확인해 보니 class2의 name이 짤림;

/* 해결책 */
/* ① 길이가 긴 테이블을 set명령어에서 앞쪽에 나오도록 합니다. */
data test;
set
class2
sashelp.class
;
run;

/* ② 테이블을 생성할 때 테이블A의 길이를 테이블B에 맞추서 변경 */
/* 테이블 sashelp.class의 길이를 class2에 맞춰서 확장해주면 됩니다. 하지만, */
/* sashelp.class 내부의 데이터는 수정 되지 않으니 이 방법을 사용하지 못함. */
/*  */
/* ③ 이미 만들어진 테이블의 길이를 변경 */
/* 이 방법은 이후 과정에서 학습 */

/* 6-1-C. 컬럼의 속성이 다른 경우 */
data class2;
input name: $21. sex age height weight;
cards;
드레이먼드그린 1 17 207 90
드마트라커즌스 2 21 210 100
;
run;

data test;
set 
class2
sashelp.class
;
run; * Error Occured - 컬럼의 속성이 다름;

/* 해결책 */
/* ① 둘 중 한 변수의 이름을 바꾸는 것 */
/* sex와 sex_1로 가각 지정. 좋은 방법은 아님. */

/* ② 테이블을 생성할 때 변수의 속성을 동일하게 만들는 것. */
data class2;
input name: $21. sex $ age height weight;
cards;
드레이먼드그린 1 17 207 90
드마트라커존스 2 21 210 100
;
run;

/* ③ 이미 만들어진 테이블의 속성을 변경하는 것 */
/* 이 방법은 이후 과정에서 학습 */

/* 6-2. 테이블 옆으로 붙이기(MERGE) */
data class3;
input name $ addr $ line;
cards;
존 서울 5
마커 부산 6
;
run;

data test;
merge
sashelp.class
class3
;
run;

/* 6-2-A. 특정 값을 기준으로 결합하는 경우 */
/* name을 기준 컬럼으로 merge 수행. 그 전에 proc sort로 기준 컬럼을 먼저 정렬. */
/* SAS는 기준 컬럼을 이용한 명령어일 경우 SORT(정렬)을 요구하는 경우가 잦음. */
data class4;
input name $ addr $ line;
cards;
존 부산 3
바바 뉴욕 4
;
run;

proc sort data=sashelp.class out=class;
by name;
run; 

proc sort data=class4;
by name;
run;

data test;
merge
class
class4
;
by name;
run;



/* 7. DO 명령어 */
/* DO 명령어를 활용하여 여러가지 명령어를 한번에 수행 */
/*  */
/* 7-1. 기본 DO 명령어 */
data test;
set sashelp.class;
if age = 12 then do;
new = '열둘';
new2 = '두살';
end;
run;

/* DO 명령어를 쓰지 않는 경우 */
data test;
set sashelp.class;
if age = 12 then  * if 는 다음줄만 영향을 줌;
new = '열둘';
new2 = '두살';    * new2에 '두살' 이 모두 들어감;
run;


/* 7-2. 반복 DO 명령어 */
data test_2;
do i=1 to 10 by 1;
summary = i + 10;
output; * 중간 중간 결과값을 테이블에 반영하고 싶을 때 사용;
end;
run;

data test_2;
do i = 1 to 10 by 1;
summary = i + 10;
end;
output; * do .. end 가 종료된 이후의 데이터만 반영(i=11, summary=20);
run;

data test_2;
do i = 1 to 10 by 1;
summary = i + 10;
output;
end;
output;
run;


/* 7-3. DO UNTIL/WHILE 명령어 */
/* DO UNTIL 명령어 */

data test;
do until (age >= 4.5);
age + 1;
double = age * 2;
output;
end;
run;

/* DO WHILE 명령어 */
data test;
do while (age <= 5.5);
age + 1;
double = age * 2;
output;
end;
run;

/* 8. SAS로 하는 SQL 명령어 */
/* SAS 기존 문법과 SQL문법의 차이점 */
/* ① SAS는 명령어를 읽을 때 '위에서 읽고 왼쪽에서 읽는다'. 그러나 SQL은 왼쪽부터 읽는 것은 동일하지만 */
/* 반드시 위에서 부터 읽는 것은 아님.  */
/* ② 각 명령어 끝에 ';'을 넣지 않음. SAS는 각 개별 명령어 끝에 ';'을 붙여야 했음. */
/* 그러나, SQL은 모든 명령어 끝에 ';'를 붙이면 됨. */

/* 8-1. SQL로 표 만들기 */
proc sql;
select name, age, height
  from sashelp.class
;
quit;

proc sql;
select *
  from sashelp.class
;
quit;

/* 8-2. SQL로 테이블 만들기 */
proc sql;
create table test as
select name, age, height
  from sashelp.class
;
quit;

/* SAS 문법으로 위를 재현 */
data test(keep=name age height);
set sashelp.class;
run;


/* 8-3. SQL로 사칙연산하기 */
/*  */
/* ① SQL에서 사칙연산 사용하기 */
proc sql;
create table test as
select name, sex, age, age+height
  from sashelp.class
;
quit;

/* ② SQL에서 사칙연산과 평균, 분산, 간단한 숫자 세기 방법 등 활용하기 */
proc sql;
create table test as
select name, sex, age, height, sum(age), sum(height, weight), mean(age), median(age),
min(age), max(age), var(age), std(age)
  from sashelp.class
;
quit;


/* 8-4. SQL로 새 컬럼 이름 부여하기(AS) */
proc sql;
create table test as
select name, sex as male_female, age+height as sum
  from sashelp.class
;
quit;


/* 8-5. SQL 명령어들 */
/* compress : 특정 문자 제거 : compress('컬럼', '문자') */
/* compress : 공백 제거      : compress(컬럼) */
/* trim     : 뒤의 공백 제거 : trim(컬럼) */
/* translate : 특정문자를 다른 문자로 대체 : trnaslate(컬럼,'문자1','문자2') */
/* tranwrd  : 특정문자를 다른 문자로 대체 : tranwrd(컬럼,'문자1','문자2') */
/* lowcase : 소문자로 변경 : lowcase(컬럼) */
/* upcase : 대문자로 변경 : upcase(컬럼) */
/* substr : 특정 위치의 문자 추출 : substr(컬럼,숫자1, 숫자2) */
/* scan : 특정문자를 기준으로 했을때 특정 순서의 문자를 추출 : scan(컬럼,순서,'특정문자') */
/* catx : 문자들 사이에 원하는 구분기호 삽입 : catx('특정문자',컬럼1,컬럼2, ...) */
/* find : 특정 문자의 위치를 찾음 : find(컬럼,'특정문자',순서) */
/* left : 왼쪽으로 정렬 : left(컬럼) */
/* right : 오른쪽으로 정렬 : right(컬럼) */
/* put : 숫자컬럼을 문자컬럼으로 변경 : put(컬럼, 문자포맷) */
/* input : 문자컬럼을 숫자컬럼으로 변경 : input(컬럼, 숫자포맷) */

proc sql;
create table test as
select name, age
     , compress(name,'A') as compress
     , translate(name, 'Ja', '스') as trans
     , tranwrd(name, 'A', 'AAAA') as tranwrd
     , substr(name, 1, 2) as substr
     , catx('-', name, sex) as catx
     , find(name, 'ce') as find
     , put(age, 5.0) as put
     , compress(put(age, 5.)) as com_put
  from sashelp.class
;
quit;


/* 8-6. SQL로 특정 데이터 추출하기(WHERE) */
proc sql;
create table test as
select name, age, height
  from sashelp.class
 where age = 12
;
quit;

/* and 와 or */
proc sql;
create table test as
select name, age, height
  from sashelp.class
 where age = 12 and 59 <= height <= 61
;
quit;

/* 데이터가 특정 문자인 경우 */
proc sql;
create table test as
select name, age, height
  from sashelp.class
 where name = 'John'
;
quit;


8-7. SQL로 데이터 정렬하기(ORDER BY)
proc sql;
create table test as
select * 
  from sashelp.class
 order by age
;
quit;

/* 여러개 컬럼을 동시에 정렬하기 */
proc sql;
create table test as
select * 
  from sashelp.class
 order by age, height
;
quit;

/* 8-8. SQL로 조건문 만들기(case when) */
proc sql;
create table test as
select *,
       case when age = 12 then '열둘'
            when age = 13 then '열셋'
       end as new_age
  from sashelp.class
;
quit;

/* 위와 동일한 SAS 문법 */
data test;
set sashelp.class;
if age = 12 then new_age = '열둘';
esle if age = 13 then new_age = '열셋';
run;

/* ELSE 명령어 */
proc sql;
create table test as
select *,
       case when age = 12 then '열둘'
            else '남짓' 
       end as new_age
  from sashelp.class
;
quit;



8-9. SQL로 그룹별로 연산하기(GROUP BY)
proc sql;
create table test as
select *, sum(age) as sum_age
  from sashelp.class
 group by sex
;
quit;

proc sql;
create table test as
select sex, sum(age) as sum_age
  from sashelp.class
 group by sex
;
quit;


8-10. SQL로 그룹별 특정 데이터 추출하기(HAVING)
proc sql;
create table test as
select *, sum(age) as sum_age
  from sashelp.class
 group by sex
having sum_age > 120
;
quit;


/* 8-11. SQL 명령어 순서 */
/* ① PROC SQL; */
/* ② CREATE TABLE AS */
/* ③ SELECT */
/* ④ FROM */
/* ⑤ WHERE */
/* ⑥ GROUP BY */
/* ⑦ HAVING */
/* ⑧ ORDER BY */

proc sql;
create table test as
select *, sum(age) as sum_age
  from sashelp.class
 where height < 65
 group by sex
having sum_age > 90
 order by name
;
quit;



/* 8-12. SQL로 테이블에 없는 컬럼 생성 후 연산(CALCULATED) */
/*  */
/* Error Occured - age_1 인식 불가 */

proc sql;
create table test_0 as
select *, age+1 as age_1
  from sashelp.class
 where age_1 > 13
;
quit;

proc sql;
create table test_1 as
select *
     , age + 1 as age_1
     , case when calculated age_1 > 15 then 'Y' else 'N' end as check_1
  from sashelp.class
;
quit;

proc sql;
create table test_2 as
select *, age+2 as age_2
  from sashelp.class
 where calculated age_2 > 15
;
quit;



8-13. SQL로 날짜 명령어 수행하기
data test;
input name $ time time2 $;

cards;
뉴욕 22097 20200701
파리 23329 20231115
뉴델 22338 20210227
;
run;


/* 8-번회. SQL로 데이터 직접 입력하기 */
/*  */
/*  */
/* ① SQL로 테이블 생성하기 */
proc sql;
create table test (
name char(12),
age  num,
height num,
weight num,
addr char)
;
quit;

/* ② SQL로 데이터 입력하기 */
/*  */
/* 직접 데이터를 입력하기 명령어(1) */
proc sql;
insert into test 
set name='호날두', age=27, height=6, weight=70
set name='메시', age=26, height=5, weight=65, addr='바르'
;
quit;

proc sql;
select * from test
;
quit;

/* 직접 데이터를 입력하기 명령어(2) */
proc sql;
insert into test
values('벤제마', 30, 6, 72, '런던')
values('그리즈만', 25, 5, 67, '마드리드')
;
quit;

/* 직접 데이터를 입력하기 명령어(3) */
proc sql;
insert into test
(name, age, addr)
values ('므키타리안', 29, '북런던')
;
quit;


/* 9. SAS MACRO(매크로) 명령어 */
/* 매크로는 SAS에서 크게 두가지 용도로 사용 */
/* ① 특정 텍스트를 손쉽게 변경할 때 사용. 이를 사용자 정의 매크로 컬럼 */
/* ② 반복 작업을 시행할 때 사용. SAS코드 반복 생성이라고 함 */

9-1. SAS MACRO 직접 입력 명령어(LET)
%let name='John';

proc sql;
create table test as
select name, sex, age
  from sashelp.class
 where name = &name.
 ;
 quit;


/* 9-2. SAS MACRO 연동 입력 명령어(CALL SYMPUT) */
/* ① 직접 입력 명령어 */
data _NULL_; * 빈 데이터를 생성합니다(테이블을 만들디 않습니다.);
call symput('value','나이'); * 매크로변수 'vlaue'를 만들고  이 값을 나이로 저장;
run;

%put &= value;
%put value=&name.


/* ② 연동 입력 명령어 */
data _NULL_;
set sashelp.class;
call symput(name, age);
run;
%put &= Alfred;
%put &= John;

/* 매크로 변수의 활용 */
proc sql;
create table sss as
select *
  from sashelp.class
 where age = &John. /* age = &John. 은 age = 12 와 동일 */
;
quit;



/* 9-3. SAS MACRO 연동 입력 명령어(PROC SQL의 INTO) */
proc sql;
select count(name) into: cnt  /* 컬럼 name 의 갯수를 매크로 변수 cnt로 생성 */
  from sashelp.class
;
quit;
%put &= cnt; /* 매크로 변수 cnt의 결과값을 확인 */

/* 컬럼 age의 전체 값의 합을 매크로 변수로 생성하고 싶다면 */
proc sql;
select sum(age) into: total
  from sashelp.class
;
quit;
%put &= total;
