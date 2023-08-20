package com.allianz.tourmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TourManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(TourManagementApplication.class, args);
	}

}
