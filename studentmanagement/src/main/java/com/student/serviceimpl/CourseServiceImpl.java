package com.student.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Course;
import com.student.model.CourseDTO;
import com.student.repository.CourseRepository;
import com.student.service.CourseService;
import com.student.util.CourseConverter;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CourseConverter courseConverter;

	@Override
	public String createCourse(Course course) {
		String message = null;
		courseRepository.save(course);
		if (course != null) {
			message = "New course saved successfully!!";
		} else {
			message = "Course is not saved!!";
		}
		return message;
	}

	@Override
	public CourseDTO updateCourse(int id, Course course) {
		// TODO Auto-generated method stub

		Course existingCourse = courseRepository.findById(id).get();
		existingCourse.setCourseName(course.getCourseName());
		existingCourse.setFees(course.getFees());
		existingCourse.setDuration(course.getDuration());

		courseRepository.save(existingCourse);
		return courseConverter.convertToCourseDTO(existingCourse);

	}

	@Override
	public List<CourseDTO> getAllCourse() {
		// TODO Auto-generated method stub
		List<Course> courses = courseRepository.findAll();
		List<CourseDTO> cDTO = new ArrayList<>();
		for (Course c : courses) {
			cDTO.add(courseConverter.convertToCourseDTO(c));
		}
		return cDTO;
	}

	@Override
	public String deleteCourseById(int id) {
		// TODO Auto-generated method stub
		String message = null;
		Optional<Course> course = courseRepository.findById(id);
		if (course.isPresent()) {
			courseRepository.deleteById(id);
			message = "Course details deleted successfully";
		} else {
			message = "Course details not found!!";
		}
		return message;

	}

	@Override
	public void deleteAllCourse() {
		// TODO Auto-generated method stub
		courseRepository.deleteAll();

	}

}
