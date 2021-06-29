<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
  <a href="/life.do">test</a>
  <br/>
  <a href="/list.do">board</a>
  <br/>
  <br/>
  <a href="/board?command=main">board2</a>
  <br/>
  <a href="/member/listMembers">memberList</a>
  <br/>
  <input type="button" value="Sign In" onClick="location.href='/member/addMember'">
  <input type="button" value="Sign Up" onClick="location.href=#">
</body>
</html>