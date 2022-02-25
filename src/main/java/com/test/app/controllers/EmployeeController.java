package com.test.app.controllers;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.test.app.model.EmployeeEntity;
import com.test.app.repository.EmployeeRepository;

@RestController
public class EmployeeController
{
	@Autowired
	EmployeeRepository employeeRepository;

	@GetMapping("/getAllEmployees")
	public Iterable<EmployeeEntity> getEmployees()
	{
		return employeeRepository.findAll();

	}

	@GetMapping("/getEmployeeById/{id}")
	public Optional<EmployeeEntity> getEmployee(@PathVariable("id") int id)
	{
		return employeeRepository.findById(id);

	}

	@PostMapping("/saveEmployee")
	public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employeeEntity)
	{
		return employeeRepository.save(employeeEntity);

	}
}
