package com.it.unimi.vassallo.wca.ilvolo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class IlvoloApplication {

	public static void main(String[] args) {
		SpringApplication.run(IlvoloApplication.class, args);
	}
}
