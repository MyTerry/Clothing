package com.clothing.service;

import java.util.List;

import com.clothing.pojo.Goods_Info;
import com.clothing.pojo.Recommend;
import com.clothing.pojo.Tbl_Province;
import com.clothing.pojo.Types;
/**
 * 主页内容加载查询接口
 * */
public interface GoogsLoadingImpl{
	//查询精品信息接口
	public List<Recommend> recommendGoodsAll() throws Exception;
	//查询女装信息接口
	public List<Goods_Info> SelectfemaleAll(Types type) throws Exception;
	//查询省份
	public List<Tbl_Province> parentidAll(int id) throws Exception;
}
