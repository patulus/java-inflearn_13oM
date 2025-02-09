package com.patulus.learnSpringBootSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LearnSpringBootSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringBootSecurityApplication.class, args);
	}

}
