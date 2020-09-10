package org.melvault.controller;

import java.util.Optional;

import org.melvault.entity.Employee;
import org.melvault.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	// insert new country into database
	@PostMapping("/add")
	public Employee addCountry(@RequestBody Employee country) {

		return employeeRepository.save(country);
	}

	// fetch all country list from database
	@GetMapping("/all")
	public Iterable<Employee> allCountry() {

		return employeeRepository.findAll();
	}

	// fetch specific country by their ID
	@GetMapping("/{employeeId}")
	public Optional<Employee> countryById(@PathVariable("employeeId") int employeeId) {

		return employeeRepository.findById(employeeId);
	}

	// update existing country
	@PutMapping("/update")
	public Employee updateCountry(@RequestBody Employee country) {

		return employeeRepository.save(country);
	}

	// delete country from database
	@DeleteMapping("/delete/{employeeId}")
	public void deleteCountry(@PathVariable("employeeId") int employeeId) {

		employeeRepository.deleteById(employeeId);
	}
}
