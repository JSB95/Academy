<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%
		String 요청 =  request.getParameter("id");
		System.out.print("html 에서 요청 : " + 요청);
	%>

</body>
</html>