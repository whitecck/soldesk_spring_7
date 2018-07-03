package org.soldesk.control;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soldesk.DAO.CustomerDAOImpl;
import org.soldesk.DAO.CustomerService;
import org.soldesk.DAO.SellerService;
import org.soldesk.DTO.CustomerDTO;
import org.soldesk.DTO.SellerDTO;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	SellerService ss;

	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/loginOk", method = RequestMethod.GET)
	public ModelAndView loginOk(@RequestParam String id, @RequestParam String pw, @RequestParam String type,
			HttpSession session, @ModelAttribute CustomerDTO dto, @ModelAttribute SellerDTO sdto) {

		ModelAndView mv = new ModelAndView();
		// System.out.println(result);
		System.out.println(type);
		System.out.println(id);
		System.out.println(pw);
		System.out.println(type);
		// System.out.println(srs);
		boolean result = cs.loginCheck(id, pw);
		boolean srs = cs.selloginCheck(id, pw);
		System.out.println("result : " + result);
		System.out.println("srs : " + srs);
		if (type.equals("a")) {
			// 일반유저
			if (result == true) {
				//System.out.println("a의 true");
				dto = cs.selectCustomer(id);
				mv.setViewName("main");
				session.setMaxInactiveInterval(60 * 60);
				session.setAttribute("list", dto);
				mv.addObject("msg", "success");

			} else {
				mv.setViewName("login");
				mv.addObject("msg", "fail");

			}

		} else if (type.equals("b")) {
			if (srs == true) {
				//System.out.println("b의 true");
				sdto = cs.sellserCustomer(id);
				mv.setViewName("selmain");
				session.setMaxInactiveInterval(60 * 60);
				session.setAttribute("sellist", sdto);
				mv.addObject("msg", "success");

			} else {
				mv.setViewName("login");
				mv.addObject("msg", "fail");

			}
		} else {
			mv.setViewName("login");

		}
		return mv;
	}

	@RequestMapping("/logout")
	public ModelAndView logout(HttpSession session) {
		cs.logout(session);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		mv.addObject("msg", "로그아웃");
		return mv;
	}

	@RequestMapping("/update")
	// 업데이트 페이지 이동
	public String update() {
		return "update";
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public ModelAndView CustomerUpdate(@ModelAttribute CustomerDTO dto, HttpServletRequest req, HttpSession session) {
		// 값이 안넘오 오고 있음
		ModelAndView mv = new ModelAndView();
		mv.setViewName("update");

		return mv;
	}

	@RequestMapping(value = "/updateOk", method = RequestMethod.GET)
	public String CustomerUp(@ModelAttribute CustomerDTO dto, Model model, HttpServletRequest req) {

		int c_id = Integer.parseInt(req.getParameter("c_id"));
		String c_name = req.getParameter("c_name");
		String c_phone = req.getParameter("c_phone");
		String c_pw = req.getParameter("c_pw");
		String c_email = req.getParameter("c_email");

		System.out.println(req.getParameter("c_id"));
		System.out.println(c_name);
		System.out.println(c_email);

		dto.setC_id(c_id);
		dto.setC_name(c_name);
		dto.setC_pw(c_pw);
		dto.setC_email(c_email);

		cs.customerUpdate(c_id, c_name, c_phone, c_pw, c_email, dto);
		return "main";
	}
}
