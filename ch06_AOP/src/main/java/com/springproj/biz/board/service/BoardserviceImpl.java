package com.springproj.biz.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproj.biz.board.BoardVO;
import com.springproj.biz.board.dao.BoardDAO;
import com.springproj.biz.common.LogAdvice;

@Service("boardService")
public class BoardserviceImpl implements BoardService {

	@Autowired
	private BoardDAO dao;
	
	@Autowired
	//private Log4jAdvice log;
	private LogAdvice log;


	@Override
	public void insertService(BoardVO vo) {
		// TODO Auto-generated method stub
		
		log.printLog(" = insertService =");
		//log.printLogging(" = insertService =");
		dao.insertBoard(vo);
	}

	@Override
	public void getService(int seq) {
		// TODO Auto-generated method stub
		
		log.printLog(" = getService =");
		
		dao.getBoard(seq);
	}

	@Override
	public void getServiceList() {
		// TODO Auto-generated method stub
		
		log.printLog(" = getService =");
		
		dao.getBoardList();
	}

	@Override
	public void updateService(BoardVO vo) {
		// TODO Auto-generated method stub
		
		log.printLog(" = updateService =");
		
		dao.updateBoard(vo);
		
	}

	@Override
	public void deleteService(int seq) {
		// TODO Auto-generated method stub
		
		log.printLog(" = deleteService =");
		
		dao.deleteBoard(seq);
	}

}
