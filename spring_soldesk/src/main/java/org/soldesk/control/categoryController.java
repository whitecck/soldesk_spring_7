package org.soldesk.control;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.soldesk.DAO.ItemsDAO;
import org.soldesk.DAO.SellerDAO;
import org.soldesk.DAO.categoryDAO;
import org.soldesk.DTO.ItemsDTO;
import org.soldesk.DTO.SellerDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class categoryController {
	
	@Inject
	categoryDAO cdao;
	
	@Inject
	ItemsDAO idao;
	
	@Inject
	SellerDAO sdao;

	public void setCdao(categoryDAO cdao) {
		this.cdao = cdao;
	}
	
	@ModelAttribute("seller")
	public SellerDTO sellerDTO() {
		return new SellerDTO();
	}
	
	@RequestMapping("test")
	public String fds() {
		
		return "df";
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
	
	@RequestMapping("findgrill")
	public String selloca(@RequestParam String s_location,Model model) {
		
		//System.out.println(s_location);
	
		List<SellerDTO> list = cdao.findgrill(s_location);
		
		model.addAttribute("s", list);
		
		// System.out.println(list); 값ㅇ ㅣ있음 
		
		return "caloview";
	}
	
	@RequestMapping("menuview")
	public ModelAndView sellermenu(@RequestParam int s_id,@ModelAttribute SellerDTO sdto,Model model,HttpServletRequest req) {
		ModelAndView mv = new ModelAndView();
		
		String id = req.getParameter("s_id");
		int iid = Integer.parseInt(req.getParameter("s_id"));
		
		System.out.println(id);
		System.out.println(s_id);
		// s_id 값 잘 나옴 
		
		sdto = sdao.sellerview(s_id);
		
		//List<ItemsDTO> ilist = idao.itemsview(iid);
		List<ItemsDTO> ilist = idao.id1();
		// System.out.println(ilist);
		
		/*mv.addObject("idto", ilist);
		mv.addObject("sdto", slist);*/
		
		model.addAttribute("i", ilist);
		
		mv.setViewName("caloviewOk");
		
		return mv;
	}
}

