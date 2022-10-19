<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int a = 1;
	int b = 0;
%>

<h1>Directive Example3</h1>
a와 b의 사칙연선 <p/>
a + b : <%=a+b%><p/>
a - b : <%=a-b%><p/>
a % b : <%=a%b%><p/>
a / b : <%=a/b%><p/>
</body>
</html>