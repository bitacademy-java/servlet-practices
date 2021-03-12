<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>값 받아보기</h1>
	-${iVal }- <br/>
	-${lVal }- <br/>
	-${fVal }- <br/>
	-${bVal }- <br/>
	-${sVal }- <br/>

	<h1>객체 받아보기</h1>
	-${vo.no }- <br/>
	-${vo.name }- <br/>
	-${obj }-
	
	<h1>산술연산</h1>
	${3*10+5 }<br/>
	${iVal+5 }<br/>
	
	<h1>관계연산</h1>
	${iVal == 10 }<br/>
	${iVal < 5 }<br/>
	${obj == null }<br/>
	${obj != null }<br/>
	${empty obj }<br/>
	${not empty obj  }<br/>

	<h1>논리연산</h1>
	${iVal == 10 && lVal < 10000 }<br/>
	${iVal < 5 || lVal - 10 == 0 }<br/>
	
	<h1>요청 파라미터</h1>
	-${param.a + 10 }-<br/>
	-${param.email }-<br/>

	<h1>Map으로 값 받아보기</h1>
	-${map.ival }-<br/>
	-${map.fval }-<br/>
	-${map.sval }-<br/>
	-${map.bval }-<br/>
	
</body>
</html>