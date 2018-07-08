
package com.technothink.callcenter.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technothink.callcenter.entity.User;
import com.technothink.callcenter.exception.DataAccessException;
import com.technothink.callcenter.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository agentRepository;

	public User findUser(String userId) throws DataAccessException {

		User agent = null;
		try {
			Optional<User> optional = agentRepository.findById(userId);
			if (null != optional) {

				agent = optional.get();
			}
		} catch (Exception exception) {
			throw new DataAccessException(exception);
		}

		return agent;
	}
}
