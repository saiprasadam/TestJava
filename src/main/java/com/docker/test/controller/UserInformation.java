package com.docker.test.controller;

import org.springframework.stereotype.Component;

@Component
public class UserInformation {

	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
