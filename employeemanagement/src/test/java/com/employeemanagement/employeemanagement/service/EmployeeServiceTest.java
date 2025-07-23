package com.employeemanagement.employeemanagement.service;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.employeemanagement.employeemanagement.entity.Employee;
import com.employeemanagement.employeemanagement.repository.EmployeeRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class EmployeeServiceTest {
	@Mock
	private EmployeeRepository employeeRepository;

	@InjectMocks
	private EmployeeService employeeService;

	public EmployeeServiceTest() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void testAddEmployee() {
		Employee employee = new Employee();
		employee.setName("Manoj Naik");
		employee.setEmail("manoj.naik@example.com");
		when(employeeRepository.save(any(Employee.class))).thenReturn(employee);

		Employee createdEmployee = employeeService.addEmployee(employee);
		assertEquals("Manoj Naik", createdEmployee.getName());
	}

	@Test
	public void testGetEmployeeById() {
		Employee employee = new Employee();
		employee.setId(1L);
		when(employeeRepository.findById(1L)).thenReturn(Optional.of(employee));

		Optional<Employee> foundEmployee = employeeService.getEmployeeById(1L);
		assertTrue(foundEmployee.isPresent());
		assertEquals(1L, foundEmployee.get().getId());
	}
}
