package org.soldesk.DAO;

import java.util.List;

import org.soldesk.DTO.CustomerDTO;

public interface CustomerDAO {
	
	public List<CustomerDTO> CustomerSelectAll(); // Customer 전체조회
	public CustomerDTO CustomergetData(String c_id); // Customer 한건조회
	public void CustomerInsert(CustomerDTO customerDTO); // Customer 입력
	public void CustomerUpdate(CustomerDTO dto); // Customer 수정
	public void CustomerUpdate2(CustomerDTO customerDTO);
	public void CustomerDelete(int c_id); // Customer 삭제
	public CustomerDTO findId(String c_loginid); // 아이디 찾기
	public boolean bofindid(String c_loginid); // 아이디 있냐 없냐 
	public CustomerDTO findPw(String c_loginid); // 비밀번호 찾기 
	
	
}
