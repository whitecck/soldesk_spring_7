package org.soldesk.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.soldesk.DTO.RefundDTO;
import org.springframework.stereotype.Repository;

@Repository
public class RefundDAOImpl implements RefundDAO{

	@Inject
	SqlSession ss;
	
	
	public void setSs(SqlSession ss) {
		this.ss = ss;
	}

	@Override
	public List<RefundDTO> RefundSelectAll() {
		
		return ss.selectList("RefundSelectAll");
	}

	@Override
	public RefundDTO RefundgetData(int r_id) {
		
		return ss.selectOne("RefundgetData", r_id);
	}

	@Override
	public void RefundInsert(RefundDTO refundDTO) {

		ss.insert("RefundInsert", refundDTO);
	}

	@Override
	public void RefundUpdate(RefundDTO refundDTO) {

		ss.update("RefundUpdate", refundDTO);
	}

	@Override
	public void RefundDelete(int r_id) {

		ss.delete("RefundDelete", r_id);
	}

}
