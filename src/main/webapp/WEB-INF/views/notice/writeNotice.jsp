<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page session="false" %>
<link href="/css/notice/notice.css?ver=2020092615" rel="stylesheet" type="text/css"/>
<html>
<head>
	<title>게시판</title>
</head>
<script>
function listNotice(){
	  
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
}

</script>
<body>
	<div class="notice_body">
		<div class="notice_title">
			<img alt="" src="/images/notice/title_icon.png">
			<h2>글쓰기</h2>
			<div class="notice_btn">
				<a href="/notice/save">저장</a>
			</div>
		</div>
		
		<textarea rows="50" cols="300" style="width:100%"></textarea>
	</div>
</body>
</html>
