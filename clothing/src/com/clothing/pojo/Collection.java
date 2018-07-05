package com.clothing.pojo;

import java.util.List;
//收藏表
public class Collection {
	private int co_id;
	// 关联用户
	private Users user;
	// 关联商品
	private List<Goods_Info> Goods_Info;

	public Collection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Collection(int co_id, Users user,
			List<com.clothing.pojo.Goods_Info> goods_Info) {
		super();
		this.co_id = co_id;
		this.user = user;
		Goods_Info = goods_Info;
	}

	public int getCo_id() {
		return co_id;
	}

	public void setCo_id(int co_id) {
		this.co_id = co_id;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public List<Goods_Info> getGoods_Info() {
		return Goods_Info;
	}

	public void setGoods_Info(List<Goods_Info> goods_Info) {
		Goods_Info = goods_Info;
	}

	@Override
	public String toString() {
		return "Collection [co_id=" + co_id + ", user=" + user
				+ ", Goods_Info=" + Goods_Info + "]";
	}

}
