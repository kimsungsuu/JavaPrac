<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String name = request.getParameter("name");
    String bloodType = request.getParameter("bloodType");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>A형</h1>
포워드 된 후 페이지 <br/>
당신의 이름은 : <%=name%>입니다. <br/>
당신의 혈액형은 : <%=bloodType %>입니다.<br/>
당신은 내성적이고 사려깊은 사고를 가진 사람입니다.
</body>
</html>