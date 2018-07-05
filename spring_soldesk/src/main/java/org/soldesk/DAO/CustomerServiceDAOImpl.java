package org.soldesk.DAO;

import java.util.HashMap;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.soldesk.DTO.CustomerDTO;
import org.soldesk.DTO.SellerDTO;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerServiceDAOImpl implements CustomerServiceDAO{

	@Inject
	SqlSession ss;
		
	@Override
	public boolean loginCheck(String id, String pw) {
		
		HashMap<String , String> idpw = new HashMap<String, String>();
		idpw.put("c_loginid", id);
		idpw.put("c_pw", pw);
		
		String ck = ss.selectOne("loginck", idpw);
		
		/*System.out.println(id);
		System.out.println(pw);
		값은 오고 있ㅇ므*/
		
		//System.out.println(ck);
		// 현재 값이 없어 
		
		/*String idck = ss.selectOne("loginCheckId", id);
		String pwck = ss.selectOne("loginCheckpw", pw);
		System.out.println(idck);
		System.out.println(pwck);*/
		if(ck!=null) {
			return true;
		}
		return false;
	}

	@Override
	public CustomerDTO viewMember(String id) {
		return ss.selectOne("viewMembre", id);
	}

	@Override
	public void logout(HttpSession session) {
	}

	@Override
	public CustomerDTO selectOne(String c_loginid) {
		
		return ss.selectOne("CheckId", c_loginid);
	}

	@Override
	public void customerUpdate(int c_id,String c_name, String c_phone, String c_pw, String c_email,CustomerDTO dto) {
		ss.update("CustomerUpdate", dto);
	}
	
	@Override
	public boolean sellogincheck(String id, String pw) {
		
		HashMap<String , String> idpw = new HashMap<String, String>();
		idpw.put("s_loginid", id);
		idpw.put("s_pw", pw);
		
		String ck = ss.selectOne("selloginCk", idpw);
		
		
		if(ck!=null) {
			return true;
		}
		return false;
	}

	@Override
	public SellerDTO viewseller(String s_id) {
		return ss.selectOne("viewSeller", s_id);
	}

	@Override
	public SellerDTO sellerOne(String s_id) {
		return ss.selectOne("selCheckId", s_id);
	}

	@Override
	public void customersellerUpdate(int c_id, String c_name, String c_phone, String c_pw, String c_email, SellerDTO dto) {
		ss.update("SellerUpdate", dto);
		
	}

	@Override
	public boolean customerfindId(String c_name) {
		String rs = ss.selectOne("customerfindId", c_name);
		
		if (rs!=null) {
			return true;
		}
		return false;
		
	}

	@Override
	public CustomerDTO customerviewId(String c_name) {
		return ss.selectOne("customerviewId", c_name);
	}

	@Override
	public boolean customerfindPw(String c_loginid) {
		String rs = ss.selectOne("customerfindPw", c_loginid);
		if(rs!=null) {
			return true;
		}
		return false;
	}

	@Override
	public CustomerDTO customerviewPw(String c_loginid) {
		return ss.selectOne("customerviewPw", c_loginid);
	}

	@Override
	public boolean sellerfindId(String s_name) {
		String rs = ss.selectOne("sellerfindId", s_name);
		if(rs!=null) {
			return true;
		}
		return false;
	}

	@Override
	public SellerDTO sellerviewId(String s_name) {
		return ss.selectOne("sellerviewId", s_name);
	}

	@Override
	public boolean sellerfinePw(String s_loginid) {
		String rs = ss.selectOne("sellerfindPw", s_loginid);
		if(rs!=null) {
			return true;
		}
		return false;
	}

	@Override
	public SellerDTO sellerviewPw(String s_loginid) {
		return ss.selectOne("sellerviewPw", s_loginid);
	}


}
