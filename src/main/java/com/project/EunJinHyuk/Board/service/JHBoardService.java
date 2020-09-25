package com.project.EunJinHyuk.Board.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.project.EunJinHyuk.Board.dao.JHBoardDao;

@Service("JHBoardService")
public class JHBoardService implements JHBoardServiceImpl {
	
	@Resource(name = "JHBoardDao")
	private JHBoardDao Dao;
	@Override
	public List<Map<String, Object>> boardList() {
		return Dao.boardList();
		
	}
}
