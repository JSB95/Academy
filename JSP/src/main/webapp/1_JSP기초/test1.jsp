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
		String ��û =  request.getParameter("id");
		System.out.print("html ���� ��û : " + ��û);
	%>

</body>
</html>