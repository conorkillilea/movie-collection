package com.conor.moviecollection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MovieCollectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCollectionApplication.class, args);
	}
}
