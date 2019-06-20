<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>UpdateUser</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="http://code.jquery.com/jquery-1.8.0.min.js"></script>
</head>
  
 <body>
	<h1 style="text-align:center;color:#FF8000;"><img src="static/images/kkkwm.jpg" width="200" height="160"></img>快快快外卖</h1>
		<div class="container">
			<ul id="Tab" class="nav nav-pills" style="font-size:15pt">
				<li><a href="update" tabindex="-1" data-toggle="tab">修改信息</a></li>
				<li><a href="userManageInUser">返回</a></li>
			</ul>
		</div>
		<div class="container">
			<div id="TabContent" class="tab-content">
				<div class="tab-pane fade in active" id="userPI">
				<f:form action="updateUser" method="post" commandName="user">
					<table class="table table-condensed">
		<thead>
		<tr>
			<td><f:input type="hidden" path="user_id" value="${id }"/></td>
		</tr>
		<tr>
			<th>密码</th>
			<td><f:input path="user_pwd" /></td>
			<td><f:errors path="user_pwd" cssStyle="color:red" /></td>
		</tr>
		<tr>
			<th>用户名</th>
			<td><f:input path="user_name" /></td>
		</tr>
		<tr>
		<th>性别</th>
		<td><f:radiobutton path="user_sex" value="男" label="男" /> <f:radiobutton
						   path="user_sex" vaue="女" label="女" />
		</td>
		</tr>
		<tr>
			<th>联系方式</th>
			<td><f:input path="user_phone" /></td>
			<td><f:errors path="user_phone" cssStyle="color:red" /></td>
		</tr>
	</thead>
	</table>
	<input type="submit" class="btn btn-success" value="修改">
	<input type="reset" class="btn btn-default" value="重填">
	</f:form>
	</div>
	</div>
	</div>
  </body>
</html>
