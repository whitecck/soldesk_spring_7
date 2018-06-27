package org.soldesk.DAO;

import java.util.List;

import org.soldesk.DTO.RefundDTO;

public interface RefundDAO {
	public List<RefundDTO> RefundSelectAll(); //전체
	public RefundDTO RefundgetData(int r_id); //한건
	public void RefundInsert(RefundDTO refundDTO); //추가
	public void RefundUpdate(RefundDTO refundDTO); //변경
	public void RefundDelete(int r_id); //삭제
}
