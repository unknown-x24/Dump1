package com.exSpringMVC.helloController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class helloController extends AbstractController{
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) 
			throws Exception{
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage","Hi User, welcome to the first Spring MVC Application CHICKEN KHAO KHUSH RAHHO");
		return modelandview;
	}

}