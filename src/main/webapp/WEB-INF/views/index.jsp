<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>홈페이지</title>
<link href="http://fonts.googleapis.com/css?family=Oswald" rel="stylesheet" type="text/css" />
<link href="/css/style.css" rel="stylesheet" type="text/css" media="screen" />
</head>
<body>

	<div id="wrapper">
		<!-- header -->
		<jsp:include page="include/header.jsp"></jsp:include>
	
		<!-- main -->
		<jsp:include page="${menuUrl}"></jsp:include> 
	</div>

	<!-- footer -->
	<jsp:include page="include/footer.jsp"></jsp:include>
	
</body>
</html>