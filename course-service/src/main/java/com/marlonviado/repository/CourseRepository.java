package com.marlonviado.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.marlonviado.dto.CourseDTO;
import com.marlonviado.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
	
	@Query("SELECT new com.marlonviado.dto.CourseDTO(course) "
			+ "FROM com.marlonviado.entity.Course course WHERE course.id = :id")
	public List<CourseDTO> getCourseById(@Param("id") int id);
	
	public List<Course> findByDescription(String description);

}
