package com.marlonviado.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.marlonviado.dto.StudentDTO;
import com.marlonviado.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public List<StudentDTO> getallStudentDTOs() {
		return studentRepository.getAllStudent();
	}
	
	public int retrieveStudent(StudentDTO studentDTO) {
		return studentRepository.retrieveStudent(studentDTO);
	}
	
}
