<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import = "com.kkkwm.pojo.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>UserHome</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="http://code.jquery.com/jquery-1.8.0.min.js"></script>
</head>
  
 <body>
	<h1 style="text-align:center;color:#FF8000;"><img src="static/images/kkkwm.jpg" width="200" height="160"></img>快快快外卖</h1>
		<div class="container">
			<ul id="Tab" class="nav nav-pills" style="font-size:15pt">
				<li><a href="riderManage" tabindex="-1" data-toggle="tab">我的信息</a></li>
				<li><a href="getStatusFourOrder">可配送订单</a></li>
				<li><a href="getStatusFiveOrder">正在配送订单</a></li>
				<li><a href="toRiderHomePage">返回</a></li>
			</ul>
		</div>
		<div class="container">
			<div id="TabContent" class="tab-content">
				<div class="tab-pane fade in active" id="userPI">
				
			<table class="table table-condensed">
		<thead>
		<tr>
			<th>账号</th>
			<td>${rider.rider_id}</td>
		</tr>
		<tr>
			<th>密码</th>
			<td>${rider.rider_name}</td>
		</tr>
		<tr>
			<th>用户名</th>
			<td>${rider.rider_pwd}</td>
		</tr>
		<tr>
			<th>性别</th>
			<td>${rider.rider_sex}</td>
		</tr>
		<tr>
			<th>联系方式</th>
			<td>${rider.rider_phone}</td>
		</tr>
	</thead>
	</table>
	<a href="toUpdateRider"><input type="button" class="btn btn-success" value="修改信息"></a>
	</div>
	</div>
	</div>
  </body>
</html>
