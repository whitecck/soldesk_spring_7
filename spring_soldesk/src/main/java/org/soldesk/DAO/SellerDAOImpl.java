package org.soldesk.DAO;

import java.util.HashMap;
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

	@Override
	public List<SellerDTO> SellerOpen() {

		return ss.selectList("SellerOpenAll");
	}

	@Override
	public List<SellerDTO> SellerOpenLoc(String s_location) {
		return ss.selectList("SellerOpenLoc", s_location);
	}
	
	@Override
	public List<SellerDTO> selchoice(String s_location, String s_category) {
		HashMap<String, String> sel = new HashMap<String, String>();
		sel.put("s_location", s_location);
		sel.put("s_category", s_category);
		return ss.selectList("selchoice", sel);
	}

	@Override
	public void sellerUpdateTimeLo(String s_time, String s_location,String s_id) {
		HashMap<String, String> sel = new HashMap<String, String>();
		
		sel.put("s_time", s_time);
		sel.put("s_location", s_location);
		sel.put("s_id", s_id);
		
		ss.update("selupdatetimelo", sel);
	}


}
