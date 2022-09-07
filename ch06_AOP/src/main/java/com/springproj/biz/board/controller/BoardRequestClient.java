package com.springproj.biz.board.controller;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springproj.biz.board.BoardVO;
import com.springproj.biz.board.service.BoardService;

public class BoardRequestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext factory
		= new GenericXmlApplicationContext("applicationContext.xml");
		
		BoardService service 
		=(BoardService)factory.getBean("boardService");
		
		//BoardserviceImpl service = new BoardserviceImpl();
		
		
		/*
		 * BoardVO vo = new BoardVO();
		 * 
		 * vo.setTitle("첫번째 게시글"); vo.setWriter("홍길동"); vo.setContent("드디어 나는 개발자.");
		 * 
		 * service.insertService(vo);
		 */
		
		
		/*
		 * BoardVO vo2 = new BoardVO();
		 * 
		 * vo2.setTitle("게시글 수정"); vo2.setContent("드디어 나는 개발자."); vo2.setSeq(1);
		 * 
		 * service.updateService(vo2);
		 */
		
		

		
		/* service.deleteService(4); */
		
		service.getService(4);		
		
		
		
		factory.close();
		
		
		
		
		
		
	}

}
