package org.soldesk.DAO;

import java.util.HashMap;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.soldesk.DTO.SellerDTO;
import org.springframework.stereotype.Repository;

@Repository
public class sellerServiceDAOimp implements sellerServiceDAO{
	
	@Inject
	SqlSession ss;

	@Override
	public boolean loginCheck(String id, String pw) {
		HashMap<String , String> idpw = new HashMap<String, String>();
		idpw.put("c_loginid", id);
		idpw.put("c_pw", pw);
		
		String ck = ss.selectOne("loginSeller", idpw);

		
		System.out.println(ck);

		if(ck!=null) {
			return true;
		}
		return false;

	}

	@Override
	public SellerDTO viewMember(String id) {
		return ss.selectOne("viewSeller", id);
	}

	@Override
	public void logout(HttpSession session) {
	}

	@Override
	public SellerDTO selectOne(String id) {
		return ss.selectOne("sellerCk", id);
	}

	@Override
	public void customerUpdate(int c_id, String c_name, String c_phone, String c_pw, String c_email, SellerDTO dto) {
		ss.update("SellerUpdate", dto);
		
	}

}
