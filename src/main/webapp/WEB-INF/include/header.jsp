<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<c:set var="path1" value="ㅎㅇ"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>

<link href="/css/main.css?ver=2.3" rel="stylesheet" type="text/css"/>
</head>
<body>

<header>
	<div>
		<a href="/ggulggul/ggulggulBoard" class="mainText" >공쥬와 꿀꿀</a>
	</div>
</header>

<nav>
	<div class="nav">
		<ul>
			<li>공주</li>
		</ul>
		<ul>
			<li>꿀꿀</li>
		</ul>
		<div class="submenu">
			<ul>
				<li><a href="/notice/notice">게시판</a></li>
			</ul>
			<ul>
				<li><a href="javascript:void(0);" onclick="goBoard('/ggulggul/ggulggulBoard')">게시판</a></li>
			</ul>
		</div>
	</div>
</nav>
<script>
	function goBoard(url){
		console.log(url);
		$.ajax({
			url : url,
			type : "GET",
			dataType : "html",
			success:function(data){
				$(".write").html(data);
			}
		})
	}
</script>