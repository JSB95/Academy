<%@page import="Dto.Board"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>회원제 게시판</h3>
	

	
	
	<%
		String loginid = (String)session.getAttribute("loginid");
		
		if (loginid != null){
	%>
		<div> <%=loginid %> 님 </div>
		<a href="write.jsp"> <button> 글쓰기 </button> </a>
		<a href="logout.jsp"><button>로그아웃</button></a>
		<a href="deletecontroller.jsp"><button>회원탈퇴</button></a>
		

		
		
		
	<%	} else { %>
		<a href="signup.jsp"> <button> 회원가입 </button> </a> 
		<form action="logincontroller.jsp" method="post">
			<input type="text" name="id">
			<input type="password" name="password">
			<input type="submit" value="로그인" name="login">
		</form>
	<%	} %>
	
	<table>
		<tr>
			<th> 번호 </th> <th> 작성일 </th>  <th> 작성자 </th> <th> 제목 </th> <th> 내용 </th>
		</tr>
		
		<!-- 반복문 -->
		
		<%
			Dao dao = new Dao();
			ArrayList<Board> boardlist = dao.list();
			for (Board temp : boardlist) {
		%>
			<tr> 
				<td> <%=temp.getBno() %> </td>
				<td> <%=temp.getBdate() %> </td>
				<td> <%=temp.getBwriter() %> </td>
				<td> <a href="view.jsp?bno=<%=temp.getBno()%>"><%=temp.getBtitle() %> </a></td>
			</tr>
		<%
			}
		%>
	</table>

	
	

</body>
</html>