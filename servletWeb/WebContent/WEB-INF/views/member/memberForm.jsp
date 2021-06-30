<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- <c:set var="contextPath" value="${pageContext.request.contextPath}"  />     --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sign up</title>
</head>
<body>
	<p>Sign Up</p>
	<form method="post" action="/member/addMember">
		<table>
		  <tr>
		     <td width="100" bgcolor="powderblue">ID</td>
		     <td width="300"><input type="text" name="userid"></td>
		  </tr>
		  <tr>
		      <td width="100" bgcolor="powderblue">PASSWORD</td>
		      <td width="300"><input type="password"  name="userpw"></td>
		  </tr>
		  <tr>
		      <td width="100" bgcolor="powderblue">NAME</td>
		      <td width="300"><input type="text"  name="username"></td>
		  </tr>
		  <tr>
		      <td width="100" bgcolor="powderblue">EMAIL</td>
		      <td width="300"><input type="text" name="email"></td>
		  </tr>
		</table>
		<input type="submit" value="submit">
		<input type="reset" value="reset">
		<input type="button" value="home" onclick="location.href='../../index.jsp'"/>
		<input type="button" value="list" onclick="location.href='/member/listMembers'"/>
	</form>
</body>
</html>