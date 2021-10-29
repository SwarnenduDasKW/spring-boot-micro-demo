package com.nov.dailycodeone.entity;

import java.util.Date;

import javax.persistence.Id;


import lombok.Data;

@Data
public class Student {

	@Id
	private Integer studentId;
	
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String departmentCode;
}
