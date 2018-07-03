package org.soldesk.DAO;

import java.util.List;

import javax.inject.Inject;
import javax.naming.spi.DirStateFactory.Result;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.soldesk.DTO.CustomerDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Inject
	CustomerServiceDAO csd;

	@Override
	public boolean loginCheck(String id, String pw) {
		boolean rs = csd.loginCheck(id, pw);
		if(rs==true) {
			return rs;
		}
		return rs;
	}

	@Override
	public CustomerDTO viewCustomer(String id) {
		return csd.viewMember(id);
	}

	@Override
	public void logout(HttpSession session) {
		session.invalidate();
	}

	@Override
	public CustomerDTO selectCustomer(String id) {
		
		return csd.selectOne(id);
	}


	@Override
	public void customerUpdate(int c_id,String c_name, String c_phone, String c_pw, String c_email,CustomerDTO dto) {
		csd.customerUpdate(c_id,c_name, c_phone, c_pw, c_email,dto);
	}
}
