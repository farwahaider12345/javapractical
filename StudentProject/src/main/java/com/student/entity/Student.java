package com.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity 
@Table(name="student_detail")
public class Student {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;//primary key 
	
	@Column(name = "student_name",nullable=false)
	private String studentName;	
	
	@Column(name = "phone_no",nullable=false)
	private int phone;
	
	@Column(name = "email",nullable=false)
	private String email;
		
}
