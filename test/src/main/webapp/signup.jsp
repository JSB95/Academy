<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<link href="css/signup.css" rel="stylesheet">
</head>
<body>

	<%@include file = "header.jsp" %>
	
	<br><br><br>
	
	 <div id="container" class="main_container">
        <div style="padding: 20px;"></div>
        <div class="login_container">
            <div class="form_container">
                <form name="login_form" action="/cookie" method="get">
                    <div class="form_title_div">
                        <p class="form_title_p">Register With Us</p>
                    </div>
                    <div>
                        <div>
                            <a class="form_item_name">username</a>
                        </div>
                        <div>
                            <input type="text" name="username" placeholder="name" class="form_input" id="name"/>
                        </div>
                        <div class="form_text_alert_padding">
                            <div id="alert_username" class="form_text_alert"></div>
                        </div>
                    </div>
                    <div>
                        <div>
                            <a class="form_item_name">Email</a>
                        </div>
                        <div>
                            <input type="text" name="email" placeholder="E-mail" class="form_input"/>
                        </div>
                        <div class="form_text_alert_padding">
                            <div id="alert_email" class="form_text_alert"></div>
                        </div>
                    </div>
                    <div>
                        <div>
                            <a class="form_item_name">Password</a>
                        </div>
                        <div>
                            <input type="password" name="password" placeholder="Enter password" class="form_input" id="password"/>
                        </div>
                        <div class="form_text_alert_padding">
                            <div id="alert_password" class="form_text_alert"></div>
                        </div>
                    </div>
                    <div>
                        <div>
                            <a class="form_item_name">Confirm Password</a>
                        </div>
                        <div>
                            <input type="password" name="password2" onfocus="" placeholder="Enter password again" class="form_input"/>
                        </div>
                        <div class="form_text_alert_padding">
                            <div id="alert_password2" class="form_text_alert"></div>
                        </div>
                    </div>
                    <div style="height: 10px;"></div>
                    <div>
                        <button type="button" class="form_submit_button" onclick="login()">Submit</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
    
    <br><br><br>


	<%@include file = "footer.jsp" %>
	
	<script type="text/javascript" src="js/signup.js"></script>

</body>
</html>