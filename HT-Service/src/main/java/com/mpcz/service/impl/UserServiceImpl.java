package com.mpcz.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpcz.domain.User;
import com.mpcz.repository.UserRepository;
import com.mpcz.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;

	@Override
	public User save(final User user) {
		// TODO Auto-generated method stub

		return repository.save(user);
	}

	@Override
	public User update(final User user) {
		// TODO Auto-generated method stub

		return repository.save(user);
	}

	@Override
	public void delete(final User user) {
		// TODO Auto-generated method stub
		repository.save(user);

	}

	@Override
	public Optional<User> findById(final Long id) {
		// TODO Auto-generated method stub

		return repository.findById(id);
	}

}
