package com.marlonviado.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(
			name = "firstname", 
			nullable = false
			)
	private String firstName;
	
	@Column(
			name = "lastname", 
			nullable = false
			)
	private String lastName;
	
	private String email;
	private String address;
	private String mobile;
	
	@Embedded
	private Guardian guardian;

}
