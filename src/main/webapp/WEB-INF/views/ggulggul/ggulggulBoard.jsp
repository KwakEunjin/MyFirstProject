<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="/css/board/board.css?ver=2.2" rel="stylesheet" type="text/css"/>
<table class="jhBoard">
	<colgroup>
		<col style="width:auto;">
		<col style="width:auto">
		<col style="width:auto">
		<col style="width:auto;">
	</colgroup>
	<thead>
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>조회수</th>
			<th>작성일</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var ="board" items="${list}" varStatus="status">
		<tr>
			<th>${board.noticeid}</th>
		 	<th>${board.title}</th>
			<th>${board.reguserid}</th>
			<th>${board.regdate}</th>
		</tr>
		</c:forEach>
	</tbody>
</table>