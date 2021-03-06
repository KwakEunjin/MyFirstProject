package com.project.MyFirstProject.notice.service;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.project.MyFirstProject.notice.dao.NoticeDAO;

@Service("noticeService")
public class NoticeServiceImpl implements NoticeService {

	@Resource(name="noticeDAO") 
	private NoticeDAO noticeDAO; 
	
	@Override 
	public List<Map<String, Object>> selectNoticeList(Map<String, Object> map) throws Exception { 
		return noticeDAO.selectNoticeList(map); 
	}

}
