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
			for (Employee Employees : repository.findAllByLastName("Smith")) {
				System.out.println("First Name: " + Employees.getFirst_Name() + "\nLast Name: " + Employees.getlastName() + "\nEmail: " + Employees.getEmail_Address() + "\nPhone Number: " + Employees.getPhone_Number()
					+ "\nCurrent Job Title: " + Employees.getCurrent_Job_Title() + "\nYears Experience: " +Employees.getYears_Experience() + "\nManager Name: " + Employees.getManager_Name() + "\nHashed Password "
						+ Employees.getHashed_PW() + "\n\n");
			}
			log.info("");
		};
	}
}


