package org.soldesk.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.soldesk.DAO.MemberDAO;
import org.soldesk.DTO.MemberDTO;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MemberDAOTest {
	
	@Inject
	private MemberDAO dao;
	
	@Test
	public void testTime() throws Exception{
		System.out.println(dao.getTime());
	}
	
	@Test
	public void testSelectMember() throws Exception{
		System.out.println(dao.readWithPW("user00", "user00"));
	}
	
//	@Test
//	public void testInsertMember()throws Exception{
//		MemberDTO dto = new MemberDTO();
//		
//		dto.setUserid("user00");
//		dto.setUserpw("user00");
//		dto.setUsername("USER00");
//		dto.setEmail("user00@aaa.com");
//		
//		dao.insertMember(dto);
//	}

}
