package com.spring.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

	public String one() {

		System.out.println("=========oneservice");
		return "1";
	}

}
