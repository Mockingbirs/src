package com.springproj.biz.service;

import java.util.List;

import com.springproj.biz.domain.UserVO;

public interface UserService {

	//CRUD 기능의 메소드 구현
	
	
	//회원 등록
	void insertService(UserVO user);
	
	//회원 상세 정보
	UserVO getService(UserVO user);
	
	
	//회원 리스트
	List<UserVO> getServiceList();
	
	
	// 회원 정보 수정
	void updateService(UserVO user);
	
	// 회원 탈퇴
	void deleteService(String id);
	
	
	
}
