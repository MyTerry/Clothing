package com.clothing.service;

import java.util.List;

import com.clothing.pojo.Recommend;
/**
 * 主页内容加载查询接口
 * */
public interface GoogsLoadingImpl{
	//查询精品信息接口
	public List<Recommend> recommendGoodsAll() throws Exception;
}
