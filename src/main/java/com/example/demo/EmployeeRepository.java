package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends  CrudRepository<Employee, Long>{
    List<Employee> findAllByLastName(String lastName);

    List<Employee> findAllByOrderByYearsExperienceDesc();

    List<Employee> findAllByEmailAddressContaining(String subtext);

    List<Employee> removeByEmailAddressContaining(String subtext);
}
