package org.soldesk.DAO;

import java.util.List;

import org.soldesk.DTO.ItemsDTO;

public interface ItemsDAO {
	
	public List<ItemsDTO> ItemsSelectAll(); //전체
	public ItemsDTO ItemsgetData(int i_id); //한건
	public void ItemsInsert(ItemsDTO itemsDTO); //추가
	public void ItemsUpdate(ItemsDTO itemsDTO); //변경
	public void ItemsDelete(int i_id); //삭제
	
	
	public List<ItemsDTO> itemsview(int s_id);
	public List<ItemsDTO> id1();
}
