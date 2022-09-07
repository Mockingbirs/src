package com.springproj.biz.board.service;

import com.springproj.biz.board.BoardVO;
import com.springproj.biz.board.dao.BoardDAO;

public class BoardserviceImpl implements BoardService {

	private BoardDAO dao;

	public BoardserviceImpl() {

		dao = new BoardDAO();

	}

	@Override
	public void insertService(BoardVO vo) {
		// TODO Auto-generated method stub

		dao.insertBoard(vo);
	}

	@Override
	public void getService(int seq) {
		// TODO Auto-generated method stub
		dao.getBoard(seq);
	}

	@Override
	public void getServiceList() {
		// TODO Auto-generated method stub
		dao.getBoardList();
	}

	@Override
	public void updateService(BoardVO vo) {
		// TODO Auto-generated method stub
		dao.updateBoard(vo);
	}

	@Override
	public void deleteService(int seq) {
		// TODO Auto-generated method stub
		dao.deleteBoard(seq);
	}

}
