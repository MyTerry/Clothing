package com.clothing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.clothing.dao_mapper.Goods_loading_Index;
import com.clothing.pojo.Goods_Info;
import com.clothing.pojo.Recommend;
import com.clothing.pojo.Tbl_Province;
import com.clothing.pojo.Types;
/*@Service*/
public class GoogsLoadingImplClass implements GoogsLoadingImpl{
	@Autowired
    private Goods_loading_Index goods_loading_Index;
	//查询精品信息接口实现方法
	public List<Recommend> recommendGoodsAll() throws Exception {
        System.out.println("进入service");
        List<Recommend> list=goods_loading_Index.recommendGoodsAll();
        		System.out.println(list.toString());
		return goods_loading_Index.recommendGoodsAll();
	}
	//查询女装信息接口实现方法
	public List<Goods_Info> SelectfemaleAll(Types type) throws Exception {
		System.out.println("进入SelectfemaleAll方法");
		return goods_loading_Index.SelectfemaleAll(type);
	}
	//查询省份
	public List<Tbl_Province> parentidAll(int id) throws Exception {
		System.out.println("进入parentidAll");
		return goods_loading_Index.parentidAll(id);
	}
}
