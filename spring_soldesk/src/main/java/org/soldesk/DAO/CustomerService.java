package org.soldesk.DAO;

import javax.servlet.http.HttpSession;

import org.soldesk.DTO.CustomerDTO;
import org.springframework.web.servlet.ModelAndView;

public interface CustomerService {
	public boolean loginCheck(String id, String pw); //로그인
	public CustomerDTO viewCustomer(CustomerDTO dto); // 로그인정보
	public void logout(HttpSession session); // 로그아웃
}
