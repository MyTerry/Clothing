package com.clothing.action;
 
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.clothing.pojo.Goods_Info;
import com.clothing.pojo.Recommend;
import com.clothing.pojo.ShopPing;
import com.clothing.pojo.Tbl_Province;
import com.clothing.service.GoogsLoadingImpl;

@Controller
public class GoogsLoadingAction {
	@Autowired
	private GoogsLoadingImpl googsLoadingImpl;
	@RequestMapping("text") //��Ʒ��ѡ���ݼ���
    public String googsString(ModelMap map) throws Exception{
    	System.out.println("����acton");
    	List<Recommend> list=googsLoadingImpl.recommendGoodsAll();
    	map.put("value", list);
    	return "index";
    }
	@RequestMapping("female")  //��Ʒ�������ݼ���
	public @ResponseBody List<Goods_Info> femaleAll(String name,ModelMap map,HttpServletResponse response) throws Exception{
		System.out.println("����femaleAll����");
		name = URLDecoder.decode(name, "utf-8");
	    System.out.println(name);
		List<Goods_Info> gInfos=googsLoadingImpl.SelectfemaleAll(name);
		System.out.println(gInfos);
		return gInfos;
    }
	@RequestMapping("parentid")  //���ص�������������
	public String parentidString() throws Exception{
		List<Tbl_Province> listProvince= googsLoadingImpl.parentidAll(0);
		System.out.println(listProvince);
		return "index";
	}
	@RequestMapping("shopping")  //��ѯ���ﳵ
	public String shoppingInfo() throws Exception{
		System.out.println("123");	
		List<ShopPing> shop=googsLoadingImpl.UserShoppingAll(1);
		System.out.println(shop);
		return "index";
	}
	@RequestMapping("addShoppingDeom")
	public String addShopping(ShopPing shop) throws Exception{
		Date date=new Date();  //��ȡ��ǰʱ��
    	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");   
		shop.setSh_data(df.format(date));
		shop.setSh_size("XXL");
		shop.setSh_number(1);
		shop.setSh_user_id(1);
		shop.setSh_goods_id(1);
		
		int i=googsLoadingImpl.saveShopping(shop);
		System.out.println(i);
		return "index";
	}
}
