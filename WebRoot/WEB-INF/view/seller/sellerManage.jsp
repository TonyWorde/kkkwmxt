<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import = "com.kkkwm.pojo.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>SellerPI</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="http://code.jquery.com/jquery-1.8.0.min.js"></script>
</head>
  
 <body>
	<h1 style="text-align:center;color:#FF8000;"><img src="static/images/kkkwm.jpg" width="200" height="160"></img>快快快外卖</h1>
		<div class="container">
			<ul id="Tab" class="nav nav-pills" style="font-size:15pt">
				<li><a href="#adminPI" tabindex="-1" data-toggle="tab">个人信息</a></li>
				<li><a href="shopManage">店铺管理</a></li>
				<li><a href="orderManageInSeller">店铺订单</a></li>
				<li><a href="toSellerHomePage">返回</a></li>
			</ul>
		</div>
		
		<div class="container">
			<div id="TabContent" class="tab-content">
		
			<div class="tab-pane fade in active" id="menu">
			<table class="table table-hover">
	<thead>
	<tr>
		<th>商家ID</th>
		<th>姓名</th>
		<th>密码</th>
		<th>性别</th>
		<th>联系方式</th>

	</tr>
	</thead>
	<tbody>
        <tr>
            <td>${seller.seller_id}</td>
        	<td>${seller.seller_name}</td>
            <td>${seller.seller_pwd}</td>
            <td>${seller.seller_sex}</td>
            <td>${seller.seller_phone}</td>
        </tr>
	</tbody>
	</table>
			<a href="toUpdateSeller">
		<button type="button" class="btn btn-primary">修改信息</button>
			</a>
	</div>
	</div>
	</div>
  </body>
</html>
