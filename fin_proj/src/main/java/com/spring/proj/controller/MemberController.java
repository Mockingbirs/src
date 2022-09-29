package com.spring.proj.controller;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.proj.domain.MemberVO;
import com.spring.proj.service.MemberService;

@Controller
@SessionAttributes("member")
public class MemberController {

	@Autowired
	MemberService memberService;


	@GetMapping("/insertMember.do")
	public String insertMember() {
		// TODO Auto-generated method stub

		// System.out.println("insertBoardController");

		return "insertMember";
	}

	
	@PostMapping("/insertMember.do")
	public String insertMember(MemberVO member, HttpSession session) throws IOException {
		System.out.println("==>"+member);

		// 파일 업로드 처리
		/*
		 * String fileSaveFolder =
		 * session.getServletContext().getRealPath("/MemberUpload/");
		 * System.out.println("=>" + fileSaveFolder);
		 * 
		 * MultipartFile uploadFile = member.getUploadFile();
		 * 
		 * if(!uploadFile.isEmpty()) { String fileName =
		 * uploadFile.getOriginalFilename(); uploadFile.transferTo(new
		 * File(fileSaveFolder + fileName)); }
		 */
		
		
		
		memberService.insertService(member);

		return "redirect:insertMember.do";
	}

	@RequestMapping(value = "/getMember.do")
	public String getMember(MemberVO member, Model model) {

		// System.out.println("GetBoardController 처리.");

		MemberVO vo = memberService.getService(member.getM_no());

		model.addAttribute("member", vo);

		return "getMember";
	}

	//검색 조건 목록 설정
	@ModelAttribute("conditionMap")  //키값
	public Map<String, String> searchConditionMap() {
		Map<String, String> conditionMap = new HashMap<String, String>(); 
		
		conditionMap.put("아이디", "M_ID");
		conditionMap.put("주소", "M_ADDR");
		
		return conditionMap; //밸류값
		
	}
	
	
	//글 목록 검색 처리
	@RequestMapping(value = "/getMemberList.do")
	public String getMemberList(MemberVO vo, Model model) {

		// System.out.println("글 목록 검색 처리");
		
		System.out.println("검색조건 : " +vo.getSearchCondition());
		System.out.println("검색단어 : " +vo.getSearchKeyword());

		if(vo.getSearchCondition() == null) {
			vo.setSearchCondition("M_ID");
		}
		
		if(vo.getSearchKeyword() == null) {
			vo.setSearchKeyword("");
		}
		
		List<MemberVO> list = memberService.getServiceList(vo);

		model.addAttribute("memberList", list);
		
		return "getMemberList";  //servlet-context ViewResolver와 연동
	}

	@RequestMapping(value = "/updateMember.do")
	public String updateMember(@ModelAttribute("member") MemberVO member) {
		// TODO Auto-generated method stub

		
		
		memberService.updateService(member);
		
		return "redirect:getMemberList.do";

	}

	@RequestMapping(value = "/deleteMember.do")
	public String deleteBoard(MemberVO member) {
		// TODO Auto-generated method stub

		memberService.deleteService(member.getM_no());

		return "redirect:getMemberList.do";
	}

}
