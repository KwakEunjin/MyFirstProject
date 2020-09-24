package com.project.EunJinHyuk.notice.service;

import java.util.List;
import java.util.Map;

public interface NoticeService {
	List<Map<String, Object>> selectNoticeList(Map<String, Object> commandMap) throws Exception;
}
