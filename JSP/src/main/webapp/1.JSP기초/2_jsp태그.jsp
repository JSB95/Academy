<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3> 선언문 태그 : 메모리 할당[변수 생성, 객체 생성, 메소드 정의x] </h3>
	<h3> 스크립트 태그 </h3>
	<h3> 표현식 태그 : 메모리 호출 </h3>
	<p> html에서 작성된 코드 </p>
	
	<%!
		int 변수1 = 10;
		Date date1 = new Date();
		//System.out.println("jsp 파일에서 작성된 코드 1");
		int 함수1(){return 2;}
		class 클래스1{
			String 필드1 = "유재석";
		}
		클래스1 객체1 = new 클래스1();
	%>
	
	<%
		int 변수2 = 20;
		Date date2 = new Date();
		System.out.println("jsp 파일에서 생성된 변수 :" + 변수2);
		System.out.println("jsp 파일에서 생성된 객체 :" + date2);
		// int 함수2(){return 3;}
		class 클래스2{
			String 필드2 = "유재석";
		}
		클래스2 객체2 = new 클래스2();
	%>
	
	<!-- html -->
	
	선언의 변수 : <%=변수1 %> <br>
	선언문의 객체 : <%=date1 %> <br>
	선언문의 함수 : <%=함수1() %> <br>
	선언문의 사용자정의 객체 : <%=객체1.필드1 %> <br>
	<hr>
	스크립트문의 변수 : <%=변수2 %> <br>
	스크립트문의 객체 : <%=date2 %> <br>
	스크립트문의 함수 : 불가 <br>
	스크립트문의 사용자정의 객체 : <%=객체2.필드2 %> <br>

</body>
</html>