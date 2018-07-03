package org.soldesk.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.soldesk.DTO.CustomerDTO;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOImpl implements CustomerDAO{ 
	@Inject
	SqlSession ss;

	public void setSs(SqlSession ss) {
		this.ss = ss;
	}

	@Override
	public List<CustomerDTO> CustomerSelectAll() {
		
		return ss.selectList("CustomerSelectAll");
	}

	@Override
	public CustomerDTO CustomergetData(String c_id) {
		
		return ss.selectOne("CustomergetData", c_id);
	}

	@Override
	public void CustomerInsert(CustomerDTO customerDTO) {
		
		ss.insert("CustomerInsert", customerDTO);
		
	}

	@Override
	public void CustomerUpdate(CustomerDTO dto) {
		ss.update("CustomerUpdate", dto);
		
	}

	@Override
	public void CustomerDelete(int c_id) {
		ss.delete("CustomerDelete", c_id);
		
	}

	@Override
	public void CustomerUpdate2(CustomerDTO customerDTO) {
		ss.update(""
				+ "", customerDTO);
		
	}
	
	
	
}
