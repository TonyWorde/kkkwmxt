<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ page import = "com.kkkwm.pojo.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>AddFood</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="http://code.jquery.com/jquery-1.8.0.min.js"></script>
</head>
  
 <body>
	<h1 style="text-align:center;color:#FF8000;"><img src="static/images/kkkwm.jpg" width="200" height="160"></img>快快快外卖</h1>
		<div class="container">
			<ul id="Tab" class="nav nav-pills" style="font-size:15pt">
			<li><a href="#adminPI" tabindex="-1" data-toggle="tab">添加菜品</a></li>
				<li><a href="toSellerHomePage">返回</a></li>
			</ul>
		</div>
		
		<div class="container">
			<div id="TabContent" class="tab-content">
	<div class="tab-pane fade in active" id="menu">
	    <f:form action="addFood" method="post" enctype="multipart/form-data">
			<table class="table table-hover">
	<thead>
	<tr>
		<th>菜品号</th>
		<td style="color: green"><input type="text" name="food_id" /></td>
	</tr>
	<tr>
		<th>菜品图片</th>
		<td><input type="file" name="food_img"/></td>
	</tr>
	<tr>
		<th>菜品名</th>
		<td style="color: tomato"><input type="text" name="food_name" /></td>
	</tr>
	<tr>
		<th>菜品价格</th>
		<td style="color: orangered"><input type="text" name="food_price" /></td>
	</tr>
	</thead>
	</table>
	<input type="submit" class="btn btn-success" value="添加">
	</f:form>
	</div>
	</div>
	</div>
  </body>
</html>
