package com.cvs.assignment.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Configuration
@ComponentScan({"com.cvs.assignment.controller","com.cvs.assignment.dao.repository","com.cvs.assignment.service","com.cvs.assignment.exception"})
@EnableJpaRepositories("com.cvs.assignment.dao.repository")
@EntityScan("com.cvs.assignment.model")
public class AssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentApplication.class, args);
	}

}
