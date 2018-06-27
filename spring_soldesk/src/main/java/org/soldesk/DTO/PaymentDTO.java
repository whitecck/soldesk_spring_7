package org.soldesk.DTO;

public class PaymentDTO {
	private int p_id; //결제번호
	private String p_date; //결제시간
	private String p_way; //결제방법
	private int c_id; //손님번호
	
	public PaymentDTO () {}

	public PaymentDTO(int p_id, String p_date, String p_way, int c_id) {
		super();
		this.p_id = p_id;
		this.p_date = p_date;
		this.p_way = p_way;
		this.c_id = c_id;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getP_date() {
		return p_date;
	}

	public void setP_date(String p_date) {
		this.p_date = p_date;
	}

	public String getP_way() {
		return p_way;
	}

	public void setP_way(String p_way) {
		this.p_way = p_way;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	
	
}
