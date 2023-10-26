package com.marlonviado;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import com.marlonviado.dto.CourseDTO;
import com.marlonviado.dto.StudentDTO;
import com.marlonviado.repository.StudentRepository;
import com.marlonviado.service.StudentService;

@SpringBootTest
class StudentServiceApplicationTests {
	
	@Autowired
	StudentService studentService;
	
	@MockBean
	StudentRepository studentRepository;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void getAllStudentTest() {
		List<CourseDTO> courseList = new ArrayList<>();
		courseList.add(new CourseDTO(1,"BSCS","Computer Science",1));
		when(studentRepository.getAllStudent()).thenReturn(
				Stream.of(new StudentDTO(1,"Marlon","Viado","mfviado@hotmail.com","Carmona","09157062309","Natividad","nviado@hotmail.com","09157062309",courseList)).collect(Collectors.toList())
				);
		assertEquals(1, studentRepository.getAllStudent().size());
	}
	
	@Test
	public void retrieveStudentTest() {
		List<CourseDTO> courseList = 
				new ArrayList<>();
		courseList.add(
				new CourseDTO(1,"BSCS","Computer Science",1)
				);
		StudentDTO studentDTO = 
				new StudentDTO(1,"Marlon","Viado","mfviado@hotmail.com","Carmona","09157062309","Natividad","nviado@hotmail.com","09157062309",courseList);
		
		when(studentRepository.retrieveStudent(studentDTO)).
		thenReturn(1);
		
		assertEquals(1, studentRepository.retrieveStudent(studentDTO));
	}
	

}
