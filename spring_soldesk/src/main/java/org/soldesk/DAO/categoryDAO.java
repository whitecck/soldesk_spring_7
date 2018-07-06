package org.soldesk.DAO;

import java.util.List;

import org.soldesk.DTO.SellerDTO;

public interface categoryDAO {
	public List<SellerDTO> grill();
	public List<SellerDTO> noodle();
	public List<SellerDTO> stick();
	public List<SellerDTO> fri();
	public List<SellerDTO> desert();
	public List<SellerDTO> guitar();
}
