package com.clothing.dao_mapper;

import java.util.List;

import com.clothing.pojo.Goods_Info;
import com.clothing.pojo.Size;

public interface Goods_details {
 //��ѯ��Ʒ����	
 public Goods_Info selectGoods(int id);
 public Goods_Info selectinfo_img(int id);
 //��ѯ����
 public List<Size> selectsize();
}
