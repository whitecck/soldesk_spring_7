package org.soldesk.DTO;

public class SellerDTO {
	private int s_id; // 판매자번호
	private String s_name; //이름
	private String s_phone; //핸드폰번호
	private String s_loginid; //아이디
	private String s_pw; // 패스워드
	private String s_email; //이메일
	private int s_open; // 개점여부
	private int s_dotori; //보유 액수
	private int s_location; // 위치
	
	public SellerDTO () {}

	public SellerDTO(int s_id, String s_name, String s_phone, String s_loginid, String s_pw, String s_email, int s_open,
			int s_dotori, int s_location) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_phone = s_phone;
		this.s_loginid = s_loginid;
		this.s_pw = s_pw;
		this.s_email = s_email;
		this.s_open = s_open;
		this.s_dotori = s_dotori;
		this.s_location = s_location;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_phone() {
		return s_phone;
	}

	public void setS_phone(String s_phone) {
		this.s_phone = s_phone;
	}

	public String getS_loginid() {
		return s_loginid;
	}

	public void setS_loginid(String s_loginid) {
		this.s_loginid = s_loginid;
	}

	public String getS_pw() {
		return s_pw;
	}

	public void setS_pw(String s_pw) {
		this.s_pw = s_pw;
	}

	public String getS_email() {
		return s_email;
	}

	public void setS_email(String s_email) {
		this.s_email = s_email;
	}

	public int getS_open() {
		return s_open;
	}

	public void setS_open(int s_open) {
		this.s_open = s_open;
	}

	public int getS_dotori() {
		return s_dotori;
	}

	public void setS_dotori(int s_dotori) {
		this.s_dotori = s_dotori;
	}

	public int getS_location() {
		return s_location;
	}

	public void setS_location(int s_location) {
		this.s_location = s_location;
	}
	
	
	
}
