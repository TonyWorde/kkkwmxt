<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
				<li><a href="#diancan" tabindex="-1" data-toggle="tab">账户充值</a></li>
				<li><a href="toUserHomePage">返回</a></li>
			</ul>
		</div>
		
	<div class="container">
	<form action="deposit" method="post">
	<table class="table table-condensed">
		<thead>
		<tr>
			<th>充值金额</th>
			<td>
				<input type="radio" name="balance" value="0.5" />0.5元
				<input type="radio" name="balance" value="1.0" />1.0元
				<input type="radio" name="balance" value="2.0" />2.0元<br>
				<input type="radio" name="balance" value="5.0" />5.0元
				<input type="radio" name="balance" value="10.0" />1 0元
				<input type="radio" name="balance" value="20.0" />2 0元<br>
				<input type="radio" name="balance" value="50.0" />5 0元
				<input type="radio" name="balance" value="100.0" />100元
				<input type="radio" name="balance" value="500.0" />500元
			</td>
		</tr>
		<tr>
			<th>充值方式</th>
			<td>
			<input type="radio" name="payway" value="微信" />微信支付<br>
			<input type="radio" name="payway" value="支付宝" />支付宝支付<br>
			<input type="radio" name="payway" value="银行卡" />银行卡支付
			</td>
		</tr>
	</thead>
	</table>
		<input type="submit" class="btn btn-warning" value="充值">
	</form>
	</div>
  </body>
</html>
