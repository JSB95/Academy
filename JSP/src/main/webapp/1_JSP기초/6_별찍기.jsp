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
		int line = 5;
		
		for (int i = 1; i<=line; i++){
			for (int b=1; b <= line - i; b++){
				out.print("&nbsp;");
			}
			
			for (int s = 1; s <= i * 2 - 1; s++){
				out.print("*");
			}
			
			out.print("<br>");
		}
	%>

</body>
</html>