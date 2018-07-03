package org.soldesk.DAO;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.soldesk.DTO.SellerDTO;
import org.springframework.stereotype.Service;

@Service
public class SellerServiceimp implements SellerService {

	@Inject
	sellerServiceDAO ssd;

	@Override
	public boolean loginCheck(String id, String pw) {
		boolean rs = ssd.loginCheck(id, pw);
		if (rs == true) {
			return rs;
		}
		return rs;
	}

	@Override
	public SellerDTO viewCustomer(String id) {
		return ssd.viewMember(id);
	}

	@Override
	public void logout(HttpSession session) {
		session.invalidate();
	}

	@Override
	public SellerDTO selectCustomer(String id) {
		return ssd.selectOne(id);
	}

	@Override
	public void customerUpdate(int c_id, String c_name, String c_phone, String c_pw, String c_email, SellerDTO dto) {
		ssd.customerUpdate(c_id, c_name, c_phone, c_pw, c_email, dto);
	}

}
