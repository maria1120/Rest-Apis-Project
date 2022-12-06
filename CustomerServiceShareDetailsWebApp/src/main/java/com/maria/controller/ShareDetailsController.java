package com.maria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.maria.entity.CustomerServiceShareDetails;
import com.maria.service.MainService;

@Controller
public class ShareDetailsController {
	
	@Autowired
	private MainService service;
	
	
	@RequestMapping("/")
   public ModelAndView getUserInputPage() {
   return new ModelAndView("index");
	}
	
	@RequestMapping("/showResult")
	public ModelAndView searchDetails(@RequestParam("cId") int customerId) {
		ModelAndView modelAndView = new ModelAndView();
		
		List<CustomerServiceShareDetails> detailsList = service.getDetailsByCustomerId(customerId);
		modelAndView.addObject("detailsList", detailsList);
		modelAndView.addObject("customerId", customerId);
		modelAndView.setViewName("showResults");
		
		return modelAndView;
	}
}
