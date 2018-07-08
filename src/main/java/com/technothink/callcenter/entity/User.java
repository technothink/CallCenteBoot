package com.technothink.callcenter.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_info")
public class User {

	@Id
	private String agentId;
	private String password;
	public String getAgentId() {
		return agentId;
	}
	public String getPassword() {
		return password;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}