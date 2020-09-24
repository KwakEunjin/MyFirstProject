package com.project.ggulggulController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GgulggulController {
	
	@RequestMapping(value = "/ggulggul/ggulggulMain", method = RequestMethod.GET)
	public ModelAndView  ggulggulMain() {
		
		ModelAndView mv = new ModelAndView("/ggulggul/ggulggulMain");
		
		//mv.setViewName();
		return mv;
	}
}
