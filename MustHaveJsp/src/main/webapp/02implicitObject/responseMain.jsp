<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>리다이렉트</h2>

<%
String idError = request.getParameter("idError");

if(idError != null) out.print("로그인 실패하였습니다.");
%>

<form action="./responseLogin.jsp" method="post">
	<input type="text" name="name" > </br>
	<input type="text" name="pwd" > </br>
	<input type="submit" value="전송" > 
</form>

</br>

<h2>응답 헤더 추가</h2>
<form action="./responseHeader.jsp" method="post">
	<input type="text" name="add_date" value="2022-09-26 11:50:50">
	<input type="submit" value="전송">
</form>
</body>
</html>