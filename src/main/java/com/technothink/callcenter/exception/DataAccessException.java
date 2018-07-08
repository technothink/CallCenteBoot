package com.technothink.callcenter.exception;

public class DataAccessException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DataAccessException(Exception exception) {
		super(exception);
	}

}
