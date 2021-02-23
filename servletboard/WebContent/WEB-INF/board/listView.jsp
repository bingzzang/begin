<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
</head>
<body>
	<h3 style="text-align:center;">BOARD</h3>
	
	<div style="text-align:center; width=700px;marging:auto;">
		총 ${plist.totalCount} 개 글/
		현재 ${plist.currentPage} 페이지/
		총 ${plist.totalPage} 페이지
	</div>
	<div  style="text-align:center;">
		<table style="text-align:center; margin:auto;">
			<tr style="background-color:#ffe6e6;">
				<td width="50">no</td>
				<td width="250">title</td>
				<td width="150">writer</td>
				<td width="150">date</td>
				<td width="50">readNum</td>
			</tr>
			<c:forEach var="vo" items="${list}">
			<tr>
				<td>${vo.num}</td>
				<td style="text-align:left;"><a href="/board/select?num=${vo.num}&page=${plist.currentPage}">${vo.title}</a></td>
				<td>${vo.writer}</td>
				<td>${vo.wdate}</td>
				<td>${vo.readnum}</td>
			</tr>
			</c:forEach>
		</table>
	</div>
	<div style="test-align:right; width:700px; margin:auto;">
		<br/>
<!-- 		<input type="button" value="write" onclick="location.href='/board/insert'"> -->
		<input type="button" value="write" onclick="location.href='/board/insert'">
	</div>
	<div style="text-align:center;">
		<c:if test="${plist.currentPage>10}">
		<input type="button" value="&lt;&lt;" onclick="location.href='?page${plist.currentPage-10}'">
		</c:if>
		<c:choose>
			<c:when test="${plist.currentPage == 1}">
				<input type="button" value="&lt;" disabled>
			</c:when>
			<c:otherwise>
				<input type="button" value="&lt;" onclick="location.href='?page${plist.currentPage-1}'">
			</c:otherwise>
		</c:choose>
		<c:forEach var="i" begin="${plist.startPage}" end="${plist.endPage}">
			<c:choose>
			  <c:when test="test=${i == plist.currentPage}">
			    <input type="button" value="${i}" style="color:green;" disabled></c:when>
			  <c:otherwise>
			  	<input type="button" value="${i}" onclick="location.href='?page=${i}'">
			  </c:otherwise>
			</c:choose>
		</c:forEach>
		<c:choose>
		  <c:when test="test=${plist.currentPage > plist.totalPage}">
		    <input type="button" value="&gt;" disabled></c:when>
		  <c:otherwise>
		  	<input type="button" value="&gt;" onclick="location.href='?page=${plist.currentPage + 1}'">
		  </c:otherwise>
		</c:choose>
		<c:if test="${plist.endPage < plist.totalPage}">
			<input type="button" value="&gt;&gt;" onclick="location.href='?page=${plist.endPage + 1}'">
		</c:if>
	</div>
</body>
</html>