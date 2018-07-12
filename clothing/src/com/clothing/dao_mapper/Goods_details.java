package com.clothing.dao_mapper;

import java.util.List;

import com.clothing.pojo.Goods_Info;
import com.clothing.pojo.Size;

public interface Goods_details {
 //查询商品详情	
 public Goods_Info selectGoods(int id);
 public Goods_Info selectinfo_img(int id);
 //查询尺码
 public List<Size> selectsize();
}
