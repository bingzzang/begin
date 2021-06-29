<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member list</title>
</head>
<body>
	<p>MEMBER LIST</p>
	<table border="1">
		<tr align="center" bgcolor="powderblue">
			<th>ID</th>
			<th>PASSWORD</th>
			<th>NAME</th>
			<th>EMAIL</th>
			<th>REGDATE</th>
			<th>UPDATE</th>
		</tr>
		<c:choose>
			<c:when test="${memberList==null}">
				<tr>
					<td colspan=6><b>NOBODY</b></td>
				</tr>
			</c:when>
			<c:when test="${memberList != null }">
				<c:forEach var="mem" items="${memberList}">
					<tr align="center">
						<td width="70px">${mem.userid}</td>
						<td width="120px">${mem.userpw}</td>
						<td width="120px">${mem.username}</td>
						<td width="180px">${mem.email}</td>
						<td width="120px">${mem.regdate}</td>
						<td width="120px">${mem.updatedate}</td>
					</tr>
				</c:forEach>
			</c:when>
		</c:choose>
	</table>
	<input type="button" value="register" onclick="location.href='/member/addMember'"> 
	<input type="button" value="home" onclick="location.href='../../index.jsp'"> 
</body>
</html>