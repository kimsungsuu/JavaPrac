<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
request.setCharacterEncoding("UTF-8");
String[] favorite = request.getParameterValues("favorite");
String favoriteStr = "";

if(favorite != null){
	for(int i = 0; i < favorite.length; i++){
		favoriteStr += favorite[i] + " ";
	}
}

 String content = request.getParameter("content").replace("\r\n","<br/>");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	전달 받은 메소드 : <%=request.getMethod() %> </br>
	eng 값 : <%= request.getParameter("eng") %> </br>
	han 값 : <%= request.getParameter("han") %> </br>
	URI 값 : <%= request.getRequestURI() %> </br>
	URL 값 : <%= request.getRequestURL() %> </br>
	내가 좋아하는 취미는? : <%= favoriteStr%></br>
	
	내용 : <%= content %>
	
</body>
</html>