<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>detail</title>
</head>
<body>

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
    <td width="150px" colspan="5">${vo.title}</td>
  </tr>
  <tr>
    <th>writer</th>
    <td width="150px" colspan="5">${vo.writer}</td>
  </tr>
  <tr>
    <th>contents</th>
    <td width="150px" height="70px" colspan="5">${vo.conts}</td>
  </tr>
</table>

<input type="button" value="update" onclick="location.href='/update.do?bno=${vo.bno}'"/>
<input type="button" value="delete" onclick="location.href='/delete.do?bno=${vo.bno}'"/>
<input type="button" value="list" onclick="location.href='/list.do'"/>
</body>
</html>