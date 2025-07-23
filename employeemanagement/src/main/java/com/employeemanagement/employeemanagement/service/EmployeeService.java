package com.employeemanagement.employeemanagement.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.employeemanagement.employeemanagement.entity.Employee;
import com.employeemanagement.employeemanagement.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);

	public Employee addEmployee(Employee employee) {
		logger.info("Adding new employee: {}", employee.getName());
		return employeeRepository.save(employee);
	}

	public Page<Employee> getAllEmployees(Pageable pageable) {
		logger.info("Fetching all employees with pagination: pageNumber={}, pageSize={}", pageable.getPageNumber(),
				pageable.getPageSize());
		return employeeRepository.findAll(pageable);
	}

	public Optional<Employee> getEmployeeById(Long id) {
		logger.info("Fetching employee by ID: {}", id);
		return employeeRepository.findById(id);
	}

	public Employee updateEmployee(Long id, Employee employeeDetails) {
		logger.info("Updating employee with ID: {}", id);
		Employee employee = employeeRepository.findById(id).orElseThrow();
		employee.setName(employeeDetails.getName());
		employee.setEmail(employeeDetails.getEmail());
		employee.setDepartment(employeeDetails.getDepartment());
		employee.setSalary(employeeDetails.getSalary());
		employee.setJoiningDate(employeeDetails.getJoiningDate());
		logger.info("Updated employee: {}", employee.getName());
		return employeeRepository.save(employee);
	}

	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
	}
}
