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
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@Inject
	CustomerDAO dao;

	public void setDao(CustomerDAO dao) {
		this.dao = dao;
	}
	
	@RequestMapping(value="/memberAll")
	public String list(Model model) {
		/*List<CustomerDTO> list = dao.CustomerSelectAll();
		model.addAttribute("list", list);*/
		
		return "MemberAll";
	}
}
