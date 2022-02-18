package com.cloud.student.student.entity;


import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity(name = "Student")
@Table(name = "Student")
@ToString
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;

    @Column(name = "college_id")
    private Long collegeId;
    @Column(name = "department_id")
    private Long departmentId;
}