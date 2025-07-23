package com.employeemanagement.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.employeemanagement.employeemanagement.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	boolean existsByEmail(String email);
}
