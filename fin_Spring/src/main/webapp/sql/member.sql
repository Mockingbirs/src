CREATE TABLE MEMBER(
m_no NUMBER(5) PRIMARY KEY,
m_id VARCHAR2(16),
m_password VARCHAR2(20),
m_name VARCHAR2(2000),
m_email VARCHAR2(2000),
m_tel VARCHAR2(2000),
m_address VARCHAR2(2000),
m_regdate date default sysdate
);


select * from MEMBER ORDER BY m_no DESC;