package com.clothing.service;

import java.util.List;

import com.clothing.pojo.Goods_Info;
import com.clothing.pojo.Recommend;
import com.clothing.pojo.ShopPing;
import com.clothing.pojo.Tbl_Province;
import com.clothing.pojo.Types;
/**
 * ��ҳ���ݼ��ز�ѯ�ӿ�
 * */
public interface GoogsLoadingImpl{
	//��ѯ��Ʒ��Ϣ�ӿ�
	public List<Recommend> recommendGoodsAll() throws Exception;
	//��ѯŮװ��Ϣ�ӿ�
	public List<Goods_Info> SelectfemaleAll(String name) throws Exception;
	//��ѯʡ��
	public List<Tbl_Province> parentidAll(int id) throws Exception;
	//��ѯ���ﳵ
    public List<ShopPing> UserShoppingAll(int id) throws Exception;
  //��ӹ��ﳵ
    public int saveShopping(ShopPing shop) throws Exception;
}
