package com.student.model;

import com.student.entity.Course;

import lombok.Data;

@Data
public class StudentDTO {

	private int id;
	private String lastName;
	private String firstName;
	private Course course;

}
