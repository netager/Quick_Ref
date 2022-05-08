select branch, count(dlq_dt), sum(count(dlq_dt))
  from tacct
 where lmt_typ is null
   and dlq_dt is not null
 group by branch
 order by branch;


select nvl(branch,'TOTAL'), count(*)
  from tacct
 where lmt_typ is null
   and dlq_dt is not null
 group by rollup(branch)
 order by branch;

select branch, 
       case when to_char(ln_dt, 'yyyymm') = '202201' then '1월'
       end as "1월",
       case when to_char(ln_dt, 'yyyymm') = '202202' then '2월'
        end as "2월",
       case when to_char(ln_dt, 'yyyymm') = '202203' then '3월'   
		end as "3월"    
  from tacct
 where lmt_typ is null
   and to_char(ln_dt,'yyyymm') between '202201' and '202203';
 group by branch, 월별
 order by branch
 
 
 select branch
      , to_char(ln_dt, 'MM')
      , count(*)
   from tacct
  where lmt_typ is null
    and ln_dt between '2022/01/01' and '2022/03/31'
  group by rollup(branch, to_char(ln_dt, 'MM'))
  order by 1, 2;
  
select branch "지점코드"
      , count(case to_char(ln_dt, 'MM') when '01' then lnact end) as "1월"
      , count(case to_char(ln_dt, 'MM') when '02' then lnact end) as "2월"
      , count(case to_char(ln_dt, 'MM') when '03' then lnact end) as "3월"
      , count(*) "합계"
   from tacct
  where lmt_typ is null
    and ln_dt between '2022/01/01' and '2022/03/31'
  group by branch
  order by branch;
   
select branch "지점코드"
      , nvl(sum(case to_char(ln_dt, 'MM') when '01' then lnact end),0) as "1월"
      , nvl(sum(case to_char(ln_dt, 'MM') when '02' then lnact end), 0) as "2월"
      , nvl(sum(case to_char(ln_dt, 'MM') when '03' then lnact end), 0) as "3월"
      , sum(lnact)
   from tacct
  where lmt_typ is null
    and ln_dt between '2022/01/01' and '2022/03/31'
  group by branch
  order by branch;



-- Join   
select a.lnid, a.id_typ, a.bthday,
       b.lnact, b.lnact_seq, b.ln_dt, b.ln_amt
  from tid a
  join tacct b
    on a.lnid = b.lnid
 where b.lmt_typ is null
 order by b.lnact, b.lnact_seq;

select i.lnid, i.bthday, a.lnact, a.lnact_seq, a.ln_amt,
       a.ln_dt, r.pay_dt, r.sum_mon_amt, r.ln_bb_amt
  from tid i
  join tacct a
    on i.lnid = a.lnid
  join trepay r
    on a.lnact = r.lnact
   and a.lnact_seq = r.lnact_seq
 where i.lnid = '10006'
 order by r.pay_dt;

-- 차주 정보
lnid : 차주id

select * from tid;
tacct 
select * from tid;

-- join 기본 
select *
  from tid
  join tacct
    on tid.lnid = tacct.lnid
 where tid.lnid = '10000';

select * from tid
 where lnid = '10000';
 
select lnid, lnact, lnact_seq, lmt, ln_amt 
  from tacct
 where lnid = '10000'
   and lmt_typ is null;
   
select *
  from tid a
  join tcredit b
    on a.lnid = b.lnid
  join tcode c
    on b.code = c.code;
    
select *
  from tacct a
  join trepay b
    on a.lnact = b.lnact
   and a.lnact_seq = b.lnact_seq;    


