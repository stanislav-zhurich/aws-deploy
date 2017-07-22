package com.stan.aws.deploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootApplication
@WebAppConfiguration
public class AwsDeployApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsDeployApplication.class, args);
	}
}
