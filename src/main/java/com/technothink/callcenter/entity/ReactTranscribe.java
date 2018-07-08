package com.technothink.callcenter.entity;

import java.util.List;

public class ReactTranscribe {

	private String jobName;
	private List<Speaker> speakers;
	private String status;

	public String getSentiment() {
		return sentiment;
	}

	public void setSentiment(String sentiment) {
		this.sentiment = sentiment;
	}

	private String sentiment;
	

	public String getJobName() {
		return jobName;
	}

	public List<Speaker> getSpeakers() {
		return speakers;
	}

	public String getStatus() {
		return status;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public void setSpeakers(List<Speaker> speakers) {
		this.speakers = speakers;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
