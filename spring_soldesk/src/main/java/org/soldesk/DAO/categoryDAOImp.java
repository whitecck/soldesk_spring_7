package org.soldesk.DAO;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.soldesk.DTO.SellerDTO;
import org.springframework.stereotype.Repository;


@Repository
public class categoryDAOImp implements categoryDAO {
	
	@Inject
	SqlSession ss;
	
	public void setSs(SqlSession ss) {
		this.ss = ss;
	}

	@Override
	public List<SellerDTO> grill() {
		return ss.selectList("grill");
	}

	@Override
	public List<SellerDTO> noodle() {
		return ss.selectList("noodle");
	}

	@Override
	public List<SellerDTO> stick() {
		return ss.selectList("stick");
	}

	@Override
	public List<SellerDTO> fri() {
		return ss.selectList("fri");
	}

	@Override
	public List<SellerDTO> desert() {
		return ss.selectList("desert");
	}

	@Override
	public List<SellerDTO> guitar() {
		return ss.selectList("guitar");
	}

	@Override
	public List<SellerDTO> findgrill(String s_location) {
		
		return ss.selectList("findgrill", s_location);
	}

}
