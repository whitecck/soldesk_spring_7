package org.soldesk.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.soldesk.DTO.ItemsDTO;
import org.springframework.stereotype.Repository;

@Repository
public class ItemsDAOImpl implements ItemsDAO{
	
	@Inject
	SqlSession ss;
	
	public void setSs(SqlSession ss) {
		this.ss = ss;
	}

	@Override
	public List<ItemsDTO> ItemsSelectAll() {
		
		return ss.selectList("ItemsSelectAll");
	}

	@Override
	public ItemsDTO ItemsgetData(int i_id) {

		return ss.selectOne("ItemsgetData", i_id);
	}

	@Override
	public void ItemsInsert(ItemsDTO itemsDTO) {
		
		ss.insert("ItemsInsert", itemsDTO);
	}

	@Override
	public void ItemsUpdate(ItemsDTO itemsDTO) {
		ss.insert("ItemsUpdate", itemsDTO);
		
	}

	@Override
	public void ItemsDelete(int i_id) {
		ss.delete("ItemsDelete", i_id);
	}

}
