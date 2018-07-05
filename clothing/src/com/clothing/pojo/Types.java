package com.clothing.pojo;
//商品类型表
public class Types {
	private int t_id;
	private String t_name;

	public Types() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Types(int t_id, String t_name) {
		super();
		this.t_id = t_id;
		this.t_name = t_name;
	}

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	@Override
	public String toString() {
		return "Types [t_id=" + t_id + ", t_name=" + t_name + "]";
	}

}
