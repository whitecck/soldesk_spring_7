package org.soldesk.DAO;

import java.util.HashMap;

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
	public CustomerDTO viewMember(CustomerDTO dto) {
		return ss.selectOne("viewMembre", dto);
	}

	@Override
	public void logout(HttpSession session) {
	}

	@Override
	public HashMap<String, String> loginck(String id, String pw) {
		boolean rs = false;
		
		HashMap<String , String> idpw = new HashMap<String, String>();
		idpw.put(id, id);
		idpw.put(pw, pw);
		
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
			rs = true;
		}
		return null;
	}

}
