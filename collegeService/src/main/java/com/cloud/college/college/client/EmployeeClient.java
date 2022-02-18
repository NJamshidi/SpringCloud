package com.cloud.college.college.client;

import com.cloud.college.college.model.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "employeeService")
public interface EmployeeClient {

	@GetMapping("/college/{collegeId}")
	List<Employee> findByCollege(@PathVariable("collegeId") Long collegeId);
	
}