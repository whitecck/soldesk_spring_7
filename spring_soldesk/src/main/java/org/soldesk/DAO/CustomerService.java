package org.soldesk.DAO;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.soldesk.DTO.CustomerDTO;
import org.springframework.web.servlet.ModelAndView;

public interface CustomerService {
	public boolean loginCheck(String id, String pw); //로그인
	public CustomerDTO viewCustomer(String id); // 로그인정보
	public void logout(HttpSession session); // 로그아웃
	public CustomerDTO selectCustomer(String id);
	public void customerUpdate(int c_id, String c_name,String c_phone,String c_pw, String c_email,CustomerDTO dto);

}
