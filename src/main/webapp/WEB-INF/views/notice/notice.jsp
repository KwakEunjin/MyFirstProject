<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page session="false" %>
<link href="/css/notice/notice.css?ver=2020092631" rel="stylesheet" type="text/css"/>
<html>
<head>
	<title>게시판</title>
</head>
<script>
/* function listNotice(){
	  
    var url = "/notice/openNoticeList.do";
      
    $.ajax({
        type:"POST",
        url:url,
        dataType : "html",
        success: function(html){
            $(".ajax_inform").html(list);
              list.get();
        },
        error: function(xhr, status, error) {
            alert(error);
        }  
    });
} */

</script>
<body>
	<div class="notice_body">
		<div class="notice_title">
			<img alt="" src="/images/notice/title_icon.png">
			<h2>공지사항</h2>
			<div class="notice_btn">
				<a href="/notice/writeNotice">글쓰기</a>
			</div>
		</div>
		
		<table class="notice_tb1">
			<colgroup>
				<col width="110px"/>
				<col width="*"/>
				<col width="110px"/>
				<col width="110px"/>
				<col width="110px"/>
			</colgroup>
			
			<thead>
			<tr class="tr_title">
				<th scope="col">글번호</th>
				<th scope="col">제목</th>
				<th scope="col">작성일자</th>
				<th scope="col">작성자</th>
				<th scope="col">조회수</th>
			</tr> 
			</thead>
			<tr class="tr_list">
				<td class="td_center">1</td>
				<td>제목</td>
				<td class="td_center">2020-09-20</td>
				<td class="td_center">관리자</td>
				<td class="td_center">1</td>
			</tr> 
			<tr class="tr_list">
				<td class="td_center">2</td>
				<td>제목</td>
				<td class="td_center">2020-09-26</td>
				<td class="td_center">관리자</td>
				<td class="td_center">10</td>
			</tr> 
		</table>
		
		<!-- 페이징처리 -->
		<div class="notice_paging">
		1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10
		</div>
		
		<!-- 검색 -->
		<div class="notice_search">
			<select>
				<option value="1" title="작성자">작성자</option>
				<option value="2" title="제목">제목</option>
			</select>
			<input type="text" width="100px">
			<a href="/notice/search">검색</a>
		</div>
	</div>
</body>
</html>
