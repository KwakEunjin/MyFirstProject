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
		mv.addObject("menuUrl", "include/main.jsp");
		mv.setViewName("index");
		
		return mv;
	}
	
	/* 메인으로 이동 */ 
	@RequestMapping(value = "/main.do", method = RequestMethod.GET)
	public ModelAndView main(Locale locale, Model model) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("location", "index");
		mv.addObject("menuUrl", "include/main.jsp");
		mv.setViewName("index");
		
		return mv;
	}
	
	/* resume 게시판으로 이동 */
	@RequestMapping(value = "/resume/goResume.do", method = RequestMethod.GET)
	public ModelAndView goResume(Locale locale, Model model) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("location", "index");
		mv.addObject("menuUrl", "resume/resume.jsp");
		mv.setViewName("index");
		
		return mv;
	}
	
	/* itInfo 게시판으로 이동 */
	@RequestMapping(value = "/itInfo/goItInfo.do", method = RequestMethod.GET)
	public ModelAndView goItInfo(Locale locale, Model model) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("location", "index");
		mv.addObject("menuUrl", "itInfo/itInfo.jsp");
		mv.setViewName("index");
		
		return mv;
	}
	
	/* codeReview 게시판으로 이동 */
	@RequestMapping(value = "/codeReview/goCodeReview.do", method = RequestMethod.GET)
	public ModelAndView goCodeReview(Locale locale, Model model) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("location", "index");
		mv.addObject("menuUrl", "codeReview/codeReview.jsp");
		mv.setViewName("index");
		
		return mv;
	}
	
	/* community 게시판으로 이동 */
	@RequestMapping(value = "/community/goCommunity.do", method = RequestMethod.GET)
	public ModelAndView goCommunity(Locale locale, Model model) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("location", "index");
		mv.addObject("menuUrl", "community/community.jsp");
		mv.setViewName("index");
		
		return mv;
	}
	
	/* familySite 게시판으로 이동 */
	@RequestMapping(value = "/familySite/goFamilySite.do", method = RequestMethod.GET)
	public ModelAndView goFamilySite(Locale locale, Model model) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("location", "index");
		mv.addObject("menuUrl", "familySite/familySite.jsp");
		mv.setViewName("index");
		
		return mv;
	}
}
