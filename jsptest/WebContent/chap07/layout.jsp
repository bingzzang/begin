<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>layout</title>
</head>
<body>

<table width="400" border="1" cellpadding="0" cellsapcing="0">
	<tr>
		<td colspan="2">
			<jsp:include page="/chap07/module/top.jsp" flush="false"  />
		</td>
	</tr>
	<tr>
		<td width="100" valign="top">
			<jsp:include page="/chap07/module/left.jsp" flush="false" />
		</td>
		<td width="300" valign="top">
		<!-- 내용부분 시작 -->
		레이아웃 1
		<br><br><br>
		<!-- 내용부분 끝 -->
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<jsp:include page="/chap07/module/bottom.jsp" flush="false" />
	</tr>
</table>
</body>
</html>