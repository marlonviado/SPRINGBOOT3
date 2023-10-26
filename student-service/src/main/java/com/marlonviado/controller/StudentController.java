package com.marlonviado.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.marlonviado.client.CourseClient;
import com.marlonviado.dto.StudentDTO;
import com.marlonviado.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@Autowired
	private CourseClient courseClient;

	@GetMapping("/all")
	public List<StudentDTO> getAllStudent() {
		List<StudentDTO> students = studentService.getallStudentDTOs();

		students.forEach(student -> student.setCourseDTO(courseClient.getCourseById(student.getId())));
		return students;
	}

}
