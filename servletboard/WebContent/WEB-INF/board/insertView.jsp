<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert</title>
</head>
<body>
	<h3 style="text-align:center;">Board</h3>
	<form action="board/insert" method="post">
		<input type="hidden" name="ip" value="<%=request.getRemoteAddr() %>">
		<table>
			<tr>
				<th>writer</th>
				<td><input type="text" name="name"></td>
			</tr>
		</table>
	</form>
</body>
</html>