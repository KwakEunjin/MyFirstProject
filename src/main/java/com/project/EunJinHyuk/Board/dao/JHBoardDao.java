package com.project.EunJinHyuk.Board.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("JHBoardDao")
public class JHBoardDao implements JHBoardDaoImpl {
	
	@Autowired
    private SqlSession sqlSession;
	@Override
    public List<Map<String, Object>> boardList() {
        return sqlSession.selectList("board.boardList");
	}
}
