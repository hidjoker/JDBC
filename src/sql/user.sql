DROP TABLE userTB;
CREATE TABLE userTB (
    idx NUMBER CONSTRAINT PK_USERTB PRIMARY KEY,
    userid VARCHAR2(50),
    name VARCHAR2(100)
);

DROP SEQUENCE userTB_SQ;
CREATE SEQUENCE userTB_SQ;

DELETE userTB;

INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user1','����1');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user2','����2');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user3','����3');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user4','����4');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user5','����5');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user6','����6');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user7','����7');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user8','����8');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user9','����9');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user10','����10');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user11','����11');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user12','����12');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user13','����13');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user14','����14');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user15','����15');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user16','����16');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user17','����17');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user18','����18');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user19','����19');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user20','����20');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user21','����21');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user22','����22');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user23','����23');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user24','����24');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user25','����25');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user26','����26');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user27','����27');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user28','����28');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user29','����29');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user30','����30');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user31','����31');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user32','����32');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user33','����33');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user34','����34');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user35','����35');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user36','����36');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user37','����37');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user38','����38');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user39','����39');

commit;

SELECT * FROM userTB;
