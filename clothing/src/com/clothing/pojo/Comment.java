package com.clothing.pojo;

import java.util.Date;
//评论表
public class Comment {
	private int co_id;
	private String co_context;
	// 关联用户
	private Users user;
	// 关联商品
	private Goods_Info goods_info;
	private Date co_data;

	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comment(int co_id, String co_context, Users user,
			Goods_Info goods_info, Date co_data) {
		super();
		this.co_id = co_id;
		this.co_context = co_context;
		this.user = user;
		this.goods_info = goods_info;
		this.co_data = co_data;
	}

	public int getCo_id() {
		return co_id;
	}

	public void setCo_id(int co_id) {
		this.co_id = co_id;
	}

	public String getCo_context() {
		return co_context;
	}

	public void setCo_context(String co_context) {
		this.co_context = co_context;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Goods_Info getGoods_info() {
		return goods_info;
	}

	public void setGoods_info(Goods_Info goods_info) {
		this.goods_info = goods_info;
	}

	public Date getCo_data() {
		return co_data;
	}

	public void setCo_data(Date co_data) {
		this.co_data = co_data;
	}

	@Override
	public String toString() {
		return "Comment [co_id=" + co_id + ", co_context=" + co_context
				+ ", user=" + user + ", goods_info=" + goods_info
				+ ", co_data=" + co_data + "]";
	}

}
