<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록</title>
</head>
<body>
	<form action="/guestbook01/add.jsp" method="post">
	<table border=1 width=500>
		<tr>
			<td>이름</td><td><input type="text" name="name"></td>
			<td>비밀번호</td><td><input type="password" name="password"></td>
		</tr>
		<tr>
			<td colspan=4><textarea name="message" cols=60 rows=5></textarea></td>
		</tr>
		<tr>
			<td colspan=4 align=right><input type="submit" VALUE=" 확인 "></td>
		</tr>
	</table>
	</form>
	<br>
	<table width=510 border=1>
		<tr>
			<td>[1]</td>
			<td>안대혁</td>
			<td>2013-01-15</td>
			<td><a href="/guestbook01/deleteform.jsp?no=">삭제</a></td>
		</tr>
		<tr>
			<td colspan=4>안녕하세요</td>
		</tr>
	</table>
</body>
</html>