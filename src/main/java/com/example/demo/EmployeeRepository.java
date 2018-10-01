package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface EmployeeRepository extends  CrudRepository<Employee, Long>{
    List<Employee> findAllByLastName(String lastName);

    List<Employee> findAllByOrderByYearsExperienceDesc();

    List<Employee> findAllByEmailAddressContaining(String subtext);

    @Transactional
    List<Employee> removeByEmailAddressContaining(String subtext);
}
