CREATE TABLE MEMBER (
    ID          VARCHAR2(50),
    PWD         NVARCHAR2(50),
    NAME        NVARCHAR2(50),
    GENDER      NCHAR(2), -- 남성, 여성
    AGE         NUMBER,
    BIRTHDAY    CHAR(10), -- 2000-01-02
    PHONE       CHAR(13), -- 010-1234-2345
    REGDATE     DATE);

drop table member;

CREATE TABLE MEMBER (
    ID          NVARCHAR2(50),
    PWD         NVARCHAR2(50),
    NAME        NVARCHAR2(50),
    GENDER      NCHAR(2), -- 남성, 여성
    BIRTHDAY    CHAR(10), -- 2000-01-02
    PHONE       CHAR(13), -- 010-1234-2345
    REGDATE     DATE,
    EMAIL       VARCHAR2(200));


create table notice (
    id          number,
    title       nvarchar2(100),
    writer_id   nvarchar2(50),
    content     clob,
    regdate     timestamp,
    hit         number,
    files       nvarchar2(1000));

create table "COMMENT" (
    id          number,
    content     nvarchar2(2000),
    regdate     timestamp,
    writer_id   nvarchar2(50),
    notice_id   number);

create table role (
    id          varchar2(50),
    discription nvarchar2(500));
 
create table member_role (
    member_id   nvarchar2(50),
    role_id     varchar2(500));    


insert into notice values(1, 'JDBC란 무엇인가?', 'newlec','aaa', SYSDATE, 0, '');
insert into notice values(2, 'JDBC2란 무엇인가?', 'newlec','aaa', SYSDATE, 0, '');
insert into notice values(3, 'JDBC3란 무엇인가?', 'newlec','aaa', SYSDATE, 0, '');
insert into notice values(4, 'JDBC4란 무엇인가?', 'newlec','aaa', SYSDATE, 10, '');

<<<<<<< HEAD
insert into notice values(5, 'JDBC5란 무엇인가?', 'newlec','aaa', SYSDATE, 10, '');
insert into notice values(6, 'JDBC6란 무엇인가?', 'newlec','aaa', SYSDATE, 10, '');
insert into notice values(7, 'JDBC7란 무엇인가?', 'newlec','aaa', SYSDATE, 10, '');
insert into notice values(8, 'JDBC8란 무엇인가?', 'newlec','aaa', SYSDATE, 10, '');
insert into notice values(9, 'JDBC9란 무엇인가?', 'newlec','aaa', SYSDATE, 10, '');
insert into notice values(10, 'JDBC10란 무엇인가?', 'newlec','aaa', SYSDATE, 10, '');

insert into notice values(11, 'JDBC11란 무엇인가?', 'newlec','aaa', SYSDATE, 10, '');
insert into notice values(12, 'JDBC12란 무엇인가?', 'newlec','aaa', SYSDATE, 10, '');
insert into notice values(13, 'JDBC13란 무엇인가?', 'newlec','aaa', SYSDATE, 10, '');


=======
insert into notice values(5, 'JDBC5란 무엇인가?', '이현철','bbb', SYSDATE, 0, '');
insert into notice values(6, 'JDBC6란 무엇인가?', '김인수','kkk', SYSDATE, 10, '');

insert into notice values(7, 'JDBC7란 무엇인가?', '이현철','bbb', SYSDATE, 0, '');
insert into notice values(8, 'JDBC8란 무엇인가?', '김인수','kkk', SYSDATE, 10, '');

insert into notice values(9, 'JDBC9란 무엇인가?', '이현철','bbb', SYSDATE, 0, '');

insert into notice values(10, 'JDBC10란 무엇인가?', '김인수','kkk', SYSDATE, 10, '');
insert into notice values(11, 'JDBC11란 무엇인가?', '이현철','bbb', SYSDATE, 0, '');
insert into notice values(12, 'JDBC12란 무엇인가?', '김인수','kkk', SYSDATE, 10, '');
insert into notice values(13, 'JSP1란 무엇인가?', '이현철','bbb', SYSDATE, 0, '');
insert into notice values(14, 'JSP란 무엇인가?', '김인수','kkk', SYSDATE, 10, '');
insert into notice values(15, 'JSP2란 무엇인가?', '이현철','bbb', SYSDATE, 0, '');
insert into notice values(16, 'JSP3란 무엇인가?', '김인수','kkk', SYSDATE, 10, '');
insert into notice values(17, 'JSP4란 무엇인가?', '이현철','bbb', SYSDATE, 0, '');
insert into notice values(18, 'JSP5란 무엇인가?', '김인수','kkk', SYSDATE, 10, '');
insert into notice values(19, 'JSP6란 무엇인가?', '이현철','bbb', SYSDATE, 0, '');

insert into notice values(20, 'JDBC20란 무엇인가?', '김인수','kkk', SYSDATE, 10, '');
insert into notice values(21, 'JDBC21란 무엇인가?', '이현철','bbb', SYSDATE, 0, '');
insert into notice values(22, 'JDBC22란 무엇인가?', '김인수','kkk', SYSDATE, 10, '');
insert into notice values(23, 'JSPC23란 무엇인가?', '이현철','bbb', SYSDATE, 0, '');
insert into notice values(24, 'JSPC24란 무엇인가?', '김인수','kkk', SYSDATE, 10, '');
insert into notice values(25, 'JSPC25란 무엇인가?', '이현철','bbb', SYSDATE, 0, '');
insert into notice values(26, 'JSPC26란 무엇인가?', '김인수','kkk', SYSDATE, 10, '');
insert into notice values(27, 'JSPC27란 무엇인가?', '이현철','bbb', SYSDATE, 0, '');
insert into notice values(28, 'JSPC28란 무엇인가?', '김인수','kkk', SYSDATE, 10, '');
insert into notice values(29, 'JSPC29란 무엇인가?', '이현철','bbb', SYSDATE, 0, '');

insert into notice values(30, 'JDBC30란 무엇인가?', '김인수','kkk', SYSDATE, 10, '');
insert into notice values(31, 'JDBC31란 무엇인가?', '이현철','bbb', SYSDATE, 0, '');
insert into notice values(32, 'JDBC32란 무엇인가?', '김인수','kkk', SYSDATE, 10, '');
insert into notice values(33, 'JSPC33란 무엇인가?', '이현철','bbb', SYSDATE, 0, '');
insert into notice values(34, 'JSPC34란 무엇인가?', '김인수','kkk', SYSDATE, 10, '');
insert into notice values(35, 'JSPC35란 무엇인가?', '이현철','bbb', SYSDATE, 0, '');
insert into notice values(36, 'JSPC36란 무엇인가?', '김인수','kkk', SYSDATE, 10, '');
insert into notice values(37, 'JSPC37란 무엇인가?', '이현철','bbb', SYSDATE, 0, '');
insert into notice values(38, 'JSPC38란 무엇인가?', '김인수','kkk', SYSDATE, 10, '');
insert into notice values(39, 'JSPC39란 무엇인가?', '이현철','bbb', SYSDATE, 0, '');

insert into notice values(40, 'JDBC40란 무엇인가?', '김인수','kkk', SYSDATE, 10, '');
insert into notice values(41, 'JDBC41란 무엇인가?', '이현철','bbb', SYSDATE, 0, '');
insert into notice values(42, 'JDBC42란 무엇인가?', '김인수','kkk', SYSDATE, 10, '');
insert into notice values(43, 'JSPC43란 무엇인가?', '이현철','bbb', SYSDATE, 0, '');
insert into notice values(44, 'JSPC44란 무엇인가?', '김인수','kkk', SYSDATE, 10, '');
insert into notice values(45, 'JSPC45란 무엇인가?', '이현철','bbb', SYSDATE, 0, '');
insert into notice values(46, 'JSPC46란 무엇인가?', '김인수','kkk', SYSDATE, 10, '');
insert into notice values(47, 'JSPC47란 무엇인가?', '이현철','bbb', SYSDATE, 0, '');
insert into notice values(48, 'JSPC48란 무엇인가?', '김인수','kkk', SYSDATE, 10, '');
insert into notice values(49, 'JSPC49란 무엇인가?', '이현철','bbb', SYSDATE, 0, '');

insert into notice values(50, 'JDBC50란 무엇인가?', '김인수','kkk', SYSDATE, 10, '');
insert into notice values(51, 'JDBC51란 무엇인가?', '이현철','bbb', SYSDATE, 0, '');
insert into notice values(52, 'JDBC52란 무엇인가?', '김인수','kkk', SYSDATE, 10, '');
insert into notice values(53, 'JSPC53란 무엇인가?', '이현철','bbb', SYSDATE, 0, '');
insert into notice values(54, 'JSPC54란 무엇인가?', '김인수','kkk', SYSDATE, 10, '');
insert into notice values(55, 'JSPC55란 무엇인가?', '이현철','bbb', SYSDATE, 0, '');
insert into notice values(56, 'JSPC56란 무엇인가?', '김인수','kkk', SYSDATE, 10, '');
insert into notice values(57, 'JSPC57란 무엇인가?', '이현철','bbb', SYSDATE, 0, '');
insert into notice values(58, 'JSPC58란 무엇인가?', '김인수','kkk', SYSDATE, 10, '');
insert into notice values(59, 'JSPC59란 무엇인가?', '이현철','bbb', SYSDATE, 0, '');

select * from notice;
>>>>>>> 9a6672ff222a71645fca9e497f88ae5a105430c0
commit;

SELECT *  
  FROM (SELECT ROW_NUMBER() OVER (ORDER BY REGDATE DESC) NUM, NOTICE.* 
          FROM NOTICE 
         WHERE title LIKE '%%' ORDER BY REGDATE )
 WHERE NUM BETWEEN 1 AND 10;

select * from notice order by regdate desc;
drop table "COMMENT";
insert into member (gender) values('남성');

select lengthb(gender) from member;

select * from member;
drop table member;
select * from nls_database_parameters;    
SELECT LENGTHb('ab') from dual;  
SELECT LENGTHb('남성') from dual; -- 한글 1글자당 3Bytes 사용 



