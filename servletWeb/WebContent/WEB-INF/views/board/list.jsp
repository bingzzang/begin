<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board List</title>
</head>
<body>
  <table>
    <tr>
      <th>BNO</th>
      <th>TITLE</th>
      <th>WRITER</th>
      <th>REGDATE</th>
      <th>VIEWCNT</th>
    </tr>
  <c:forEach items="${list}" var="item">
    <tr>
      <td>${item.bno}</td>
      <td><a href="/detail.do?bno=${item.bno}">${item.title}</a></td>
      <td>${item.writer}</td>
      <td>${item.regdate}</td>
      <td>${item.viewcnt}</td>
    </tr>
  </c:forEach>
  </table>
</body>
</html>