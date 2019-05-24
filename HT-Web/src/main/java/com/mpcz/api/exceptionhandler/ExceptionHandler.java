package com.mpcz.api.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.mpcz.exception.FormValidationException;
import com.mpcz.response.Response;

@RestControllerAdvice
public class ExceptionHandler  extends ResponseEntityExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(FormValidationException.class)
	public final ResponseEntity<Response> handleFormValidationException(FormValidationException ex,
			WebRequest request) {
		
		return new ResponseEntity<>(ex.getResponse(), HttpStatus.OK);
	}
	
}
