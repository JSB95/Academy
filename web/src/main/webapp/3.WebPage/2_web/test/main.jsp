<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
	
	#wrap{
		width: 1100px;
		text-align: center;
		margin: 0 auto;
		margin-bottom: 100px;
	}
	#content1{
		margin-top: 20px;
		margin-bottom: 70px;
		display: inline-block;
		text-align: center;
	}
	#content1_left{
		float: left;
		margin-right: 20px;
	}
	.line1{
		font-size: 20px;
		font-weight: bold;
		margin-bottom: 5px;
	}
	#icon1{
		float: left;
		width:76px;
		height:80px;
		background-image: url("img/icon1.png");
		background-repeat: no-repeat;
		margin-right: 30px;
	}
	#icon2{
		float: left;
		width:76px;
		height:80px;
		background-image: url("img/icon2.png");
		background-repeat: no-repeat;
		margin-right: 30px;
	}
	#content1_right{
		float: left;
	}
	
	#content2{
		display: inline-block;
		text-align: center;
	}
	#content2_1{
		float: left;
	}
	#content2_2{
		float: left;
	}
	#content2_3{
		float: left;
	}
	#content2_4{
		float: left;
	}
	#content2_1_img{
		background-image: url("img/image1.jpg");
		background-repeat: no-repeat;
		background-size: contain;
		text-align: center;
		width:250px;
		height:180px;
	}
	#content2_2_img{
		background-image: url("img/image2.jpg");
		background-repeat: no-repeat;
		background-size: contain;
		text-align: center;
		width:250px;
		height:180px;
	}
	#content2_3_img{
		background-image: url("img/image3.jpg");
		background-repeat: no-repeat;
		background-size: contain;
		text-align: center;
		width:250px;
		height:180px;
	}
	#content2_4_img{
		background-image: url("img/image4.jpg");
		background-repeat: no-repeat;
		background-size: contain;
		text-align: center;
		width:250px;
		height:180px;
	}
	.line2{
		font-size: 20px;
		font-weight: bold;
		text-align: left;
	}
	li{
		text-align: left;
	}
	
	</style>

</head>
<body>

	<div id = "wrap">
	
		<div id = "content1"> 
			<div id = "icon1">  </div>
			<div id = "content1_left">
				
				<div>
					<ul>
						<li class = "line1"> ���� �ȳ� </li>
						<li> ��Ʃ��� �뿩�� ������ ���ͳ� ������ �ϼž� �մϴ�. <br> ������ 1�� �������� �����մϴ�. </li>
					</ul>
				</div>
				
			</div>
			<div id = "icon2">  </div>
			<div id = "content1_right">
			
				
				<ul>
					<li class = "line1"> ���� ������ </li>
					<li> ��� ����, ���� ����, ������ ����, ���� ���� �� ���� �� <br> �� ��ü�� �̿��� �� �ֽ��ϴ�. </li>
				</ul>
			
			</div>
			
		</div>
		
		<div id = "content2">
		
			<div id = "content2_1">
				<ul>
					<li> <div id = "content2_1_img"> </div> </li>
					<li class = "line2"> �Կ� ��Ʃ��� </li>
					<li> ī�޶�, ���� �� Ȱ�� ��� �Ϻ� </li>
				</ul>
			</div>
			
			<div id = "content2_2">
				
				<ul>
					<li> <div id = "content2_2_img"> </div> </li>	
					<li class = "line2"> �Կ� ��Ʃ��� </li>
					<li> ī�޶�, ���� �� Ȱ�� ��� �Ϻ� </li>
				</ul>
			</div>
			
			<div id = "content2_3">
				
				<ul>
					<li> <div id = "content2_3_img"> </div> </li>
					<li class = "line2"> �Կ� ��Ʃ��� </li>
					<li> ī�޶�, ���� �� Ȱ�� ��� �Ϻ� </li>
				</ul>
			</div>
			
			<div id = "content2_4">
				
				<ul>
					<li> <div id = "content2_4_img"> </div> </li>
					<li class = "line2"> �Կ� ��Ʃ��� </li>
					<li> ī�޶�, ���� �� Ȱ�� ��� �Ϻ� </li>
				</ul>
			</div>
		
		</div>
		
		
	
	
	</div>

</body>
</html>