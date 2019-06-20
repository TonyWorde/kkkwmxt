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
				<li><a href="showShop">点餐</a></li>
				<li><a href="userManageInUser">我的信息</a></li>
				<li><a href="getUserOrder">我的订单</a></li>
				<li><a href="getSendOrder">正在配送订单</a></li>
				<li><a href="toAddComment">评论</a></li>
				<li><a href="getUserComment" tabindex="-1" data-toggle="tab">查看评价</a></li>
				<li><a href="toUserHomePage">返回</a></li>
				<li><a href="quit">退出</a></li>
			</ul>
		</div>
		<div class="container">
			<div id="TabContent" class="tab-content">
				<div class="tab-pane fade in active" id="comment">
		<table class="table table-hover">
		<thead>
		<tr>
			<th>评论号</th>
			<th>评论内容</th>
			<th>用户ID</th>
		</tr>
		</thead>
		<tbody>
    	<c:forEach var="uc" items="${usercomment}">
        	<tr>
    		<td>${uc.comment_id} </td>
    		<td>${uc.comment_content} </td>
    		<td>${uc.user_id} </td>
        	</tr>
    	</c:forEach>
		</tbody>
	</table>
	</div>
			</div>
		</div>
  </body>
</html>
