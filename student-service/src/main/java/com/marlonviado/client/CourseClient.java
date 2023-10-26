package com.marlonviado.client;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import com.marlonviado.dto.CourseDTO;

@HttpExchange
public interface CourseClient {
	
	@GetExchange("/course/{courseId}")
	public List<CourseDTO> getCourseById(@PathVariable("courseId") int courseId);
	
}
