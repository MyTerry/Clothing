package com.clothing.dao_mapper;

import java.util.List;

import com.clothing.pojo.Recommend;
/**
 * ��ҳ���ݼ��ز�ѯ
 * 
 * */
public interface Goods_loading_Index {
	//��ѯ��Ʒ��Ϣ
     public List<Recommend> recommendGoodsAll() throws Exception;
}
