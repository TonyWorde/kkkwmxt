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
				<li><a href="toUserHomePage">返回</a></li>
			</ul>
		</div>
		<div class="container">
			<div id="TabContent" class="tab-content">
				<div class="tab-pane fade in active" id="mycart">
		<table class="table table-hover">
		<thead>
		<tr>
			<th>菜品</th>
			<th>单价</th>
			<th>数量</th>
			<th>总价</th>

		</tr>
		</thead>
		<tbody>
    	<c:forEach items="${cartlist}" var="list">
        	<tr>
            	<td>${list.food_name}</td>
            	<td>${list.food_price}元/份</td>
            	<td><a href="changeCart?cart_id=${list.cart_id }&param=minus"> <button>-</button></a>
    			&nbsp;${list.cart_num}份 &nbsp;
    			<a href="changeCart?cart_id=${list.cart_id }&param=add"> <button>+</button></a></td>
            	<td>${list.cart_total}元/份 </td>
        	</tr>
    	</c:forEach>
    	<tr>
    		<td>共${totalprice }元</td>
    	</tr>
		</tbody>
	</table>
	<a href="account"><button class="btn btn-primary">结算</button></a>
	</div>
	</div>
	</div>
  </body>
</html>
