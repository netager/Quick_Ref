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

commit;

drop table "COMMENT";
insert into member (gender) values('남성');

select lengthb(gender) from member;

select * from member;
drop table member;
select * from nls_database_parameters;    
SELECT LENGTHb('ab') from dual;  
SELECT LENGTHb('남성') from dual; -- 한글 1글자당 3Bytes 사용 