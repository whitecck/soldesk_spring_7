package org.soldesk.control;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soldesk.DAO.CustomerService;
import org.soldesk.DTO.CustomerDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ServiceContoller {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Inject
	CustomerService cs;
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "/loginOk", method = RequestMethod.GET)
	public ModelAndView loginOk(@RequestParam String id,@RequestParam String pw) {
		
		boolean result = cs.loginCheck(id , pw);
		ModelAndView mv = new ModelAndView();
		
		if(result==true) {
			mv.setViewName("main");
			mv.addObject("msg", "대여 ");
			
			return mv;
		}else {
			mv.setViewName("login");
			mv.addObject("msg", "안대여");
			
			return mv;
		}
		
	}
	
	@RequestMapping("/logout")
	public ModelAndView logout(HttpSession session) {
		cs.logout(session);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		mv.addObject("msg", "로그아웃");
		return mv;
	}
}




















