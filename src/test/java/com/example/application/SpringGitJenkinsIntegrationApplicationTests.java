package com.example.application;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringGitJenkinsIntegrationApplicationTests {
	
	private static Logger log = LoggerFactory.getLogger(SpringGitJenkinsIntegrationApplicationTests.class);

	@Test
	void contextLoads() {
		log.info("Application Tested");
	}

}
