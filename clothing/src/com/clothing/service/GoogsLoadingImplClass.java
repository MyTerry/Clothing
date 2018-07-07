package com.clothing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.clothing.dao_mapper.Goods_loading_Index;
import com.clothing.pojo.Recommend;
/*@Service*/
public class GoogsLoadingImplClass implements GoogsLoadingImpl{
	@Autowired
    private Goods_loading_Index goods_loading_Index;
	public List<Recommend> recommendGoodsAll() throws Exception {
        System.out.println("½øÈëservice");
        List<Recommend> list=goods_loading_Index.recommendGoodsAll();
        		System.out.println(list.toString());
		return goods_loading_Index.recommendGoodsAll();
	}

}
