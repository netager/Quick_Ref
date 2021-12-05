
CREATE TABLE ����
(
	�����ڵ�              CHAR(18)  NOT NULL ,
	�����                CHAR(18)  NULL ,
	����                  CHAR(18)  NULL ,
	����                  CHAR(18)  NULL ,
	������ȣ              CHAR(18)  NOT NULL 
);



CREATE UNIQUE INDEX XPK���� ON ����
(�����ڵ�  ASC);



ALTER TABLE ����
	ADD CONSTRAINT  XPK���� PRIMARY KEY (�����ڵ�);



CREATE TABLE ����_�ð�
(
	�����ڵ�              CHAR(18)  NOT NULL ,
	�ð�                  CHAR(18)  NOT NULL ,
	���ǹ�ȣ              CHAR(18)  NOT NULL 
);



CREATE UNIQUE INDEX XPK����_�ð� ON ����_�ð�
(�ð�  ASC,���ǹ�ȣ  ASC);



ALTER TABLE ����_�ð�
	ADD CONSTRAINT  XPK����_�ð� PRIMARY KEY (�ð�,���ǹ�ȣ);



CREATE TABLE ����
(
	����                  CHAR(18)  NULL ,
	����⵵              CHAR(18)  NULL ,
	��ȥ����              CHAR(18)  NULL ,
	����                  CHAR(18)  NULL ,
	�����о�              CHAR(18)  NULL ,
	������ȣ              CHAR(18)  NOT NULL ,
	�а���ȣ              CHAR(18)  NOT NULL ,
	���_���ù�ȣ         CHAR(18)  NOT NULL ,
	���_���ø�           CHAR(18)  NULL 
);



CREATE UNIQUE INDEX XPK���� ON ����
(������ȣ  ASC);



ALTER TABLE ����
	ADD CONSTRAINT  XPK���� PRIMARY KEY (������ȣ);



CREATE TABLE ����
(
	�ð�                  CHAR(18)  NULL ,
	���ǹ�ȣ              CHAR(18)  NOT NULL ,
	���Ǹ�                CHAR(18)  NULL ,
	�ο���                CHAR(18)  NULL 
);



CREATE UNIQUE INDEX XPK���� ON ����
(���ǹ�ȣ  ASC);



ALTER TABLE ����
	ADD CONSTRAINT  XPK���� PRIMARY KEY (���ǹ�ȣ);



CREATE TABLE ���п���
(
	�������              CHAR(18)  NULL ,
	�л���ȣ              CHAR(18)  NOT NULL ,
	������ȣ              CHAR(18)  NULL ,
	������              CHAR(18)  NULL ,
	�����о�              CHAR(18)  NULL 
);



CREATE UNIQUE INDEX XPK���п��� ON ���п���
(�л���ȣ  ASC);



ALTER TABLE ���п���
	ADD CONSTRAINT  XPK���п��� PRIMARY KEY (�л���ȣ);



CREATE TABLE ����
(
	���ø�                CHAR(18)  NULL ,
	���ù�ȣ              CHAR(18)  NOT NULL 
);



CREATE UNIQUE INDEX XPK���� ON ����
(���ù�ȣ  ASC);



ALTER TABLE ����
	ADD CONSTRAINT  XPK���� PRIMARY KEY (���ù�ȣ);



CREATE TABLE ��������
(
	�����ڵ�              CHAR(18)  NOT NULL ,
	�л���ȣ              CHAR(18)  NOT NULL ,
	�̼�����              CHAR(18)  NULL ,
	�̼�����              CHAR(18)  NULL 
);



CREATE UNIQUE INDEX XPK�������� ON ��������
(�����ڵ�  ASC,�л���ȣ  ASC);



ALTER TABLE ��������
	ADD CONSTRAINT  XPK�������� PRIMARY KEY (�����ڵ�,�л���ȣ);



CREATE TABLE �а�
(
	�а���ȭ��ȣ          CHAR(18)  NULL ,
	�а���ȣ              CHAR(18)  NOT NULL ,
	�а���                CHAR(18)  NULL 
);



CREATE UNIQUE INDEX XPK�а� ON �а�
(�а���ȣ  ASC);



ALTER TABLE �а�
	ADD CONSTRAINT  XPK�а� PRIMARY KEY (�а���ȣ);



CREATE TABLE �л�
(
	����                  CHAR(18)  NULL ,
	����⵵              CHAR(18)  NULL ,
	����                  CHAR(18)  NULL ,
	�л���ȣ              CHAR(18)  NOT NULL ,
	���_���ù�ȣ         CHAR(18)  NOT NULL ,
	����_���ù�ȣ         CHAR(18)  NOT NULL ,
	���_���ø�           CHAR(18)  NULL ,
	����_���ø�           CHAR(18)  NULL 
);



CREATE UNIQUE INDEX XPK�л� ON �л�
(�л���ȣ  ASC);



ALTER TABLE �л�
	ADD CONSTRAINT  XPK�л� PRIMARY KEY (�л���ȣ);



ALTER TABLE ����
	ADD (CONSTRAINT  R_55 FOREIGN KEY (������ȣ) REFERENCES ����(������ȣ));



ALTER TABLE ����_�ð�
	ADD (CONSTRAINT  R_173 FOREIGN KEY (�����ڵ�) REFERENCES ����(�����ڵ�));



ALTER TABLE ����_�ð�
	ADD (CONSTRAINT  R_182 FOREIGN KEY (���ǹ�ȣ) REFERENCES ����(���ǹ�ȣ));



ALTER TABLE ����
	ADD (CONSTRAINT  R_34 FOREIGN KEY (�а���ȣ) REFERENCES �а�(�а���ȣ));



ALTER TABLE ����
	ADD (CONSTRAINT  R_54 FOREIGN KEY (���_���ù�ȣ) REFERENCES ����(���ù�ȣ));



ALTER TABLE ���п���
	ADD (CONSTRAINT  R_102 FOREIGN KEY (�л���ȣ) REFERENCES �л�(�л���ȣ));



ALTER TABLE ���п���
	ADD (CONSTRAINT  R_28 FOREIGN KEY (������ȣ) REFERENCES ����(������ȣ) ON DELETE SET NULL);



ALTER TABLE ��������
	ADD (CONSTRAINT  ���� FOREIGN KEY (�����ڵ�) REFERENCES ����(�����ڵ�));



ALTER TABLE ��������
	ADD (CONSTRAINT  R_101 FOREIGN KEY (�л���ȣ) REFERENCES �л�(�л���ȣ));



ALTER TABLE �л�
	ADD (CONSTRAINT  R_22 FOREIGN KEY (���_���ù�ȣ) REFERENCES ����(���ù�ȣ));



ALTER TABLE �л�
	ADD (CONSTRAINT  R_23 FOREIGN KEY (����_���ù�ȣ) REFERENCES ����(���ù�ȣ));



CREATE  TRIGGER tI_���� BEFORE INSERT ON ���� for each row
-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
-- INSERT trigger on ���� 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
    /* ���� ?�� ���� on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="0000ef3e", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="����"
    P2C_VERB_PHRASE="R/55", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_55", FK_COLUMNS="������ȣ" */
    SELECT count(*) INTO NUMROWS
      FROM ����
      WHERE
        /* %JoinFKPK(:%New,����," = "," AND") */
        :new.������ȣ = ����.������ȣ;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert ���� because ���� does not exist.'
      );
    END IF;


-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
END;
/

CREATE  TRIGGER tD_���� AFTER DELETE ON ���� for each row
-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
-- DELETE trigger on ���� 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
    /* ����  �̼����� on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="0002d264", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="�̼�����"
    P2C_VERB_PHRASE="R/99", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_99", FK_COLUMNS="�����ڵ�" */
    SELECT count(*) INTO NUMROWS
      FROM �̼�����
      WHERE
        /*  %JoinFKPK(�̼�����,:%Old," = "," AND") */
        �̼�����.�����ڵ� = :old.�����ڵ�;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete ���� because �̼����� exists.'
      );
    END IF;

    /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
    /* ���� ��? ��?���� on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="��?����"
    P2C_VERB_PHRASE="��?", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="��?", FK_COLUMNS="�����ڵ�" */
    SELECT count(*) INTO NUMROWS
      FROM ��?����
      WHERE
        /*  %JoinFKPK(��?����,:%Old," = "," AND") */
        ��?����.�����ڵ� = :old.�����ڵ�;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete ���� because ��?���� exists.'
      );
    END IF;

    /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
    /* ����  ����_�ð� on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="����_�ð�"
    P2C_VERB_PHRASE="R/173", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_173", FK_COLUMNS="�����ڵ�" */
    SELECT count(*) INTO NUMROWS
      FROM ����_�ð�
      WHERE
        /*  %JoinFKPK(����_�ð�,:%Old," = "," AND") */
        ����_�ð�.�����ڵ� = :old.�����ڵ�;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete ���� because ����_�ð� exists.'
      );
    END IF;


-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
END;
/

CREATE  TRIGGER tU_���� AFTER UPDATE ON ���� for each row
-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
-- UPDATE trigger on ���� 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
  /* ����  �̼����� on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="00044c12", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="�̼�����"
    P2C_VERB_PHRASE="R/99", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_99", FK_COLUMNS="�����ڵ�" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.�����ڵ� <> :new.�����ڵ�
  THEN
    SELECT count(*) INTO NUMROWS
      FROM �̼�����
      WHERE
        /*  %JoinFKPK(�̼�����,:%Old," = "," AND") */
        �̼�����.�����ڵ� = :old.�����ڵ�;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update ���� because �̼����� exists.'
      );
    END IF;
  END IF;

  /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
  /* ���� ��? ��?���� on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="��?����"
    P2C_VERB_PHRASE="��?", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="��?", FK_COLUMNS="�����ڵ�" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.�����ڵ� <> :new.�����ڵ�
  THEN
    SELECT count(*) INTO NUMROWS
      FROM ��?����
      WHERE
        /*  %JoinFKPK(��?����,:%Old," = "," AND") */
        ��?����.�����ڵ� = :old.�����ڵ�;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update ���� because ��?���� exists.'
      );
    END IF;
  END IF;

  /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
  /* ����  ����_�ð� on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="����_�ð�"
    P2C_VERB_PHRASE="R/173", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_173", FK_COLUMNS="�����ڵ�" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.�����ڵ� <> :new.�����ڵ�
  THEN
    SELECT count(*) INTO NUMROWS
      FROM ����_�ð�
      WHERE
        /*  %JoinFKPK(����_�ð�,:%Old," = "," AND") */
        ����_�ð�.�����ڵ� = :old.�����ڵ�;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update ���� because ����_�ð� exists.'
      );
    END IF;
  END IF;

  /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
  /* ���� ?�� ���� on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="����"
    P2C_VERB_PHRASE="R/55", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_55", FK_COLUMNS="������ȣ" */
  SELECT count(*) INTO NUMROWS
    FROM ����
    WHERE
      /* %JoinFKPK(:%New,����," = "," AND") */
      :new.������ȣ = ����.������ȣ;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update ���� because ���� does not exist.'
    );
  END IF;


-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
END;
/


CREATE  TRIGGER tI_����_�ð� BEFORE INSERT ON ����_�ð� for each row
-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
-- INSERT trigger on ����_�ð� 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
    /* ����  ����_�ð� on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="0001f4cb", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="����_�ð�"
    P2C_VERB_PHRASE="R/173", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_173", FK_COLUMNS="�����ڵ�" */
    SELECT count(*) INTO NUMROWS
      FROM ����
      WHERE
        /* %JoinFKPK(:%New,����," = "," AND") */
        :new.�����ڵ� = ����.�����ڵ�;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert ����_�ð� because ���� does not exist.'
      );
    END IF;

    /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
    /* ����  ����_�ð� on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="����_�ð�"
    P2C_VERB_PHRASE="R/182", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_182", FK_COLUMNS="���ǹ�ȣ" */
    SELECT count(*) INTO NUMROWS
      FROM ����
      WHERE
        /* %JoinFKPK(:%New,����," = "," AND") */
        :new.���ǹ�ȣ = ����.���ǹ�ȣ;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert ����_�ð� because ���� does not exist.'
      );
    END IF;


-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
END;
/

CREATE  TRIGGER tU_����_�ð� AFTER UPDATE ON ����_�ð� for each row
-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
-- UPDATE trigger on ����_�ð� 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
  /* ����  ����_�ð� on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="0001fb85", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="����_�ð�"
    P2C_VERB_PHRASE="R/173", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_173", FK_COLUMNS="�����ڵ�" */
  SELECT count(*) INTO NUMROWS
    FROM ����
    WHERE
      /* %JoinFKPK(:%New,����," = "," AND") */
      :new.�����ڵ� = ����.�����ڵ�;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update ����_�ð� because ���� does not exist.'
    );
  END IF;

  /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
  /* ����  ����_�ð� on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="����_�ð�"
    P2C_VERB_PHRASE="R/182", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_182", FK_COLUMNS="���ǹ�ȣ" */
  SELECT count(*) INTO NUMROWS
    FROM ����
    WHERE
      /* %JoinFKPK(:%New,����," = "," AND") */
      :new.���ǹ�ȣ = ����.���ǹ�ȣ;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update ����_�ð� because ���� does not exist.'
    );
  END IF;


-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
END;
/


CREATE  TRIGGER tI_���� BEFORE INSERT ON ���� for each row
-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
-- INSERT trigger on ���� 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
    /* �а�  ���� on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="0001ec8c", PARENT_OWNER="", PARENT_TABLE="�а�"
    CHILD_OWNER="", CHILD_TABLE="����"
    P2C_VERB_PHRASE="R/34", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_34", FK_COLUMNS="�а���ȣ" */
    SELECT count(*) INTO NUMROWS
      FROM �а�
      WHERE
        /* %JoinFKPK(:%New,�а�," = "," AND") */
        :new.�а���ȣ = �а�.�а���ȣ;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert ���� because �а� does not exist.'
      );
    END IF;

    /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
    /* ���� ��� ���� on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="����"
    P2C_VERB_PHRASE="R/54", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_54", FK_COLUMNS="���_���ù�ȣ" */
    SELECT count(*) INTO NUMROWS
      FROM ����
      WHERE
        /* %JoinFKPK(:%New,����," = "," AND") */
        :new.���_���ù�ȣ = ����.���ù�ȣ;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert ���� because ���� does not exist.'
      );
    END IF;


-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
END;
/

CREATE  TRIGGER tD_���� AFTER DELETE ON ���� for each row
-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
-- DELETE trigger on ���� 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
    /* ���� ?�� ���� on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="0001acb5", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="����"
    P2C_VERB_PHRASE="R/55", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_55", FK_COLUMNS="������ȣ" */
    SELECT count(*) INTO NUMROWS
      FROM ����
      WHERE
        /*  %JoinFKPK(����,:%Old," = "," AND") */
        ����.������ȣ = :old.������ȣ;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete ���� because ���� exists.'
      );
    END IF;

    /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
    /* ���� ���� ���п��� on parent delete set null */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="���п���"
    P2C_VERB_PHRASE="R/28", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_28", FK_COLUMNS="������ȣ" */
    UPDATE ���п���
      SET
        /* %SetFK(���п���,NULL) */
        ���п���.������ȣ = NULL
      WHERE
        /* %JoinFKPK(���п���,:%Old," = "," AND") */
        ���п���.������ȣ = :old.������ȣ;


-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
END;
/

CREATE  TRIGGER tU_���� AFTER UPDATE ON ���� for each row
-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
-- UPDATE trigger on ���� 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
  /* ���� ?�� ���� on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="0003e9ce", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="����"
    P2C_VERB_PHRASE="R/55", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_55", FK_COLUMNS="������ȣ" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.������ȣ <> :new.������ȣ
  THEN
    SELECT count(*) INTO NUMROWS
      FROM ����
      WHERE
        /*  %JoinFKPK(����,:%Old," = "," AND") */
        ����.������ȣ = :old.������ȣ;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update ���� because ���� exists.'
      );
    END IF;
  END IF;

  /* ���� ���� ���п��� on parent update set null */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="���п���"
    P2C_VERB_PHRASE="R/28", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_28", FK_COLUMNS="������ȣ" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.������ȣ <> :new.������ȣ
  THEN
    UPDATE ���п���
      SET
        /* %SetFK(���п���,NULL) */
        ���п���.������ȣ = NULL
      WHERE
        /* %JoinFKPK(���п���,:%Old," = ",",") */
        ���п���.������ȣ = :old.������ȣ;
  END IF;

  /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
  /* �а�  ���� on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="�а�"
    CHILD_OWNER="", CHILD_TABLE="����"
    P2C_VERB_PHRASE="R/34", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_34", FK_COLUMNS="�а���ȣ" */
  SELECT count(*) INTO NUMROWS
    FROM �а�
    WHERE
      /* %JoinFKPK(:%New,�а�," = "," AND") */
      :new.�а���ȣ = �а�.�а���ȣ;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update ���� because �а� does not exist.'
    );
  END IF;

  /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
  /* ���� ��� ���� on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="����"
    P2C_VERB_PHRASE="R/54", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_54", FK_COLUMNS="���_���ù�ȣ" */
  SELECT count(*) INTO NUMROWS
    FROM ����
    WHERE
      /* %JoinFKPK(:%New,����," = "," AND") */
      :new.���_���ù�ȣ = ����.���ù�ȣ;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update ���� because ���� does not exist.'
    );
  END IF;


-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
END;
/


CREATE  TRIGGER tD_���� AFTER DELETE ON ���� for each row
-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
-- DELETE trigger on ���� 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
    /* ����  ����_�ð� on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="0000d889", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="����_�ð�"
    P2C_VERB_PHRASE="R/182", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_182", FK_COLUMNS="���ǹ�ȣ" */
    SELECT count(*) INTO NUMROWS
      FROM ����_�ð�
      WHERE
        /*  %JoinFKPK(����_�ð�,:%Old," = "," AND") */
        ����_�ð�.���ǹ�ȣ = :old.���ǹ�ȣ;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete ���� because ����_�ð� exists.'
      );
    END IF;


-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
END;
/

CREATE  TRIGGER tU_���� AFTER UPDATE ON ���� for each row
-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
-- UPDATE trigger on ���� 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
  /* ����  ����_�ð� on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="00010915", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="����_�ð�"
    P2C_VERB_PHRASE="R/182", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_182", FK_COLUMNS="���ǹ�ȣ" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.���ǹ�ȣ <> :new.���ǹ�ȣ
  THEN
    SELECT count(*) INTO NUMROWS
      FROM ����_�ð�
      WHERE
        /*  %JoinFKPK(����_�ð�,:%Old," = "," AND") */
        ����_�ð�.���ǹ�ȣ = :old.���ǹ�ȣ;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update ���� because ����_�ð� exists.'
      );
    END IF;
  END IF;


-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
END;
/


CREATE  TRIGGER tI_���п��� BEFORE INSERT ON ���п��� for each row
-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
-- INSERT trigger on ���п��� 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
    /* ���� ���� ���п��� on child insert set null */
    /* ERWIN_RELATION:CHECKSUM="0001fed1", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="���п���"
    P2C_VERB_PHRASE="R/28", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_28", FK_COLUMNS="������ȣ" */
    UPDATE ���п���
      SET
        /* %SetFK(���п���,NULL) */
        ���п���.������ȣ = NULL
      WHERE
        NOT EXISTS (
          SELECT * FROM ����
            WHERE
              /* %JoinFKPK(:%New,����," = "," AND") */
              :new.������ȣ = ����.������ȣ
        ) 
        /* %JoinPKPK(���п���,:%New," = "," AND") */
         and ���п���.�л���ȣ = :new.�л���ȣ;

    /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
    /* �л�  ���п��� on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="�л�"
    CHILD_OWNER="", CHILD_TABLE="���п���"
    P2C_VERB_PHRASE="R/102", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_102", FK_COLUMNS="�л���ȣ" */
    SELECT count(*) INTO NUMROWS
      FROM �л�
      WHERE
        /* %JoinFKPK(:%New,�л�," = "," AND") */
        :new.�л���ȣ = �л�.�л���ȣ;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert ���п��� because �л� does not exist.'
      );
    END IF;


-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
END;
/

CREATE  TRIGGER tU_���п��� AFTER UPDATE ON ���п��� for each row
-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
-- UPDATE trigger on ���п��� 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
  /* ���� ���� ���п��� on child update no action */
  /* ERWIN_RELATION:CHECKSUM="0001fd85", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="���п���"
    P2C_VERB_PHRASE="R/28", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_28", FK_COLUMNS="������ȣ" */
  SELECT count(*) INTO NUMROWS
    FROM ����
    WHERE
      /* %JoinFKPK(:%New,����," = "," AND") */
      :new.������ȣ = ����.������ȣ;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    :new.������ȣ IS NOT NULL AND
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update ���п��� because ���� does not exist.'
    );
  END IF;

  /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
  /* �л�  ���п��� on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="�л�"
    CHILD_OWNER="", CHILD_TABLE="���п���"
    P2C_VERB_PHRASE="R/102", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_102", FK_COLUMNS="�л���ȣ" */
  SELECT count(*) INTO NUMROWS
    FROM �л�
    WHERE
      /* %JoinFKPK(:%New,�л�," = "," AND") */
      :new.�л���ȣ = �л�.�л���ȣ;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update ���п��� because �л� does not exist.'
    );
  END IF;


-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
END;
/


CREATE  TRIGGER tD_���� AFTER DELETE ON ���� for each row
-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
-- DELETE trigger on ���� 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
    /* ���� ��� �л� on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="0002b7bf", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="�л�"
    P2C_VERB_PHRASE="R/22", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_22", FK_COLUMNS="���_���ù�ȣ" */
    SELECT count(*) INTO NUMROWS
      FROM �л�
      WHERE
        /*  %JoinFKPK(�л�,:%Old," = "," AND") */
        �л�.���_���ù�ȣ = :old.���ù�ȣ;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete ���� because �л� exists.'
      );
    END IF;

    /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
    /* ���� ���� �л� on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="�л�"
    P2C_VERB_PHRASE="R/23", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_23", FK_COLUMNS="����_���ù�ȣ" */
    SELECT count(*) INTO NUMROWS
      FROM �л�
      WHERE
        /*  %JoinFKPK(�л�,:%Old," = "," AND") */
        �л�.����_���ù�ȣ = :old.���ù�ȣ;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete ���� because �л� exists.'
      );
    END IF;

    /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
    /* ���� ��� ���� on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="����"
    P2C_VERB_PHRASE="R/54", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_54", FK_COLUMNS="���_���ù�ȣ" */
    SELECT count(*) INTO NUMROWS
      FROM ����
      WHERE
        /*  %JoinFKPK(����,:%Old," = "," AND") */
        ����.���_���ù�ȣ = :old.���ù�ȣ;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete ���� because ���� exists.'
      );
    END IF;


-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
END;
/

CREATE  TRIGGER tU_���� AFTER UPDATE ON ���� for each row
-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
-- UPDATE trigger on ���� 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
  /* ���� ��� �л� on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="000312b2", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="�л�"
    P2C_VERB_PHRASE="R/22", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_22", FK_COLUMNS="���_���ù�ȣ" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.���ù�ȣ <> :new.���ù�ȣ
  THEN
    SELECT count(*) INTO NUMROWS
      FROM �л�
      WHERE
        /*  %JoinFKPK(�л�,:%Old," = "," AND") */
        �л�.���_���ù�ȣ = :old.���ù�ȣ;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update ���� because �л� exists.'
      );
    END IF;
  END IF;

  /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
  /* ���� ���� �л� on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="�л�"
    P2C_VERB_PHRASE="R/23", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_23", FK_COLUMNS="����_���ù�ȣ" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.���ù�ȣ <> :new.���ù�ȣ
  THEN
    SELECT count(*) INTO NUMROWS
      FROM �л�
      WHERE
        /*  %JoinFKPK(�л�,:%Old," = "," AND") */
        �л�.����_���ù�ȣ = :old.���ù�ȣ;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update ���� because �л� exists.'
      );
    END IF;
  END IF;

  /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
  /* ���� ��� ���� on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="����"
    P2C_VERB_PHRASE="R/54", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_54", FK_COLUMNS="���_���ù�ȣ" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.���ù�ȣ <> :new.���ù�ȣ
  THEN
    SELECT count(*) INTO NUMROWS
      FROM ����
      WHERE
        /*  %JoinFKPK(����,:%Old," = "," AND") */
        ����.���_���ù�ȣ = :old.���ù�ȣ;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update ���� because ���� exists.'
      );
    END IF;
  END IF;


-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
END;
/


CREATE  TRIGGER tI_�������� BEFORE INSERT ON �������� for each row
-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
-- INSERT trigger on �������� 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
    /* ���� ��? ��?���� on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="0001f0ed", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="��?����"
    P2C_VERB_PHRASE="��?", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="��?", FK_COLUMNS="�����ڵ�" */
    SELECT count(*) INTO NUMROWS
      FROM ����
      WHERE
        /* %JoinFKPK(:%New,����," = "," AND") */
        :new.�����ڵ� = ����.�����ڵ�;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert ��?���� because ���� does not exist.'
      );
    END IF;

    /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
    /* �л�  ��?���� on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="�л�"
    CHILD_OWNER="", CHILD_TABLE="��?����"
    P2C_VERB_PHRASE="R/101", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_101", FK_COLUMNS="�л���ȣ" */
    SELECT count(*) INTO NUMROWS
      FROM �л�
      WHERE
        /* %JoinFKPK(:%New,�л�," = "," AND") */
        :new.�л���ȣ = �л�.�л���ȣ;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert ��?���� because �л� does not exist.'
      );
    END IF;


-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
END;
/

CREATE  TRIGGER tU_�������� AFTER UPDATE ON �������� for each row
-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
-- UPDATE trigger on �������� 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
  /* ���� ��? ��?���� on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="0001ee3b", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="��?����"
    P2C_VERB_PHRASE="��?", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="��?", FK_COLUMNS="�����ڵ�" */
  SELECT count(*) INTO NUMROWS
    FROM ����
    WHERE
      /* %JoinFKPK(:%New,����," = "," AND") */
      :new.�����ڵ� = ����.�����ڵ�;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update ��?���� because ���� does not exist.'
    );
  END IF;

  /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
  /* �л�  ��?���� on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="�л�"
    CHILD_OWNER="", CHILD_TABLE="��?����"
    P2C_VERB_PHRASE="R/101", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_101", FK_COLUMNS="�л���ȣ" */
  SELECT count(*) INTO NUMROWS
    FROM �л�
    WHERE
      /* %JoinFKPK(:%New,�л�," = "," AND") */
      :new.�л���ȣ = �л�.�л���ȣ;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update ��?���� because �л� does not exist.'
    );
  END IF;


-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
END;
/


CREATE  TRIGGER tD_�а� AFTER DELETE ON �а� for each row
-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
-- DELETE trigger on �а� 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
    /* �а�  ���� on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="0000c935", PARENT_OWNER="", PARENT_TABLE="�а�"
    CHILD_OWNER="", CHILD_TABLE="����"
    P2C_VERB_PHRASE="R/34", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_34", FK_COLUMNS="�а���ȣ" */
    SELECT count(*) INTO NUMROWS
      FROM ����
      WHERE
        /*  %JoinFKPK(����,:%Old," = "," AND") */
        ����.�а���ȣ = :old.�а���ȣ;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete �а� because ���� exists.'
      );
    END IF;


-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
END;
/

CREATE  TRIGGER tU_�а� AFTER UPDATE ON �а� for each row
-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
-- UPDATE trigger on �а� 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
  /* �а�  ���� on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="0000fd56", PARENT_OWNER="", PARENT_TABLE="�а�"
    CHILD_OWNER="", CHILD_TABLE="����"
    P2C_VERB_PHRASE="R/34", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_34", FK_COLUMNS="�а���ȣ" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.�а���ȣ <> :new.�а���ȣ
  THEN
    SELECT count(*) INTO NUMROWS
      FROM ����
      WHERE
        /*  %JoinFKPK(����,:%Old," = "," AND") */
        ����.�а���ȣ = :old.�а���ȣ;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update �а� because ���� exists.'
      );
    END IF;
  END IF;


-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
END;
/


CREATE  TRIGGER tI_�л� BEFORE INSERT ON �л� for each row
-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
-- INSERT trigger on �л� 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
    /* ���� ��� �л� on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="0001f547", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="�л�"
    P2C_VERB_PHRASE="R/22", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_22", FK_COLUMNS="���_���ù�ȣ" */
    SELECT count(*) INTO NUMROWS
      FROM ����
      WHERE
        /* %JoinFKPK(:%New,����," = "," AND") */
        :new.���_���ù�ȣ = ����.���ù�ȣ;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert �л� because ���� does not exist.'
      );
    END IF;

    /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
    /* ���� ���� �л� on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="�л�"
    P2C_VERB_PHRASE="R/23", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_23", FK_COLUMNS="����_���ù�ȣ" */
    SELECT count(*) INTO NUMROWS
      FROM ����
      WHERE
        /* %JoinFKPK(:%New,����," = "," AND") */
        :new.����_���ù�ȣ = ����.���ù�ȣ;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert �л� because ���� does not exist.'
      );
    END IF;


-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
END;
/

CREATE  TRIGGER tD_�л� AFTER DELETE ON �л� for each row
-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
-- DELETE trigger on �л� 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
    /* �л� �̼� �̼����� on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="0002c5ca", PARENT_OWNER="", PARENT_TABLE="�л�"
    CHILD_OWNER="", CHILD_TABLE="�̼�����"
    P2C_VERB_PHRASE="�̼�", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="�̼�", FK_COLUMNS="�л���ȣ" */
    SELECT count(*) INTO NUMROWS
      FROM �̼�����
      WHERE
        /*  %JoinFKPK(�̼�����,:%Old," = "," AND") */
        �̼�����.�л���ȣ = :old.�л���ȣ;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete �л� because �̼����� exists.'
      );
    END IF;

    /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
    /* �л�  ��?���� on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="�л�"
    CHILD_OWNER="", CHILD_TABLE="��?����"
    P2C_VERB_PHRASE="R/101", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_101", FK_COLUMNS="�л���ȣ" */
    SELECT count(*) INTO NUMROWS
      FROM ��?����
      WHERE
        /*  %JoinFKPK(��?����,:%Old," = "," AND") */
        ��?����.�л���ȣ = :old.�л���ȣ;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete �л� because ��?���� exists.'
      );
    END IF;

    /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
    /* �л�  ���п��� on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="�л�"
    CHILD_OWNER="", CHILD_TABLE="���п���"
    P2C_VERB_PHRASE="R/102", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_102", FK_COLUMNS="�л���ȣ" */
    SELECT count(*) INTO NUMROWS
      FROM ���п���
      WHERE
        /*  %JoinFKPK(���п���,:%Old," = "," AND") */
        ���п���.�л���ȣ = :old.�л���ȣ;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete �л� because ���п��� exists.'
      );
    END IF;


-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
END;
/

CREATE  TRIGGER tU_�л� AFTER UPDATE ON �л� for each row
-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
-- UPDATE trigger on �л� 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
  /* �л� �̼� �̼����� on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="00054af5", PARENT_OWNER="", PARENT_TABLE="�л�"
    CHILD_OWNER="", CHILD_TABLE="�̼�����"
    P2C_VERB_PHRASE="�̼�", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="�̼�", FK_COLUMNS="�л���ȣ" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.�л���ȣ <> :new.�л���ȣ
  THEN
    SELECT count(*) INTO NUMROWS
      FROM �̼�����
      WHERE
        /*  %JoinFKPK(�̼�����,:%Old," = "," AND") */
        �̼�����.�л���ȣ = :old.�л���ȣ;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update �л� because �̼����� exists.'
      );
    END IF;
  END IF;

  /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
  /* �л�  ��?���� on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="�л�"
    CHILD_OWNER="", CHILD_TABLE="��?����"
    P2C_VERB_PHRASE="R/101", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_101", FK_COLUMNS="�л���ȣ" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.�л���ȣ <> :new.�л���ȣ
  THEN
    SELECT count(*) INTO NUMROWS
      FROM ��?����
      WHERE
        /*  %JoinFKPK(��?����,:%Old," = "," AND") */
        ��?����.�л���ȣ = :old.�л���ȣ;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update �л� because ��?���� exists.'
      );
    END IF;
  END IF;

  /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
  /* �л�  ���п��� on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="�л�"
    CHILD_OWNER="", CHILD_TABLE="���п���"
    P2C_VERB_PHRASE="R/102", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_102", FK_COLUMNS="�л���ȣ" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.�л���ȣ <> :new.�л���ȣ
  THEN
    SELECT count(*) INTO NUMROWS
      FROM ���п���
      WHERE
        /*  %JoinFKPK(���п���,:%Old," = "," AND") */
        ���п���.�л���ȣ = :old.�л���ȣ;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update �л� because ���п��� exists.'
      );
    END IF;
  END IF;

  /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
  /* ���� ��� �л� on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="�л�"
    P2C_VERB_PHRASE="R/22", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_22", FK_COLUMNS="���_���ù�ȣ" */
  SELECT count(*) INTO NUMROWS
    FROM ����
    WHERE
      /* %JoinFKPK(:%New,����," = "," AND") */
      :new.���_���ù�ȣ = ����.���ù�ȣ;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update �л� because ���� does not exist.'
    );
  END IF;

  /* ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21 */
  /* ���� ���� �л� on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="����"
    CHILD_OWNER="", CHILD_TABLE="�л�"
    P2C_VERB_PHRASE="R/23", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_23", FK_COLUMNS="����_���ù�ȣ" */
  SELECT count(*) INTO NUMROWS
    FROM ����
    WHERE
      /* %JoinFKPK(:%New,����," = "," AND") */
      :new.����_���ù�ȣ = ����.���ù�ȣ;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update �л� because ���� does not exist.'
    );
  END IF;


-- ERwin Builtin 2021�� 12�� 4�� ����� ���� 12:07:21
END;
/

