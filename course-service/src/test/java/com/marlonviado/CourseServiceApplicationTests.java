package com.marlonviado;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import com.marlonviado.dto.CourseDTO;
import com.marlonviado.repository.CourseRepository;
import com.marlonviado.service.CourseService;

@SpringBootTest
@RunWith(SpringRunner.class)
class CourseServiceApplicationTests {
	
	@MockBean
	private CourseRepository courseRepository;
	
	@Autowired
	private CourseService courseService;

	@Test
	public void getCourseByIdTest() {
		when(courseRepository.getCourseById(3))
		.thenReturn(
				Stream.of(new CourseDTO(3,"TEST","TEST",1)).collect(Collectors.toList())
				);
		assertEquals(1, courseService.getCourseById(3).size());
	}

}
