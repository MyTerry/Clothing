package com.clothing.pojo;
//商品图片表
public class Goods_img {
	private int gi_id;
	private String gi_url;
	// 关联商品
	private Goods_Info goods_info;

	
	
	public Goods_img() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Goods_img(int gi_id, String gi_url, Goods_Info goods_info) {
		super();
		this.gi_id = gi_id;
		this.gi_url = gi_url;
		this.goods_info = goods_info;
	}

	public int getGi_id() {
		return gi_id;
	}

	public void setGi_id(int gi_id) {
		this.gi_id = gi_id;
	}

	public String getGi_url() {
		return gi_url;
	}

	public void setGi_url(String gi_url) {
		this.gi_url = gi_url;
	}

	public Goods_Info getGoods_info() {
		return goods_info;
	}

	public void setGoods_info(Goods_Info goods_info) {
		this.goods_info = goods_info;
	}

	@Override
	public String toString() {
		return "Goods_img [gi_id=" + gi_id + ", gi_url=" + gi_url
				+ ", goods_info=" + goods_info + "]";
	}

}
