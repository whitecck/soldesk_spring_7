package org.soldesk.DAO;

import javax.inject.Inject;
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
	public CustomerDTO viewCustomer(CustomerDTO dto) {
		return csd.viewMember(dto);
	}

	@Override
	public void logout(HttpSession session) {
		session.invalidate();
	}

}
