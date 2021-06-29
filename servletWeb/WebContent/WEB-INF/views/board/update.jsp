<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update</title>
</head>
<body>
<form action="/update.do?bno=${vo.bno}" method="post">
	<table border="1">
	  <tr>
	    <th>bno</th>
	    <td width="150px">${vo.bno}</td>
	<!--   </tr> -->
	<!--   <tr> -->
	    <th>regdate</th>
	    <td width="150px">${vo.regdate}</td>
	    <th>viewcnt</th>
	    <td width="150px">${vo.viewcnt}</td>
	  </tr>
	  <tr>
	    <th>title</th>
	    <td width="150px" colspan="5"><input type="text" name="title" value="${vo.title}"/></td>
	  </tr>
	  <tr>
	    <th>writer</th>
	    <td width="150px" colspan="5"><input type="text" name="writer" value="${vo.writer}"/></td>
	  </tr>
	  <tr>
	    <th>contents</th>
	    <td width="150px" height="70px" colspan="5"><textarea id="conts" name="conts"
            rows="5" cols="33">${vo.conts}</textarea></td>
	  </tr>
	</table>
	<input type="submit" value="Submit"/>
	<input type="button" value="cancle" onclick="location.href='/list.do'"/>
</form>
</body>
</html>