<%@page import="camerashop.bean.CategoryBean"%>
<%@page import="camerashop.model.CategoryModel"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="camerashop.bean.ProductBean"%>
<%@page import="camerashop.util.ServletUtility"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<style type="text/css">
.home-content-wrapper{
background-image: url('../images/background.jpg');
background-size: cover; 
height: 650px;
margin-top: -20px;
}
.overlay-box{
padding: 200px 0px;
box-sizing: border-box;
background: rgba(0, 0, 0, 0.5);
height: 100%;
}

.container{
width: 1200px;
margin: 0px auto;
}


.welcome-text{
color:#FFF;
font-size: 75px;
font-family: raleway-bold;
line-height: 90px;
text-align: right;
}
</style>
<body>
<%@ include file="Header.jsp" %>
	<div class="home-content-wrapper">
		<div class="overlay-box">
			<div class="container">
				<div class="welcome-text">WELCOME TO <br/>The Camera Shop</div>	
			</div>
		</div>	
	</div>

<%@ include file="Footer.jsp" %>
</body>
</html>