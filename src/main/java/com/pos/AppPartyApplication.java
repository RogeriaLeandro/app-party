package com.pos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EntityScan(basePackages = {"models"})
public class AppPartyApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppPartyApplication.class, args);
	}


}
