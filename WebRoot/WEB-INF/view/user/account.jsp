<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import = "com.kkkwm.pojo.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Pay</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="http://code.jquery.com/jquery-1.8.0.min.js"></script>
	<script type="text/javascript">
        function verification(){
            var address = document.getElementById("address");
            if(address.value.length==0){
                confirm("收货地址不能为空");
                return false;
            }
            return true;
        }

    </script>
</head>
<body>
	<h1 style="text-align:center;color:#FF8000;"><img src="static/images/kkkwm.jpg" width="200" height="160"></img>快快快外卖</h1>
		
		<div class="container">
			<ul id="Tab" class="nav nav-pills" style="font-size:15pt">
				<li><a href="showShop">返回</a></li>
			</ul>
		</div>
		
		
		
	<div class="container">
		<div class="tab-pane fade in active" id="Aorders">
		<table class="table table-hover">
		<thead>
		<tr>
			<th>菜品</th>
			<th>单价</th>
			<th>数量</th>
			<th>总价</th>
			<th>实付金额</th>

		</tr>
		</thead>
		<tbody>
    	<c:forEach var="list" items="${cartlist}">
        	<tr>
      		<td>${list.food_name} </td>
    		<td>${list.food_price}元/份 </td>
    		<td>${list.cart_num}份 </td>
    		<td>${list.cart_total}元/份 </td>
        	</tr>
    	</c:forEach>
    	<tr>
    		<td>共${totalprice }元</td>
    	</tr>
		</tbody>
	</table>
	</div>
        <form class="form-horizontal" style="width: 600px" action="payOrder" method="post" onsubmit="return verification()">

            <div class="form-group">
                <label for="address" class="col-sm-2 control-label">收货地址</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="order_address">
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-active">购买</button>
                </div>
            </div>
        </form>
	</div>
</body>
</html>