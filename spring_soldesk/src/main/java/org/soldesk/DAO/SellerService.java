package org.soldesk.DAO;

import javax.servlet.http.HttpSession;

import org.soldesk.DTO.CustomerDTO;
import org.soldesk.DTO.SellerDTO;

public interface SellerService {
	public boolean loginCheck(String id, String pw); //로그인
	public SellerDTO viewCustomer(String id); // 로그인정보
	public void logout(HttpSession session); // 로그아웃
	public SellerDTO selectCustomer(String id);
	public void customerUpdate(int c_id, String c_name,String c_phone,String c_pw, String c_email,SellerDTO dto);
}
