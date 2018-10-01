package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@SpringBootApplication
public class DemoApplication {
	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(EmployeeRepository repository) {
		return (args) -> {

			// fetch all employees
			log.info("Employees found with findAll():");
			log.info("-------------------------------");
			for (Employee employee : repository.findAll()) {
				System.out.println("First Name: " + employee.getFirst_Name() + "\nLast Name: " + employee.getlastName() + "\nEmail: " + employee.getEmail_Address() + "\nPhone Number: " + employee.getPhone_Number()
					+ "\nCurrent Job Title: " + employee.getCurrent_Job_Title() + "\nYears Experience: " +employee.getYears_Experience() + "\nManager Name: " + employee.getManager_Name() + "\nHashed Password "
						+ employee.getHashed_PW() + "\n\n");
			}
			log.info("");
		};
	}
}


