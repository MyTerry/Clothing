package com.clothing.dao_mapper;

import java.util.List;

import com.clothing.pojo.Goods_Info;
import com.clothing.pojo.Recommend;
import com.clothing.pojo.ShopPing;
import com.clothing.pojo.Tbl_Province;
import com.clothing.pojo.Types;
/**
 * 主页内容加载查询
 * 
 * */
public interface Goods_loading_Index {
	 //查询精品信息
     public List<Recommend> recommendGoodsAll() throws Exception;
     //查询女装信息
     public List<Goods_Info> SelectfemaleAll(String name) throws Exception;
     //查询省份
     public List<Tbl_Province> parentidAll(int id) throws Exception;
	 //查询购物车
     public List<ShopPing> UserShoppingAll(int id) throws Exception;
     //添加购物车
     public int saveShopping(ShopPing shop) throws Exception;
}
