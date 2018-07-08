package org.soldesk.DAO;

import java.util.List;

import org.soldesk.DTO.SellerDTO;

public interface SellerDAO {
	
	public List<SellerDTO> SellerSelectAll();//전체
	public SellerDTO SellergetData(int s_id);//한건
	public void SellerInsert(SellerDTO sellerDTO);//추가
	public void SellerUpdate(SellerDTO sellerDTO);//변경
	public void SellerDelete(int s_id);//삭제
	public List<SellerDTO> SellerOpen();
	public List<SellerDTO> SellerOpenLoc(String s_location);
	
	public List<SellerDTO> selchoice(String s_location,String s_category);
	public void sellerUpdateTimeLo(String s_time,String s_location,String s_id);
	public SellerDTO sellerview(int s_id);
}
