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
				<li><a href="showShop">点餐</a></li>
				<li><a href="userManageInUser">我的信息</a></li>
				<li><a href="getUserOrder">我的订单</a></li>
				<li><a href="getSendOrder" tabindex="-1" data-toggle="tab">正在配送订单</a></li>
				<li><a href="toAddComment">评论</a></li>
				<li><a href="getUserComment">查看评价</a></li>
				<li><a href="toUserHomePage">返回</a></li>
				<li><a href="quit">退出</a></li>
			</ul>
		</div>
		<div class="container">
			<div id="TabContent" class="tab-content">
				<div class="tab-pane fade in active" id="userOrder">
	
	<div class="table-responsive">
	<table class="table">
	<thead>
	<tr>
		<th>店铺名</th>
		<th>订单号</th>
		<th>订单下单时间</th>
		<th>订单价格</th>
		<th>实付金额</th>
		<th>订单状态</th>
		<th>订单收货地址</th>
		<th>用户ID</th>
		<th>用户联系方式</th>
		<th>配送人员ID</th>

	</tr>
	</thead>
	<tbody>
    <c:forEach var="oa" items="${orderlist}">
        <tr>
       	 	<td style="color: purple">${oa.shop_name}</td>
            <td style="color: darkgreen">${oa.order_on}</td>
            <td style="color: tomato">${oa.order_time}</td>
            <td style="color: orangered">${oa.order_price}</td>
            <td>${oa.order_pay}</td>
            <td>${oa.order_status}</td>
            <td>${oa.order_address} </td>
    		<td>${oa.user_id} </td>
    		<td>${oa.user_phone}</td>
    		<td>${oa.rider_id} </td>
    		<td><a href="getUserItem?order_on=${oa.order_on }"><button class="btn btn-success">查看订单详情</button></a></td>
        </tr>
        
        <tr> 
    		<td colspan="9">订单状态：0未付款，1已付款，2拒接单，3已接单，4可取货，5已送出，6已完成</td>
    	</tr>
    	
    	<tr>
    		<td><a href="arrive?order_on=${oa.order_on }"><button class="btn btn-success">确认收货</button></a></td>
        </tr>
    </c:forEach>
	</tbody>
	</table>
	</div>
	</div>
			</div>
		</div>
  </body>
</html>
