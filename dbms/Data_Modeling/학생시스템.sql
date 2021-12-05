
CREATE TABLE 과목
(
	과목코드              CHAR(18)  NOT NULL ,
	과목명                CHAR(18)  NULL ,
	학점                  CHAR(18)  NULL ,
	일자                  CHAR(18)  NULL ,
	교수번호              CHAR(18)  NOT NULL 
);



CREATE UNIQUE INDEX XPK과목 ON 과목
(과목코드  ASC);



ALTER TABLE 과목
	ADD CONSTRAINT  XPK과목 PRIMARY KEY (과목코드);



CREATE TABLE 과목_시간
(
	과목코드              CHAR(18)  NOT NULL ,
	시간                  CHAR(18)  NOT NULL ,
	교실번호              CHAR(18)  NOT NULL 
);



CREATE UNIQUE INDEX XPK과목_시간 ON 과목_시간
(시간  ASC,교실번호  ASC);



ALTER TABLE 과목_시간
	ADD CONSTRAINT  XPK과목_시간 PRIMARY KEY (시간,교실번호);



CREATE TABLE 교수
(
	성명                  CHAR(18)  NULL ,
	출생년도              CHAR(18)  NULL ,
	결혼여부              CHAR(18)  NULL ,
	직위                  CHAR(18)  NULL ,
	연구분야              CHAR(18)  NULL ,
	교수번호              CHAR(18)  NOT NULL ,
	학과번호              CHAR(18)  NOT NULL ,
	출생_도시번호         CHAR(18)  NOT NULL ,
	출생_도시명           CHAR(18)  NULL 
);



CREATE UNIQUE INDEX XPK교수 ON 교수
(교수번호  ASC);



ALTER TABLE 교수
	ADD CONSTRAINT  XPK교수 PRIMARY KEY (교수번호);



CREATE TABLE 교실
(
	시간                  CHAR(18)  NULL ,
	교실번호              CHAR(18)  NOT NULL ,
	교실명                CHAR(18)  NULL ,
	인원수                CHAR(18)  NULL 
);



CREATE UNIQUE INDEX XPK교실 ON 교실
(교실번호  ASC);



ALTER TABLE 교실
	ADD CONSTRAINT  XPK교실 PRIMARY KEY (교실번호);



CREATE TABLE 대학원생
(
	취득학점              CHAR(18)  NULL ,
	학생번호              CHAR(18)  NOT NULL ,
	교수번호              CHAR(18)  NULL ,
	논문제목              CHAR(18)  NULL ,
	연구분야              CHAR(18)  NULL 
);



CREATE UNIQUE INDEX XPK대학원생 ON 대학원생
(학생번호  ASC);



ALTER TABLE 대학원생
	ADD CONSTRAINT  XPK대학원생 PRIMARY KEY (학생번호);



CREATE TABLE 도시
(
	도시명                CHAR(18)  NULL ,
	도시번호              CHAR(18)  NOT NULL 
);



CREATE UNIQUE INDEX XPK도시 ON 도시
(도시번호  ASC);



ALTER TABLE 도시
	ADD CONSTRAINT  XPK도시 PRIMARY KEY (도시번호);



CREATE TABLE 수강과목
(
	과목코드              CHAR(18)  NOT NULL ,
	학생번호              CHAR(18)  NOT NULL ,
	이수학점              CHAR(18)  NULL ,
	이수일자              CHAR(18)  NULL 
);



CREATE UNIQUE INDEX XPK수강과목 ON 수강과목
(과목코드  ASC,학생번호  ASC);



ALTER TABLE 수강과목
	ADD CONSTRAINT  XPK수강과목 PRIMARY KEY (과목코드,학생번호);



CREATE TABLE 학과
(
	학과전화번호          CHAR(18)  NULL ,
	학과번호              CHAR(18)  NOT NULL ,
	학과명                CHAR(18)  NULL 
);



CREATE UNIQUE INDEX XPK학과 ON 학과
(학과번호  ASC);



ALTER TABLE 학과
	ADD CONSTRAINT  XPK학과 PRIMARY KEY (학과번호);



CREATE TABLE 학생
(
	성명                  CHAR(18)  NULL ,
	출생년도              CHAR(18)  NULL ,
	성별                  CHAR(18)  NULL ,
	학생번호              CHAR(18)  NOT NULL ,
	출생_도시번호         CHAR(18)  NOT NULL ,
	거주_도시번호         CHAR(18)  NOT NULL ,
	출생_도시명           CHAR(18)  NULL ,
	거주_도시명           CHAR(18)  NULL 
);



CREATE UNIQUE INDEX XPK학생 ON 학생
(학생번호  ASC);



ALTER TABLE 학생
	ADD CONSTRAINT  XPK학생 PRIMARY KEY (학생번호);



ALTER TABLE 과목
	ADD (CONSTRAINT  R_55 FOREIGN KEY (교수번호) REFERENCES 교수(교수번호));



ALTER TABLE 과목_시간
	ADD (CONSTRAINT  R_173 FOREIGN KEY (과목코드) REFERENCES 과목(과목코드));



ALTER TABLE 과목_시간
	ADD (CONSTRAINT  R_182 FOREIGN KEY (교실번호) REFERENCES 교실(교실번호));



ALTER TABLE 교수
	ADD (CONSTRAINT  R_34 FOREIGN KEY (학과번호) REFERENCES 학과(학과번호));



ALTER TABLE 교수
	ADD (CONSTRAINT  R_54 FOREIGN KEY (출생_도시번호) REFERENCES 도시(도시번호));



ALTER TABLE 대학원생
	ADD (CONSTRAINT  R_102 FOREIGN KEY (학생번호) REFERENCES 학생(학생번호));



ALTER TABLE 대학원생
	ADD (CONSTRAINT  R_28 FOREIGN KEY (교수번호) REFERENCES 교수(교수번호) ON DELETE SET NULL);



ALTER TABLE 수강과목
	ADD (CONSTRAINT  수강 FOREIGN KEY (과목코드) REFERENCES 과목(과목코드));



ALTER TABLE 수강과목
	ADD (CONSTRAINT  R_101 FOREIGN KEY (학생번호) REFERENCES 학생(학생번호));



ALTER TABLE 학생
	ADD (CONSTRAINT  R_22 FOREIGN KEY (출생_도시번호) REFERENCES 도시(도시번호));



ALTER TABLE 학생
	ADD (CONSTRAINT  R_23 FOREIGN KEY (거주_도시번호) REFERENCES 도시(도시번호));



CREATE  TRIGGER tI_과목 BEFORE INSERT ON 과목 for each row
-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
-- INSERT trigger on 과목 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
    /* 교수 ?의 과목 on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="0000ef3e", PARENT_OWNER="", PARENT_TABLE="교수"
    CHILD_OWNER="", CHILD_TABLE="과목"
    P2C_VERB_PHRASE="R/55", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_55", FK_COLUMNS="교수번호" */
    SELECT count(*) INTO NUMROWS
      FROM 교수
      WHERE
        /* %JoinFKPK(:%New,교수," = "," AND") */
        :new.교수번호 = 교수.교수번호;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert 과목 because 교수 does not exist.'
      );
    END IF;


-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
END;
/

CREATE  TRIGGER tD_과목 AFTER DELETE ON 과목 for each row
-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
-- DELETE trigger on 과목 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
    /* 과목  이수과목 on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="0002d264", PARENT_OWNER="", PARENT_TABLE="과목"
    CHILD_OWNER="", CHILD_TABLE="이수과목"
    P2C_VERB_PHRASE="R/99", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_99", FK_COLUMNS="과목코드" */
    SELECT count(*) INTO NUMROWS
      FROM 이수과목
      WHERE
        /*  %JoinFKPK(이수과목,:%Old," = "," AND") */
        이수과목.과목코드 = :old.과목코드;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete 과목 because 이수과목 exists.'
      );
    END IF;

    /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
    /* 과목 수? 수?과목 on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="과목"
    CHILD_OWNER="", CHILD_TABLE="수?과목"
    P2C_VERB_PHRASE="수?", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="수?", FK_COLUMNS="과목코드" */
    SELECT count(*) INTO NUMROWS
      FROM 수?과목
      WHERE
        /*  %JoinFKPK(수?과목,:%Old," = "," AND") */
        수?과목.과목코드 = :old.과목코드;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete 과목 because 수?과목 exists.'
      );
    END IF;

    /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
    /* 과목  과목_시간 on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="과목"
    CHILD_OWNER="", CHILD_TABLE="과목_시간"
    P2C_VERB_PHRASE="R/173", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_173", FK_COLUMNS="과목코드" */
    SELECT count(*) INTO NUMROWS
      FROM 과목_시간
      WHERE
        /*  %JoinFKPK(과목_시간,:%Old," = "," AND") */
        과목_시간.과목코드 = :old.과목코드;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete 과목 because 과목_시간 exists.'
      );
    END IF;


-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
END;
/

CREATE  TRIGGER tU_과목 AFTER UPDATE ON 과목 for each row
-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
-- UPDATE trigger on 과목 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
  /* 과목  이수과목 on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="00044c12", PARENT_OWNER="", PARENT_TABLE="과목"
    CHILD_OWNER="", CHILD_TABLE="이수과목"
    P2C_VERB_PHRASE="R/99", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_99", FK_COLUMNS="과목코드" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.과목코드 <> :new.과목코드
  THEN
    SELECT count(*) INTO NUMROWS
      FROM 이수과목
      WHERE
        /*  %JoinFKPK(이수과목,:%Old," = "," AND") */
        이수과목.과목코드 = :old.과목코드;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update 과목 because 이수과목 exists.'
      );
    END IF;
  END IF;

  /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
  /* 과목 수? 수?과목 on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="과목"
    CHILD_OWNER="", CHILD_TABLE="수?과목"
    P2C_VERB_PHRASE="수?", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="수?", FK_COLUMNS="과목코드" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.과목코드 <> :new.과목코드
  THEN
    SELECT count(*) INTO NUMROWS
      FROM 수?과목
      WHERE
        /*  %JoinFKPK(수?과목,:%Old," = "," AND") */
        수?과목.과목코드 = :old.과목코드;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update 과목 because 수?과목 exists.'
      );
    END IF;
  END IF;

  /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
  /* 과목  과목_시간 on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="과목"
    CHILD_OWNER="", CHILD_TABLE="과목_시간"
    P2C_VERB_PHRASE="R/173", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_173", FK_COLUMNS="과목코드" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.과목코드 <> :new.과목코드
  THEN
    SELECT count(*) INTO NUMROWS
      FROM 과목_시간
      WHERE
        /*  %JoinFKPK(과목_시간,:%Old," = "," AND") */
        과목_시간.과목코드 = :old.과목코드;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update 과목 because 과목_시간 exists.'
      );
    END IF;
  END IF;

  /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
  /* 교수 ?의 과목 on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="교수"
    CHILD_OWNER="", CHILD_TABLE="과목"
    P2C_VERB_PHRASE="R/55", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_55", FK_COLUMNS="교수번호" */
  SELECT count(*) INTO NUMROWS
    FROM 교수
    WHERE
      /* %JoinFKPK(:%New,교수," = "," AND") */
      :new.교수번호 = 교수.교수번호;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update 과목 because 교수 does not exist.'
    );
  END IF;


-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
END;
/


CREATE  TRIGGER tI_과목_시간 BEFORE INSERT ON 과목_시간 for each row
-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
-- INSERT trigger on 과목_시간 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
    /* 과목  과목_시간 on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="0001f4cb", PARENT_OWNER="", PARENT_TABLE="과목"
    CHILD_OWNER="", CHILD_TABLE="과목_시간"
    P2C_VERB_PHRASE="R/173", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_173", FK_COLUMNS="과목코드" */
    SELECT count(*) INTO NUMROWS
      FROM 과목
      WHERE
        /* %JoinFKPK(:%New,과목," = "," AND") */
        :new.과목코드 = 과목.과목코드;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert 과목_시간 because 과목 does not exist.'
      );
    END IF;

    /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
    /* 교실  과목_시간 on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="교실"
    CHILD_OWNER="", CHILD_TABLE="과목_시간"
    P2C_VERB_PHRASE="R/182", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_182", FK_COLUMNS="교실번호" */
    SELECT count(*) INTO NUMROWS
      FROM 교실
      WHERE
        /* %JoinFKPK(:%New,교실," = "," AND") */
        :new.교실번호 = 교실.교실번호;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert 과목_시간 because 교실 does not exist.'
      );
    END IF;


-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
END;
/

CREATE  TRIGGER tU_과목_시간 AFTER UPDATE ON 과목_시간 for each row
-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
-- UPDATE trigger on 과목_시간 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
  /* 과목  과목_시간 on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="0001fb85", PARENT_OWNER="", PARENT_TABLE="과목"
    CHILD_OWNER="", CHILD_TABLE="과목_시간"
    P2C_VERB_PHRASE="R/173", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_173", FK_COLUMNS="과목코드" */
  SELECT count(*) INTO NUMROWS
    FROM 과목
    WHERE
      /* %JoinFKPK(:%New,과목," = "," AND") */
      :new.과목코드 = 과목.과목코드;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update 과목_시간 because 과목 does not exist.'
    );
  END IF;

  /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
  /* 교실  과목_시간 on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="교실"
    CHILD_OWNER="", CHILD_TABLE="과목_시간"
    P2C_VERB_PHRASE="R/182", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_182", FK_COLUMNS="교실번호" */
  SELECT count(*) INTO NUMROWS
    FROM 교실
    WHERE
      /* %JoinFKPK(:%New,교실," = "," AND") */
      :new.교실번호 = 교실.교실번호;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update 과목_시간 because 교실 does not exist.'
    );
  END IF;


-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
END;
/


CREATE  TRIGGER tI_교수 BEFORE INSERT ON 교수 for each row
-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
-- INSERT trigger on 교수 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
    /* 학과  교수 on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="0001ec8c", PARENT_OWNER="", PARENT_TABLE="학과"
    CHILD_OWNER="", CHILD_TABLE="교수"
    P2C_VERB_PHRASE="R/34", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_34", FK_COLUMNS="학과번호" */
    SELECT count(*) INTO NUMROWS
      FROM 학과
      WHERE
        /* %JoinFKPK(:%New,학과," = "," AND") */
        :new.학과번호 = 학과.학과번호;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert 교수 because 학과 does not exist.'
      );
    END IF;

    /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
    /* 도시 출생 교수 on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="도시"
    CHILD_OWNER="", CHILD_TABLE="교수"
    P2C_VERB_PHRASE="R/54", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_54", FK_COLUMNS="출생_도시번호" */
    SELECT count(*) INTO NUMROWS
      FROM 도시
      WHERE
        /* %JoinFKPK(:%New,도시," = "," AND") */
        :new.출생_도시번호 = 도시.도시번호;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert 교수 because 도시 does not exist.'
      );
    END IF;


-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
END;
/

CREATE  TRIGGER tD_교수 AFTER DELETE ON 교수 for each row
-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
-- DELETE trigger on 교수 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
    /* 교수 ?의 과목 on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="0001acb5", PARENT_OWNER="", PARENT_TABLE="교수"
    CHILD_OWNER="", CHILD_TABLE="과목"
    P2C_VERB_PHRASE="R/55", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_55", FK_COLUMNS="교수번호" */
    SELECT count(*) INTO NUMROWS
      FROM 과목
      WHERE
        /*  %JoinFKPK(과목,:%Old," = "," AND") */
        과목.교수번호 = :old.교수번호;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete 교수 because 과목 exists.'
      );
    END IF;

    /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
    /* 교수 지도 대학원생 on parent delete set null */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="교수"
    CHILD_OWNER="", CHILD_TABLE="대학원생"
    P2C_VERB_PHRASE="R/28", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_28", FK_COLUMNS="교수번호" */
    UPDATE 대학원생
      SET
        /* %SetFK(대학원생,NULL) */
        대학원생.교수번호 = NULL
      WHERE
        /* %JoinFKPK(대학원생,:%Old," = "," AND") */
        대학원생.교수번호 = :old.교수번호;


-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
END;
/

CREATE  TRIGGER tU_교수 AFTER UPDATE ON 교수 for each row
-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
-- UPDATE trigger on 교수 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
  /* 교수 ?의 과목 on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="0003e9ce", PARENT_OWNER="", PARENT_TABLE="교수"
    CHILD_OWNER="", CHILD_TABLE="과목"
    P2C_VERB_PHRASE="R/55", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_55", FK_COLUMNS="교수번호" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.교수번호 <> :new.교수번호
  THEN
    SELECT count(*) INTO NUMROWS
      FROM 과목
      WHERE
        /*  %JoinFKPK(과목,:%Old," = "," AND") */
        과목.교수번호 = :old.교수번호;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update 교수 because 과목 exists.'
      );
    END IF;
  END IF;

  /* 교수 지도 대학원생 on parent update set null */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="교수"
    CHILD_OWNER="", CHILD_TABLE="대학원생"
    P2C_VERB_PHRASE="R/28", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_28", FK_COLUMNS="교수번호" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.교수번호 <> :new.교수번호
  THEN
    UPDATE 대학원생
      SET
        /* %SetFK(대학원생,NULL) */
        대학원생.교수번호 = NULL
      WHERE
        /* %JoinFKPK(대학원생,:%Old," = ",",") */
        대학원생.교수번호 = :old.교수번호;
  END IF;

  /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
  /* 학과  교수 on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="학과"
    CHILD_OWNER="", CHILD_TABLE="교수"
    P2C_VERB_PHRASE="R/34", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_34", FK_COLUMNS="학과번호" */
  SELECT count(*) INTO NUMROWS
    FROM 학과
    WHERE
      /* %JoinFKPK(:%New,학과," = "," AND") */
      :new.학과번호 = 학과.학과번호;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update 교수 because 학과 does not exist.'
    );
  END IF;

  /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
  /* 도시 출생 교수 on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="도시"
    CHILD_OWNER="", CHILD_TABLE="교수"
    P2C_VERB_PHRASE="R/54", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_54", FK_COLUMNS="출생_도시번호" */
  SELECT count(*) INTO NUMROWS
    FROM 도시
    WHERE
      /* %JoinFKPK(:%New,도시," = "," AND") */
      :new.출생_도시번호 = 도시.도시번호;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update 교수 because 도시 does not exist.'
    );
  END IF;


-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
END;
/


CREATE  TRIGGER tD_교실 AFTER DELETE ON 교실 for each row
-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
-- DELETE trigger on 교실 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
    /* 교실  과목_시간 on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="0000d889", PARENT_OWNER="", PARENT_TABLE="교실"
    CHILD_OWNER="", CHILD_TABLE="과목_시간"
    P2C_VERB_PHRASE="R/182", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_182", FK_COLUMNS="교실번호" */
    SELECT count(*) INTO NUMROWS
      FROM 과목_시간
      WHERE
        /*  %JoinFKPK(과목_시간,:%Old," = "," AND") */
        과목_시간.교실번호 = :old.교실번호;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete 교실 because 과목_시간 exists.'
      );
    END IF;


-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
END;
/

CREATE  TRIGGER tU_교실 AFTER UPDATE ON 교실 for each row
-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
-- UPDATE trigger on 교실 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
  /* 교실  과목_시간 on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="00010915", PARENT_OWNER="", PARENT_TABLE="교실"
    CHILD_OWNER="", CHILD_TABLE="과목_시간"
    P2C_VERB_PHRASE="R/182", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_182", FK_COLUMNS="교실번호" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.교실번호 <> :new.교실번호
  THEN
    SELECT count(*) INTO NUMROWS
      FROM 과목_시간
      WHERE
        /*  %JoinFKPK(과목_시간,:%Old," = "," AND") */
        과목_시간.교실번호 = :old.교실번호;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update 교실 because 과목_시간 exists.'
      );
    END IF;
  END IF;


-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
END;
/


CREATE  TRIGGER tI_대학원생 BEFORE INSERT ON 대학원생 for each row
-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
-- INSERT trigger on 대학원생 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
    /* 교수 지도 대학원생 on child insert set null */
    /* ERWIN_RELATION:CHECKSUM="0001fed1", PARENT_OWNER="", PARENT_TABLE="교수"
    CHILD_OWNER="", CHILD_TABLE="대학원생"
    P2C_VERB_PHRASE="R/28", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_28", FK_COLUMNS="교수번호" */
    UPDATE 대학원생
      SET
        /* %SetFK(대학원생,NULL) */
        대학원생.교수번호 = NULL
      WHERE
        NOT EXISTS (
          SELECT * FROM 교수
            WHERE
              /* %JoinFKPK(:%New,교수," = "," AND") */
              :new.교수번호 = 교수.교수번호
        ) 
        /* %JoinPKPK(대학원생,:%New," = "," AND") */
         and 대학원생.학생번호 = :new.학생번호;

    /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
    /* 학생  대학원생 on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="학생"
    CHILD_OWNER="", CHILD_TABLE="대학원생"
    P2C_VERB_PHRASE="R/102", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_102", FK_COLUMNS="학생번호" */
    SELECT count(*) INTO NUMROWS
      FROM 학생
      WHERE
        /* %JoinFKPK(:%New,학생," = "," AND") */
        :new.학생번호 = 학생.학생번호;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert 대학원생 because 학생 does not exist.'
      );
    END IF;


-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
END;
/

CREATE  TRIGGER tU_대학원생 AFTER UPDATE ON 대학원생 for each row
-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
-- UPDATE trigger on 대학원생 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
  /* 교수 지도 대학원생 on child update no action */
  /* ERWIN_RELATION:CHECKSUM="0001fd85", PARENT_OWNER="", PARENT_TABLE="교수"
    CHILD_OWNER="", CHILD_TABLE="대학원생"
    P2C_VERB_PHRASE="R/28", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_28", FK_COLUMNS="교수번호" */
  SELECT count(*) INTO NUMROWS
    FROM 교수
    WHERE
      /* %JoinFKPK(:%New,교수," = "," AND") */
      :new.교수번호 = 교수.교수번호;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    :new.교수번호 IS NOT NULL AND
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update 대학원생 because 교수 does not exist.'
    );
  END IF;

  /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
  /* 학생  대학원생 on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="학생"
    CHILD_OWNER="", CHILD_TABLE="대학원생"
    P2C_VERB_PHRASE="R/102", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_102", FK_COLUMNS="학생번호" */
  SELECT count(*) INTO NUMROWS
    FROM 학생
    WHERE
      /* %JoinFKPK(:%New,학생," = "," AND") */
      :new.학생번호 = 학생.학생번호;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update 대학원생 because 학생 does not exist.'
    );
  END IF;


-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
END;
/


CREATE  TRIGGER tD_도시 AFTER DELETE ON 도시 for each row
-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
-- DELETE trigger on 도시 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
    /* 도시 출생 학생 on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="0002b7bf", PARENT_OWNER="", PARENT_TABLE="도시"
    CHILD_OWNER="", CHILD_TABLE="학생"
    P2C_VERB_PHRASE="R/22", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_22", FK_COLUMNS="출생_도시번호" */
    SELECT count(*) INTO NUMROWS
      FROM 학생
      WHERE
        /*  %JoinFKPK(학생,:%Old," = "," AND") */
        학생.출생_도시번호 = :old.도시번호;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete 도시 because 학생 exists.'
      );
    END IF;

    /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
    /* 도시 거주 학생 on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="도시"
    CHILD_OWNER="", CHILD_TABLE="학생"
    P2C_VERB_PHRASE="R/23", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_23", FK_COLUMNS="거주_도시번호" */
    SELECT count(*) INTO NUMROWS
      FROM 학생
      WHERE
        /*  %JoinFKPK(학생,:%Old," = "," AND") */
        학생.거주_도시번호 = :old.도시번호;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete 도시 because 학생 exists.'
      );
    END IF;

    /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
    /* 도시 출생 교수 on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="도시"
    CHILD_OWNER="", CHILD_TABLE="교수"
    P2C_VERB_PHRASE="R/54", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_54", FK_COLUMNS="출생_도시번호" */
    SELECT count(*) INTO NUMROWS
      FROM 교수
      WHERE
        /*  %JoinFKPK(교수,:%Old," = "," AND") */
        교수.출생_도시번호 = :old.도시번호;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete 도시 because 교수 exists.'
      );
    END IF;


-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
END;
/

CREATE  TRIGGER tU_도시 AFTER UPDATE ON 도시 for each row
-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
-- UPDATE trigger on 도시 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
  /* 도시 출생 학생 on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="000312b2", PARENT_OWNER="", PARENT_TABLE="도시"
    CHILD_OWNER="", CHILD_TABLE="학생"
    P2C_VERB_PHRASE="R/22", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_22", FK_COLUMNS="출생_도시번호" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.도시번호 <> :new.도시번호
  THEN
    SELECT count(*) INTO NUMROWS
      FROM 학생
      WHERE
        /*  %JoinFKPK(학생,:%Old," = "," AND") */
        학생.출생_도시번호 = :old.도시번호;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update 도시 because 학생 exists.'
      );
    END IF;
  END IF;

  /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
  /* 도시 거주 학생 on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="도시"
    CHILD_OWNER="", CHILD_TABLE="학생"
    P2C_VERB_PHRASE="R/23", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_23", FK_COLUMNS="거주_도시번호" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.도시번호 <> :new.도시번호
  THEN
    SELECT count(*) INTO NUMROWS
      FROM 학생
      WHERE
        /*  %JoinFKPK(학생,:%Old," = "," AND") */
        학생.거주_도시번호 = :old.도시번호;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update 도시 because 학생 exists.'
      );
    END IF;
  END IF;

  /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
  /* 도시 출생 교수 on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="도시"
    CHILD_OWNER="", CHILD_TABLE="교수"
    P2C_VERB_PHRASE="R/54", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_54", FK_COLUMNS="출생_도시번호" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.도시번호 <> :new.도시번호
  THEN
    SELECT count(*) INTO NUMROWS
      FROM 교수
      WHERE
        /*  %JoinFKPK(교수,:%Old," = "," AND") */
        교수.출생_도시번호 = :old.도시번호;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update 도시 because 교수 exists.'
      );
    END IF;
  END IF;


-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
END;
/


CREATE  TRIGGER tI_수강과목 BEFORE INSERT ON 수강과목 for each row
-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
-- INSERT trigger on 수강과목 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
    /* 과목 수? 수?과목 on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="0001f0ed", PARENT_OWNER="", PARENT_TABLE="과목"
    CHILD_OWNER="", CHILD_TABLE="수?과목"
    P2C_VERB_PHRASE="수?", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="수?", FK_COLUMNS="과목코드" */
    SELECT count(*) INTO NUMROWS
      FROM 과목
      WHERE
        /* %JoinFKPK(:%New,과목," = "," AND") */
        :new.과목코드 = 과목.과목코드;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert 수?과목 because 과목 does not exist.'
      );
    END IF;

    /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
    /* 학생  수?과목 on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="학생"
    CHILD_OWNER="", CHILD_TABLE="수?과목"
    P2C_VERB_PHRASE="R/101", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_101", FK_COLUMNS="학생번호" */
    SELECT count(*) INTO NUMROWS
      FROM 학생
      WHERE
        /* %JoinFKPK(:%New,학생," = "," AND") */
        :new.학생번호 = 학생.학생번호;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert 수?과목 because 학생 does not exist.'
      );
    END IF;


-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
END;
/

CREATE  TRIGGER tU_수강과목 AFTER UPDATE ON 수강과목 for each row
-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
-- UPDATE trigger on 수강과목 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
  /* 과목 수? 수?과목 on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="0001ee3b", PARENT_OWNER="", PARENT_TABLE="과목"
    CHILD_OWNER="", CHILD_TABLE="수?과목"
    P2C_VERB_PHRASE="수?", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="수?", FK_COLUMNS="과목코드" */
  SELECT count(*) INTO NUMROWS
    FROM 과목
    WHERE
      /* %JoinFKPK(:%New,과목," = "," AND") */
      :new.과목코드 = 과목.과목코드;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update 수?과목 because 과목 does not exist.'
    );
  END IF;

  /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
  /* 학생  수?과목 on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="학생"
    CHILD_OWNER="", CHILD_TABLE="수?과목"
    P2C_VERB_PHRASE="R/101", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_101", FK_COLUMNS="학생번호" */
  SELECT count(*) INTO NUMROWS
    FROM 학생
    WHERE
      /* %JoinFKPK(:%New,학생," = "," AND") */
      :new.학생번호 = 학생.학생번호;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update 수?과목 because 학생 does not exist.'
    );
  END IF;


-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
END;
/


CREATE  TRIGGER tD_학과 AFTER DELETE ON 학과 for each row
-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
-- DELETE trigger on 학과 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
    /* 학과  교수 on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="0000c935", PARENT_OWNER="", PARENT_TABLE="학과"
    CHILD_OWNER="", CHILD_TABLE="교수"
    P2C_VERB_PHRASE="R/34", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_34", FK_COLUMNS="학과번호" */
    SELECT count(*) INTO NUMROWS
      FROM 교수
      WHERE
        /*  %JoinFKPK(교수,:%Old," = "," AND") */
        교수.학과번호 = :old.학과번호;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete 학과 because 교수 exists.'
      );
    END IF;


-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
END;
/

CREATE  TRIGGER tU_학과 AFTER UPDATE ON 학과 for each row
-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
-- UPDATE trigger on 학과 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
  /* 학과  교수 on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="0000fd56", PARENT_OWNER="", PARENT_TABLE="학과"
    CHILD_OWNER="", CHILD_TABLE="교수"
    P2C_VERB_PHRASE="R/34", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_34", FK_COLUMNS="학과번호" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.학과번호 <> :new.학과번호
  THEN
    SELECT count(*) INTO NUMROWS
      FROM 교수
      WHERE
        /*  %JoinFKPK(교수,:%Old," = "," AND") */
        교수.학과번호 = :old.학과번호;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update 학과 because 교수 exists.'
      );
    END IF;
  END IF;


-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
END;
/


CREATE  TRIGGER tI_학생 BEFORE INSERT ON 학생 for each row
-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
-- INSERT trigger on 학생 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
    /* 도시 출생 학생 on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="0001f547", PARENT_OWNER="", PARENT_TABLE="도시"
    CHILD_OWNER="", CHILD_TABLE="학생"
    P2C_VERB_PHRASE="R/22", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_22", FK_COLUMNS="출생_도시번호" */
    SELECT count(*) INTO NUMROWS
      FROM 도시
      WHERE
        /* %JoinFKPK(:%New,도시," = "," AND") */
        :new.출생_도시번호 = 도시.도시번호;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert 학생 because 도시 does not exist.'
      );
    END IF;

    /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
    /* 도시 거주 학생 on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="도시"
    CHILD_OWNER="", CHILD_TABLE="학생"
    P2C_VERB_PHRASE="R/23", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_23", FK_COLUMNS="거주_도시번호" */
    SELECT count(*) INTO NUMROWS
      FROM 도시
      WHERE
        /* %JoinFKPK(:%New,도시," = "," AND") */
        :new.거주_도시번호 = 도시.도시번호;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert 학생 because 도시 does not exist.'
      );
    END IF;


-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
END;
/

CREATE  TRIGGER tD_학생 AFTER DELETE ON 학생 for each row
-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
-- DELETE trigger on 학생 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
    /* 학생 이수 이수과목 on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="0002c5ca", PARENT_OWNER="", PARENT_TABLE="학생"
    CHILD_OWNER="", CHILD_TABLE="이수과목"
    P2C_VERB_PHRASE="이수", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="이수", FK_COLUMNS="학생번호" */
    SELECT count(*) INTO NUMROWS
      FROM 이수과목
      WHERE
        /*  %JoinFKPK(이수과목,:%Old," = "," AND") */
        이수과목.학생번호 = :old.학생번호;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete 학생 because 이수과목 exists.'
      );
    END IF;

    /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
    /* 학생  수?과목 on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="학생"
    CHILD_OWNER="", CHILD_TABLE="수?과목"
    P2C_VERB_PHRASE="R/101", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_101", FK_COLUMNS="학생번호" */
    SELECT count(*) INTO NUMROWS
      FROM 수?과목
      WHERE
        /*  %JoinFKPK(수?과목,:%Old," = "," AND") */
        수?과목.학생번호 = :old.학생번호;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete 학생 because 수?과목 exists.'
      );
    END IF;

    /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
    /* 학생  대학원생 on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="학생"
    CHILD_OWNER="", CHILD_TABLE="대학원생"
    P2C_VERB_PHRASE="R/102", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_102", FK_COLUMNS="학생번호" */
    SELECT count(*) INTO NUMROWS
      FROM 대학원생
      WHERE
        /*  %JoinFKPK(대학원생,:%Old," = "," AND") */
        대학원생.학생번호 = :old.학생번호;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete 학생 because 대학원생 exists.'
      );
    END IF;


-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
END;
/

CREATE  TRIGGER tU_학생 AFTER UPDATE ON 학생 for each row
-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
-- UPDATE trigger on 학생 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
  /* 학생 이수 이수과목 on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="00054af5", PARENT_OWNER="", PARENT_TABLE="학생"
    CHILD_OWNER="", CHILD_TABLE="이수과목"
    P2C_VERB_PHRASE="이수", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="이수", FK_COLUMNS="학생번호" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.학생번호 <> :new.학생번호
  THEN
    SELECT count(*) INTO NUMROWS
      FROM 이수과목
      WHERE
        /*  %JoinFKPK(이수과목,:%Old," = "," AND") */
        이수과목.학생번호 = :old.학생번호;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update 학생 because 이수과목 exists.'
      );
    END IF;
  END IF;

  /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
  /* 학생  수?과목 on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="학생"
    CHILD_OWNER="", CHILD_TABLE="수?과목"
    P2C_VERB_PHRASE="R/101", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_101", FK_COLUMNS="학생번호" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.학생번호 <> :new.학생번호
  THEN
    SELECT count(*) INTO NUMROWS
      FROM 수?과목
      WHERE
        /*  %JoinFKPK(수?과목,:%Old," = "," AND") */
        수?과목.학생번호 = :old.학생번호;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update 학생 because 수?과목 exists.'
      );
    END IF;
  END IF;

  /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
  /* 학생  대학원생 on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="학생"
    CHILD_OWNER="", CHILD_TABLE="대학원생"
    P2C_VERB_PHRASE="R/102", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_102", FK_COLUMNS="학생번호" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.학생번호 <> :new.학생번호
  THEN
    SELECT count(*) INTO NUMROWS
      FROM 대학원생
      WHERE
        /*  %JoinFKPK(대학원생,:%Old," = "," AND") */
        대학원생.학생번호 = :old.학생번호;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update 학생 because 대학원생 exists.'
      );
    END IF;
  END IF;

  /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
  /* 도시 출생 학생 on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="도시"
    CHILD_OWNER="", CHILD_TABLE="학생"
    P2C_VERB_PHRASE="R/22", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_22", FK_COLUMNS="출생_도시번호" */
  SELECT count(*) INTO NUMROWS
    FROM 도시
    WHERE
      /* %JoinFKPK(:%New,도시," = "," AND") */
      :new.출생_도시번호 = 도시.도시번호;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update 학생 because 도시 does not exist.'
    );
  END IF;

  /* ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21 */
  /* 도시 거주 학생 on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="도시"
    CHILD_OWNER="", CHILD_TABLE="학생"
    P2C_VERB_PHRASE="R/23", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_23", FK_COLUMNS="거주_도시번호" */
  SELECT count(*) INTO NUMROWS
    FROM 도시
    WHERE
      /* %JoinFKPK(:%New,도시," = "," AND") */
      :new.거주_도시번호 = 도시.도시번호;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update 학생 because 도시 does not exist.'
    );
  END IF;


-- ERwin Builtin 2021년 12월 4일 토요일 오후 12:07:21
END;
/

