package com.technothink.callcenter.repository;

import org.springframework.data.repository.CrudRepository;

import com.technothink.callcenter.entity.User;

public interface UserRepository extends CrudRepository<User, String> {

}
