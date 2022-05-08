2장. SELECT 기본 문장 작성

다음 문장을 실행하고 각각의 실행 결과가 어떻게 나올 것인지를 확인하세요.

SELECT *
FROM   tid ;

select count(*) from tid;

SELECT lnid, id_typ, bthday
FROM   tid ;

SELECT lnid, ln_dt, ln_amt, ln_amt / 1000000, (ln_amt*0.0325)/12
FROM   tacct ;

SELECT lnid, ln_amt, exp_dt, exp_dt - 14
FROM   tacct ;

SELECT lnid || ' 차주의 등급은 ' || grade || ' 입니다.'
FROM   tid 
WHERE id_typ = '2' ;

SELECT lnid   AS 차주번호
      ,id_typ AS 차주구분코드
      ,bthday AS 생일
      ,gender AS 성별
  FROM tid ; 

SELECT lnact, lnact_seq, ln_amt, ln_amt/1000 "대출금(천원)"
  FROM tacct ; 

SELECT grade
  FROM tid ; 

SELECT DISTINCT grade
  FROM tid ;



Quiz 

 차주정보(TID) 테이블을 이용하여 다음의 데이터를 검색하세요.
컬럼: lnid, id_typ, gender, bthday, score, grade 
별칭: 차주번호, 차주구분, 성별, 생일, 신용점수, 신용등급 



답안.
SELECT lnid    AS 차주번호
      ,id_typ  AS 차주구분
      ,gender  AS 성별 
      ,bthday  AS 생일 
      ,score   AS 신용점수 
      ,grade   AS 신용등급
FROM tid ; 

 계좌정보(TACCT) 테이블을 이용하여 다음의 데이터를 검색하세요. 
컬럼: lnact, lnact_seq, acct_typ, ln_dt, ln_amt, rate, (ln_amt*rate)/12



답안.
SELECT lnact, lnact_seq, acct_typ, ln_dt, ln_amt, rate, (ln_amt*rate)/12
FROM tacct ; 

계좌정보(TACCT) 테이블을 이용하여 다음의 데이터를 검색하세요. 
컬럼: branch, prod_cd 
조건: 중복행 제거



답안.
SELECT DISTINCT branch, prod_cd
FROM tacct ;

3장. WHERE절을 이용한 행 제한

다음 문장을 실행하고 각각의 실행 결과가 어떻게 나올 것인지를 확인하세요.

SELECT lnact, lnact_seq, lnid, ln_dt, ln_term, ln_amt
FROM tacct 
WHERE ln_amt > 2000000000 ;

SELECT * 
  FROM tid 
 WHERE grade = 'A';

SELECT * 
  FROM tid 
 WHERE bthday = '1983/06/24';

SELECT lnact, lnact_seq, lnid, ln_dt, ln_term, ln_amt
FROM tacct 
WHERE ln_amt BETWEEN  1000000000 AND 2000000000 ;

SELECT lnid, id_typ, bthday, grade
FROM tid 
WHERE grade IN ('AA+','AA','AA-') ;

SELECT * 
FROM tcode
WHERE grade LIKE 'A%' ;


-- _  : 한문자를 의미
-- ----------------
SELECT * 
FROM tcode 
WHERE grade LIKE 'A_' ;

SELECT lnact, lnact_seq, acct_typ, lmt_typ, lnid, ln_dt, ln_amt 
FROM tacct
WHERE lmt_typ IS NULL ;

SELECT lnact, lnact_seq, acct_typ, lmt_typ, lnid, ln_dt, ln_amt 
FROM tacct
WHERE lmt_typ IS NULL
  AND ln_dt   >= '2022/01/01';
  
SELECT lnact, lnact_seq, acct_typ, prod_cd, lnid, ln_dt, ln_amt 
FROM tacct
WHERE prod_cd = '101' 
   OR prod_cd = '102' ; 

SELECT lnid, id_typ, bthday, grade
FROM tid 
WHERE grade NOT IN ('AA+','AA','AA-') ;


Quiz

 차주정보(TID) 테이블을 이용하여 다음의 데이터를 검색하세요.
컬럼: lnid, id_typ, gender, bthday, score
별칭: 차주번호, 차주구분, 성별, 생일, 신용점수 
조건: 개인 차주 검색 (ID_TYP:'1')



답안.
SELECT lnid    AS 차주번호
      ,id_typ  AS 차주구분
      ,gender  AS 성별 
      ,bthday  AS 생일 
      ,score   AS 신용점수 
FROM tid 
WHERE id_typ = '1' ; 

 차주정보(TID) 테이블을 이용하여 다음의 데이터를 검색하세요.
컬럼: lnid, id_typ, gender, bthday, score
별칭: 차주번호, 차주구분, 성별, 생일, 신용점수 
조건1: 개인 차주 검색 (ID_TYP:'1')
조건2: 신용점수(SCORE)가 900점 이상



답안.
SELECT lnid    AS 차주번호
      ,id_typ  AS 차주구분
      ,gender  AS 성별 
      ,bthday  AS 생일 
      ,score   AS 신용점수 
FROM tid 
WHERE id_typ = '1'
  AND score  >= 900 ; 


 계좌정보(TACCT) 테이블을 이용하여 다음의 데이터를 검색하세요.
컬럼: lnact, lnact_seq, lnid, ln_dt, exp_dt, ln_amt/1000000
조건1: 한도계좌 제외 (lmt_typ:NULL)
조건2: 2021년에 시작된 대출 계좌(ln_dt)



답안.
SELECT lnact, lnact_seq, lnid, ln_dt, exp_dt, ln_amt/1000000 AS "대출금(백만)"
FROM tacct 
WHERE lmt_typ IS NULL 
  AND ln_dt BETWEEN '2021/01/01' AND '2021/12/31' ; 

 계좌정보(TACCT) 테이블을 이용하여 다음의 데이터를 검색하세요.
컬럼: lnact, lnact_seq, lnid, ln_dt, 대출금(백만원), ln_term, rate, 월이자 
대출금(LN_AMT)은 백만원 단위로 검색, 별칭 정의
이자 계산: ROUND((대출금액 * 연이자율)/12), 별칭 정의
조건: 한도계좌 제외 (lmt_typ:NULL)



답안.
SELECT lnact, lnact_seq, lnid, ln_dt, ln_amt/1000000 AS "대출금(백만원)"
      ,ln_term, rate, ROUND((ln_amt * rate)/12) AS "월이자" 
  FROM tacct 
 WHERE lmt_typ IS NULL ;








4장. ORDER BY 절을 이용한 정렬

다음 문장을 실행하고 각각의 실행 결과가 어떻게 나올 것인지를 확인하세요.

SELECT *
FROM tid 
ORDER BY bthday ;

SELECT *
FROM tid 
ORDER BY bthday DESC ;

SELECT lnact, lnact_seq, lnid, ln_dt, ln_amt AS 대출금
FROM tacct
WHERE lmt_typ IS NULL 
ORDER BY 대출금 ;

SELECT lnact, lnact_seq, lnid, ln_dt, ln_amt AS 대출금
FROM tacct
WHERE lmt_typ IS NULL 
ORDER BY 3 ;

SELECT lnact, lnact_seq, lnid, ln_dt, ln_amt AS 대출금
FROM tacct
WHERE lmt_typ IS NULL 
ORDER BY 5, 4 DESC ;


Quiz 

  차주정보(TID) 테이블을 이용하여 다음의 데이터를 검색하세요.
컬럼: lnid, id_typ, gender, bthday, score
별칭: 차주번호, 차주구분, 성별, 생일, 신용점수 
조건1: 개인 차주 검색 (ID_TYP:'1')
조건2: 신용점수(SCORE)가 900점 이상
정렬: 신용 점수(SCORE) 기준 오름차순



답안.
SELECT lnid    AS 차주번호
      ,id_typ  AS 차주구분
      ,gender  AS 성별 
      ,bthday  AS 생일 
      ,score   AS 신용점수 
FROM tid 
WHERE id_typ = '1'
  AND score  >= 900
ORDER BY score ; 

 계좌정보(TACCT) 테이블을 이용하여 다음의 데이터를 검색하세요.
컬럼: lnact, lnact_seq, lnid, ln_dt, exp_dt, ln_amt/1000000
조건1: 한도계좌 제외 (lmt_typ:NULL)
조건2: 2021년에 시작된 대출 계좌(ln_dt)
정렬: 대출금 기준 내림차순 (별칭사용)



답안.
SELECT lnact, lnact_seq, lnid, ln_dt, exp_dt, ln_amt/1000000 AS "대출금(백만)"
FROM tacct 
WHERE lmt_typ IS NULL 
  AND ln_dt BETWEEN '2021/01/01' AND '2021/12/31'
ORDER BY "대출금(백만)" DESC ; 

 차주정보(TID) 테이블을 이용하여 다음의 데이터를 검색하세요.
컬럼: lnid, bthday, grade
조건1: 법인 차주 검색 (ID_TYP:'2')
조건2: 신용 등급(GRADE) : AA+, AA, AA- 
정렬: 신용등급 순서 (AA+ => AA => AA-), 같은 등급내에서는 차주번호(LNID) 오름차순
힌트: CASE 문 활용

답안.
SELECT lnid, bthday, grade
FROM tid 
WHERE id_typ = '2' 
  AND grade IN ('AA+','AA','AA-')
ORDER BY CASE grade WHEN 'AA+' THEN 1
                    WHEN 'AA'  THEN 2 
                    WHEN 'AA-' THEN 3
         END
        ,lnid ;











차주정보(TID) 테이블을 이용하여 다음의 데이터를 검색하세요.
컬럼: lnid, bthday, gender, score 
조건: 개인 차주 검색 (ID_TYP:'1')
정렬: 연도를 제외한 생일을 기준으로 오름차순 정렬('MM/DD') 
힌트: TO_CHAR 함수 활용



답안.
SELECT lnid, bthday, gender, score 
FROM tid 
WHERE id_typ = '1' 
ORDER BY TO_CHAR(bthday, 'MMDD');





5장. 단일 행 함수 

다음 문장을 실행하고 각각의 실행 결과가 어떻게 나올 것인지를 확인하세요.

SELECT lnid, gender, bthday
      ,TO_CHAR(bthday,'MM/DD')
      ,TO_CHAR(bthday,'DD Month, YYYY')
FROM tid 
WHERE id_typ = '1' ; 

SELECT lnact, lnact_seq, ln_dt
      ,TO_CHAR(ln_amt,'L999,999,999,999')
      ,TO_CHAR(ln_amt,'L000,000,999,999')
FROM tacct 
WHERE lmt_typ IS NULL ; 
   
SELECT lnact, lnact_seq, acct_typ, lnid, ln_amt, rate 
      ,TRUNC((ln_amt * rate) / 12)        AS 이자1
      ,TRUNC((ln_amt * NVL(rate,0)) / 12) AS 이자2
FROM tacct 
WHERE branch = '10'; 
   
SELECT lnid, bthday, score, gender, 
       CASE gender WHEN '1' THEN '남'
                   WHEN '2' THEN '여'
                   ELSE '법인'
       END AS 성별                  
FROM tid 
WHERE id_typ = '1'; 

SELECT lnact, lnact_seq, ln_amt, rate, rate_typ,
       CASE WHEN rate_typ = '1' 
                  THEN TRUNC((ln_amt * rate)/12)
            WHEN rate_typ = '2' 
                  THEN TRUNC((ln_amt * (rate+0.01))/12)
            ELSE 0 
       END AS 이자                                 
FROM tacct 
WHERE lmt_typ IS NULL ;



6장. GROUP BY 절을 이용한 그룹 함수 

다음 문장을 실행하고 각각의 실행 결과가 어떻게 나올 것인지를 확인하세요.

SELECT SUM(ln_amt), AVG(ln_amt), 
       MAX(ln_amt), MIN(ln_amt)
FROM tacct 
WHERE lmt_typ IS NULL  ;

SELECT MAX(ln_dt), MIN(ln_dt)
FROM tacct 
WHERE lmt_typ IS NULL  ;

SELECT COUNT(*)
FROM tid ;

SELECT COUNT(gender)
FROM tid ;

SELECT COUNT(DISTINCT gender)
FROM tid ;

SELECT branch, SUM(ln_amt)
FROM tacct
WHERE lmt_typ IS NULL 
GROUP BY branch;

SELECT SUM(ln_amt)
FROM tacct
WHERE lmt_typ IS NULL 
GROUP BY branch;

SELECT branch, prod_cd, SUM(ln_amt)
FROM tacct
WHERE lmt_typ IS NULL 
GROUP BY branch, prod_cd ;

SELECT branch, prod_cd, SUM(ln_amt) -- ERROR 
FROM tacct ;

SELECT branch, prod_cd, SUM(ln_amt) -- ERROR 
FROM tacct
GROUP BY branch ;

SELECT branch, prod_cd, SUM(ln_amt) -- ERROR 
FROM tacct
WHERE lmt_typ IS NULL 
  AND SUM(ln_amt) > 2000000000
GROUP BY branch, prod_cd ;

SELECT branch, prod_cd, SUM(ln_amt)
FROM tacct
WHERE lmt_typ IS NULL 
GROUP BY branch, prod_cd 
HAVING SUM(ln_amt) > 2000000000 ;


Quiz 

  차주정보(TID) 테이블을 이용하여 다음의 데이터를 검색하세요.
검색: 성별(GENDER)별 인원 수(COUNT) 검색 
조건: 개인 차주 검색 (ID_TYP:'1')
그룹: 성별(GENDER)
정렬: 성별(GENDER) 기준 오름차순 



답안.
SELECT gender, COUNT(*) AS CNT 
FROM tid 
WHERE id_typ = '1' 
GROUP BY gender 
ORDER BY gender ; 

  차주정보(TID) 테이블을 이용하여 다음의 데이터를 검색하세요.
검색: 연도별(BTHDAY에서 연도만 사용), 성별(GENDER)별, 인원 수(COUNT) 검색 
조건: 개인 차주 검색 (ID_TYP:'1')
그룹: 생년(YYYY), 성별(GENDER)
정렬: 생년(YYYY), 성별(GENDER) 기준 오름차순 
힌트: TO_CHAR 활용


답안.
SELECT TO_CHAR(bthday,'YYYY') AS YYYY
      ,gender
      ,COUNT(*) AS CNT 
FROM tid 
WHERE id_typ = '1' 
GROUP BY TO_CHAR(bthday,'YYYY'), gender 
ORDER BY TO_CHAR(bthday,'YYYY'), gender  ; 



















7장. Join 문장 작성

다음 문장을 실행하고 각각의 실행 결과가 어떻게 나올 것인지를 확인하세요.

SELECT a.lnid, a.id_typ, a.bthday, 
       b.lnact, b.lnact_seq, b.ln_dt, b.ln_amt
FROM tid   a
JOIN tacct b
  ON a.lnid = b.lnid
WHERE b.lmt_typ IS NULL
ORDER BY b.lnact, b.lnact_seq ;

SELECT i.lnid, i.bthday, a.lnact, a.lnact_seq, a.ln_amt, a.ln_dt, 
       r.pay_dt, r.sum_mon_amt, r.ln_bb_amt 
FROM tid   i
JOIN tacct a
  ON i.lnid = a.lnid 
JOIN trepay r 
  ON a.lnact     = r.lnact
 AND a.lnact_seq = r.lnact_seq 
WHERE i.lnid = '10006'
ORDER BY r.pay_dt ; 

SELECT e.last_name, e.department_id, d.department_name
FROM   employees e LEFT OUTER JOIN departments d
ON    (e.department_id = d.department_id) ;

SELECT e.last_name, d.department_id, d.department_name
FROM   employees e RIGHT OUTER JOIN departments d
ON    (e.department_id = d.department_id) ;

SELECT e.last_name, d.department_id, d.department_name
FROM   employees e FULL OUTER JOIN departments d
ON    (e.department_id = d.department_id) ;

SELECT last_name, department_name
FROM   employees
CROSS JOIN departments ;



Quiz 

차주정보(TID), 대출계좌(TACCT) 테이블을 이용하여 다음 조건에 만족하는 행을 검색하세요.
컬럼: lnid, bthday, score, lnact, lnact_seq, ln_dt, ln_amt, repay_typ, rate
조인: 차주번호(LNID)가 같은 행끼리 연결
조건1: 개인 차주 검색 (ID_TYP:'1')
조건2: 현재 대출 상태인 계좌 검색 (REPAY:NULL)
조건3: 한도 계좌 제외 (LMT_TYP:NULL)
정렬: 대출금액(LN_AMT) 내림차순, 동일 금액내에서 차주번호(LNID) 오름차순



답안.
SELECT i.lnid, i.bthday, i.score, 
       a.lnact, a.lnact_seq, a.ln_dt, a.ln_amt, a.repay_typ, a.rate
  FROM tid   i 
  JOIN tacct a 
    ON i.lnid    = a.lnid 
 WHERE i.id_typ  = '1' 
   AND a.repay   IS NULL
   AND a.lmt_typ IS NULL
ORDER BY a.ln_amt DESC, i.lnid ;

차주별 신용등급 정보(TCREDIT), 신용평가사정보(TAGENCY), 신용등급코드(TCODE) 테이블을 이용하여 다음 조건에 만족하는 행을 검색하세요.
컬럼: lnid, aname, start_dt, end_dt, grade, grade_desc
조인1: 신용평가사 코드(ACODE)가 같은 행끼리 연결
조인2: 신용등급 코드(CODE)가 같은 행끼리 연결 
조건: 오늘을 기준(SYSDATE)으로 유효기간 내에 평가만 검색 (END_DT > SYSDATE)
정렬: 차주번호(LNID), 신용등급 코드(CODE) 오름차순 정렬

답안.
SELECT a.lnid, b.aname,  
       a.start_dt, a.end_dt, 
       c.grade, c.grade_desc
FROM tcredit a 
JOIN tagency b 
  ON a.acode = b.acode 
JOIN tcode   c
  ON a.code  = c.code 
WHERE a.end_dt > SYSDATE 
ORDER BY a.lnid, c.code;





8장. Subquery 활용

다음 문장을 실행하고 각각의 실행 결과가 어떻게 나올 것인지를 확인하세요.

SELECT * 
  FROM tcredit  
 WHERE acode = (SELECT acode
                  FROM tagency 
                 WHERE aname = '한국기업평가') ;

SELECT * 
  FROM tcredit  
 WHERE end_dt < SYSDATE 
   AND acode = (SELECT acode
                  FROM tagency 
                 WHERE aname = '한국기업평가') ;

SELECT lnact, lnact_seq, lnid, ln_dt, ln_term, ln_amt 
  FROM tacct   
 WHERE lmt_typ IS NULL 
   AND ln_amt > (SELECT AVG(ln_amt)
                   FROM tacct  
                  WHERE lmt_typ IS NULL) ;

SELECT branch, TRUNC(AVG(ln_amt))
  FROM tacct   
 WHERE lmt_typ IS NULL 
GROUP BY branch 
HAVING AVG(ln_amt) > (SELECT AVG(ln_amt)
                        FROM tacct  
                       WHERE lmt_typ IS NULL) ;

SELECT lnact, lnact_seq, lnid, ln_dt, ln_term, ln_amt
  FROM tacct 
 WHERE lmt_typ IS NULL 
   AND lnid IN (SELECT lnid 
                  FROM tid 
                 WHERE grade = 'A') ;

SELECT lnact, lnact_seq, lnid, prod_cd, ln_dt, ln_term, ln_amt
  FROM tacct 
 WHERE lmt_typ IS NULL 
   AND (prod_cd, ln_amt) IN (SELECT prod_cd, MAX(ln_amt) 
                               FROM tacct  
                              WHERE lmt_typ IS NULL
                             GROUP BY prod_cd) ;

SELECT a.lnact, a.lnact_seq, a.lnid, a.prod_cd, a.ln_dt, a.ln_amt, b.avg_ln_amt
  FROM tacct a 
  JOIN (SELECT prod_cd, TRUNC(AVG(ln_amt)) AS avg_ln_amt
          FROM tacct  
         WHERE lmt_typ IS NULL
        GROUP BY prod_cd) b 
    ON a.prod_cd = b.prod_cd 
   AND a.ln_amt  > b.avg_ln_amt  
 WHERE lmt_typ IS NULL ; 

9장. 집합 연산자

SELECT branch, COUNT(ln_amt)
  FROM tacct 
 WHERE ln_dt BETWEEN '2020/01/01' AND '2020/12/31' 
   AND lmt_typ IS NULL 
GROUP BY branch
UNION 
SELECT branch, COUNT(ln_amt)
  FROM tacct 
 WHERE ln_dt BETWEEN '2021/01/01' AND '2021/12/31' 
   AND lmt_typ IS NULL 
GROUP BY branch  
ORDER BY 1 ; 

SELECT branch, COUNT(ln_amt)
  FROM tacct 
 WHERE ln_dt BETWEEN '2020/01/01' AND '2020/12/31' 
   AND lmt_typ IS NULL 
GROUP BY branch
UNION ALL 
SELECT branch, COUNT(ln_amt)
  FROM tacct 
 WHERE ln_dt BETWEEN '2021/01/01' AND '2021/12/31' 
   AND lmt_typ IS NULL 
GROUP BY branch  
ORDER BY 1 ; 

SELECT branch, COUNT(ln_amt)
  FROM tacct 
 WHERE ln_dt BETWEEN '2020/01/01' AND '2020/12/31' 
   AND lmt_typ IS NULL 
GROUP BY branch
INTERSECT 
SELECT branch, COUNT(ln_amt)
  FROM tacct 
 WHERE ln_dt BETWEEN '2021/01/01' AND '2021/12/31' 
   AND lmt_typ IS NULL 
GROUP BY branch  
ORDER BY 1 ; 

SELECT branch, COUNT(ln_amt)
  FROM tacct 
 WHERE ln_dt BETWEEN '2020/01/01' AND '2020/12/31' 
   AND lmt_typ IS NULL 
GROUP BY branch
MINUS
SELECT branch, COUNT(ln_amt)
  FROM tacct 
 WHERE ln_dt BETWEEN '2021/01/01' AND '2021/12/31' 
   AND lmt_typ IS NULL 
GROUP BY branch  
ORDER BY 1 ; 


10장. 테이블 생성 및 관리

CREATE TABLE borrower
(lnid   VARCHAR2(4), 
 bthday DATE, 
 gender CHAR(1), 
 score  NUMBER(4)) ;
 
DESCRIBE borrower

CREATE TABLE tacct_lmt
AS SELECT *
     FROM tacct 
    WHERE lmt_typ = '1' ;

DESCRIBE tacct_lmt

CREATE GLOBAL TEMPORARY TABLE taccount
ON COMMIT DELETE ROWS 
AS SELECT *
     FROM tacct 
    WHERE lmt_typ IS NULL ; 

SELECT * FROM taccount ;

INSERT INTO taccount 
SELECT * FROM tacct 
WHERE lmt_typ IS NULL ; 

SELECT * FROM taccount ;

COMMIT ;

SELECT * FROM taccount ;

DROP TABLE taccount PURGE ; 

CREATE GLOBAL TEMPORARY TABLE taccount
ON COMMIT PRESERVE ROWS 
AS SELECT *
     FROM tacct 
    WHERE lmt_typ IS NULL ; 

SELECT * FROM taccount ;

ALTER TABLE borrower
ADD (grade  VARCHAR2(3)) ; 	

ALTER TABLE borrower
MODIFY (grade  VARCHAR2(4)) ; 

ALTER TABLE borrower 
DROP (grade) ; 	

DROP TABLE borrower ;
FLASHBACK TABLE borrower TO BEFORE DROP ; 
DROP TABLE borrower PURGE ;
11장. DML 활용

INSERT INTO tid (lnid, id_typ, bthday, gender, score, grade) 
VALUES ('20000', '1', '1990/01/15', '1', 800, NULL) ; 

INSERT INTO tid (lnid, id_typ, bthday, grade) 
VALUES ('20001', '2', '2012/01/20', 'A-') ; 

TRUNCATE TABLE taccount ; 

INSERT INTO taccount
SELECT * 
  FROM tacct 
 WHERE lmt_typ IS NULL ; 
 
UPDATE tid 
   SET score = 850 
 WHERE lnid  = '20000' ; 

UPDATE taccount 
   SET repay = 'Y'
      ,repay_dt = '2022/04/20' ; 

DELETE tid 
WHERE lnid IN ('20000', '20001') ; 

DELETE taccount ; 

TRUNCATE TABLE taccount ; 

COMMIT ; 
   

12장. 트랜잭션 이해 및 관리 

INSERT INTO tid (lnid, id_typ, bthday, grade) 
VALUES ('20001', '2', '2012/01/20', 'A-') ; 

COMMIT ; 

DELETE tid 
WHERE lnid = '20001' ; 

ROLLBACK;

14장. 기타 객체 관리
  
CREATE VIEW vid 
AS SELECT lnid, bthday, gender, score 
     FROM tid 
    WHERE id_typ = '1' ;

SELECT *
FROM vid ; 

CREATE OR REPLACE VIEW vid 
AS SELECT lnid, id_typ, bthday, gender, score 
     FROM tid 
    WHERE id_typ = '1' ;

SELECT *
FROM vid ; 

DROP VIEW vid ;

CREATE INDEX acctlmt_ix01 ON tacct_lmt(lnact) ; 

SELECT * 
  FROM tacct_lmt 
 WHERE lnact = '200000';

DROP INDEX acctlmt_ix01 ;

CREATE SEQUENCE lnid_sq
START WITH 30000
MAXVALUE   99999 ;

INSERT INTO tid (lnid, id_typ, bthday, grade) 
VALUES (lnid_sq.nextval, '2', '2012/01/20', 'A-') ; 

SELECT	lnid_sq.currval
FROM	dual;

CREATE SYNONYM lmt FOR tacct_lmt ;

DROP SYNONYM lmt ;

