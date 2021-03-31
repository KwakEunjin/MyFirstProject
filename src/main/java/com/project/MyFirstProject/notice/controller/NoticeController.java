package com.project.MyFirstProject.notice.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.MyFirstProject.HomeController;
import com.project.MyFirstProject.notice.service.NoticeService;

@Controller /* ��Ʈ�ѷ� ��ü���� ���� */
public class NoticeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Resource(name="noticeService") 
	private NoticeService noticeService;
	
	@RequestMapping(value="/notice/notice") 
	public ModelAndView selectNoticeList(Map<String,Object> commandMap) throws Exception { 
		logger.debug(this.getClass().toString());
		
		ModelAndView mv = new ModelAndView("/notice/notice"); 
		List<Map<String,Object>> list = noticeService.selectNoticeList(commandMap); 
		
		mv.addObject("list", list); 
		return mv;
	}
	
	@RequestMapping(value="/notice/writeNotice") 
	public ModelAndView writeNotice(Map<String,Object> commandMap) throws Exception { 
		logger.debug(this.getClass().toString());
		
		ModelAndView mv = new ModelAndView("/notice/writeNotice"); 
		return mv;
	}

}
