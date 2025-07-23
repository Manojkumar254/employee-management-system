package com.employeemanagement.employeemanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty(message = "Name cannot be empty")
	private String name;
	@Email(message = "Email should be valid")
	@Column(unique = true)
	private String email;
	private String department;
	@Positive(message = "Salary must be positive")
	private Double salary;
	private LocalDate joiningDate;
}