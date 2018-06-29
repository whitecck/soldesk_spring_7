package org.soldesk.control;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soldesk.DAO.CustomerDAO;
import org.soldesk.DTO.CustomerDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {

	@Inject
	CustomerDAO dao;
	
	//private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	public void setDao(CustomerDAO dao) {
		this.dao = dao;
	}

	@ModelAttribute("customer")
	public CustomerDTO customerDTO() {
		return new CustomerDTO();
	}

	@RequestMapping(value = "/memberAll")
	// 전체 조회
	public String list(Model model) {
		List<CustomerDTO> list = dao.CustomerSelectAll();
		model.addAttribute("list", list);

		return "MemberAll";
	}

	@RequestMapping("/main")
	public String goMain() {
		return "main";
	}

	@RequestMapping("/singup")
	// 회원가입 페이지 이동
	public String insertOne() {
		return "singup";
	}

	@RequestMapping("/singupOk")
	// 회원가입
	public ModelAndView insertOk(@ModelAttribute CustomerDTO CusDTO, Model model) {
		// 작동 잘됨
		ModelAndView mv = new ModelAndView("singupOk");

		mv.setViewName("singupOk");
		model.addAttribute("list", CusDTO);

		dao.CustomerInsert(CusDTO);
		return mv;
	}

	@RequestMapping("/mypage1")
	// 업데이트 및 삭제 페이지 이동
	public String CustomerUpdate(Model model) {
		return "mypage1";
	}

	@RequestMapping("/update")
	// 업데이트 페이지 이동
	public String update() {
		return "update";
	}

	@RequestMapping("/updateOk")
	public ModelAndView updateFormOk(@ModelAttribute CustomerDTO CusDTO, Model model) {
		// 계정 수정 실행
		ModelAndView mv = new ModelAndView("updateOK");

		mv.setViewName("updateOk");
		model.addAttribute("list", CusDTO);

		dao.CustomerUpdate(CusDTO);

		return mv;
	}

	@RequestMapping("/delete")
	public String delete() {
		// id 삭제 페이지 이동
		return "delete";
	}

	@RequestMapping("/deleteOk")
	// id 삭제 실행
	public String deleteOk(@RequestParam String c_id) {
		int i = Integer.parseInt(c_id);

		dao.CustomerDelete(i);

		return "deleteOk";
	}

	/*@RequestMapping("/login")
	public String login() {
		// 로긴 페이지 이동
		return "login";
	}*/

/*	@RequestMapping(value = "/loginOk", method = RequestMethod.POST)
	public ModelAndView loginOk(@ModelAttribute CustomerDTO dto, HttpSession session) {
		boolean result = service.loginCheck(dto, session);
		ModelAndView mv = new ModelAndView();
		
		if(result==true) {
			mv.setViewName("main");
			mv.addObject("msg", "eoa");
		}else {
			mv.setViewName("login");
			mv.addObject("msg", "ss");
		}
		
		return mv;

		// 로긴 페이지에 라디오 버튼 값을 가져와서 
		// 다오에서 나오는 출력값을 가지고 2개의 경우를 만들어야함 하나는 정보가 일치 했을떄
		// 테이블 안에 있는 정보를 가지고 세션에 담구는거
		// 다른 하나는 아이디가 틀리면 안된다고 메세지 띄우고 다시 로긴페이지로 넘기는방법

		model.addAttribute("id", c_loginid);
		model.addAttribute("pw", c_pw);
	}

	@RequestMapping(value = "/logout")
	public ModelAndView logout(HttpSession session) {
		// 로그인 끝어버리기
		service.logout(session);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		mv.addObject("msg", "logout");
		return mv;
	}
*/
}
