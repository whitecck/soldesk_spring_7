package org.soldesk.DAO;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.soldesk.DTO.CustomerDTO;

public interface CustomerServiceDAO {
	public boolean loginCheck(String id, String pw);
	public CustomerDTO viewMember(String id);
	public void logout (HttpSession session);
	public CustomerDTO selectOne(String id);
	public void customerUpdate(int c_id, String c_name,String c_phone,String c_pw, String c_email,CustomerDTO dto);
	
}
