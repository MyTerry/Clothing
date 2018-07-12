package com.clothing.pojo;

import java.util.List;

//商品详情表
public class Goods_Info {
	private int g_id;
	private String g_name;
	private double g_price;
	private String g_im;
	private float g_discount;
	private String g_describe;
	// 关联类型表
	private Types types;
	private double g_original;
	
	private List<Goods_img> Goods_imgs;
	
	private List<Comment> Comments;
	
	
	
	
	public Goods_Info() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goods_Info(int g_id, String g_name, double g_price, String g_im,
			float g_discount, String g_describe, Types types,
			double g_original, List<Goods_img> goods_imgs,
			List<Comment> comments) {
		super();
		this.g_id = g_id;
		this.g_name = g_name;
		this.g_price = g_price;
		this.g_im = g_im;
		this.g_discount = g_discount;
		this.g_describe = g_describe;
		this.types = types;
		this.g_original = g_original;
		Goods_imgs = goods_imgs;
		Comments = comments;
	}





	public List<Comment> getComments() {
		return Comments;
	}
	public void setComments(List<Comment> comments) {
		Comments = comments;
	}





	public List<Goods_img> getGoods_imgs() {
		return Goods_imgs;
	}

	public void setGoods_imgs(List<Goods_img> goods_imgs) {
		Goods_imgs = goods_imgs;
	}

	public int getG_id() {
		return g_id;
	}

	public void setG_id(int g_id) {
		this.g_id = g_id;
	}

	public String getG_name() {
		return g_name;
	}

	public void setG_name(String g_name) {
		this.g_name = g_name;
	}

	public double getG_price() {
		return g_price;
	}

	public void setG_price(double g_price) {
		this.g_price = g_price;
	}

	public String getG_im() {
		return g_im;
	}

	public void setG_im(String g_im) {
		this.g_im = g_im;
	}

	public float getG_discount() {
		return g_discount;
	}

	public void setG_discount(float g_discount) {
		this.g_discount = g_discount;
	}

	public String getG_describe() {
		return g_describe;
	}

	public void setG_describe(String g_describe) {
		this.g_describe = g_describe;
	}

	public Types getTypes() {
		return types;
	}

	public void setTypes(Types types) {
		this.types = types;
	}

	public double getG_original() {
		return g_original;
	}

	public void setG_original(double g_original) {
		this.g_original = g_original;
	}
	@Override
	public String toString() {
		return "Goods_Info [g_id=" + g_id + ", g_name=" + g_name + ", g_price="
				+ g_price + ", g_im=" + g_im + ", g_discount=" + g_discount
				+ ", g_describe=" + g_describe + ", types=" + types
				+ ", g_original=" + g_original + ", Goods_imgs=" + Goods_imgs
				+ ", Comments=" + Comments + "]";
	}

}
