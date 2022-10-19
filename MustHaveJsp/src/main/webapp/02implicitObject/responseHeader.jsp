<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Collection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전송된 응답 헤더 처리</title>
</head>
<body>
<%
// SimpleDateFormat으로 데이터 형식 지정
// parse()로 문자열을 Date 형으로 변환
// format()으로 Date형을 문자열로 변환

// String add_date = request.getParameter("add_date");

// SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
// Date date = s.parse(add_date); 

// String dateStr = s.format(date);

// out.print("오늘의 날짜 : " + dateStr); // parameter로 보내준 값 그대로 출력
// out.print("오늘의 날짜2 : " + date); // 한국 기준 시간 출력
%>

<%
String add_date = request.getParameter("add_date");

SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
long addDateLong = s.parse(add_date).getTime();

response.addDateHeader("Today`s date : ", addDateLong);

%>

<h2>저장된 응답 헤더 출력하기</h2>
<%
Collection<String> headerNames = response.getHeaderNames();
for(String hName : headerNames){
	String hValue = response.getHeader(hName);

%>
	<li><%= hName %> : <%=hValue %></li>
	
<%
}
%>
	
</body>
</html>