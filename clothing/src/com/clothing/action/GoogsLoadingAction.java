package com.clothing.action;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clothing.pojo.Goods_Info;
import com.clothing.pojo.Tbl_Province;
import com.clothing.pojo.Types;
import com.clothing.service.GoogsLoadingImpl;

@Controller
public class GoogsLoadingAction {
	@Autowired
	private GoogsLoadingImpl googsLoadingImpl;
	@RequestMapping("text")
    public String googsString() throws Exception{
    	System.out.println("进入acton");
    	googsLoadingImpl.recommendGoodsAll();
    	return "index";
    }
	@RequestMapping("female")
	public String femaleAll(Types type) throws Exception{
		System.out.println("进入femaleAll方法");
	    type.setT_name("女装");
		List<Goods_Info> gInfos=googsLoadingImpl.SelectfemaleAll(type);
		System.out.println(gInfos);
		return "index";
    }
	@RequestMapping("parentid")
	public String parentidString() throws Exception{
		List<Tbl_Province> listProvince= googsLoadingImpl.parentidAll(0);
		System.out.println(listProvince);
		return "index";
	}
}
