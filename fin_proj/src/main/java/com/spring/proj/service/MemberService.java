package com.spring.proj.service;

import java.util.List;

import com.spring.proj.domain.MemberVO;

public interface MemberService {
	// CRUD 기능 수행을 위한 메서드 호출 기능

	// 글 등록
	void insertService(MemberVO vo);
	
	// 글 목록 조회
	MemberVO getService(int m_no);
	
	List<MemberVO> getServiceList(MemberVO vo);
	
	
	// 글 수정
	void updateService(MemberVO vo);
	
	// 글 삭제
	void deleteService(int m_no);
	
}