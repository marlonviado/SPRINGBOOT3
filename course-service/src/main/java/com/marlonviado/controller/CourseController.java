package com.marlonviado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marlonviado.dto.CourseDTO;
import com.marlonviado.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/{courseId}")
	public List<CourseDTO> getCourseById(@PathVariable("courseId") int courseId) {
		return this.courseService.getCourseById(courseId);
	}

}
