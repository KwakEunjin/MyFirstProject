package com.project.EunJinHyuk.notice.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.project.EunJinHyuk.common.dao.AbstractDAO;

@Repository("noticeDAO")
public class NoticeDAO extends AbstractDAO{

	public List<Map<String, Object>> selectNoticeList(Map<String, Object> map) {
		return (List<Map<String, Object>>)selectList("notice.selectNoticeList", map);
	}

}
