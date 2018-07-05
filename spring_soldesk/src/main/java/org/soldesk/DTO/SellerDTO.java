package org.soldesk.DTO;

public class SellerDTO {
	private int s_id; // 판매자번호
	private String s_name; //이름
	private String s_phone; //핸드폰번호
	private String s_loginid; //아이디
	private String s_image; // 가게 사진
	private String s_pw; // 패스워드
	private String s_email; //이메일
	private int s_open; // 개점여부
	private String s_time; // 영업시간 
	private String s_location; // 위치
	private String s_category; // 카테고리
	private int s_dotori; //보유 액수
	
	public SellerDTO () {}

	public SellerDTO(int s_id, String s_name, String s_phone, String s_loginid, String s_image, String s_pw,
			String s_email, int s_open, String s_time, String s_location, String s_category, int s_dotori) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_phone = s_phone;
		this.s_loginid = s_loginid;
		this.s_image = s_image;
		this.s_pw = s_pw;
		this.s_email = s_email;
		this.s_open = s_open;
		this.s_time = s_time;
		this.s_location = s_location;
		this.s_category = s_category;
		this.s_dotori = s_dotori;
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

	public String getS_image() {
		return s_image;
	}

	public void setS_image(String s_image) {
		this.s_image = s_image;
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

	public String getS_time() {
		return s_time;
	}

	public void setS_time(String s_time) {
		this.s_time = s_time;
	}

	public String getS_location() {
		return s_location;
	}

	public void setS_location(String s_location) {
		this.s_location = s_location;
	}

	public String getS_category() {
		return s_category;
	}

	public void setS_category(String s_category) {
		this.s_category = s_category;
	}

	public int getS_dotori() {
		return s_dotori;
	}

	public void setS_dotori(int s_dotori) {
		this.s_dotori = s_dotori;
	}

	
	
	
	
}
