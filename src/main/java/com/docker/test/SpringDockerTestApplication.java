package com.docker.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SpringDockerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerTestApplication.class, args);
	}

}
