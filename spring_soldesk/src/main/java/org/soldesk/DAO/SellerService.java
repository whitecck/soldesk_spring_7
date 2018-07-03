package org.soldesk.DAO;

import javax.servlet.http.HttpSession;

import org.soldesk.DTO.CustomerDTO;
import org.soldesk.DTO.SellerDTO;

public interface SellerService {
	public boolean selloginCheck(String id, String pw); //로그인
	public SellerDTO viewCustomer(String id); // 로그인정보
	public SellerDTO selectCustomer(String id);
	public void customerUpdate(int s_id, String s_name,String s_phone,String s_pw, String s_email,SellerDTO dto);
}
