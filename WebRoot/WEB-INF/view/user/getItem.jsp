<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import = "com.kkkwm.pojo.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>CommentList</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="http://code.jquery.com/jquery-1.8.0.min.js"></script>
</head>
  
 <body>
	<h1 style="text-align:center;color:#FF8000;"><img src="static/images/kkkwm.jpg" width="200" height="160"></img>快快快外卖</h1>
		<div class="container">
			<ul id="Tab" class="nav nav-pills" style="font-size:15pt">
				<li><a href="showShop" tabindex="-1" data-toggle="tab">订单详情</a></li>
				<li><a href="getUserOrder">返回</a></li>
			</ul>
		</div>
		<div class="container">
			<div id="TabContent" class="tab-content">
				<div class="tab-pane fade in active" id="item">
				    <table class="table table-hover">
        <thead>
        <tr>
            <th>店铺名</th>
            <th>菜品名</th>
            <th>菜品单价</th>
            <th>数量</th>
            <th>总价</th>
        </tr>
        </thead>
            <c:forEach var="oi" items="${orderitem}">
                <tr>
                    <td>${oi.shop_name}</td>
                    <td style="color: crimson">${oi.food_name}</td>
                    <td style="color: brown">${oi.food_price}元/份</td>
                    <td>${oi.food_num}份</td>
                    <td>${oi.food_total}元</td>
                </tr>
        </c:forEach>
    </table>
    </div>
    </div>
    </div>
  </body>
</html>
