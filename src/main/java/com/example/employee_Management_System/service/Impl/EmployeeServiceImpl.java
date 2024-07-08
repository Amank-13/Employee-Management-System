package com.example.employee_Management_System.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee_Management_System.model.Employee;
import com.example.employee_Management_System.repo.EmployeeRepository;
import com.example.employee_Management_System.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public String addEmployee(Employee employee) {
		 employeeRepository.save(employee);
		return "Saved";
	}

	@Override
	public List<Employee> findAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee findById(Long Id) {
		return employeeRepository.findById(Id).orElse(new Employee());
	}

	@Override
	public List<Employee> findByLocation(String location) {
		return employeeRepository.findByLocation(location);
	}

	@Override
	public List<Employee> findBySpecialization(String specialization) {
		
		return employeeRepository.findBySpecialization(specialization);
	}

	@Override
	public String updateEmployeeLocation(Employee employee) {
		if(employee.getEmpId()!=null && employee.getLocation()!=null) {
			employeeRepository.updateLocation(employee.getLocation(), employee.getEmpId());
			return "Data Updated Successfully.";
		}
		return null;
	}

	@Override
	public String deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
		return "Record Removed.";
	}


}
