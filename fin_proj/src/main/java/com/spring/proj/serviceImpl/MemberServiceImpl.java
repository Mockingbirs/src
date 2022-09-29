package com.spring.proj.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.proj.dao.MemberDAOMybatis;
import com.spring.proj.domain.MemberVO;
import com.spring.proj.service.MemberService;

@Service("memeberService")
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAOMybatis dao;
	
	


	@Override
	public void insertService(MemberVO vo) {
		dao.insertMember(vo);
	}

	@Override
	public MemberVO getService(int m_no) {
		MemberVO member = dao.getMember(m_no);
		return member;
	}

	@Override
	public List<MemberVO> getServiceList(MemberVO vo) {	
	 return dao.getMemberList(vo);
		
	}

	@Override
	public void updateService(MemberVO vo) {
		dao.updateMember(vo);
		
	}

	@Override
	public void deleteService(int m_no) {
		dao.deleteMember(m_no);
	}

}
