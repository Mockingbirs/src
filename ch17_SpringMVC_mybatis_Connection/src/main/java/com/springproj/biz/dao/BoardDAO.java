package com.springproj.biz.dao;

import java.util.List;

import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springproj.biz.domain.BoardVO;

@Repository("boardDAO")
public class BoardDAO extends SqlSessionDaoSupport {

	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory setSqlSessionFactory) {
		super.setSqlSessionFactory(setSqlSessionFactory);
	}

	// 글 등록(insert문)
	public void insertBoard(BoardVO vo) {

		getSqlSession().insert("Board.insertBoard", vo);

	}

	// 목록 상세 보기(select문)
	public BoardVO getBoard(int seq) {

		return getSqlSession().selectOne("Board.getBoard", seq);
		
	}

	// 목록보기(select문)
	public List<BoardVO> getBoardList(BoardVO vo) {

		if (vo.getSearchCondition().equals("TITLE")) {
			return getSqlSession().selectList("Board.getBoardList_T", vo);
		} else if (vo.getSearchCondition().equals("CONTENT")) {
			return getSqlSession().selectList("Board.getBoardList_C", vo);
		}else {
			return getSqlSession().selectList("Board.getBoardList_T", vo);
		}

	}

	// 글 수정(update문)
	public void updateBoard(BoardVO vo) {

		getSqlSession().update("Board.updateBoard", vo);

	}

	// 글 삭제(delete문)
	public void deleteBoard(int seq) {

		getSqlSession().delete("Board.deleteBoard", seq);

	}

}
