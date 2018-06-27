package org.soldesk.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.soldesk.DTO.ReservationDTO;
import org.springframework.stereotype.Repository;

@Repository
public class ReservationDAOImpl implements ReservationDAO{
	
	@Inject
	SqlSession ss;

	
	public void setSs(SqlSession ss) {
		this.ss = ss;
	}

	@Override
	public List<ReservationDTO> ReservationSelectAll() {

		return ss.selectList("ReservationSelectAll");
	}

	@Override
	public ReservationDTO ReservationgetData(int r_no) {

		return ss.selectOne("ReservationgetData", r_no);
	}

	@Override
	public void ReservationInsert(ReservationDTO reservationDTO) {

		ss.insert("ReservationInsert", reservationDTO);
	}

	@Override
	public void ReservationUpdate(ReservationDTO reservationDTO) {

		ss.update("ReservationUpdate", reservationDTO);
	}

	@Override
	public void ReservationDelete(int r_no) {

		ss.delete("ReservationDelete", r_no);
	}
	
	
	
}
