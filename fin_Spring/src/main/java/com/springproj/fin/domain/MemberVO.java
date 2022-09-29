package com.springproj.fin.domain;

import java.sql.Date;

public class MemberVO {
	private int m_no;
	private String m_id;
	private String m_passowrd;
	private String m_name;
	private String m_email;
	private String m_tel;
	private String m_address;
	private Date m_regdate;
	public int getM_no() {
		return m_no;
	}
	public void setM_no(int m_no) {
		this.m_no = m_no;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_passowrd() {
		return m_passowrd;
	}
	public void setM_passowrd(String m_passowrd) {
		this.m_passowrd = m_passowrd;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_email() {
		return m_email;
	}
	public void setM_email(String m_email) {
		this.m_email = m_email;
	}
	public String getM_tel() {
		return m_tel;
	}
	public void setM_tel(String m_tel) {
		this.m_tel = m_tel;
	}
	public String getM_address() {
		return m_address;
	}
	public void setM_address(String m_address) {
		this.m_address = m_address;
	}
	public Date getM_regdate() {
		return m_regdate;
	}
	public void setM_regdate(Date m_regdate) {
		this.m_regdate = m_regdate;
	}
	@Override
	public String toString() {
		
		String data = "memberVO[no="+m_no+", id="+m_id+", pw="+m_passowrd+", name ="+m_name
				+", email="+m_email+", tel="+m_tel+", addr="+m_address+", date="+m_regdate+"]";
		
		return data;
	}
	
	
	
}
