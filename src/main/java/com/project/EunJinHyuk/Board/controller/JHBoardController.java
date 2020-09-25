package com.project.EunJinHyuk.Board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

	@Controller
	public class JHBoardController {
		
		@RequestMapping(value = "/ggulggul/ggulggulBoard")
		public ModelAndView  ggulggulMain() {
			
			ModelAndView mv = new ModelAndView("/ggulggul/ggulggulBoard");
			
			return mv;
		}
		
		
		
		
	}
