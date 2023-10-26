package com.marlonviado.dto;

import java.util.ArrayList;
import java.util.List;

import com.marlonviado.entity.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO { 
	
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private String address;
	private String mobile;
	private String guardianName;
	private String guardianEmail;
	private String guardianMobile;
	private List<CourseDTO> courseDTO = new ArrayList<CourseDTO>();
	
	public StudentDTO(Student student) {
		this.id = student.getId();
		this.firstName = student.getFirstName();
		this.lastName = student.getLastName();
		this.email = student.getEmail();
		this.address = student.getAddress();
		this.mobile = student.getMobile();
		this.guardianName = student.getGuardian().getName();
		this.guardianEmail = student.getGuardian().getEmail();
		this.guardianMobile = student.getGuardian().getMobile();
	}

}
