<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="./requestWebInfo.jsp?eng=hello&han=안녕">
GET 방식 전송
</a>
</br>
<form method="post" action="requestWebInfo.jsp">
	<input type="text" name="eng" value="Bye">
	<input type="text" name="han" value="잘가!">
	<input type="submit" value="전송">
</form>

<form method="post" action="requestWebInfo.jsp">
	<input type="checkbox" name="favorite" value="basketball">농구</br>
	<input type="checkbox" name="favorite" value="baseball">야구</br>
	<input type="checkbox" name="favorite" value="soccer">축구</br>
	
	<textarea name="content" rows="4" cols="30"></textarea>
	<br/>
	<input type="submit" value="전송">
</form>

<a href="requestHeader.jsp">요청 헤더 정보 읽기</a>
</body>
</html>