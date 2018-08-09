<!DOCTYPE html>
<%@ page language="java" import="java.util.*"
	contentType="text/html;charset=utf-8"%>
<%@ page import="java.sql.*"%>
<html>
<head>
<meta http-equiv=Content-Type content="text/html;charset=utf-8">
<meta charset="gbk">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta content="yes" name="apple-mobile-web-app-capable" />
<meta content="black" name="apple-mobile-web-app-status-bar-style">
<meta content="telephone=no" name="format-detection" />
<meta content="yes" name="apple-touch-fullscreen" />
<meta name="viewport"
	content="width=device-width,initial-scale=1.0,maximum-scale=1.0,minimum-scale=1.0,user-scalable=no" />
<link type="text/css" rel="stylesheet" href="stylesheets/style.css" />
<style>
body {
	background-color: white;
}

* {
	padding: 0;
	margin: 0;
}

ul {
	list-style: none
}

li {
	height: 70px;
	padding: 10px;
	border-bottom: 1px solid #ccc;
	vertical-align: middle;
}

.icon img {
	height: 70px;
	width: 70px;
}

.icon {
	display: inline-block;
	vertical-align: middle;
	/*border: 1px solid #00ff00;*/
}

.text {
	margin-left: 10px;
	width: calc(100% - 50px);
	display: inline-block;
	text-align: left;
	line-height: 70px;
	vertical-align: middle;
}
</style>

<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">

<title>文件传阅系统</title>
<script type="text/javascript">
	//在此拿到jsAPI权限验证配置所需要的信息
	var _config =
<%=com.alibaba.dingtalk.openapi.demo.auth.AuthHelper.getConfig(request)%>
	;
</script>
<script type="text/javascript" src="javascripts/zepto.min.js"></script>
<script type="text/javascript"
	src="http://g.alicdn.com/dingding/open-develop/1.6.9/dingtalk.js">
	
</script>
<script type="text/javascript" src="javascripts/logger.js">
	
</script>
<script type="text/javascript" src="javascripts/demo.js">
	
</script>
<script>
	
</script>
</head>

<body>


	<div align="center">
		<strong>欢迎您</strong> <span> <strong>
				<div id="userName" style="display: inline-block"></div>
		</strong>
		</span> <strong>使用文件传阅</strong>
	</div>
	<br>
	<br>

	<div align="center">&nbsp;&nbsp;&nbsp;&nbsp;您有？条未处理文件任务，请及时处理！</div>
	<br>
	<ul>
		<li>
			<div class="icon">
				<img src="pic/select (4).jpg" style="width: 25px; height: 25px">
			</div> <strong><div class="text">创建文件</div></strong>
		</li>
		<li>
			<div class="icon">
				<img src="pic/select.jpg" style="width: 25px; height: 25px">
			</div> <strong><div class="text">传阅文件</div></strong>
		</li>
		<li>
			<div class="icon">
				<img src="pic/select (2).jpg" style="width: 25px; height: 25px">
			</div> <strong><div class="text">查询统计</div></strong>
		</li>
		<li>
			<div class="icon">
				<img src="pic/select (3).jpg" style="width: 25px; height: 25px">
			</div> <strong><div class="text">下载文件</div></strong>
		</li>
	</ul>
	<script type="text/javascript">
		window.addEventListener('load', function() {
			setTimeout(function() {
			}, 500);
		});

		function openLink(url) {
			dd.biz.util.openLink({
				url : url,
				onSuccess : function(result) {
				},
				onFail : function(err) {
					alert(JSON.stringify(err));
				}
			});
		}

		var items = document.querySelectorAll('li');
		items[0].addEventListener('click', function() {
			window.location = './nav/1demo.html';
		});
		items[1].addEventListener('click', function() {
			openLink('https://www.baidu.com/');
		});

		items[2].addEventListener('click', function() {
			window.location = './list/list.html';
		});

		items[3].addEventListener('click', function() {
			window.location = './drawer/index.html';
		});
		items[4].addEventListener('click', function() {
			window.location = './tab/index.html';
		});
		items[5].addEventListener('click', function() {
			window.location = './contacts.jsp?corpid=' + _config.corpId;
		});
	</script>

</body>

</html>
