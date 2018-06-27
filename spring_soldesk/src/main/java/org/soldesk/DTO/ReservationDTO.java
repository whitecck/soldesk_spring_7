package org.soldesk.DTO;

public class ReservationDTO {
	private int r_no; //예약번호
	private String r_date; //수령할 시간
	private int r_bool; // 수령여부
	private String r_request; //요청사항
	private int r_money; //거래금액
	private int c_id; //손님번호
	private int s_id; //판매자번호
	private int i_id; //상품번호
	
	public ReservationDTO () {}

	public ReservationDTO(int r_no, String r_date, int r_bool, String r_request, int r_money, int c_id, int s_id,
			int i_id) {
		super();
		this.r_no = r_no;
		this.r_date = r_date;
		this.r_bool = r_bool;
		this.r_request = r_request;
		this.r_money = r_money;
		this.c_id = c_id;
		this.s_id = s_id;
		this.i_id = i_id;
	}

	public int getR_no() {
		return r_no;
	}

	public void setR_no(int r_no) {
		this.r_no = r_no;
	}

	public String getR_date() {
		return r_date;
	}

	public void setR_date(String r_date) {
		this.r_date = r_date;
	}

	public int getR_bool() {
		return r_bool;
	}

	public void setR_bool(int r_bool) {
		this.r_bool = r_bool;
	}

	public String getR_request() {
		return r_request;
	}

	public void setR_request(String r_request) {
		this.r_request = r_request;
	}

	public int getR_money() {
		return r_money;
	}

	public void setR_money(int r_money) {
		this.r_money = r_money;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public int getI_id() {
		return i_id;
	}

	public void setI_id(int i_id) {
		this.i_id = i_id;
	}
	
	
}
