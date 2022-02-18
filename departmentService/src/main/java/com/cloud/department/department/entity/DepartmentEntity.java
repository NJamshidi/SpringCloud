package com.cloud.department.department.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity(name = "Department")
@Table(name = "Department")
@ToString
public class DepartmentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@Column(name = "college_id")
	private Long collegeId;
}