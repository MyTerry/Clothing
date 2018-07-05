package com.clothing.pojo;

import java.util.List;
//推荐表
public class Recommend {
	private int re_id;
	// 关联商品
	private List<Goods_Info> goods_info;

	public Recommend() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Recommend(int re_id, List<Goods_Info> goods_info) {
		super();
		this.re_id = re_id;
		this.goods_info = goods_info;
	}

	public int getRe_id() {
		return re_id;
	}

	public void setRe_id(int re_id) {
		this.re_id = re_id;
	}

	public List<Goods_Info> getGoods_info() {
		return goods_info;
	}

	public void setGoods_info(List<Goods_Info> goods_info) {
		this.goods_info = goods_info;
	}

	@Override
	public String toString() {
		return "Recommend [re_id=" + re_id + ", goods_info=" + goods_info + "]";
	}

}
