package org.soldesk.control;

import java.util.List;

import javax.inject.Inject;

import org.soldesk.DAO.ItemsDAO;
import org.soldesk.DAO.ReservationDAO;
import org.soldesk.DAO.SellerDAO;
import org.soldesk.DTO.ReservationDTO;
import org.soldesk.DTO.SellerDTO;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public class ReservationController {

	@Inject
	ReservationDAO r_dao;
	SellerDAO s_dao;

	public void setRdao(ReservationDAO r_dao) {
		this.r_dao = r_dao;
	}
	
	public void setSdao(SellerDAO s_dao) {
		this.s_dao = s_dao;
	}
	
	@RequestMapping("/selectOpenAll") // 카테고리 없을때
	// 전체 조회
	public String list(Model model) {
		 List<SellerDTO> list = s_dao.SellerOpen();
		 model.addAttribute("list", list);

		return "list";
	}
	
	@RequestMapping("/selectOpenLoc") // 카테고리 지역
	// 지역별 조회
	public String localList(@RequestParam("s_location") String s_location, Model model) {
		 List<SellerDTO> list = s_dao.SellerOpenLoc(s_location);
		 model.addAttribute("list", list);

		return "list";
	}

	@RequestMapping("/insertOne")
	// 회원가입 페이지 이동
	public String insertOne() {
		return "insertOne";
	}

	@RequestMapping("/insertOk")
	// 회원가입
	// public String insertOk()
	public ModelAndView insertOk(@ModelAttribute ReservationDTO ResDTO, Model model) {
		// 아직 r_dao 가 비어서 안댐 r_dao 완성후 String 없애고 풀면 댐
		ModelAndView mv = new ModelAndView("insertOk");

		mv.setViewName("insertOk");
		model.addAttribute("list", ResDTO);

		r_dao.ReservationInsert(ResDTO);
		return mv;
		// return "insertOk";
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
	public ModelAndView updateFormOk(@ModelAttribute ReservationDTO ResDTO, Model model) {
		ModelAndView mv = new ModelAndView("updateOK");

		mv.setViewName("updateOk");
		model.addAttribute("list", ResDTO);

		return mv;
	}

	@RequestMapping("/delete")
	// id 삭제 페이지 이동
	public String delete() {
		return "delete";
	}

	@RequestMapping("/deleteOk")
	// id 삭제 실행
	public String deleteOk(@RequestParam int r_no) {
		r_dao.ReservationDelete(r_no);

		return "deleteOk";
	}

	@RequestMapping("/login")
	// 로긴 페이지 세션 받고 아이디랑 회원 번호를 세션 값으로 남겨야함
	public String login(@RequestParam String loginid, String pw) {
		// r_dao 필요함

		return null;
	}

}
