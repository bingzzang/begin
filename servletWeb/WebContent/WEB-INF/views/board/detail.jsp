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

<table>
  <tr>
    <th>bno</th>
    <td>${vo.bno}</td>
  </tr>
  <tr>
    <th>title</th>
    <td>${vo.title}</td>
  </tr>
  <tr>
    <th>regdate</th>
    <td>${vo.regdate}</td>
  </tr>
  <tr>
    <th>viewcnt</th>
    <td>${vo.viewcnt}</td>
  </tr>
  <tr>
    <th>contents</th>
    <td>${vo.conts}</td>
  </tr>
</table>

<%-- <a href="/jspPro/board/edit?seq=${dto.seq }">수정하기</a> --%>
<a href="/list.do">목록으로</a>
<%--         <a href="/jspPro/board/delete?seq=${dto.seq }">삭제하기</a> --%>
</body>
</html>