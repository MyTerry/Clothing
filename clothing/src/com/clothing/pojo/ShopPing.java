package com.clothing.pojo;

import java.util.Date;
import java.util.List;
//购物车表
public class ShopPing {
private int sh_id;
private Date sh_data;
//用户
private Users u;
//商品
private List<Goods_Info> Goods_Infos;


public ShopPing() {
	super();
	// TODO Auto-generated constructor stub
}
public ShopPing(int sh_id, Date sh_data, Users u, List<Goods_Info> goods_Infos) {
	super();
	this.sh_id = sh_id;
	this.sh_data = sh_data;
	this.u = u;
	Goods_Infos = goods_Infos;
}
public int getSh_id() {
	return sh_id;
}
public void setSh_id(int sh_id) {
	this.sh_id = sh_id;
}
public Date getSh_data() {
	return sh_data;
}
public void setSh_data(Date sh_data) {
	this.sh_data = sh_data;
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
@Override
public String toString() {
	return "ShopPing [sh_id=" + sh_id + ", sh_data=" + sh_data + ", u=" + u
			+ ", Goods_Infos=" + Goods_Infos + "]";
}


}
