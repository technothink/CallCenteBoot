package com.technothink.callcenter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.technothink.callcenter.entity.User;
import com.technothink.callcenter.exception.DataAccessException;
import com.technothink.callcenter.response.ServiceResponse;
import com.technothink.callcenter.response.ServiceResponse.STATUS;
import com.technothink.callcenter.service.UserService;

@CrossOrigin
@RestController
public class UserController {

	@Autowired
	UserService agentService;

	@RequestMapping(method = RequestMethod.POST, value = "/cc/findUser/{userId}")
	public ServiceResponse findUser(@PathVariable("userId") String userId) {
		ServiceResponse response = null;
		User agent = null;
		try {
			agent = agentService.findUser(userId);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		if (null != agent) {
			response = new ServiceResponse(STATUS.SUCCESS, "User Validated", agent);
		} else {
			response = new ServiceResponse(STATUS.FAIL, "User not found in system", null);
		}

		return response;
	}

}
