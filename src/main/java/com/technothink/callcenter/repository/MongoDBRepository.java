package com.technothink.callcenter.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.technothink.callcenter.entity.AWSTranscript;

@Repository
public interface MongoDBRepository extends CrudRepository<AWSTranscript, Long>  {

	
	
}
