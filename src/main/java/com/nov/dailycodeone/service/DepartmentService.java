package com.nov.dailycodeone.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nov.dailycodeone.entity.Department;


public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> findAllDepartments();

	public Department fetchDepartmentById(Long departmentId);

	public String deleteDepartmentById(Long departmentId);

	public Department updateDepartmentById(Long departmentId, Department department);

	public Department getDepartmentByName(String departmentName);

}
