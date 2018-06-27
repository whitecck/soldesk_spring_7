package org.soldesk.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.soldesk.DTO.PaymentDTO;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentDAOImpl implements PaymentDAO{
	
	@Inject
	SqlSession ss;
	
	public void setSs(SqlSession ss) {
		this.ss = ss;
	}

	@Override
	public List<PaymentDTO> PaymentSelectAll() {

		return ss.selectList("PaymentSelectAll");
	}

	@Override
	public PaymentDTO PaymentgetData(int p_id) {

		return ss.selectOne("PaymentgetData", p_id);
	}

	@Override
	public void PaymentInsert(PaymentDTO paymentDTO) {
		ss.insert("PaymentInsert", paymentDTO);
		
	}

	@Override
	public void paymentUpdate(PaymentDTO paymentDTO) {
		ss.update("PaymentUpdate", paymentDTO);
	}

	@Override
	public void paymentDelete(int p_id) {
		ss.delete("PaymentDelete", p_id);
	}

}
