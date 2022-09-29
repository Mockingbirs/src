package com.springproj.biz.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproj.biz.dao.BoardDAO;
import com.springproj.biz.dao.BoardDAOMybatis;
import com.springproj.biz.domain.BoardVO;
import com.springproj.biz.service.BoardService;

@Service("boardService")
public class BoardserviceImpl implements BoardService {

	@Autowired
	//private BoardDAO dao;
	private BoardDAOMybatis dao;
	
	//private Log4jAdvice log;
	//private LogAdvice log;


	@Override
	public void insertService(BoardVO vo) {
		// TODO Auto-generated method stub
		
		//log.printLog(" = insertService ="); 
		//log.printLogging(" = insertService =");

		/*
		if(vo.getSeq() == 0) {
			throw new IllegalArgumentException("0번 글은 등록할 수 없습니다.");
			
		}
		//*/
		dao.insertBoard(vo);
	
	}

	@Override
	public BoardVO getService(int seq) {
		// TODO Auto-generated method stub
		
		//log.printLog(" = getService =");
		
		//dao.getBoard(seq);
		BoardVO board = dao.getBoard(seq);

		
		return board;
	}

	@Override
	public List<BoardVO> getServiceList(BoardVO vo) {
		// TODO Auto-generated method stub
		
		//log.printLog(" = getService =");
		
	 return dao.getBoardList(vo);
		
	}

	@Override
	public void updateService(BoardVO vo) {
		// TODO Auto-generated method stub
		
		//log.printLog(" = updateService =");
		
		dao.updateBoard(vo);
		
	}

	@Override
	public void deleteService(int seq) {
		// TODO Auto-generated method stub
		
		//log.printLog(" = deleteService =");
		
		dao.deleteBoard(seq);
	}

}
