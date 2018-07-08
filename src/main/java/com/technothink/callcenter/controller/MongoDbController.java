package com.technothink.callcenter.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.technothink.callcenter.entity.AWSTranscript;
import com.technothink.callcenter.entity.ReactTranscribe;
import com.technothink.callcenter.response.ServiceResponse;
import com.technothink.callcenter.response.ServiceResponse.STATUS;
import com.technothink.callcenter.service.MongoDbService;

@CrossOrigin
@RestController
public class MongoDbController {

	@Autowired
	MongoDbService mongoDBService;

	@RequestMapping(method = RequestMethod.POST, value = "/cc/search/{anyValue}")

	public ServiceResponse findTranscibe(@PathVariable("anyValue") String anyValue) {
		ServiceResponse response = null;
		System.out.println("Got for search" + anyValue);
		List<AWSTranscript> list = mongoDBService.getTranscrptList();
		List<ReactTranscribe> list1 = new ArrayList<>();

		if (null != list && list.size() > 0) {
			ReactTranscribe reactTranscribe = new ReactTranscribe();
			for (AWSTranscript awsTranscript : list) {
				reactTranscribe.setJobName(awsTranscript.getJobName());
				reactTranscribe.setSpeakers(awsTranscript.getSpeakers());
				reactTranscribe.setStatus(awsTranscript.getStatus());
				reactTranscribe.setSentiment(awsTranscript.getSentiment().getSentiment());
				list1.add(reactTranscribe);

			}
			response = new ServiceResponse(STATUS.SUCCESS, "Transcribe list ", list1);

		} else {
			response = new ServiceResponse(STATUS.FAIL, "Transcribe list not found ", null);
		}
		return response;

	}

}
