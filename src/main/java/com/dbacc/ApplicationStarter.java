package com.dbacc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author Lu, 2023-12-13
 */
@SpringBootApplication
@RestController
public class ApplicationStarter {
	public static void main(String[] args) {
		SpringApplication.run(ApplicationStarter.class, args);
		//SpringApplication.run(ConsumingRestApplication.class, args);
	}
}
