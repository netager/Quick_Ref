-- database 조회
select * from v$database;

-- redo log 확인
select * from v$log;

-- 테이를 logging / degree 확인
select table_name, LOGGING, degree from dba_tables
 where owner = 'HR'
   AND table_name LIKE '%TEST%';


-- segment 용량 조회
select segment_name, bytes/1024/1024 from dba_segments
 where segment_name like '%TEST%'
   and owner = 'HR';


-- UNDO 파라미터 조회
select * from v$parameter
 where name like 'undo%';


-- undo_management -> AUTO
-- undo_tablespace -> UNDOTBS1
-- undo_retention -> 900


-- UNDO 테이블스페이스에 대한 사용량 조회
select STATUS, sum(bytes)/1024/1024 MB from dba_undo_extents group by status;

-- 어떤 세션이 UNDO를 어느정도 사용하고 있는지 조회
SELECT TO_CHAR(s.sid)||',' ||TO_CHAR(s.serial#) sid_serial,
         NVL(s.username, 'None') orauser,
         s.program,
         r.name undoseg,
         t.used_ublk * TO_NUMBER(x.value)/1024/1024||'M' "Undo"
FROM   sys.v_$rollname    r,
        sys.v_$session     s,
        sys.v_$transaction t,
        sys.v_$parameter   x
WHERE s.taddr = t.addr
AND r.usn   = t.xidusn(+)
AND x.name  = 'db_block_size';


-- rollback 된 세션 확인
select v.sid, v.serial#, s.program, v.username, opname, target, sofar, totalwork, units
     , to_char(start_time, 'YYYY-MM-DD HH24:MI') start_time, time_remaining, elapsed_seconds
  from v$session_longops v, v$session s
 where v.sid = s.sid
   and v.serial# = s.serial#
   and v.username='HR'
   and v.opname like '%Rollback%';


-- retention time guarantee 확인
select tablespace_name,retention from dba_tablespaces where tablespace_name='UNDOTBS1';


-- v$undostat 뷰로 undo_retention 추적
select to_char(begin_time, 'YYYY-MM-DD HH24:MI') begin_time,
to_char(end_time, 'YYYY-MM-DD HH24:MI') end_time, tuned_undoretention
from v$undostat
order by end_time desc;


-- temp 사용 현황
SELECT d.tablespace_name tbs_name, d.status Status, d.CONTENTS Type,
d.extent_management Ext_manage,
NVL(a.BYTES / 1024 / 1024, 0) Total_mega,
NVL(t.BYTES, 1)/1024/1024 ||' / '|| NVL(a.BYTES / 1024 / 1024, 1) Used_mega,
NVL(t.BYTES / a.BYTES * 100, 1) Used_PCT,
NVL(t.curnt_byte/1024/1024, 1) Cache_mega,
(NVL(t.curnt_byte/1024/1024, 1)/NVL(a.BYTES / 1024 / 1024, 0)*100) Cache_PCT
FROM SYS.dba_tablespaces d,
(SELECT tablespace_name, SUM (BYTES) BYTES
FROM dba_temp_files
GROUP BY tablespace_name) a,
(SELECT tablespace_name, SUM (BYTES_USED) curnt_byte, sum(BYTES_CACHED) BYTES
FROM v$temp_extent_pool
GROUP BY tablespace_name) t
WHERE d.tablespace_name = a.tablespace_name(+)
AND d.tablespace_name = t.tablespace_name(+)
AND d.extent_management LIKE 'LOCAL'
AND d.CONTENTS LIKE 'TEMPORARY';


-- temp 용량
select s.tablespace_name, sum(s.BYTES_USED+bytes_free) total,
       sum(s.BYTES_USED) used,
       sum(bytes_free) free,
       round(sum(s.BYTES_USED)/sum(s.BYTES_USED+bytes_free)*100,2)||' %' "used(%)"
from v$temp_space_header s
group by s.tablespace_name;


SELECT b.tablespace,
b.segfile#,
b.segblk#,
b.blocks,
a.sid,
a.serial#,
c.spid,
a.username,
a.osuser,
a.status,
a.sql_hash_value
FROM v$session a,
v$sort_usage b,
v$process c
WHERE a.saddr = b.session_addr and a.paddr=c.addr
ORDER BY b.tablespace, b.segfile#, b.segblk#, b.blocks;

SELECT usn, extents, writes, xacts, waits, hwmsize, status FROM v$rollstat;



SELECT TABLE_NAME
     , owner
     , NUM_ROWS
     , BLOCKS
     , EMPTY_BLOCKS
  FROM DBA_TABLES
WHERE TABLE_NAME = 'TEST';



SELECT segment_NAME
     , bytes/1024/1024
  FROM DBA_segments
WHERE segment_NAME like 'TEST%';

alter table hr.test1 enable row movement;

alter table "HR"."TEST1" shrink space;

SELECT * FROM  TABLE(dbms_space.asa_recommendations());

select * from dba_tablespaces;

select * from dba_tables where table_name like 'TEST%';

select * from dba_segments where segment_name like 'TEST%';

SELECT COUNT(DISTINCT DBMS_ROWID.ROWID_BLOCK_NUMBER(ROWID)||DBMS_ROWID.ROWID_RELATIVE_FNO(ROWID)) "USED"
  FROM hr.test;

select * from dba_tablespaces;

create table hr.test1
storage (initial 1m next 1m)
as select * from hr.test where rownum < 100

;


select segment_name, bytes/1024/1024, extents, initial_extent, next_extent from dba_segments where segment_name like 'TEST%';

select * from dba_segments where segment_name like 'TEST%';

select * from hr.test1;

select * from dba_tables where table_name like 'TE%';

insert into hr.test1 select * from hr.test where rownum < 10001;
commit;

select count(*) from hr.test1;
drop table hr.test1;



SELECT * FROM dba_tablespaces;
-- temp
select sum(free_blocks)
from gv$sort_segment
where tablespace_name = 'TEMP';

select inst_id, tablespace_name, total_blocks, used_blocks, free_blocks
from gv$sort_segment;