<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%@include file="1.��ġ.jsp" %>
	<div class="container"> <!-- �ڽ��� -->
		<div class="navbar navbar-expand-md"> <!-- �׺���̼� �� -->
		
			<a href = "#" class = "navbar-brand"> �ΰ� </a>
		
			<button  type="button"
				data-bs-toggle="collapse" data-bs-target="#navmenu" 
				aria-controls="navbarcontents" aria-expanded="false">
				 <span class="navbar-toggler-icon"></span>
			</button>
			
			<!-- �޴� ������ �۾����� ��� -->
			
			<div class = "collapse navbar-collapse" id = "navmenu">
		
			<ul class="navbar-nav"> <!-- �׺���̼� ��� -->
				<li class="navbar-item"> <a href="#" class="nav-link">�޴�1</a> </li> <!-- �׺���̼� ��� �� -->
				<li class="navbar-item"> <a href="#" class="nav-link">�޴�2</a> </li>
				<li class="navbar-item"> <a href="#" class="nav-link">�޴�3</a> </li>
				<li class="nav-item dropdown">
					<a href = "#" class = "nav-link dropdown-toggle" data-bs-toggle="dropdown" aria-haspopup = "true" aria-expanded = "false" id = "navdrop"> ����ٿ� </a>
					
					<div class = "dropdown-menu" aria-labelledby="navdrop">
						<a class="dropdown-item" href = "#"> ����ٿ� �޴� 1</a>
						<a class="dropdown-item" href = "#"> ����ٿ� �޴� 2</a>
						<a class="dropdown-item" href = "#"> ����ٿ� �޴� 3</a>
					</div>
					
				</li>
			</ul>
			
			<form action="">
				<div class="row">
					<div class = "col-md-3">
						<input type="text" class = "form-control" placeholder="�˻���">
					</div>
					<div class = "col-md-5">
						<button class = "form-control" type = "submit"> �˻� </button>
					</div>
					
				</div>
			
			</form>
			</div>
		</div>
	</div>
	
	
</body>
</html>