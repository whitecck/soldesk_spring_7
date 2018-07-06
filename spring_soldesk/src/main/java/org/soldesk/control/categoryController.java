package org.soldesk.control;

import java.util.List;

import javax.inject.Inject;

import org.soldesk.DAO.categoryDAO;
import org.soldesk.DTO.SellerDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class categoryController {
	
	@Inject
	categoryDAO cdao;

	public void setCdao(categoryDAO cdao) {
		this.cdao = cdao;
	}
	
	@ModelAttribute("seller")
	public SellerDTO sellerDTO() {
		return new SellerDTO();
	}
	
	@RequestMapping(value="/grill")
	public String grill(Model model) {
		List<SellerDTO> list = cdao.grill();
		
		model.addAttribute("list", list);
		
		return "grill";
	}
	
	@RequestMapping("/noodle")
	public String noodle(Model model) {
		List<SellerDTO> list = cdao.noodle();
		model.addAttribute("list", list);
		return "noodle";
	}
	
	@RequestMapping("/stick")
	public String stick(Model model) {
		List<SellerDTO> list = cdao.noodle();
		model.addAttribute("list", list);
		return "stick";
	}
	
	@RequestMapping("fri")
	public String fri(Model model) {
		List<SellerDTO> list = cdao.fri();
		model.addAttribute("list", list);
		return "fri";
	}
	
	@RequestMapping("desert")
	public String desert(Model model) {
		List<SellerDTO> list = cdao.desert();
		model.addAttribute("list", list);
		return "desert";
	}
	
	@RequestMapping("guitar")
	public String guitar(Model model) {
		List<SellerDTO> list = cdao.guitar();
		model.addAttribute("list", list);
		return "guitar";
	}
}

