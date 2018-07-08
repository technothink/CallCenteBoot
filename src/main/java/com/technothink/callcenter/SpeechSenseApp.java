package com.technothink.callcenter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpeechSenseApp {

	private static Logger logger = LoggerFactory.getLogger(SpeechSenseApp.class);

	public static void main(String[] args) {

		SpringApplication.run(SpeechSenseApp.class, args);
		logger.debug("Spring boot application started..");
	}
}
