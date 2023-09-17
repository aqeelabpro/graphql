package com.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.graphql.*")
public class SpringBootGraphqlServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGraphqlServerApplication.class, args);
	}

}
