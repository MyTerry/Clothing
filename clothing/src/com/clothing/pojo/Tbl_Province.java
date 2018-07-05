package com.clothing.pojo;
//Ê¡ÊÐ±í
public class Tbl_Province {
	private int codeId;
	private int parentid;
	private String cityName;

	public Tbl_Province() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tbl_Province(int codeId, int parentid, String cityName) {
		super();
		this.codeId = codeId;
		this.parentid = parentid;
		this.cityName = cityName;
	}

	public int getCodeId() {
		return codeId;
	}

	public void setCodeId(int codeId) {
		this.codeId = codeId;
	}

	public int getParentid() {
		return parentid;
	}

	public void setParentid(int parentid) {
		this.parentid = parentid;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Tbl_Province [codeId=" + codeId + ", parentid=" + parentid
				+ ", cityName=" + cityName + "]";
	}

}
