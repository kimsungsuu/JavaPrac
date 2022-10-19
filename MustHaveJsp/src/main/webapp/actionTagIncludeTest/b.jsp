<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

request.setCharacterEncoding("UTF-8"); 


String name = request.getParameter("name");

%>

<h1>B Test 2</h1>

B 이름은 : <%=name %> <br/>



</body>
</html>