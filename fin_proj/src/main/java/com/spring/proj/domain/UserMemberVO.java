package com.spring.proj.domain;

import java.util.Date;

public class UserMemberVO {
	
	private String um_mid;		
	private String um_ars;		
	private int um_grade;		
	private String um_password;			
	private String um_ymd;			
	private String um_gender;			
	private int um_tel;			
	private String um_addr;			
	private String um_email;			
	private int um_emailcheck;			
	private int um_snscheck;			
	private Date um_regdate;			
	private String um_cpno;		
	private String um_msno;
	
	
	public String getUm_mid() {
		return um_mid;
	}
	public void setUm_mid(String um_mid) {
		this.um_mid = um_mid;
	}
	public String getUm_ars() {
		return um_ars;
	}
	public void setUm_ars(String um_ars) {
		this.um_ars = um_ars;
	}
	public int getUm_grade() {
		return um_grade;
	}
	public void setUm_grade(int um_grade) {
		this.um_grade = um_grade;
	}
	public String getUm_password() {
		return um_password;
	}
	public void setUm_password(String um_password) {
		this.um_password = um_password;
	}
	public String getUm_ymd() {
		return um_ymd;
	}
	public void setUm_ymd(String um_ymd) {
		this.um_ymd = um_ymd;
	}
	public String getUm_gender() {
		return um_gender;
	}
	public void setUm_gender(String um_gender) {
		this.um_gender = um_gender;
	}
	public int getUm_tel() {
		return um_tel;
	}
	public void setUm_tel(int um_tel) {
		this.um_tel = um_tel;
	}
	public String getUm_addr() {
		return um_addr;
	}
	public void setUm_addr(String um_addr) {
		this.um_addr = um_addr;
	}
	public String getUm_email() {
		return um_email;
	}
	public void setUm_email(String um_email) {
		this.um_email = um_email;
	}
	public int getUm_emailcheck() {
		return um_emailcheck;
	}
	public void setUm_emailcheck(int um_emailcheck) {
		this.um_emailcheck = um_emailcheck;
	}
	public int getUm_snscheck() {
		return um_snscheck;
	}
	public void setUm_snscheck(int um_snscheck) {
		this.um_snscheck = um_snscheck;
	}
	public Date getUm_regdate() {
		return um_regdate;
	}
	public void setUm_regdate(Date um_regdate) {
		this.um_regdate = um_regdate;
	}
	public String getUm_cpno() {
		return um_cpno;
	}
	public void setUm_cpno(String um_cpno) {
		this.um_cpno = um_cpno;
	}
	public String getUm_msno() {
		return um_msno;
	}
	public void setUm_msno(String um_msno) {
		this.um_msno = um_msno;
	}
	
	@Override
	public String toString() {
		return "UserMemberVO [um_mid=" + um_mid + ", um_ars=" + um_ars + ", um_grade=" + um_grade + ", um_password="
				+ um_password + ", um_ymd=" + um_ymd + ", um_gender=" + um_gender + ", um_tel=" + um_tel + ", um_addr="
				+ um_addr + ", um_email=" + um_email + ", um_emailcheck=" + um_emailcheck + ", um_snscheck="
				+ um_snscheck + ", um_regdate=" + um_regdate + ", um_cpno=" + um_cpno + ", um_msno=" + um_msno + "]";
	}			
	
	
	

}
