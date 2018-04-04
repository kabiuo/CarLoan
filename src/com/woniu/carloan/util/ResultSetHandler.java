package com.woniu.carloan.util;

import java.sql.ResultSet;

/**
 * �����������
 * @author 
 *
 * @param <T> �������͵ķ��Ͳ���
 */
@FunctionalInterface
public interface ResultSetHandler<T> {

	/**
	 * ��������
	 * @param rs ���������
	 * @return �ӽ�����л�õ�Ҫ��ѯ����
	 */
	public T handle(ResultSet rs);
}
