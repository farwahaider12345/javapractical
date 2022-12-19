package com.student.service;

import java.util.List;

import com.student.entity.Course;

import com.student.model.CourseDTO;



public interface CourseService {

	String createCourse(Course course);

	
	CourseDTO updateCourse(int id, Course course);
	
	List<CourseDTO> getAllCourse();
	
	void deleteAllCourse();
	
}
