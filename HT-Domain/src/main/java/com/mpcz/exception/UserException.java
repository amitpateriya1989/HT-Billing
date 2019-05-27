package com.mpcz.exception;

import com.mpcz.response.Response;

public class UserException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Response response;
	
	public UserException(final Response response) {
		
		super(response.getMessage());
		
		this.response=response;
	}
	
	public Response getResponse() {
		
		return response;
	}
	public void setResponse(Response response) {
		
		this.response = response;
	}

}
