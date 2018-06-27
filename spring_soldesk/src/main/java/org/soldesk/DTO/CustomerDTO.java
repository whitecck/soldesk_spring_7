package org.soldesk.DTO;

public class CustomerDTO {
	private int c_id; //손님번호
	private String c_name; //이름
	private String c_phone; //핸드폰번호
	private String c_loginid; //아이디
	private String c_pw; //비밀번호
	private String c_email; //이메일
	private int c_dotori; //보유액수
	
	public CustomerDTO () {}

	public CustomerDTO(int c_id, String c_name, String c_phone, String c_loginid, String c_pw, String c_email,
			int c_dotori) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_phone = c_phone;
		this.c_loginid = c_loginid;
		this.c_pw = c_pw;
		this.c_email = c_email;
		this.c_dotori = c_dotori;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_phone() {
		return c_phone;
	}

	public void setC_phone(String c_phone) {
		this.c_phone = c_phone;
	}

	public String getC_loginid() {
		return c_loginid;
	}

	public void setC_loginid(String c_loginid) {
		this.c_loginid = c_loginid;
	}

	public String getC_pw() {
		return c_pw;
	}

	public void setC_pw(String c_pw) {
		this.c_pw = c_pw;
	}

	public String getC_email() {
		return c_email;
	}

	public void setC_email(String c_email) {
		this.c_email = c_email;
	}

	public int getC_dotori() {
		return c_dotori;
	}

	public void setC_dotori(int c_dotori) {
		this.c_dotori = c_dotori;
	}
	
	
	
}
