package com.clothing.pojo;

import java.util.Date;
import java.util.List;
//订单详情表
public class OrderDetails {
private int od_id;
private int od_number;
private double od_money;
private Date od_data;
//关联商品
private List<Goods_Info> Goods_Info;
//关联订单
private Orders Order;



public OrderDetails() {
	super();
	// TODO Auto-generated constructor stub
}
public OrderDetails(int od_id, int od_number, double od_money, Date od_data,
		List<com.clothing.pojo.Goods_Info> goods_Info, Orders order) {
	super();
	this.od_id = od_id;
	this.od_number = od_number;
	this.od_money = od_money;
	this.od_data = od_data;
	Goods_Info = goods_Info;
	Order = order;
}
public int getOd_id() {
	return od_id;
}
public void setOd_id(int od_id) {
	this.od_id = od_id;
}
public int getOd_number() {
	return od_number;
}
public void setOd_number(int od_number) {
	this.od_number = od_number;
}
public double getOd_money() {
	return od_money;
}
public void setOd_money(double od_money) {
	this.od_money = od_money;
}
public Date getOd_data() {
	return od_data;
}
public void setOd_data(Date od_data) {
	this.od_data = od_data;
}
public List<Goods_Info> getGoods_Info() {
	return Goods_Info;
}
public void setGoods_Info(List<Goods_Info> goods_Info) {
	Goods_Info = goods_Info;
}
public Orders getOrder() {
	return Order;
}
public void setOrder(Orders order) {
	Order = order;
}
@Override
public String toString() {
	return "OrderDetails [od_id=" + od_id + ", od_number=" + od_number
			+ ", od_money=" + od_money + ", od_data=" + od_data
			+ ", Goods_Info=" + Goods_Info + ", Order=" + Order + "]";
}

}
