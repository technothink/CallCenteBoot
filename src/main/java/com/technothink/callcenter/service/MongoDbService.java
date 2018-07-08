package com.technothink.callcenter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technothink.callcenter.entity.AWSTranscript;
import com.technothink.callcenter.repository.MongoDBRepository;

@Service
public class MongoDbService {

	@Autowired
	MongoDBRepository dbRepository;

	public List<AWSTranscript> getTranscrptList() {
		
		return (List<AWSTranscript>) dbRepository.findAll();
	}
}
