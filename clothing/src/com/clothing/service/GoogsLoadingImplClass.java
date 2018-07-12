package com.clothing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.clothing.dao_mapper.Goods_loading_Index;
import com.clothing.pojo.Goods_Info;
import com.clothing.pojo.Recommend;
import com.clothing.pojo.ShopPing;
import com.clothing.pojo.Tbl_Province;
import com.clothing.pojo.Types;
/*@Service*/
public class GoogsLoadingImplClass implements GoogsLoadingImpl{
	@Autowired
    private Goods_loading_Index goods_loading_Index;
	//��ѯ��Ʒ��Ϣ�ӿ�ʵ�ַ���
	public List<Recommend> recommendGoodsAll() throws Exception {
        System.out.println("����service");
        List<Recommend> list=goods_loading_Index.recommendGoodsAll();
        		System.out.println(list.toString());
		return goods_loading_Index.recommendGoodsAll();
	}
	//��ѯŮװ��Ϣ�ӿ�ʵ�ַ���
	public List<Goods_Info> SelectfemaleAll(String name) throws Exception {
		System.out.println("����SelectfemaleAll����");
		return goods_loading_Index.SelectfemaleAll(name);
	}
	//��ѯʡ��
	public List<Tbl_Province> parentidAll(int id) throws Exception {
		System.out.println("����parentidAll");
		return goods_loading_Index.parentidAll(id);
	}
	//��ѯ���ﳵ
	public List<ShopPing> UserShoppingAll(int id) throws Exception {
        System.out.println("����userShoppingAll");
		return goods_loading_Index.UserShoppingAll(id);
	}
	//��ӹ��ﳵ
	public int saveShopping(ShopPing shop) throws Exception {
		System.out.println("����saveShopping");
		return goods_loading_Index.saveShopping(shop);
	}
}
