<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    
	<%
		String �̸� = request.getParameter("name");
		String ���� = request.getParameter("color");
		
		boolean admin = true;
		if (!�̸�.equals("������")){
			admin=false;
		}
		int �ݺ�Ƚ�� = Integer.parseInt(request.getParameter("numer"));
	%>
	

<html>"D:/1/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/work/Catalina/localhost/JSP/org/apache/jsp/_1_005fJSP����/_3_005f���������_jsp.java"


	<body style="background-color: <%=����%>">
		"D:/1/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/work/Catalina/localhost/JSP/org/apache/jsp/_1_005fJSP����/_3_005f���������_jsp.java"
		�ۼ��� �̸� : <%=�̸� %> <br>
		������ ���� : <%=���� %>
		
		<%
			if(admin == true){
		%>
		
			<div> ������ </div>
		
		<%
			}
		%>
		
		<%
			for(int i = 0; i < �ݺ�Ƚ��; i++){
		%>
		
			<span> �� </span>
		
		<%
			}
		%>
		
		<br>
		
		<%
			for( int i = 0 ; i<�ݺ�Ƚ�� ;i++ ){
				for( int s = 0 ; s<=i ; s++){
			%>		
				<span> �� </span> <!-- ����� -->
			<% 
				}
		%>		
				<br> <!-- �ٹٲ�ó��  -->
		<%	
			}
		%>

		

	</body>
</html>