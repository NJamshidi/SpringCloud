package com.cloud.employee.employee.service;

import com.cloud.employee.employee.entity.EmployeeEntity;
import com.cloud.employee.employee.model.Employee;
import com.cloud.employee.employee.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;
import java.util.function.Function;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	public Mono<Employee> save(EmployeeEntity department) {
		EmployeeEntity c = repository.save(department);
		return Mono.just(Optional.of(c).map(mapper).orElse(null));
	}

	public Flux<Employee> findAll() {
		return Flux.fromIterable(repository.findAll()).map(mapper);
	}

	public Mono<Employee> findById(Long id) {

		return Mono.just(repository.findById(id).map(mapper).orElse(null));
	}

	public Flux<Employee> findByCollege(Long collegeId) {
		return Flux.fromIterable(repository.findByCollegeId(collegeId)).map(mapper);
	}

	public Flux<Employee> findByDepartment(Long departmentId) {
		return Flux.fromIterable(repository.findByDepartmentId(departmentId)).map(mapper);
	}

	private Function<EmployeeEntity, Employee> mapper = c -> {
		Employee response = new Employee();
		BeanUtils.copyProperties(c, response);
		return response;
	};

}