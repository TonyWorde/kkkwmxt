<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>login</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="http://code.jquery.com/jquery-1.8.0.min.js"></script>
</head>
  
 <body>
	<h1 style="text-align:center;color:#FF8000;"><img src="static/images/kkkwm.jpg" width="200" height="160"></img>快快快外卖</h1>
		<div class="container">
			<ul id="Tab" class="nav nav-pills" style="font-size:15pt">
				<li><a href="toIndex">首页</a></li>
				<li><a href="#adminPI" tabindex="-1" data-toggle="tab"><span class="glyphicon glyphicon-log-in"></span> 登录</a></li>
				<li><a href="userCheck"><span class="glyphicon glyphicon-user"></span> 注册</a></li>
			</ul>
		</div>
		
			<div class="container">
			
	<form action="login" method="post">
	<table class="table table-hover">
		<thead>
		<tr>
			<th>用户名</th>
			<td><input type="text" name="id" placeholder="Please enter your id"></td>
		</tr>
		<tr>
			<th>密码</th>
			<td><input type="password" name="pwd" placeholder="Please enter your password"></td>
		</tr>
		<tr>
        	<th></th>
        	<td>
        		<input type="radio" name="person" value="user" checked />用户
        		<input type="radio" name="person" value="seller"/>商家
        		<input type="radio" name="person" value="rider"/>骑手
        		<input type="radio" name="person" value="admin"/>管理员<br>
        	</td>
		</tr>
	</thead>
	<tr>
		<td>
			<input type="submit" class="btn btn-success" value="登录">
		</td>
	</tr>
	</table>
	</form>

	
	</div>
		
		
		
  </body>
</html>
