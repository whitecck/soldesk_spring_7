package org.soldesk.DTO;

public class RefundDTO {
	private int r_id; //환급번호
	private String r_account; //환급계좌
	private String r_date; //환급날짜
	private int r_money; // 환금급액
	private int s_id; // 판매자번호
	
	public RefundDTO () {}

	public RefundDTO(int r_id, String r_account, String r_date, int r_money, int s_id) {
		super();
		this.r_id = r_id;
		this.r_account = r_account;
		this.r_date = r_date;
		this.r_money = r_money;
		this.s_id = s_id;
	}

	public int getR_id() {
		return r_id;
	}

	public void setR_id(int r_id) {
		this.r_id = r_id;
	}

	public String getR_account() {
		return r_account;
	}

	public void setR_account(String r_account) {
		this.r_account = r_account;
	}

	public String getR_date() {
		return r_date;
	}

	public void setR_date(String r_date) {
		this.r_date = r_date;
	}

	public int getR_money() {
		return r_money;
	}

	public void setR_money(int r_money) {
		this.r_money = r_money;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	
	
}
