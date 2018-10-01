package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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
			for (Employee Employees : repository.findAll()) {
				System.out.println("First Name: " + Employees.getFirstName() + "\nLast Name: " + Employees.getLastName() + "\nEmail: " + Employees.getEmailAddress() + "\nPhone Number: " + Employees.getPhoneNumber()
					+ "\nCurrent Job Title: " + Employees.getCurrentJobTitle() + "\nYears Experience: " +Employees.getYearsExperience() + "\nManager Name: " + Employees.getManagerName() + "\nHashed Password "
						+ Employees.getHashedPw() + "\n\n");
			}
			log.info("");
		};
	}
}


