<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import = "com.kkkwm.pojo.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Orders</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="http://code.jquery.com/jquery-1.8.0.min.js"></script>
  </head>
  
  <body>
	<h1 style="text-align:center;color:#FF8000;"><img src="static/images/kkkwm.jpg" width="200" height="160"></img>快快快外卖</h1>
		<div class="container">
			<ul id="Tab" class="nav nav-pills" style="font-size:15pt">
				<li><a href="getAdmin">个人信息</a></li>
				<li><a href="getAllOrder" tabindex="-1" data-toggle="tab">订单信息</a></li>
				<li><a href="getAllUser">用户管理</a></li>
				<li><a href="getAllSeller">商家管理</a></li>
				<li><a href="getAllRider">骑手管理</a></li>
				<li><a href="toAdminHomePage">返回</a></li>
			</ul>
		</div>
		
		<div class="container">
			<div id="TabContent" class="tab-content">
	
		<div class="tab-pane fade in active" id="Aorders">
		<table class="table table-hover">
		<thead>
		<tr>
			<th>订单号</th>
			<th>下单时间</th>
			<th>订单总价</th>
			<th>实付金额</th>
			<th>订单状态</th>
			<th>收货地址</th>
			<th>店铺名</th>
			<th>用户ID</th>
			<th>骑手ID</th>
			<th> </th>

		</tr>
		</thead>
		<tbody>
    	<c:forEach var="oa" items="${orderall}">
        	<tr>
    		<td>${oa.order_on} </td>
    		<td>${oa.order_time} </td>
    		<td>${oa.order_price} </td>
    		<td>${oa.order_pay} </td>
    		<td>${oa.order_status} </td>
    		<td>${oa.order_address} </td>
    		<td>${oa.shop_name} </td>
    		<td>${oa.user_id} </td>
    		<td>${oa.rider_id} </td>
    		<td><a href="getItem?order_on=${oa.order_on }"><button type="button" class="btn btn-primary">查看订单详情</button></a></td>
        	</tr>
        <tr>
    		<td colspan="9">订单状态：0未付款，1已付款，2拒接单，3已接单，4可取货，5已送出，6已完成</td>
    	</tr>
    	</c:forEach>
		</tbody>
	</table>
	</div>
	
			</div>
		</div>
	
  </body>
</html>