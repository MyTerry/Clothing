package com.clothing.action;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clothing.service.GoogsLoadingImpl;

@Controller
public class GoogsLoadingAction {
	@Autowired
	private GoogsLoadingImpl googsLoadingImpl;
	@RequestMapping("text")
    public String googsString() throws Exception{
    	System.out.println("½øÈëacton");
    	googsLoadingImpl.recommendGoodsAll();
    	return "index";
    }
}
