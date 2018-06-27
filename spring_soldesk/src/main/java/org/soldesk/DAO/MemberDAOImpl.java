package org.soldesk.DAO;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.soldesk.DTO.MemberDTO;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO {
	@Inject
	private SqlSession sqlSession;
	private static final String namespace="org.soldesk.mapper.MemberMapper";
	
	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace+".getTime");
	}

	@Override
	public void insertMember(MemberDTO dto) {
		sqlSession.insert(namespace+".insertMember",dto);	
	}

	@Override
	public MemberDTO readMember(String userid) throws Exception {
		return (MemberDTO)
				sqlSession.selectOne(namespace+".selectMember",userid);
				
	}

	@Override
	public MemberDTO readWithPW(String userid, String pw) throws Exception {
		Map<String, Object>paramMap = new HashMap<String, Object>();
		
		paramMap.put("userid", userid);
		paramMap.put("userpw", pw);
	
		return sqlSession.selectOne(namespace+".readWithPW", paramMap);
	}
}
