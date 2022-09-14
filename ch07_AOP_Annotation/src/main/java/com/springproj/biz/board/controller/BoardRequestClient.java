package com.springproj.biz.board.controller;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springproj.biz.board.BoardVO;
import com.springproj.biz.board.service.BoardService;

public class BoardRequestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");

		BoardService service = (BoardService) factory.getBean("boardService");

		// Spring 사용으로 인한 IoC 인스턴트 생성을 위해 주석처리
		// BoardserviceImpl service = new BoardserviceImpl();

		
		//게시글 작성
		  BoardVO vo = new BoardVO();
		  
		  vo.setTitle("오류 게시글"); vo.setWriter("김오류"); vo.setContent("드디어 나도 오류.");
		  
		 //service.insertService(vo);
		 
		
		  // beforeLog사용으로 따로 출력할 필요가 없어짐
		  // System.out.println(vo);  
		 
		
		
		
		//게시글 수정
//		  BoardVO vo2 = new BoardVO();
//		  
//		  vo2.setTitle("첫번째 게시글"); vo2.setContent("드디어 나는 개발자."); vo2.setSeq(2);
//		  
//		  service.updateService(vo2);
//		 
		
		
		
		

		
		
		//게시글 불러오기
		//BoardVO board = service.getService(1);   System.out.println(board); 
		
		
		
		//게시글 목록보기
		ArrayList<BoardVO> list = service.getServiceList();
		for(BoardVO board : list) {
			System.out.println(board);
		}
		
		
		
		
		//게시글 삭제
				// service.deleteService(4);
		

		factory.close();

	}

}
