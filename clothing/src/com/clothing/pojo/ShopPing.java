package com.clothing.pojo;

import java.util.List;
//购物车表
public class ShopPing {
private int sh_id;
private String sh_data;
private String sh_size;
private int sh_number;
private int sh_user_id;
private int sh_goods_id;
//用户
private Users u;
//商品
private List<Goods_Info> Goods_Infos;


public ShopPing() {
	super();
	// TODO Auto-generated constructor stub
}




@Override
public String toString() {
	return "ShopPing [sh_id=" + sh_id + ", sh_data=" + sh_data + ", sh_size="
			+ sh_size + ", sh_number=" + sh_number + ", sh_user_id="
			+ sh_user_id + ", sh_goods_id=" + sh_goods_id + ", u=" + u
			+ ", Goods_Infos=" + Goods_Infos + "]";
}




public ShopPing(int sh_id, String sh_data, String sh_size, int sh_number,
		int sh_user_id, int sh_goods_id, Users u, List<Goods_Info> goods_Infos) {
	super();
	this.sh_id = sh_id;
	this.sh_data = sh_data;
	this.sh_size = sh_size;
	this.sh_number = sh_number;
	this.sh_user_id = sh_user_id;
	this.sh_goods_id = sh_goods_id;
	this.u = u;
	Goods_Infos = goods_Infos;
}




public String getSh_data() {
	return sh_data;
}

public void setSh_data(String sh_data) {
	this.sh_data = sh_data;
}

public int getSh_user_id() {
	return sh_user_id;
}
public void setSh_user_id(int sh_user_id) {
	this.sh_user_id = sh_user_id;
}
public int getSh_goods_id() {
	return sh_goods_id;
}
public void setSh_goods_id(int sh_goods_id) {
	this.sh_goods_id = sh_goods_id;
}
public String getSh_size() {
	return sh_size;
}

public void setSh_size(String sh_size) {
	this.sh_size = sh_size;
}

public int getSh_number() {
	return sh_number;
}

public void setSh_number(int sh_number) {
	this.sh_number = sh_number;
}

public int getSh_id() {
	return sh_id;
}
public void setSh_id(int sh_id) {
	this.sh_id = sh_id;
}

public Users getU() {
	return u;
}
public void setU(Users u) {
	this.u = u;
}
public List<Goods_Info> getGoods_Infos() {
	return Goods_Infos;
}
public void setGoods_Infos(List<Goods_Info> goods_Infos) {
	Goods_Infos = goods_Infos;
}



}
