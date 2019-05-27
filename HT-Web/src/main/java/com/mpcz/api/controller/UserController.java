package com.mpcz.api.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mpcz.domain.User;
import com.mpcz.exception.FormValidationException;
import com.mpcz.exception.UserException;
import com.mpcz.request.ErrorDetails;
import com.mpcz.request.UserDto;
import com.mpcz.response.Response;
import com.mpcz.service.UserService;
import com.mpcz.service.impl.UserServiceImpl;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value = "/api/user")
public class UserController {
	Logger logger=LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/save")
	public ResponseEntity<Response> saveUser(@RequestBody @Valid UserDto user,BindingResult bindingResult)
	throws FormValidationException,UserException,Exception{
		String method="UserController : saveUser()";
		logger.info(method);
		
		Response response = new Response();
		List<Object> list = new ArrayList<>();
		
		
		if (bindingResult.hasErrors()) {
		logger.error("Form validation error");	
		List<ErrorDetails> errorList = new ArrayList<ErrorDetails>();
		
		bindingResult.getFieldErrors().stream().forEach(field -> {
		
		ErrorDetails error = new ErrorDetails(new Date(), field.getDefaultMessage(),
				field.getField() + ":" + field.getDefaultMessage());
		errorList.add(error);

		});
		//response.setCode(ResponseCode.FORM_VALIDATION_ERROR);
		response.setError(errorList);
		
		throw new FormValidationException(response);
		}
		
		ModelMapper mapper=new ModelMapper();
		User user1=new User();
		mapper.map(user, user1);
		
		response = userService.save(user1);
		
		if(Objects.isNull(response)) {
			logger.error("userService.save(user1) returning null");	
			throw new UserException(response);
		}else {
			
		logger.error("Response returning success");	
		return  ResponseEntity.ok().header("Content-Type", "application/json").body(response);
		}
	}

}
