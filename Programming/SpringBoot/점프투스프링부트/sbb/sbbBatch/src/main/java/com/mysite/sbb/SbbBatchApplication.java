package com.mysite.sbb;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbbBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbbBatchApplication.class, args);
	}

}
