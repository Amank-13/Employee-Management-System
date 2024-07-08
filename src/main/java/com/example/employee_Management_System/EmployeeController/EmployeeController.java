package com.example.employee_Management_System.EmployeeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee_Management_System.model.Employee;
import com.example.employee_Management_System.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
	@GetMapping("/showEmployees")
	 public List<Employee> showAllEmployees() {
		return employeeService.findAllEmployees();
	}
	
	@GetMapping("/showEmployeeById/{id}")
	 public Employee showEmployeeById(@PathVariable long id) {
		return employeeService.findById(id);
	}
		
	@GetMapping("/showEmployeeByLocation/{location}")
	public List<Employee> showEmployeeByLocation(@PathVariable String location){
		return employeeService.findByLocation(location);
	}
	
	@GetMapping("/showEmployeeBySpecialization/{specialization}")
	public List<Employee> showEmployeeBySpecialization(@PathVariable String specialization){
		return employeeService.findBySpecialization(specialization);
	}
	
	@PutMapping("/updateLocation")
	public String updateLocation(@RequestBody Employee employee) {
		return employeeService.updateEmployeeLocation(employee);
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		return employeeService.deleteEmployee(id);
	}
}
