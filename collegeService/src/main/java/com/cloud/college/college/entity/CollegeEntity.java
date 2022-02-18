package com.cloud.college.college.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "College")
@Table(name = "College")
public class CollegeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String address;

	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}