package com.nov.dailycodeone.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nov.dailycodeone.entity.Department;
import com.nov.dailycodeone.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> findAllDepartments() {
		return departmentRepository.findAll();
	}

	@Override
	public Department fetchDepartmentById(Long departmentId) {
		return departmentRepository.findById(departmentId).get();
	}

	@Override
	public String deleteDepartmentById(Long departmentId) {
		departmentRepository.deleteById(departmentId);
		return "Department deleted successfully";
	}

	@Override
	public Department updateDepartmentById(Long departmentId, Department department) {
		Department deptFromDB = departmentRepository.findById(departmentId).get();
		
		if(Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
			deptFromDB.setDepartmentName(department.getDepartmentName());
		}
		
		if(Objects.nonNull(department.getDepartmentAdress()) && !"".equalsIgnoreCase(department.getDepartmentAdress())) {
			deptFromDB.setDepartmentAdress(department.getDepartmentAdress());
		}
		
		if(Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())) {
			deptFromDB.setDepartmentCode(department.getDepartmentCode());
		}
		
		return departmentRepository.save(deptFromDB);
	}

	@Override
	public Department getDepartmentByName(String departmentName) {
		return departmentRepository.findByDepartmentName(departmentName);
	}
	
	
}
