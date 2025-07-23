package com.employeemanagement.employeemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.employeemanagement.employeemanagement.entity.Employee;
import com.employeemanagement.employeemanagement.service.EmployeeService;

import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@PostMapping
	public ResponseEntity<Employee> addEmployee(@Valid @RequestBody Employee employee) {
		return new ResponseEntity<>(employeeService.addEmployee(employee), HttpStatus.CREATED);
	}

	@GetMapping
	public Page<Employee> getAllEmployees(@PageableDefault(size = 10) Pageable pageable) {
		return employeeService.getAllEmployees(pageable);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
		return employeeService.getEmployeeById(id).map(employee -> ResponseEntity.ok(employee))
				.orElse(ResponseEntity.notFound().build());
	}

	@PutMapping("/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id,
			@Validated @RequestBody Employee employeeDetails) {
		return ResponseEntity.ok(employeeService.updateEmployee(id, employeeDetails));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
		return ResponseEntity.noContent().build();
	}

}
