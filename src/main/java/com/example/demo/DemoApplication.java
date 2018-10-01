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

	//TESTING OPERATIONS
	@Bean
	public CommandLineRunner demo(EmployeeRepository repository) {
		return (args) -> {

			// get all employees
			log.info("employees found with findAll():");
			log.info("-------------------------------");
			for (Employee employees : repository.findAll()) {
				System.out.println("First Name: " + employees.getFirstName() + "\nLast Name: " + employees.getLastName() + "\nEmail: " + employees.getEmailAddress() + "\nPhone Number: " + employees.getPhoneNumber()
						+ "\nCurrent Job Title: " + employees.getCurrentJobTitle() + "\nYears Experience: " +employees.getYearsExperience() + "\nManager Name: " + employees.getManagerName() + "\nHashed Password "
						+ employees.getHashedPw() + "\n\n");
			}
			log.info("-------------------------------");

			// get all employees ordered by experience
			log.info("employees by experience ");
			for(Employee employees : repository.findAllByOrderByYearsExperienceDesc() ){
				System.out.println("First Name: " + employees.getFirstName() + "\nLast Name: " + employees.getLastName() + "\nEmail: " + employees.getEmailAddress() + "\nPhone Number: " + employees.getPhoneNumber()
						+ "\nCurrent Job Title: " + employees.getCurrentJobTitle() + "\nYears Experience: " +employees.getYearsExperience() + "\nManager Name: " + employees.getManagerName() + "\nHashed Password "
						+ employees.getHashedPw() + "\n\n");
			}
		};
	}
}


