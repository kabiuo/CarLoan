package com.woniu.carloan.util;

/**
 * �Զ������ݿ�����쳣(���ܼ��쳣/����ʱ�쳣)
 * @author ���
 *
 */
public class DBException extends RuntimeException {

	public DBException(String message, Throwable cause) {
		super(message, cause);
	}

	public DBException(String message) {
		super(message);
	}
}
