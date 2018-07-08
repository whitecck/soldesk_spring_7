package org.soldesk.DTO;

public class ItemsDTO {
	private int i_id; //상품번호
	private int s_id; //판매자번호
	private String i_name; //상품이름
	private int i_price; //상품가격
	private String i_desc; //상품설명
	private String i_image; //상품사진
	
	public ItemsDTO() {}

	public ItemsDTO(int i_id, int s_id, String i_name, int i_price, String i_desc, String i_image) {
		super();
		this.i_id = i_id;
		this.s_id = s_id;
		this.i_name = i_name;
		this.i_price = i_price;
		this.i_desc = i_desc;
		this.i_image = i_image;
	}

	public int getI_id() {
		return i_id;
	}

	public void setI_id(int i_id) {
		this.i_id = i_id;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getI_name() {
		return i_name;
	}

	public void setI_name(String i_name) {
		this.i_name = i_name;
	}

	public int getI_price() {
		return i_price;
	}

	public void setI_price(int i_price) {
		this.i_price = i_price;
	}

	public String getI_desc() {
		return i_desc;
	}

	public void setI_desc(String i_desc) {
		this.i_desc = i_desc;
	}

	public String getI_image() {
		return i_image;
	}

	public void setI_image(String i_image) {
		this.i_image = i_image;
	}
	
	
}
