package org.soldesk.control;

import java.util.List;

import javax.inject.Inject;

import org.soldesk.DAO.CustomerDAO;
import org.soldesk.DAO.MemberDAO;
import org.soldesk.DAO.MemberDAOImpl;
import org.soldesk.DTO.CustomerDTO;
import org.soldesk.DTO.MemberDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {
	
	@Inject
	CustomerDAO dao;

	public void setDao(CustomerDAO dao) {
		this.dao = dao;
	}
	
	@RequestMapping(value="/memberAll")
	// 전체 조회
	public String list(Model model) {
		//List<CustomerDTO> list = dao.CustomerSelectAll();
		// model.addAttribute("list", list);
		
		return "MemberAll";
	}
	
	@RequestMapping("/insertOne")
	// 회원가입 페이지 이동
	public String insertOne() {
		return "insertOne";
	}
	
	@RequestMapping("/insertOk")
	// 회원가입 
	public String insertOk()
	/*public ModelAndView insertOk(@ModelAttribute CustomerDTO CusDTO,Model model)*/ {
		// 아직  dao 가 비어서 안댐 dao 완성후 String 없애고 풀면 댐 
		/*ModelAndView mv = new ModelAndView("insertOk");
		
		mv.setViewName("insertOk");
		model.addAttribute("list", CusDTO);*/
		
		// dao.CustomerInsert(CusDTO); 
		// return mv;
		return "insertOk";
	}
	
	@RequestMapping("/updel")
	// 업데이트 및 삭제 페이지 이동
	public String CustomerUpdate() {
		return "updel";
	}
	
	@RequestMapping("/update")
	// 업데이트 페이지 이동
	public String update() {
		return "update";
	}
	
	@RequestMapping("/updateOk")
	// 업데이트 실행
	public ModelAndView updateFormOk(@ModelAttribute CustomerDTO CusDTO,Model model) {
		 ModelAndView mv = new ModelAndView("updateOK");
		 
		 mv.setViewName("updateOk");
		 model.addAttribute("list", CusDTO);
		
		return mv;
	}
	
	@RequestMapping("/delete")
	// id 삭제 페이지 이동
	public String delete() {
		return "delete";
	}
	
	@RequestMapping("/deleteOk")
	// id 삭제 실행
	public String deleteOk(@RequestParam String c_id) {
		int i = Integer.parseInt(c_id);
		
		dao.CustomerDelete(i);
		
		return "deleteOk";
	}
	@RequestMapping("/login")
	// 로긴 페이지 세션 받고 아이디랑 회원 번호를 세션 값으로 남겨야함 
	public String login(@RequestParam String loginid, String pw) {
		// dao 필요함 
		
		
		return null;
	}
}
