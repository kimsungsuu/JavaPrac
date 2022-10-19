<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>로그인 처리 페이지</h2>
<%
String id = request.getParameter("name");
String pwd = request.getParameter("pwd");

if(id.equalsIgnoreCase("must") && pwd.equalsIgnoreCase("1234")){
	response.sendRedirect("responseLoginOk.jsp");
}else{
	request.getRequestDispatcher("responseMain.jsp?idError=1")
	.forward(request, response);
}
%>
</body>
</html>