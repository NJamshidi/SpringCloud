package com.cloud.employee.employee.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity(name = "Employee")
@Table(name = "Employee")
@ToString
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int age;
	private String position;
	
	@Column(name = "college_id")
	private Long collegeId;
	@Column(name = "department_id")
	private Long departmentId;

}