package com.clothing.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PingLun {
	@RequestMapping(value="pinglun",method=RequestMethod.GET)
   public void selectPL(){
	   
   }
}
