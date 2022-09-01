package com.frontdesk.appplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.commerce.config.CommerceSpringConfiguration;

@SpringBootApplication(scanBasePackages = {"com.frontdesk.appplication.controllers", "com.frontdesk.appplication.config"})
@Import(CommerceSpringConfiguration.class)
public class FronDeskApplication {

	public static void main(String[] args) {
		SpringApplication.run(FronDeskApplication.class, args);
	}

}