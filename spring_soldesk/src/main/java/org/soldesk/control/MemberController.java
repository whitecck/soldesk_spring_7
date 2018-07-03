package org.soldesk.control;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soldesk.DAO.CustomerDAO;
import org.soldesk.DAO.CustomerServiceDAOImpl;
import org.soldesk.DAO.CustomerServiceImpl;
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
	CustomerServiceImpl cs;
	
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

	@RequestMapping("/signupUser")
	// 회원가입 페이지 이동
	public String signupUser() {
		return "signupUser";
	}

	@RequestMapping("/insertOk")
	// 회원가입
	public ModelAndView insertOk(@ModelAttribute CustomerDTO cdto, Model model) {
		// 작동 잘됨
		ModelAndView mv = new ModelAndView("insertOk");

		mv.setViewName("insertOk");
		model.addAttribute("list", cdto);

		dao.CustomerInsert(cdto);
		return mv;
	}

	@RequestMapping("/mypage1")
	// 업데이트 및 삭제 페이지 이동
	public String CustomerUpdate(Model model) {
		return "mypage1";
	}

	@RequestMapping("/updateOk")
	public ModelAndView updateFormOk(@ModelAttribute CustomerDTO dto, Model model,@RequestParam String c_id) {
		// 계정 수정 실행
		ModelAndView mv = new ModelAndView("updateOK");
		
		mv.setViewName("updateOk");
		model.addAttribute("dto", cs.selectCustomer(c_id));
		
		System.out.println(dto.getC_id());

		dao.CustomerUpdate(dto);

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

}
