<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    
	<%
		String 이름 = request.getParameter("name");
		String 색상 = request.getParameter("color");
		
		boolean admin = true;
		if (!이름.equals("관리자")){
			admin=false;
		}
		int 반복횟수 = Integer.parseInt(request.getParameter("numer"));
	%>
	

<html>"D:/1/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/work/Catalina/localhost/JSP/org/apache/jsp/_1_005fJSP기초/_3_005f결과페이지_jsp.java"


	<body style="background-color: <%=색상%>">
		"D:/1/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/work/Catalina/localhost/JSP/org/apache/jsp/_1_005fJSP기초/_3_005f결과페이지_jsp.java"
		작성한 이름 : <%=이름 %> <br>
		선택한 색상 : <%=색상 %>
		
		<%
			if(admin == true){
		%>
		
			<div> 관리자 </div>
		
		<%
			}
		%>
		
		<%
			for(int i = 0; i < 반복횟수; i++){
		%>
		
			<span> ☆ </span>
		
		<%
			}
		%>
		
		<br>
		
		<%
			for( int i = 0 ; i<반복횟수 ;i++ ){
				for( int s = 0 ; s<=i ; s++){
			%>		
				<span> ☆ </span> <!-- 별찍기 -->
			<% 
				}
		%>		
				<br> <!-- 줄바꿈처리  -->
		<%	
			}
		%>

		

	</body>
</html>