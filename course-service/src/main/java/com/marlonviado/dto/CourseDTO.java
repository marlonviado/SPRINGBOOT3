package com.marlonviado.dto;

import com.marlonviado.entity.Course;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO {
	
	private int courseId;
	private String name;
	private String description;
	private int studentId;
	
	public CourseDTO(Course course) {
		this.courseId=course.getId();
		this.name=course.getName();
		this.description=course.getDescription();
		this.studentId=course.getStudentId();
	}

}
