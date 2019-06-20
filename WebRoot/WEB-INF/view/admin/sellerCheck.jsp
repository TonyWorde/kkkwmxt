<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ page import = "com.kkkwm.pojo.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>SellerRegister</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="http://code.jquery.com/jquery-1.8.0.min.js"></script>
</head>
  
 <body>
	<h1 style="text-align:center;color:#FF8000;"><img src="static/images/kkkwm.jpg" width="200" height="160"></img>快快快外卖</h1>
		<div class="container">
			<ul id="Tab" class="nav nav-pills" style="font-size:15pt">
			<li><a href="#adminPI" tabindex="-1" data-toggle="tab">商家注册</a></li>
				<li><a href="toAdminHomePage">返回</a></li>
			</ul>
		</div>
  
    <div class="container">
    <f:form action="sellerregist" method="post" commandName="seller">
	<table class="table table-hover">
		<thead>
		<tr>
			<th>账号</th>
			<td><f:input path="seller_id" />
				</td>
				<td><f:errors path="seller_id" cssStyle="color:red" />
				</td>
		</tr>
		<tr>
			<th>密码</th>
			<td><f:input path="seller_pwd" />
				</td>
				<td><f:errors path="seller_pwd" cssStyle="color:red" />
				</td>
		</tr>
		<tr>
			<th>性名</th>
			<td><f:input path="seller_name" />
				</td>
		</tr>
		<tr>
			<th>性别</th>
			<td><f:radiobutton path="seller_sex" value="男" label="男" /> <f:radiobutton
						path="seller_sex" vaue="女" label="女" />
		</td>
		</tr>
		<tr>
			<th>联系方式</th>
			<td><f:input path="seller_phone" />
				</td>
				<td><f:errors path="seller_phone" cssStyle="color:red" />
				</td>
		</tr>
		
	</thead>
	</table>
	<input type="submit" class="btn btn-success" value="注册">
	<input type="reset" class="btn btn-default" value="重填">
	</f:form>
	</div>
  </body>
</html>


