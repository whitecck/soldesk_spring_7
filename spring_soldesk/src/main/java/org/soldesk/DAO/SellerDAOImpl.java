package org.soldesk.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.soldesk.DTO.SellerDTO;
import org.springframework.stereotype.Repository;

@Repository
public class SellerDAOImpl implements SellerDAO{

	@Inject
	SqlSession ss;
	
	public void setSs(SqlSession ss) {
		this.ss = ss;
	}

	@Override
	public List<SellerDTO> SellerSelectAll() {

		return ss.selectList("SellerSelectAll");
	}

	@Override
	public SellerDTO SellergetData(int s_id) {

		return ss.selectOne("SellergetData", s_id);
	}

	@Override
	public void SellerInsert(SellerDTO sellerDTO) {

		ss.insert("SellerInsert", sellerDTO);
	}

	@Override
	public void SellerUpdate(SellerDTO sellerDTO) {

		ss.update("SellerUpdate", sellerDTO);
	}

	@Override
	public void SellerDelete(int s_id) {

		ss.delete("SellerDelete", s_id);
	}

}
