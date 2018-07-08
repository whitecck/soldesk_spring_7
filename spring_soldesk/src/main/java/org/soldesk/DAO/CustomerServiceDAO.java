package org.soldesk.DAO;

import javax.servlet.http.HttpSession;

import org.soldesk.DTO.CustomerDTO;
import org.soldesk.DTO.SellerDTO;

public interface CustomerServiceDAO {
	
	// customer
	
	public boolean loginCheck(String id, String pw);
	public CustomerDTO viewMember(String id);
	public void logout (HttpSession session);
	public CustomerDTO selectOne(String id);
	public void customerUpdate(int c_id, String c_name,String c_phone,String c_pw, String c_email,CustomerDTO dto);

	// seller
	
	public boolean sellogincheck(String id, String pw);
	public SellerDTO viewseller(String id);
	public SellerDTO sellerOne(String id); //로긴정보
	public void customersellerUpdate(int s_id, String s_name,String s_phone,String s_pw, String s_email,SellerDTO dto);
	
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
	public SellerDTO sellerviewOp(int s_id);
	
}
