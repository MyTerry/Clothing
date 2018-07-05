package com.clothing.pojo;
//”√ªß±Ì
public class Users {
	private int u_Id;
	private String u_Tel;
	private String u_Pass;
	private String u_Name;
	private String u_Head;
	private String u_Sex;
	private String u_Address;
	
	
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(int u_Id, String u_Tel, String u_Pass, String u_Name,
			String u_Head, String u_Sex, String u_Address) {
		super();
		this.u_Id = u_Id;
		this.u_Tel = u_Tel;
		this.u_Pass = u_Pass;
		this.u_Name = u_Name;
		this.u_Head = u_Head;
		this.u_Sex = u_Sex;
		this.u_Address = u_Address;
	}
	public int getU_Id() {
		return u_Id;
	}
	public void setU_Id(int u_Id) {
		this.u_Id = u_Id;
	}
	public String getU_Tel() {
		return u_Tel;
	}
	public void setU_Tel(String u_Tel) {
		this.u_Tel = u_Tel;
	}
	public String getU_Pass() {
		return u_Pass;
	}
	public void setU_Pass(String u_Pass) {
		this.u_Pass = u_Pass;
	}
	public String getU_Name() {
		return u_Name;
	}
	public void setU_Name(String u_Name) {
		this.u_Name = u_Name;
	}
	public String getU_Head() {
		return u_Head;
	}
	public void setU_Head(String u_Head) {
		this.u_Head = u_Head;
	}
	public String getU_Sex() {
		return u_Sex;
	}
	public void setU_Sex(String u_Sex) {
		this.u_Sex = u_Sex;
	}
	public String getU_Address() {
		return u_Address;
	}
	public void setU_Address(String u_Address) {
		this.u_Address = u_Address;
	}
	@Override
	public String toString() {
		return "Users [u_Id=" + u_Id + ", u_Tel=" + u_Tel + ", u_Pass="
				+ u_Pass + ", u_Name=" + u_Name + ", u_Head=" + u_Head
				+ ", u_Sex=" + u_Sex + ", u_Address=" + u_Address + "]";
	}

}
