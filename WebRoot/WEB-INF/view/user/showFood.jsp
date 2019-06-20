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
				<li><a href="showShop">返回</a></li>
				<li><a href="myCart">我的购物车</a></li>
			</ul>
		</div>
		<div class="container">
				<div class="tab-pane fade in active" id="Food">
						<table class="table table-hover">
		<thead>
		<tr>
			<th>菜品图片</th>
			<th>菜品</th>
			<th>单价</th>
			<th> </th>

		</tr>
		</thead>
		<tbody>
    	<c:forEach var="list" items="${foodlist}">
        	<tr>
    		<td><img src="${pageContext.request.contextPath}/${list.food_img }" width="160" height="90"/> </td>
    		<td>菜品：${list.food_name} </td>
    		<td>单价：${list.food_price}元/份 </td>
    		<td><a href="addCart?shop_id=${list.shop_id }&food_id=${list.food_id }"><button class="btn btn-warning">加入购物车</button></a></td>
        	</tr>
    	</c:forEach>
		</tbody>
	</table>
	</div>
	</div>
  </body>
</html>
