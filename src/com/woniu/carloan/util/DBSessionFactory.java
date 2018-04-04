package com.woniu.carloan.util;

/**
 * ���ݿ�Ự����
 * @author
 *
 */
public final class DBSessionFactory {
	private static ThreadLocal<DBSession> threadLocal = new ThreadLocal<>();
	
	private DBSessionFactory() {
		throw new AssertionError();
	}
	
	/**
	 * ��ú͵�ǰ�̰߳󶨵�DBSession����
	 * @return DBSession����
	 */
	public static DBSession getCurrentSession() {
		DBSession session = threadLocal.get();
		if (session == null) {
			session = new DBSession();
			threadLocal.set(session);
		}
		session.open();
		return session;
	}
	
	/**
	 * �ͷź͵�ǰ�̰߳󶨵�DBSession
	 */
	public static void closeSession() {
		DBSession session = threadLocal.get();
		if (session != null) {
			threadLocal.remove();
			session.close();
		}
	}
}
