<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>layout2</title>
</head>
<body>

<table width="400" border="1" cellpadding="0" cellspacing="0">
	<tr>
		<td colspan="2">
			<jsp:include page="/chap07/module/top.jsp" flush="false"/>
		</td>
	</tr>
	<tr>
		<td width="100" valign="top">
			<jsp:include page="/chap07/module/left.jsp" flush="false"/>
		</td>
		<td width="300" valign="top">
			이 부분은 layout2.jsp가 생성됨<br>
			레이아웃2
			<br><br><br>
 		</td>
	</tr>
	<tr>
		<td colspan="2">
			<jsp:include page="/chap07/module/bottom.jsp" flush="false"/>
		</td>
	</tr>
</table>
</body>
</html>