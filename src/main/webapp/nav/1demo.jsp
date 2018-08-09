<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<jsp:useBean id="query"
	class="com.alibaba.dingtalk.openapi.servlet.MysqlServer" scope="page"></jsp:useBean>
<html>
<head>

<title>处理1demo.html的相关操作</title>


</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		String sex = request.getParameter("sex");
		String age = request.getParameter("age");
		ResultSet rs = null;
		String str = "select username,sex,age from user ";
		query.getConnection();
		rs = query.select(str);
		rs.last();
		str = "insert into User(username,sex,age)values('" + username + "','" + sex + "','" + age + "');";
		query.update(str);
	%>
</body>
</html>