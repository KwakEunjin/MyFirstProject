<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String menuUrl = request.getParameter("contentPage");    
	if(menuUrl==null) {
		menuUrl="main.jsp";
	}

%>    
<%-- <%@ include file="/WEB-INF/include/header.jsp"%>
<%@ include file="/WEB-INF/include/footer.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"
--%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>홈페이지</title>
<link href="http://fonts.googleapis.com/css?family=Oswald" rel="stylesheet" type="text/css" />
<link href="/css/style.css" rel="stylesheet" type="text/css" media="screen" />
<style type="text/css">
@import "gallery.css";
</style>
</head>
<body>

<div id="wrapper">
	<!-- header -->
	<jsp:include page="/WEB-INF/include/header.jsp"></jsp:include>

	<!-- main -->
	<jsp:include page="<%=menuUrl%>"></jsp:include>
</div>

	<!-- footer -->
	<jsp:include page="/WEB-INF/include/footer.jsp"></jsp:include>
</body>
</html>