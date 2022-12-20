package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

//	@Query("from Student where com.student.entity.Course(courseName) like :s%")
//	List<Student> getStudentByName(@Param("s") String courseName);

}
