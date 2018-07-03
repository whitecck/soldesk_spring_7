package org.soldesk.DAO;

import javax.servlet.http.HttpSession;

import org.soldesk.DTO.SellerDTO;

public interface sellerServiceDAO {
	public boolean loginCheck(String id, String pw);
	public SellerDTO viewMember(String id);
	public void logout (HttpSession session);
	public SellerDTO selectOne(String id);
	public void customerUpdate(int c_id, String c_name,String c_phone,String c_pw, String c_email,SellerDTO dto);
}
