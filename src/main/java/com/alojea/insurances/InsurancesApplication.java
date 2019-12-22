package com.alojea.insurances;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.alojea.insurances.repositories")
public class InsurancesApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsurancesApplication.class, args);
	}

}
