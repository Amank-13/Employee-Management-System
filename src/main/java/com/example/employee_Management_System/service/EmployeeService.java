package com.example.employee_Management_System.service;

import java.util.List;

import com.example.employee_Management_System.model.Employee;

public interface EmployeeService {

	String addEmployee(Employee employee);
	
	List<Employee> findAllEmployees();
	
	Employee findById(Long Id);
	
	List<Employee> findByLocation(String location);
	
	List<Employee> findBySpecialization(String specialization);
	
	String updateEmployeeLocation(Employee employee);
	
	String deleteEmployee(Long id);
}
