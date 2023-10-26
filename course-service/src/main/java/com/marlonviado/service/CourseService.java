package com.marlonviado.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.marlonviado.dto.CourseDTO;
import com.marlonviado.repository.CourseRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<CourseDTO> getCourseById(int id) {
		return this.courseRepository.getCourseById(id);
	}

}
