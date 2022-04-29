<%@page import="java.util.Arrays"%>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%!
		String[] board = {"[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]"};
		String winner ="";
		int count = 0;
	%>
	
	<%
		for( int i = 0 ; i<board.length; i++ ) {
		out.print( board[i] +" ");

		if( i % 3 == 2 ) out.print("<br>");
	}
	%>
	
	<%

			for (int i = 0; i < board.length; i++){

					if (request.getParameter(i + "") != null && request.getParameter(i+"").equals(i+"") && board[i].equals("[  ]")){
						out.print(i+"번 선택");
						board[i] = "[ O ]";
						count++;
						break;
				}

				while (true){
					Random random = new Random();
					int com = random.nextInt(9);
					if (board[com].equals("[  ]")) {
						board[com] = "[ X ]";
						count++;
						break;
					}
					if (count == 9){
						break;
					}
				}
			}
			
			for (int i = 0; i <= 6; i += 3){
				if(board[i].equals(board[i+1]) && board[i+1].equals(board[i+2])){
					winner = board[i];
				}
			}
			
			for (int i = 0; i <= 2; i++){
				if(board[i].equals(board[i+3]) && board[i+3].equals(board[i+6])){
					winner = board[i];
				}
			}
			
			if (board[0].equals(board[4]) && board[4].equals(board[8])){
				winner = board[0];
			}
			
			if (board[2].equals(board[4]) && board[4].equals(board[6])){
				winner = board[2];
			}
			
			if (winner.equals("[ O ]")){
				out.println("플레이어 승리");
			}
			
			if (winner.equals("[ X ]")){
				out.println("컴퓨터 승리");
			}
			
			if(count == 9){
				out.println("무승부");

			}

	
		if(request.getParameter("reset") != null){
			for (int i = 0; i < board.length; i++){
				board[i] = "[  ]";
			}
		}

		
	%>
	

	<form action="5_틱택토.jsp" method="get">
		<% for (int i = 0; i < board.length; i++){ %>
			<button type="submit" value="<%=i %>" name="<%=i %>"> <%=i %> </button>
			
			<% if (i % 3 == 2){out.print("<br>");} %>
			
		<% } %>
	</form>
	<br>
	<form action="5_틱택토.jsp" method="get">
		<input type = "submit" value="reset" name="reset"> 
	</form>

</body>
</html>