package com.woniu.carloan.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 数据库工具类(数据库资源管理类)
 * @author
 *
 */
public final class DBUtil {
	private static final String JDBC_DRV = "com.mysql.jdbc.Driver";
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/carloan?useSSL=false&useUnicode=true&characterEncoding=utf8";
	private static final String JDBC_UID = "root";
	private static final String JDBC_PWD = "root";

	static {
		try {
			Class.forName(JDBC_DRV);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new DBException("加载数据库驱动出错", e);
		}
	}

	private DBUtil() {
		throw new AssertionError();
	}

	/**
	 * 打开数据库连接
	 * @return Connection对象
	 */
	public static Connection openConnection() {
		try {
			return DriverManager.getConnection(JDBC_URL, JDBC_UID, JDBC_PWD);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("创建数据库连接出错", e);
		}
	}

	/**
	 * 关闭数据库连接
	 * @param con 待关闭的Connection对象
	 */
	public static void closeConnection(Connection con) {
		try {
			if (con != null && !con.isClosed()) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("关闭数据库连接出错", e);
		}
	}
}
