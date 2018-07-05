package com.clothing.pojo;
//³ßÂë±í
public class Size {
	private int s_id;
	private String s_size;
	
	
	public Size() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Size(int s_id, String s_size) {
		super();
		this.s_id = s_id;
		this.s_size = s_size;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_size() {
		return s_size;
	}

	public void setS_size(String s_size) {
		this.s_size = s_size;
	}

	@Override
	public String toString() {
		return "Size [s_id=" + s_id + ", s_size=" + s_size + "]";
	}
	

}
