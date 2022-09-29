package com.spring.proj.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.proj.domain.MemberVO;
@Repository
public class MemberDAOMybatis {

	@Autowired
	SqlSessionTemplate mybatis;

	// 글 등록(insert문)
	public void insertMember(MemberVO vo) {

		mybatis.insert("Member.insertMember", vo);

	}

	// 목록 상세 보기(select문)
	public MemberVO getMember(int m_no) {

		return mybatis.selectOne("Member.getMember", m_no);
		
	}

	// 목록보기(select문)
	public List<MemberVO> getMemberList(MemberVO vo) {

//		if (vo.getSearchCondition().equals("TITLE")) {
//			return mybatis.selectList("Board.getBoardList_T", vo);
//		} else if (vo.getSearchCondition().equals("CONTENT")) {
//			return mybatis.selectList("Board.getBoardList_C", vo);
//		}else {
//			return mybatis.selectList("Board.getBoardList_T", vo);
//		}
		
		return mybatis.selectList("Member.getMemberList", vo);
	}

	// 글 수정(update문)
	public void updateMember(MemberVO vo) {

		System.out.println(vo);
		
		mybatis.update("Member.updateMember", vo);

	}

	// 글 삭제(delete문)
	public void deleteMember(int m_no) {
		
		
		
		mybatis.delete("Member.deleteMember", m_no);

	}

	
	
	
	
}
