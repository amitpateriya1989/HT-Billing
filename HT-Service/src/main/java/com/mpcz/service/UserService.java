package com.mpcz.service;

import java.util.Optional;

import com.mpcz.domain.User;

public interface UserService {

	public User save(final User user);
	
	public User update(final User user);
	
	public void delete(final User user);
	
	public Optional<User> findById(final Long id);

	
}
