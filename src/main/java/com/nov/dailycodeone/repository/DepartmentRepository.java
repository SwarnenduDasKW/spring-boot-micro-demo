package com.nov.dailycodeone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nov.dailycodeone.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	
	public Department findByDepartmentName(String departmentName);
}

