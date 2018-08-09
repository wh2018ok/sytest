package com.alibaba.dingtalk.openapi.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 文件工具类，用于连接数据库
 */
public class MysqlServer {
	private static final String URL = "jdbc:mysql://192.168.10.135:3306/fileread?characterEncoding=utf8&useSSL=true&serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASSWORD = "123.com";
	private static Connection conn = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	// 创建一个静态块

	static {
		try {
			// 1.加载驱动程序
			Class.forName("com.mysql.jdbc.Driver");
			// 2.获得数据库的链接
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	// 获得连接
	public static Connection getConnection() {
		return conn;
	}
	   
	   //查询
	   public ResultSet select(String query)
	   {
	    System.out.println(query);
	    try {
	   stmt = conn.createStatement();
	   rs = stmt.executeQuery(query);
	  } catch (SQLException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	  }
	   return rs;
	   }
	   //更新
	   public void update(String upstr)
	   {
	    System.out.println(upstr);
	    try {
	   stmt = conn.createStatement();
	   int rs = stmt.executeUpdate(upstr);
	  } catch (SQLException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	  }
	      
	   //关闭操作
	   }
	   public void close()
	   {
	    try {
	   stmt.close();
	   conn.close();
	  } catch (SQLException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	  }
	       

	   }
	}



