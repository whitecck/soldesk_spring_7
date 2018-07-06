package org.soldesk.control;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soldesk.DAO.CustomerDAO;
import org.soldesk.DAO.CustomerServiceDAOImpl;
import org.soldesk.DAO.CustomerServiceImpl;
import org.soldesk.DAO.SellerDAO;
import org.soldesk.DAO.SellerDAOImpl;
import org.soldesk.DTO.CustomerDTO;
import org.soldesk.DTO.SellerDTO;
import org.springframework.http.HttpRequest;
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
	@Inject
	SellerDAO sdao;
	
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
	
	@RequestMapping("/insertAll")
	public ModelAndView insertAll(@RequestParam String type) {
		// type 값에 따른 회원가입 페이지 이동 
		ModelAndView mv = new ModelAndView();
		System.out.println(type);
		
		if(type.equals("a")) {
			mv.setViewName("signupUser");
		}else {
			mv.setViewName("signupTruck");
		}
		
		return mv;
	}

	@RequestMapping("/userinsertOk")
	// 일반 계정 생성
	public ModelAndView insertOk(@ModelAttribute CustomerDTO cdto, Model model) {
		ModelAndView mv = new ModelAndView("insertOk");

		mv.setViewName("insertOk");
		model.addAttribute("list", cdto);

		dao.CustomerInsert(cdto);
		return mv;
	}
	
	@RequestMapping("/truckinsertOk")
	// 판매자 계정 생성
	public String truckinsertOk(@ModelAttribute()SellerDTO sdto) {
		
		sdao.SellerInsert(sdto);
		
		return "truckinsertOk";
	}

	@RequestMapping("/mypage1")
	// 업데이트 및 삭제 페이지 이동
	public String CustomerUpdate(Model model) {
		return "mypage1";
	}

	@RequestMapping("/cusupdateOk") 
	// customer 수정 
	public ModelAndView updateFormOk(@ModelAttribute CustomerDTO dto, Model model,@RequestParam String c_id) {
		// 계정 수정 실행
		ModelAndView mv = new ModelAndView("updateOK");
		
		mv.setViewName("updateOk");
		model.addAttribute("dto", cs.selectCustomer(c_id));
		
		System.out.println(dto.getC_id());

		dao.CustomerUpdate(dto);

		return mv;
	}
	
	@RequestMapping("/truckOpen")
	public String truckMain2() {
		return "truckOpen";
	}
	
	@RequestMapping("/selupdateOk")
	// seller 수정
	public ModelAndView selupdateOk(@ModelAttribute SellerDTO sdto, Model model,@RequestParam String s_id) {
		
		ModelAndView mv = new ModelAndView("selupdateOk");
		
		mv.setViewName("selupdateOk");
		// model.addAttribute("sdto", ); 출력할 값 너허야핳마
		
		System.out.println(sdto.getS_id());
		
		sdao.SellerInsert(sdto);
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
	
	@RequestMapping("selupdate")
	public String selupdate() {
		return "selupdate";
	}
	
	
	@RequestMapping("selchoice")
	public ModelAndView selchoice(@RequestParam String s_location,@RequestParam String s_id,@RequestParam String o_hour,@RequestParam String o_min,@RequestParam String c_hour, @RequestParam String c_min, Model model) {
		ModelAndView mv = new ModelAndView();
		
		String s = o_hour + ":" + o_min + "-" + c_hour + ":" + c_min;
		
		String s_time = s;
		
		sdao.sellerUpdateTimeLo(s_time, s_location, s_id);
		mv.setViewName("truckMain2");
		
		
		System.out.println("일단 옴 ");
		return mv;
	}
	

}
