package com.example.application;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringGitJenkinsIntegrationApplication {

	private static Logger log = LoggerFactory.getLogger(SpringGitJenkinsIntegrationApplication.class);

	@PostConstruct
	public void init() {
		log.info("Application Started");
	}

	public static void main(String[] args) {

		log.info("Application executed added four added the line in the github");

		SpringApplication.run(SpringGitJenkinsIntegrationApplication.class, args);
	}

}
