package org.soldesk.DAO;

import java.util.List;

import javax.inject.Inject;
import javax.naming.spi.DirStateFactory.Result;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.soldesk.DTO.CustomerDTO;
import org.soldesk.DTO.SellerDTO;
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
	
	@Override
	public boolean selloginCheck(String id, String pw) {
		boolean rs = csd.loginCheck(id, pw);
		if (rs == true) {
			return rs;
		}
		return rs;
	}

	@Override
	public SellerDTO viewSeller(String id) {
		return csd.viewseller(id);
	}

	@Override
	public SellerDTO sellserCustomer(String id) {
		return csd.sellerOne(id);
	}

	@Override
	public void customerSellerUpdate(int s_id, String s_name, String s_phone, String s_pw, String s_email, SellerDTO dto) {
		csd.customersellerUpdate(s_id, s_name, s_phone, s_pw, s_email, dto);
	}
}
