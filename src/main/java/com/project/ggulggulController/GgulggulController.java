package com.project.ggulggulController;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.EunJinHyuk.HomeController;

public class GgulggulController {
	
private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/views/ggulggul/ggulggulMain", method = RequestMethod.GET)
	public ModelAndView  ggulggulMain(Locale locale) {
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("/ggulggul/ggulggulMain");
		return mv;
	}
}
