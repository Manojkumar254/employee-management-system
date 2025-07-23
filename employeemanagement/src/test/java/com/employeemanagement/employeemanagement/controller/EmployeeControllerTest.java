package com.employeemanagement.employeemanagement.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.employeemanagement.employeemanagement.entity.Employee;
import com.employeemanagement.employeemanagement.service.EmployeeService;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class EmployeeControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@Mock
	private EmployeeService employeeService;

	@InjectMocks
	private EmployeeController employeeController;

	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void testAddEmployee() throws Exception {
		Employee employee = new Employee();
		employee.setName("Manoj Naik");
		employee.setEmail("manoj.naik@example.com");

		when(employeeService.addEmployee(any(Employee.class))).thenReturn(employee);

		mockMvc.perform(post("/api/employees").contentType(MediaType.APPLICATION_JSON)
				.content("{\"name\":\"John Doe\",\"email\":\"manoj.naik@example.com\"}"))
				.andExpect(status().isCreated());
	}
}
