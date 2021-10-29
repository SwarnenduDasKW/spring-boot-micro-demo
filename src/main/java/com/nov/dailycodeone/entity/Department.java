package com.nov.dailycodeone.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long departmentIdLong;
	
	@NotBlank(message = "Please add department name")
	private String departmentName;
	private String departmentAdress;
	private String departmentCode;
	
	
	public Long getDepartmentIdLong() {
		return departmentIdLong;
	}
	public void setDepartmentIdLong(Long departmentIdLong) {
		this.departmentIdLong = departmentIdLong;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentAdress() {
		return departmentAdress;
	}
	public void setDepartmentAdress(String departmentAdress) {
		this.departmentAdress = departmentAdress;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	public Department(Long departmentIdLong, String departmentName, String departmentAdress, String departmentCode) {
		super();
		this.departmentIdLong = departmentIdLong;
		this.departmentName = departmentName;
		this.departmentAdress = departmentAdress;
		this.departmentCode = departmentCode;
	}
	
	public Department() {
		super();
	}
	
	@Override
	public String toString() {
		return "Department [departmentIdLong=" + departmentIdLong + ", departmentName=" + departmentName
				+ ", departmentAdress=" + departmentAdress + ", departmentCode=" + departmentCode + "]";
	}
	
	
}
