package com.mpcz.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.net.ssl.HttpsURLConnection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpcz.constant.HttpCode;
import com.mpcz.constant.ResponseMessage;
import com.mpcz.domain.User;
import com.mpcz.exception.UserException;
import com.mpcz.repository.UserRepository;
import com.mpcz.response.Response;
import com.mpcz.service.UserService;
import com.mpcz.utility.UserUtility;

@Service
public class UserServiceImpl implements UserService {

	Logger logger=LoggerFactory.getLogger(UserServiceImpl.class);
			
	@Autowired
	private UserRepository repository;
	
	/**
	 * method: To save user record
	 * var: User : is used to store data
	 */
	@Override
	public Response<User> save(final User user) throws UserException {
		String method="UserServiceImpl : save()";
		logger.info(method);
		
		// TODO Auto-generated method stub
		Response response=new Response();
		
		if(Objects.isNull(user)) {
			logger.error("User Object is Null");
			response.setCode(HttpCode.NULL_OBJECT);
			response.setMessage(ResponseMessage.NULL_OBJECT_MESSAGE);
			throw new UserException(response);
		}else {

			User user1=UserUtility.getUserRecordUpdateDetail(user);
			User userResponse=null;
			if(Objects.isNull(user1)) {
				logger.error("method getUserRecordUpdateDetail is returning Null");
				response.setCode(HttpCode.NULL_OBJECT);
				response.setMessage(ResponseMessage.USER_RECORD_ERROR_MESSAGE);
				throw new UserException(response);
			}else {
				user1.setAccountNonExpired(false);
				user1.setAccountNonLocked(false);
				user1.setCredentialsNonExpired(false);
				user1.setLastLoggedInDate(null);
				user1.setLoginAttemp(null);
				user1.setLoginStatus("NA");
				userResponse=repository.save(user1);
			}

			if(Objects.isNull(userResponse)) {
				logger.error("repository.save(user1) is returning Null");
				response.setCode(HttpCode.NULL_OBJECT);
				response.setMessage(ResponseMessage.CREATE_USER_RECORD_ERROR_MESSAGE);
				throw new UserException(response);
			}else {
				logger.info("response is returning successfully");
				response.setCode(HttpCode.OK);
				response.setMessage(ResponseMessage.RECORD_INSERTED_MESSAGE);
				List list=new ArrayList();
				list.add(userResponse);
				response.setList(list);
				return response;
			}
		}


	}



	@Override
	public Response<User> update(final User user) {
		// TODO Auto-generated method stub

		//return repository.save(user);
		return null;
	}

	@Override
	public void delete(final User user) {
		// TODO Auto-generated method stub
		repository.save(user);

	}

	@Override
	public Response<Optional<User>> findById(final Long id) {
		// TODO Auto-generated method stub

		//return repository.findById(id);
		return null;
	}

}
