package com.traini8.trainingCenterRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan("com.traini8.trainingCenterRegistry.model")
public class TrainingCenterRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingCenterRegistryApplication.class, args);
	}

}
