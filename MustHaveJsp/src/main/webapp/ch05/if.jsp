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
	String color = request.getParameter("likeColor");
	String msg = "";

	if(color.equals("red")){
		msg = "빨간색";
	}else if(color.equals("blue")){
		msg = "파란색";
	}else if(color.equals("orange")){
		msg = "주황색";
	}else msg = "보라색";
	
	out.print(msg);
%>

</body>
</html>