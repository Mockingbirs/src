package com.springproj.biz.board.service;

import com.springproj.biz.board.BoardVO;

public interface BoardService {
	// CRUD 기능 수행을 위한 메서드 호출 기능

	// 글 등록
	void insertService(BoardVO vo);
	
	// 글 목록 조회
	void getService(int seq);
	
	void getServiceList();
	
	
	// 글 수정
	void updateService(BoardVO vo);
	
	// 글 삭제
	void deleteService(int seq);
	
}