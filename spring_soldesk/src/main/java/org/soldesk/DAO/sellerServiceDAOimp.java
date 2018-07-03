package org.soldesk.DAO;

import java.util.HashMap;

import javax.inject.Inject;

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
		idpw.put("s_loginid", id);
		idpw.put("s_pw", pw);
		
		String ck = ss.selectOne("selloginCk", idpw);
		
		System.out.println(ck);
		
		if(ck!=null) {
			return true;
		}
		return false;
	}

	@Override
	public SellerDTO viewMember(String s_id) {
		return ss.selectOne("viewSeller", s_id);
	}

	@Override
	public SellerDTO selectOne(String s_id) {
		return ss.selectOne("selCheckId", s_id);
	}

	@Override
	public void customerUpdate(int c_id, String c_name, String c_phone, String c_pw, String c_email, SellerDTO dto) {
		ss.update("SellerUpdate", dto);
		
	}

}
