package com.employee.dto;


public class ErrorDTO extends BaseDomainDTO{
	
	private int errorCode;
	
	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrroMessage() {
		return errroMessage;
	}

	public void setErrroMessage(String errroMessage) {
		this.errroMessage = errroMessage;
	}

	private String errroMessage;

}
