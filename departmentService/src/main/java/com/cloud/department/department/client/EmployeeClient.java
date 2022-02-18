package com.cloud.department.department.client;

import com.cloud.department.department.model.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "employeeُervice")
public interface EmployeeClient {

	@GetMapping("/department/{departmentId}")
	List<Employee> findByDepartment(@PathVariable("departmentId") Long departmentId);
	
}