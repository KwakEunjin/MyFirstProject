<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page session="false" %>
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
	<h2>게시판 목록</h2>
	<button onclick="listNotice"></button>
	
	<table style="border:1px solid #ccc">
		<colgroup>
			<col width="10%"/>
			<col width="*"/>
			<col width="15%"/>
			<col width="20%"/>
		</colgroup>
		
		<thead>
		<tr>
			<th scope="col">글번호</th>
			<th scope="col">제목</th>
			<th scope="col">조회수</th>
			<th scope="col">작성일</th>
		</tr> 
		</thead> 
		
<%-- 		<tbody> 
			<c:choose>
				<c:when test="${fn:length(list) > 0}">
					<c:forEach items="${list }" var="row">
						<tr>
							<td>${row.IDX }</td>
							<td>${row.TITLE }</td>
							<td>${row.HIT_CNT }</td>
							<td>${row.CREA_DTM }</td>
						</tr>
					</c:forEach>
				</c:when>
				<c:otherwise>
					<tr>
						<td colspan="4">조회된 결과가 없습니다.</td>
					</tr>
				</c:otherwise>
			</c:choose>
		</tbody> --%>
	</table>
</body>
</html>
