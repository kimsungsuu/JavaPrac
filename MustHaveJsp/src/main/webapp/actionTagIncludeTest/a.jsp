<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    request.setCharacterEncoding("UTF-8"); 
   	String name = request.getParameter("name");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Include Test</title>
</head>
<body>


<form method="post" action="a.jsp">
<input name="name"/> <br/>

<input type="submit" value="전송"/>
</form>

<h1>A Test 1</h1>
A 이름은 : <%=name%><br/>

<jsp:include page="b.jsp" flush="false">
	<jsp:param name="name" value="김성수"/>
</jsp:include>

</body>
</html>