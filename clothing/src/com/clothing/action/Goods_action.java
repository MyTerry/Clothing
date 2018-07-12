package com.clothing.action;


import java.util.List;




import com.alibaba.fastjson.JSON;
import com.clothing.pojo.Goods_Info;
import com.clothing.pojo.Size;
import com.clothing.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//这里是商品详情与尺码
public class Goods_action {
	/*HttpServletRequest request;*/
	@Autowired
	Goods_service Goods_service;
	
	@Autowired
	Size_service Size_service;
	
    @RequestMapping(value="name/ook",method=RequestMethod.GET)
	public String resultget(Model model){
    	/*String str=null;*/
    	System.out.println("ACTION");
    	Goods_Info goods=Goods_service.selectAll();
    	model.addAttribute("goods",goods);
    	System.out.println(goods);
    	//System.out.println(goods.getGoods_imgs().get(0).getGi_url());
    	//System.out.println(goods.getComments().get(0).getCo_context());
    	/*List<Size> szs=Size_service.selectsizeAll();
    	str=JSON.toJSONString(goods);
    	System.out.println(str);
    	ModelAndView ModelAndView=new ModelAndView();
    	ModelAndView.setViewName("chaungzhi");
    	model.addAttribute("goods",goods);
    	model.addAttribute("szs",szs);
    	for(Size s:szs)
    	{
    		System.out.println(s);
    	} */
    	return "login";
    }
}
