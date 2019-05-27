package com.mpcz.exception;

import com.mpcz.response.Response;

public class FormValidationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Response response;
	
	public FormValidationException(final Response response){
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
