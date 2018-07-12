package com.clothing.service;

import com.clothing.dao_mapper.*;
import com.clothing.pojo.Goods_Info;
import com.clothing.pojo.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//这里是商品详情Service
@Service
public class Goods_service {
   @Autowired
   Goods_details Goods_interface;
   public Goods_Info selectAll() {
		// TODO Auto-generated method stub
	   System.out.println("这里是Service");
	   Goods_Info g=Goods_interface.selectinfo_img(1);
	   System.out.println(g);
		return Goods_interface.selectinfo_img(1);
	}
}
