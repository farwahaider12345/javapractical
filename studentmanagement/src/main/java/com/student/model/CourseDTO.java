package com.student.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Data
public class CourseDTO {

	private int id;

	@NotNull
	@Size(min = 1)
	private String courseName;

	@NotNull
	@Size(min = 1)
	private int fees;

	@NotNull
	@Size(min = 1)
	private String duration;

}
