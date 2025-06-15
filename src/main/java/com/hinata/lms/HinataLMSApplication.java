package com.hinata.lms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HinataLMSApplication {

	public static void main(String[] args) {
		System.out.println(new org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder().encode("123456"));
		SpringApplication.run(HinataLMSApplication.class, args);
	}

}
