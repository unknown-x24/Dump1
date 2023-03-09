package com.adi.inputMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class working {
	
	@RequestMapping("/page1")
	public ModelAndView helloName() {
	
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("wel","Hi User, welcome to the first Spring MVC Application");
		return model;
	}
	@RequestMapping("/page2/{name}/{id}")
	public ModelAndView helloPos(@PathVariable String name , @PathVariable("id") String name1 ) {
	
		ModelAndView model1 = new ModelAndView("HelloPage");
		model1.addObject("wel",name1+ "Analyst "+name);
		return model1;
	}
	
	@RequestMapping("/admissionForm.html")
	public ModelAndView addForm( ) {
	
		ModelAndView model1 = new ModelAndView("AdmissionForm");
		
		return model1;
	}
	
	@RequestMapping("/submitAdmissionForm.html")
	public ModelAndView submitForm( @RequestParam("studentName" )String name,@RequestParam("studentHobby" )String hobby) {
	
		ModelAndView model1 = new ModelAndView("AdmissionSuccess");
		model1.addObject("msg","Hi "+name+" your hobby is "+hobby);
		return model1;
	}


}
