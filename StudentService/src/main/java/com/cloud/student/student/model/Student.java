package com.cloud.student.student.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {

    private Long id;
    private Long collegeId;
    private Long departmentId;
    private String name;
    private int age;
    private String position;

    @Override
    public String toString() {
        return "Employee [id=" + id + ", collegeId=" + collegeId + ", departmentId=" + departmentId
                + ", name=" + name + ", position=" + position + "]";
    }

}