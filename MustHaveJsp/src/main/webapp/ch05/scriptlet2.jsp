<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	float f = 2.3f;
	
	int i = Math.round(f);
	
	Date date = new Date();
%>

	실수 f의 반올림 값은? : <%=i%> <p/>
	오늘의 날짜는? : <%=date%>, <%=date.toString() %>
</body>
</html>