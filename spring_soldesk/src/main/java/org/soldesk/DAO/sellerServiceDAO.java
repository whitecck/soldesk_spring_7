package org.soldesk.DAO;

import javax.servlet.http.HttpSession;

import org.soldesk.DTO.SellerDTO;

public interface sellerServiceDAO {
	public boolean loginCheck(String id, String pw);
	public SellerDTO viewMember(String id);
	public SellerDTO selectOne(String id);
	public void customerUpdate(int s_id, String s_name,String s_phone,String s_pw, String s_email,SellerDTO dto);
}
