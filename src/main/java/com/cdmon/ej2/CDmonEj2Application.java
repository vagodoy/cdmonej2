package com.cdmon.ej2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.cdmon"})
public class CDmonEj2Application {

	public static void main(String[] args) {
		SpringApplication.run(CDmonEj2Application.class, args);
	}

}
