package com.springproj.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.DefaultSessionAttributeStore;

import com.springproj.biz.domain.UserVO;
import com.springproj.biz.service.UserService;

@Controller
public class LogInOutController {

	@Autowired
	UserService userService;
	
	@GetMapping("/login.me")
	public String loginForm(@ModelAttribute("usr") UserVO vo) {
		
		//System.out.println("loginForm"); 
		
		vo.setId("test");
		vo.setPassword("test1234");
		
		return "login";
	}
	
	@PostMapping("/login.me")
	public String loginProc(UserVO user, HttpSession session) {
		
		if(user.getId() == null || user.getId().equals("")) {
			throw new IllegalArgumentException("아이디는 반드시 입력해야합니다.");
		}
		
		
		
		
		
		String reVal = null;
		//System.out.println("loginProc");
		
		// 1. user의 id 존재 여부를 db에서 가져오기.
		UserVO vo = userService.getService(user);
		
		if((vo !=null)&&vo.getPassword().equals(user.getPassword())) {
			
			session.setAttribute("userName", vo.getName());
			
			reVal = "redirect:getBoardList.do";
			
		}else {
			reVal =  "redirect:login.me";
		}
		
	
return reVal;
		
	}
	
	@RequestMapping("/logout.me" )
	public String lougoutProc(HttpSession session) {
		
		//System.out.println("로그 아웃 처리.");
		
		session.invalidate();	
		
		return "redirect:login.me";
	}
	
	
}
