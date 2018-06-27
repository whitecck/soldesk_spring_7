package org.soldesk.DAO;
import org.soldesk.DTO.MemberDTO;

public interface MemberDAO {
	public String getTime();
	public void insertMember(MemberDTO dto);
	public MemberDTO readMember(String userid)throws Exception; 
	public MemberDTO readWithPW(String userid, String pw) throws Exception;
}
