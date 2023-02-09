package com.eunocompany.home1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeCotroller {
//===========================로그인 창
	@RequestMapping(value = "/login")
	public String login() {
		
		return "login";
	}
	@RequestMapping(value = "/loginOk")
	public String loginOk(HttpServletRequest request, Model model) {
		
		String memberId = request.getParameter("mid");
		String memberPw = request.getParameter("mpw");
		
		model.addAttribute("memberId", memberId);
		model.addAttribute("memberPw", memberPw);
		
		return "confirmId";
	}
	@RequestMapping(value = "/loginOk2")
	public String loginOk2(@RequestParam("mid") String memberId,@RequestParam("mpw") String memberPw, Model model) {
		
//		String memberId = request.getParameter("mid");
//		String memberPw = request.getParameter("mpw");
		
		model.addAttribute("memberId", memberId);
		model.addAttribute("memberPw", memberPw);
		
		return "confirmId";
	}
//========================================회원가입 창
	@RequestMapping(value = "/join")
	public String join() {
		

		return "join";
	}
	@RequestMapping(value = "/joinOk")
	public String joinOk(MemberDto memberDto) {
		
		return "joinOk";
	}
//==============================회원 포인트 창
	@RequestMapping(value = "/point/{memberPoint}")
	public String point(@PathVariable String memberPoint, Model model) {
		
		model.addAttribute("point", memberPoint);
		
		return "pointOutput";
	}
}
