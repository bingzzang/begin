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
	
	<div style="test-align:right; width=700px;marging:auto;">
		총 ${plist.totalCount} 개 글/
		현재 ${plist.currentPage} 페이지/
		총 ${plist.totalPage} 페이지
	</div>
	
	<table>
		<tr>
			<td width="50">no</td>
			<td width="250">title</td>
			<td width="150">writer</td>
			<td width="150">date</td>
			<td width="50">readNum</td>
		</tr>
		<c:forEach var="vo" items="${list}">
		<tr>
			<td></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>