package com.spring.proj.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.proj.domain.UserMemberVO;

@Repository
public class UserMemberDAOMybatis {
	
	@Autowired
	SqlSessionTemplate mybatis;
	
	public void insertUserMember(UserMemberVO vo) {
		mybatis.insert("UserMember.insertUserMember",vo);
	}
	
}
