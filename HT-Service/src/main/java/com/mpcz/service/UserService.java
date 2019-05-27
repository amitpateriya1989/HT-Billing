package com.mpcz.service;

import java.util.Optional;

import com.mpcz.domain.User;
import com.mpcz.exception.UserException;
import com.mpcz.response.Response;

public interface UserService {

	public Response<User> save(final User user) throws UserException;
	
	public Response<User> update(final User user);
	
	public void delete(final User user);
	
	public Response<Optional<User>> findById(final Long id);

	
}
