package com.springproj.biz.board.controller;

import com.springproj.biz.board.BoardVO;
import com.springproj.biz.board.service.BoardserviceImpl;

public class BoardRequestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 BoardserviceImpl service = new BoardserviceImpl(); 
		 BoardVO vo = new BoardVO();
		 /* 
		 * vo.setTitle("첫번째 게시글"); vo.setWriter("홍길동"); vo.setContent("드디어 나는 개발자.");
		 * 
		 * service.insertService(vo);
		 */
		
		service.getServiceList();
	}

}
