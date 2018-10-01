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

	//test employee to be added
	Employee emp = new Employee("john", "Doe", "123@aol.com", "911", "student", 6, "jane doe", "password20");

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	//TESTING OPERATIONS
	@Bean
	public CommandLineRunner demo(EmployeeRepository repository) {
		return (args) -> {

			// get all employees
			log.info("\nemployees found with findAll():");
			log.info("-------------------------------");
			for (Employee employees : repository.findAll()) {
				printEmployeeTable(employees);
			}

			// get all employees ordered by experience
			log.info("-------------------------------");
			log.info("employees by experience ");
			for(Employee employees : repository.findAllByOrderByYearsExperienceDesc() ){
				printEmployeeTable(employees);
			}

			//add an employee
			repository.save(emp);

			//check database for added employee
			log.info("-------------------------------");
			log.info("employees by those containing aol emails...... ");
			for(Employee employees : repository.findAllByEmailAddressContaining("aol") ){
				printEmployeeTable(employees);
			}

			/*UNCOMMENT TO DELETE THE ENTRY
            //DELETE THE NEW GUY!
            log.info("-------------------------------");
            log.info("deleting employees by those containing aol emails...... ");
            repository.removeByEmailAddressContaining("aol");


            //search the database again and make sure he is out
            log.info("-------------------------------");
            log.info("Searching for new employee to make sure he is gone ");
            for(Employee employees : repository.findAllByEmailAddressContaining("aol") ){
                printEmployeeTable(employees);
            }
            */
		};
	}

	//prints out values of employee attributes
	public void printEmployeeTable(Employee employees){
		System.out.println("First Name: " + employees.getFirstName() + "\nLast Name: " + employees.getLastName() + "\nEmail: " + employees.getEmailAddress() + "\nPhone Number: " + employees.getPhoneNumber()
				+ "\nCurrent Job Title: " + employees.getCurrentJobTitle() + "\nYears Experience: " +employees.getYearsExperience() + "\nManager Name: " + employees.getManagerName() + "\nHashed Password "
				+ employees.getHashedPw() + "\n\n");
	}
}


