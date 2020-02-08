package com.demo;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

	@RequestMapping("add")
	public ModelAndView calc(HttpServletRequest req,HttpServletResponse res) {
		
		String i =req.getParameter("t1");
		String j =req.getParameter("t2");
		
		Integer i1 = Integer.parseInt(i);
		Integer i2= Integer.parseInt(j);
		
		Integer result = i1+i2;
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("result", result);
		mv.setViewName("result");
		
		return mv;
		
		
		
	}
}
