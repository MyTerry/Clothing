package com.clothing.dao_mapper;

import java.util.List;

import com.clothing.pojo.Recommend;
/**
 * 主页内容加载查询
 * 
 * */
public interface Goods_loading_Index {
	//查询精品信息
     public List<Recommend> recommendGoodsAll() throws Exception;
}
