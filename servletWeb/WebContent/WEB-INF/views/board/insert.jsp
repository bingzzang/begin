<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert</title>
</head>
<body>
<form action="/insert.do" method="post">
	<input type="hidden" name="command" value="bdinsert">
	<table border="1">
	  <tr>
	    <th><label for="title">title</label></th>
	    <td><input type="text" id="title" name="title" width="150px"></td>
	  </tr>
	  <tr>
      <th><label for="writer">writer</label></th>
      <td><input type="text" id="writer" name="writer" width="150px"></td>
    </tr>
	  <tr>
	    <th><label for="conts">contents</label></th>
	    <td><textarea id="conts" name="conts"
	          rows="5" cols="33"></textarea></td>
	  </tr>
	</table>
	<input type="submit" value="Submit"/>
	<input type="button" value="Cancle" onclick="location.href='/list.do'"/>
</form>
</body>
</html>