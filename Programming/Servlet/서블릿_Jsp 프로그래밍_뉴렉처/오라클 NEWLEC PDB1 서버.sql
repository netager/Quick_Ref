create view notice_view
as 
select n.id, n.title, n.writer_id, n.regdate, n.hit, n.files, count(c.id) CMT_COUNT
  from notice n
  left join "COMMENT" c 
    on n.id = c.notice_id
 group by n.id, n.title, n.writer_id, n.regdate, n.hit, n.files;

select * from notice_view;

SELECT * , 1  
  FROM (SELECT ROW_NUMBER() OVER (ORDER BY REGDATE DESC) NUM, NOTICE.* 
          FROM NOTICE 
         WHERE title LIKE '%%' ORDER BY REGDATE ) 
 WHERE NUM BETWEEN 1 AND 10;


select id, title, writer_id, regdate, hit, files, 1 "CMT_COUNT"  from 
(SELECT ROW_NUMBER() OVER (ORDER BY REGDATE DESC) NUM, NOTICE.* 
          FROM NOTICE 
         WHERE title LIKE '%%' ORDER BY REGDATE);	
         
select '1' from notice;    
\
select * from notice_view;



select * 
 from (select rownum num, n.* 
 from (select *  
                      from notice_view 
                     where title like '%%' 
                     order by regdate desc) n)  
     where num between 1 and 10 ;


SELECT id, title, writer_id, regdate, hit, files, CMT_COUNT   FROM (SELECT ROW_NUMBER() OVER (ORDER BY REGDATE DESC) NUM,         NOTICE_view.* FROM NOTICE_view WHERE title LIKE '%%' ORDER BY REGDATE )  WHERE NUM BETWEEN 1 AND 10; 
java.sql.SQLException: 부적합한 열 이름