package org.soldesk.DAO;

import java.util.List;

import org.soldesk.DTO.CustomerDTO;

public interface CustomerDAO {
	
	public List<CustomerDTO> CustomerSelectAll(); // Customer 전체조회
	public CustomerDTO CustomergetData(int c_id); // Customer 한건조회
	public void CustomerInsert(CustomerDTO customerDTO); // Customer 입력
	public void CustomerUpdate(CustomerDTO customerDTO); // Customer 수정
	public void CustomerUpdate2(CustomerDTO customerDTO);
	public void CustomerDelete(int c_id); // Customer 삭제
	
	
}
