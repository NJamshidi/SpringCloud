package com.cloud.department.department.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Department {

	private Long id;
	private Long collegeId;
	private String name;
	private List<Employee> employees = new ArrayList<>();

	@Override
	public String toString() {
		return "Department [id=" + id + ", collegeId=" + collegeId + ", name=" + name + "]";
	}

}