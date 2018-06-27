package org.soldesk.DAO;

import java.util.List;

import org.soldesk.DTO.ReservationDTO;

public interface ReservationDAO {
	
	public List<ReservationDTO> ReservationSelectAll(); //전체 조회
	public ReservationDTO ReservationgetData(int r_no); //하나 조회
	public void ReservationInsert(ReservationDTO reservationDTO); //추가
	public void ReservationUpdate(ReservationDTO reservationDTO); //변경
	public void ReservationDelete(int r_no); //삭제
}
