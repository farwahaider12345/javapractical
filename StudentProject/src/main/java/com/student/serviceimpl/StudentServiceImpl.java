package com.student.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.student.entity.Student;
import com.student.repositry.StudentRepostoriy;
import com.student.service.StudentService;
import com.student.util.Converter;



public class StudentServiceImpl implements StudentService  {

	@Autowired
	private StudentRepostoriy studentRepository;
	
	
	@Autowired
	private Converter converted;
	
	@Override 
	public String createStudent(Student student)
	{
		// TODO Auto-generated method stub
		String message = null;
		studentRepository.save(student);
		if(student!=null)
		{
			message ="Student details saved successfully";
		}
		return message;
	}

	
}
