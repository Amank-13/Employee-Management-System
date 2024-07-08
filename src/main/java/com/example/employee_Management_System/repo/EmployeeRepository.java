package com.example.employee_Management_System.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.employee_Management_System.model.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	
    @Query("SELECT e FROM Employee e WHERE e.location = :location")
	 public List<Employee> findByLocation(@Param("location") String location);

	
	@Query("select u from Employee u where u.specialization = :s")
	public List<Employee> findBySpecialization(@Param("s") String specialization);
	
	
	 @Query("UPDATE Employee e SET e.location = :location WHERE e.empId = :empId")
	    void updateLocation(@Param("location") String location, @Param("empId") Long empId);
}
