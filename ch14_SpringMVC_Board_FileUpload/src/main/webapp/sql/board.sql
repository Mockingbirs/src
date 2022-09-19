CREATE TABLE board(
seq NUMBER(5) PRIMARY KEY,
title VARCHAR2(200),
writer VARCHAR2(20),
content VARCHAR2(2000),
regdate date default sysdate,
cnt NUMBER(5) default 0
);


select * from BOARD ORDER BY seq DESC;