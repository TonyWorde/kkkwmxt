<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Home</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="http://code.jquery.com/jquery-1.8.0.min.js"></script>


</head>
<body>
		<h1 style="text-align:center;color:#FF8000;"><img src="static/images/kkkwm.jpg" width="200" height="160"></img>快快快外卖</h1>
		
		<div class="container">
			<ul id="Tab" class="nav nav-pills" style="font-size:15pt">
				<li><a href="#index" data-toggle="tab">首页</a></li>
				<li class="dropdown">
					<a href="#" id="TabDrop" class="dropdown-toggle"
						data-toggle="dropdown">关于我们
						<b class="caret"></b>
						</a>
					<ul class="dropdown-menu">
						<li><a href="#kkkwm" tabindex="-1" data-toggle="tab">快快快外卖</a></li>
						<li><a href="#about" tabindex="-1" data-toggle="tab">关于我们</a></li>
					</ul>
				</li>
      			<li><a href="userCheck"><span class="glyphicon glyphicon-user"></span> 注册</a></li>
      			<li><a href="tologin"><span class="glyphicon glyphicon-log-in"></span> 登录</a></li>
			</ul>
		</div>
		
		<div class="container">
			<div id="TabContent" class="tab-content">
				<div class="tab-pane fade in active" id="index">
	
				<div class="row clearfix">
					<div>
						<h3>系统公告</h3>
						<p>近期有12家新店铺加入快快快外卖，在新店铺下单即可享受新用户优惠。</p>
					</div>
				</div>
			</div>
			
			
				<div class="tab-pane fade" id="kkkwm">
					<h3>快快快外卖</h3>
					<p>近期有12家新店铺加入快快快外卖，在新店铺下单即可享受新用户优惠。</p>
				</div>			


				<div class="tab-pane fade" id="about">
					<h3>组员介绍</h3>
					<p>[组员介绍文案]</p>
				</div>
			</div>
								<div id="myCarousel" class="carousel slide">
						<ol class="carousel-indicators">
							<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
							<li data-target="#myCarousel" data-slide-to="1"></li>
							<li data-target="#myCarousel" data-slide-to="2"></li>
						</ol>   

						<div class="carousel-inner">
							<div class="item active">
								<img src="static/images/cp1.jpg" alt="First slide">
							</div>
							<div class="item">
								<img src="static/images/cp2.jpg" alt="Second slide">							</div>
							<div class="item">
								<img src="static/images/cp3.jpg" alt="Third slide">
							</div>
						</div>

						<a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
	    					<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
	    					<span class="sr-only">Previous</span>
						</a>
						<a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
	    					<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
	    					<span class="sr-only">Next</span>
						</a>
					</div> 
		</div>
</body>
</html>
