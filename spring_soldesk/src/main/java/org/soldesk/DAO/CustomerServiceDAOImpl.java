package org.soldesk.DAO;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.soldesk.DTO.CustomerDTO;
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
		
		System.out.println(ck);
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
		/*ss.update("CustomerUpdate", c_name);
		ss.update("CustomerUpdate", c_phone);
		ss.update("CustomerUpdate", c_pw);
		ss.update("CustomerUpdate", c_email);*/
	}


}
