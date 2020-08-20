package kr.co.mlec.form;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/form")
@Controller
public class MemberController {
//	@RequestMapping("/form/joinForm.do")

	@RequestMapping("/joinForm.do")
//	public void joinForm() {
//	}
	public String joinForm() {
		return "form/joinForm";
	}
	
//	@RequestMapping("/form/join.do")
	@RequestMapping("/join.do")
//최종버전
	public String join(@ModelAttribute("member") MemberVO member) {
		System.out.println(member);
		return "form/memberInfo";
	}
	
/*//	public ModelAndView join(@RequestParam("id")String id, @RequestParam("password")String password, 
//					   @RequestParam("name")String name, HttpServletRequest request) {
	public ModelAndView join(MemberVO member) {
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		
		
		MemberVO member = new MemberVO();
		member.setId(id);
		member.setName(name);
		member.setPassword(password);
		
		 1. request 영역에 직접 등록한다 
		ModelAndView mav = new ModelAndView();
		mav.setViewName("form/memberInfo");
//		ModelAndView mav = new ModelAndView("form/memberInfo");
		mav.addObject("member",member);
//		request.setAttribute("member", member);
//		return "form/memberInfo";
		return mav;
	}
*/
}
