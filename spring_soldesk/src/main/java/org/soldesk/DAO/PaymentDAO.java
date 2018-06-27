package org.soldesk.DAO;

import java.util.List;

import org.soldesk.DTO.PaymentDTO;

public interface PaymentDAO {
	
	public List<PaymentDTO> PaymentSelectAll(); //전체
	public PaymentDTO PaymentgetData(int p_id); //한건
	public void PaymentInsert(PaymentDTO paymentDTO); //추가
	public void paymentUpdate(PaymentDTO paymentDTO); //변경
	public void paymentDelete(int p_id); //삭제
}
