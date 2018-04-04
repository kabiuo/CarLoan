package com.woniu.carloan.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 数据库会话
 * @author
 *
 */
public class DBSession {
	private Connection conn;

	/**
	 * 开启事务
	 */
	public void beginTx() {
		try {
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("开启事务失败", e);
		}
	}

	/**
	 * 提交事务
	 */
	public void commitTx() {
		try {
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("提交事务失败", e);
		}
	}

	/**
	 * 回滚事务
	 */
	public void rollbackTx() {
		try {
			conn.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("回滚事务失败", e);
		}
	}

	/**
	 * 执行查询
	 * @param sql SQL语句
	 * @param handler 结果集处理器
	 * @param params 替换SQL语句中占位符的参数
	 * @return 代表查询结果的对象
	 */
	public <T> T query(String sql, ResultSetHandler<T> handler, Object... params) {
		if (sql == null) {
			throw new DBException("没有指定要执行的SQL语句");
		}
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			int paramCount = stmt.getParameterMetaData().getParameterCount();
			if (paramCount != params.length) {
				throw new DBException("传入的参数个数和SQL语句中需要的参数个数不匹配");
			}
			for (int i = 0; i < params.length; ++i) {
				stmt.setObject(i + 1, params[i]);
			}
			try (ResultSet rs = stmt.executeQuery()) {
				return handler.handle(rs);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new DBException("处理结果集时发生错误", e);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("创建或执行SQL语句时发生错误", e);
		}
	}

	/**
	 * 执行更新(包括insert / delete / update)
	 * @param sql SQL语句
	 * @param params 替换SQL语句中占位符的参数
	 * @return 受影响的行数
	 */
	public int update(String sql, Object... params) {
		if (sql == null) {
			throw new DBException("没有指定要执行的SQL语句");
		}
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			int paramCount = stmt.getParameterMetaData().getParameterCount();
			if (paramCount != params.length) {
				throw new DBException("传入的参数个数和SQL语句中需要的参数个数不匹配");
			}
			for (int i = 0; i < params.length; ++i) {
				stmt.setObject(i + 1, params[i]);
			}
			return stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("执行SQL语句时发生错误", e);
		}
	}

	/**
	 * 开启数据库会话
	 */
	public void open() {
		if (conn == null) {
			conn = DBUtil.openConnection();
		}
	}

	/**
	 * 关闭数据库会话
	 */
	public void close() {
		DBUtil.closeConnection(conn);
		conn = null;
	}
}
