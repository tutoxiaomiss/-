package com.pms.utils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtil {
	// 设置静态常量
	private static String driverClassName;
	private static String url;
	private static String user;
	private static String password;
	// 给静态出来
	static {
		try {
			// 如何获得属性文件的输入流？
			// (不采用输入流中FileInputStream("src/db.properties"),因为WEB项目会放在服务器里，这样不可取)
			// 通常情况下使用类的加载器的方式进行获取：
			InputStream is = JdbcUtil.class.getClassLoader().getResourceAsStream("db.properties");
			// 实例化Properties对象
			Properties props = new Properties();
			// 首先通过props对象解析，然后再通过load()方法加载一个输入流
			props.load(is);
			driverClassName = props.getProperty("driverClassName");
			url = props.getProperty("url");
			user = props.getProperty("user");
			password = props.getProperty("password");
			Class.forName(driverClassName);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 注册驱动的方法
	public static void loadDriver() throws ClassNotFoundException{
		Class.forName(driverClassName);
	}
	
	// 获取连接的方法
	public static Connection getConnection() throws Exception {
		Connection conn = null;
		loadDriver();
		conn = DriverManager.getConnection(url, user, password);
		return conn;
		// return = DriverManager.getConnection(url, user, password);
	}
	// 释放资源1
	public static void release(PreparedStatement pstmt, Connection conn) {
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			pstmt = null;
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			conn = null;
		}
	}
	// 释放资源2
	public static void release(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			rs = null;
		}
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			pstmt = null;
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			conn = null;
		}
	}
	
}
