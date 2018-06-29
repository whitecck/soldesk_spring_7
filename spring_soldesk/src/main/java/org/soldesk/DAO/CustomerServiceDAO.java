package org.soldesk.DAO;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.soldesk.DTO.CustomerDTO;

public interface CustomerServiceDAO {
	public boolean loginCheck(String id, String pw);
	public CustomerDTO viewMember(CustomerDTO dto);
	public void logout (HttpSession session);
	public HashMap<String , String> loginck(String id ,String pw);
}
