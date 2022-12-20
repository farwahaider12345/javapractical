package com.student.testserviceimpl;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.student.entity.Student;
import com.student.repository.StudentRepository;
import com.student.service.StudentService;
import com.student.util.StudentConverter;

@SpringBootTest
class StudentServiceTest {

	@Autowired
	private StudentService studentService;

	@Autowired
	private StudentConverter studentconverter;

	@MockBean
	private StudentRepository studentRepository;

	@Test
	void testSaveAccountDetail() {
		Student student = Student.builder().firstName("Farwa").lastName("Haider").build();

		Mockito.when(studentRepository.save(student)).thenReturn(student);
		assertThat(studentService.createStudent(student)).isEqualTo("Student details saved successfully");

	}
}
