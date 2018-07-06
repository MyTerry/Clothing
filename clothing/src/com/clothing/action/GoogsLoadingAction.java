package com.clothing.action;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoogsLoadingAction {
	@RequestMapping(value="test")
    public String googsString(){
    	System.out.println("½øÈëacton");
    	return null;
    }
}
