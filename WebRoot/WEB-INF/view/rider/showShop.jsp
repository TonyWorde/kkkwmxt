<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import = "com.kkkwm.pojo.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>ShopManage</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="http://code.jquery.com/jquery-1.8.0.min.js"></script>
</head>
  
 <body>
	<h1 style="text-align:center;color:#FF8000;"><img src="static/images/kkkwm.jpg" width="200" height="160"></img>快快快外卖</h1>
		<div class="container">
			<ul id="Tab" class="nav nav-pills" style="font-size:15pt">
				<li><a href="riderManage">我的信息</a></li>
				<li><a href="getStatusFourOrder">可配送订单</a></li>
				<li><a href="getStatusFiveOrder">正在配送订单</a></li>
				<li><a href="toRiderHomePage">返回</a></li>
			</ul>
		</div>
		
		<div class="container">
			<div id="TabContent" class="tab-content">
		
			<div class="tab-pane fade in active" id="menu">
			<table class="table table-hover">
	<thead>
	<tr>
		<th>店铺ID</th>
		<th>店铺名</th>
		<th>店铺地址</th>
		<th>联系方式</th>

	</tr>
	</thead>
	<tbody>
        <tr>
            <td style="color: green">${shop.shop_id}</td>
        	<td>${shop.shop_name}</td>
            <td>${shop.shop_address}</td>
            <td>${shop.shop_phone}</td>
        </tr>
	</tbody>
	</table>
	</div>
	</div>
	</div>
  </body>
</html>
