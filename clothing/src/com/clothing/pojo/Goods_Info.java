package com.clothing.pojo;

import java.util.List;

//商品详情表
public class Goods_Info {
	private int g_id;
	private String g_name;
	private Double g_price;
	private String g_img;
	private float g_discount;
	private String g_describe;
	// 关联类型表
	private Types types;
	private double g_original;
	private List<Goods_img> Goods_imgs;
	private List<Comment> Comments;
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
	public Double getG_price() {
		return g_price;
	}
	public void setG_price(Double g_price) {
		this.g_price = g_price;
	}
	public String getG_img() {
		return g_img;
	}
	public void setG_img(String g_img) {
		this.g_img = g_img;
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
	public List<Goods_img> getGoods_imgs() {
		return Goods_imgs;
	}
	public void setGoods_imgs(List<Goods_img> goods_imgs) {
		Goods_imgs = goods_imgs;
	}
	public List<Comment> getComments() {
		return Comments;
	}
	public void setComments(List<Comment> comments) {
		Comments = comments;
	}
	@Override
	public String toString() {
		return "Goods_Info [g_id=" + g_id + ", g_name=" + g_name + ", g_price="
				+ g_price + ", g_img=" + g_img + ", g_discount=" + g_discount
				+ ", g_describe=" + g_describe + ", types=" + types
				+ ", g_original=" + g_original + ", Goods_imgs=" + Goods_imgs
				+ ", Comments=" + Comments + "]";
	}
	public Goods_Info(int g_id, String g_name, Double g_price, String g_img,
			float g_discount, String g_describe, Types types,
			double g_original, List<Goods_img> goods_imgs,
			List<Comment> comments) {
		super();
		this.g_id = g_id;
		this.g_name = g_name;
		this.g_price = g_price;
		this.g_img = g_img;
		this.g_discount = g_discount;
		this.g_describe = g_describe;
		this.types = types;
		this.g_original = g_original;
		Goods_imgs = goods_imgs;
		Comments = comments;
	}
	public Goods_Info() {
	}
	
	
	
	
	

}
