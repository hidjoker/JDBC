DROP TABLE userTB;
CREATE TABLE userTB (
    idx NUMBER CONSTRAINT PK_USERTB PRIMARY KEY,
    userid VARCHAR2(50),
    name VARCHAR2(100)
);

DROP SEQUENCE userTB_SQ;
CREATE SEQUENCE userTB_SQ;

DELETE userTB;

INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user1','蜡历1');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user2','蜡历2');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user3','蜡历3');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user4','蜡历4');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user5','蜡历5');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user6','蜡历6');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user7','蜡历7');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user8','蜡历8');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user9','蜡历9');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user10','蜡历10');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user11','蜡历11');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user12','蜡历12');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user13','蜡历13');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user14','蜡历14');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user15','蜡历15');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user16','蜡历16');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user17','蜡历17');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user18','蜡历18');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user19','蜡历19');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user20','蜡历20');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user21','蜡历21');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user22','蜡历22');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user23','蜡历23');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user24','蜡历24');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user25','蜡历25');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user26','蜡历26');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user27','蜡历27');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user28','蜡历28');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user29','蜡历29');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user30','蜡历30');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user31','蜡历31');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user32','蜡历32');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user33','蜡历33');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user34','蜡历34');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user35','蜡历35');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user36','蜡历36');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user37','蜡历37');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user38','蜡历38');
INSERT INTO userTB( idx, userid, name ) VALUES (userTB_SQ.nextval,'user39','蜡历39');

commit;

SELECT * FROM userTB;
