package com.project.EunJinHyuk.Board.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.EunJinHyuk.Board.service.JHBoardService;

	@Controller
	public class JHBoardController {
		
		@Resource(name="JHBoardService")
	    private JHBoardService service;
		
		@RequestMapping(value = "/ggulggul/ggulggulBoard")
		public ModelAndView  ggulggulMain() {
			
			ModelAndView mv = new ModelAndView("/ggulggul/ggulggulBoard");
			List<Map<String, Object>> list = service.boardList();
			System.out.println(list.get(0));
			mv.addObject("list",list);
			
			return mv;
		}
		
		
		
		
	}
