package com.mpcz.response;

import java.util.List;

import com.mpcz.request.ErrorDetails;

public class Response<T> {
	private String code;
	private String message;
	private List<T> list;
	private List<ErrorDetails> error;

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public List<ErrorDetails> getError() {
		return error;
	}
	public void setError(List<ErrorDetails> error) {
		this.error = error;
	}



}
