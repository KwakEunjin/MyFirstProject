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

<link href="/css/main.css?ver=1.8" rel="stylesheet" type="text/css"/>

</head>
<body>

<header>
	<div>
		<a href="/views/ggulggul/ggulggulMain" class="mainText" >공쥬와 꿀꿀</a>
	</div>
</header>

<nav>
	<div>
		<ul class="nav">
		
          <li class="navTopManu"><p>공주</p>
            <ul class="subNav">
              <li><a href="/notice/notice">게시판</a></li>
              <li><a href="#">메뉴1-2</a></li>
              <li><a href="#">메뉴1-3</a></li>
            </ul>
          </li>
          
          <li class="navTopManu"><p>꿀꿀</p>
            <ul class="subNav">
              <li><a href="#">메뉴2-1</a></li>
              <li><a href="#">메뉴2-2</a></li>
              <li><a href="#">메뉴2-3</a></li>
            </ul>
          </li>
          
        </ul>
	</div>
</nav>
<script>
$(".navTopManu").hover(function(){
	$(this).find(".subNav").children().slideToggle(500);
})
</script>