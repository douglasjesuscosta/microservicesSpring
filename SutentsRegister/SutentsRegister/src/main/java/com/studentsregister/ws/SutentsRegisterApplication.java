package com.studentsregister.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class SutentsRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SutentsRegisterApplication.class, args);
	}
}
