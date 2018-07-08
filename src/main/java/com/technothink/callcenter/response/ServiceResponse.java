package com.technothink.callcenter.response;

public class ServiceResponse {

	private STATUS status;

	public STATUS getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}

	public Object getData() {
		return data;
	}

	private String message;
	private Object data;

	public ServiceResponse(STATUS status, String message, Object data) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
	}

	public enum STATUS {
		SUCCESS("0"), FAIL("1");
		private String responseType;

		private STATUS(String responseType) {
			this.responseType = responseType;
		}

		public String getResponse() {
			return responseType;
		}

	}
}
