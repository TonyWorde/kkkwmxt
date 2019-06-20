<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import = "com.kkkwm.pojo.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>RiderManage</title>
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
				<li><a href="getAllOrder">订单信息</a></li>
				<li><a href="getAllUser">用户管理</a></li>
				<li><a href="getAllSeller">商家管理</a></li>
				<li><a href="getAllRider" tabindex="-1" data-toggle="tab">骑手管理</a></li>
				<li><a href="toAdminHomePage">返回</a></li>
			</ul>
		</div>
		
		<div class="container">
			<div id="TabContent" class="tab-content">
	
	<div class="tab-pane fade in active" id="Rmanage">
	<a href="riderCheck">
	<button type="button" class="btn btn-primary">添加新骑手</button>
	</a>
	<div class="table-responsive">
	<table class="table">
	<thead>
	<tr>
		<th>骑手ID</th>
		<th>姓名</th>
		<th>性别</th>
		<th>联系方式</th>
		<th> </th>
	</tr>
	</thead>
	<tbody>
    <c:forEach var="rider" items="${riderlist}">
        <tr>
            	<td>骑手ID：${rider.rider_id}</td>
				<td>骑手名：${rider.rider_name}</td>
				<td>密码：${rider.rider_pwd}</td>
				<td>性别：${rider.rider_sex}</td>
				<td>联系方式：${rider.rider_phone}</td>
            <td><a href="deleteRider?rider_id=${rider.rider_id }"><button type="button" class="btn btn-warning">注销该骑手</button></a></td>
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