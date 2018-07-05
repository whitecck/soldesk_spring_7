package org.soldesk.DAO;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.soldesk.DTO.CustomerDTO;
import org.soldesk.DTO.SellerDTO;
import org.springframework.web.servlet.ModelAndView;

public interface CustomerService {
	public boolean loginCheck(String id, String pw); //로그인
	public CustomerDTO viewCustomer(String id); // 로그인정보
	public void logout(HttpSession session); // 로그아웃
	public CustomerDTO selectCustomer(String id);
	public void customerUpdate(int c_id, String c_name,String c_phone,String c_pw, String c_email,CustomerDTO dto);
	
	public boolean selloginCheck(String id, String pw); //로그인
	public SellerDTO viewSeller(String id); // ?
	public SellerDTO sellserCustomer(String id); // f로긩ㄴ 정보 
	public void customerSellerUpdate(int s_id, String s_name,String s_phone,String s_pw, String s_email,SellerDTO dto);
	
	// 아이디 찾기
		// customer
		public boolean customerfindId(String c_name);
		public CustomerDTO customerviewId(String c_name);
		public boolean customerfindPw(String c_loginid);
		public CustomerDTO customerviewPw(String c_loginid);
		
		// seller
		public boolean sellerfindId(String s_name);
		public SellerDTO sellerviewId(String s_name);
		public boolean sellerfinePw(String s_loginid);
		public SellerDTO sellerviewPw(String s_loginid);

}
