package com.project.MyFirstProject;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/*  초기화면 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(Locale locale, Model model) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("location", "index");
		mv.addObject("menuUrl", "main.jsp");
		mv.setViewName("index");
		
		return mv;
	}
	
	/* 메인으로 이동 */ 
	@RequestMapping(value = "/main.do", method = RequestMethod.GET)
	public ModelAndView main(Locale locale, Model model) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("location", "index");
		mv.addObject("menuUrl", "main.jsp");
		mv.setViewName("index");
		
		return mv;
	}
	
	/* mySelf 게시판으로 이동 */
	@RequestMapping(value = "/mySelf/goMySelf.do", method = RequestMethod.GET)
	public ModelAndView goMySelf(Locale locale, Model model) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("location", "index");
		mv.addObject("menuUrl", "myself/mySelf.jsp");
		mv.setViewName("index");
		
		return mv;
	}
}
