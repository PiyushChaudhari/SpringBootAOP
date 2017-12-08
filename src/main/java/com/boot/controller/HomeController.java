package com.boot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.boot.model.Addition;
import com.boot.service.AdditionService;

@Controller
@RequestMapping(value = { "/home" })
public class HomeController {
	
	@Autowired
	private AdditionService additionService; 

	@RequestMapping(value = { "/index" }, method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView md = new ModelAndView("index");
		md.addObject("addition", new Addition());
		return md;
	}

	@RequestMapping(value = "/result", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("addition") Addition addition) {
		
		ModelAndView md = new ModelAndView("result");
		md.addObject("result", additionService.processAddition(addition));
		
		return md;

	}
}
