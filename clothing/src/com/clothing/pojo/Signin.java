package com.clothing.pojo;

import java.util.List;
//签到表
public class Signin {
	private int si_id;
	private int si_fate;
	// 关联用户
	private List<Users> User;
	
	

	public Signin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Signin(int si_id, int si_fate, List<Users> user) {
		super();
		this.si_id = si_id;
		this.si_fate = si_fate;
		User = user;
	}

	public int getSi_id() {
		return si_id;
	}

	public void setSi_id(int si_id) {
		this.si_id = si_id;
	}

	public int getSi_fate() {
		return si_fate;
	}

	public void setSi_fate(int si_fate) {
		this.si_fate = si_fate;
	}

	public List<Users> getUser() {
		return User;
	}

	public void setUser(List<Users> user) {
		User = user;
	}

	@Override
	public String toString() {
		return "Signin [si_id=" + si_id + ", si_fate=" + si_fate + ", User="
				+ User + "]";
	}

}
