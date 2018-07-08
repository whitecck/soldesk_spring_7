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
public class CustomerServiceImpl implements CustomerService {

	@Inject
	CustomerServiceDAO csd;

	@Override
	public boolean loginCheck(String id, String pw) {
		boolean rs = csd.loginCheck(id, pw);
		if (rs == true) {
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
	public void customerUpdate(int c_id, String c_name, String c_phone, String c_pw, String c_email, CustomerDTO dto) {
		csd.customerUpdate(c_id, c_name, c_phone, c_pw, c_email, dto);
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
	public void customerSellerUpdate(int s_id, String s_name, String s_phone, String s_pw, String s_email,
			SellerDTO dto) {
		csd.customersellerUpdate(s_id, s_name, s_phone, s_pw, s_email, dto);
	}

	@Override
	public boolean customerfindId(String c_name) {
		boolean rs = csd.customerfindId(c_name);
		if (rs == true) {
			return rs;
		}
		return rs;
	}

	@Override
	public CustomerDTO customerviewId(String c_name) {
		return csd.customerviewId(c_name);
	}

	@Override
	public boolean customerfindPw(String c_loginid) {
		boolean rs = csd.customerfindPw(c_loginid);
		if (rs==true) {
			return rs;
		}
		return rs;
	}

	@Override
	public CustomerDTO customerviewPw(String c_loginid) {
		return csd.customerviewPw(c_loginid);
	}

	@Override
	public boolean sellerfindId(String s_name) {
		boolean rs = csd.sellerfindId(s_name);
		if(rs==true) {
			return rs;
		}
		return rs;
	}

	@Override
	public SellerDTO sellerviewId(String s_name) {
		return csd.sellerviewId(s_name);
	}

	@Override
	public boolean sellerfinePw(String s_loginid) {
		boolean rs = csd.sellerfinePw(s_loginid);
		if(rs==true) {
			return true;
		}
		return false;
	}

	@Override
	public SellerDTO sellerviewPw(String s_loginid) {
		return csd.sellerviewPw(s_loginid);
	}

	@Override
	public SellerDTO sellerviewOp(int s_id) {
		return csd.sellerviewOp(s_id);
	}
}
