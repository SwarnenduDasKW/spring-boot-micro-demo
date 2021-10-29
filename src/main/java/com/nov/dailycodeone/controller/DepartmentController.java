package com.nov.dailycodeone.controller;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.query.criteria.LiteralHandlingMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nov.dailycodeone.service.DepartmentService;

import io.swagger.annotations.ApiOperation;
import io.swagger.models.Response;

import com.nov.dailycodeone.entity.Department;

@RestController
@RequestMapping("/api")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	
	private final Logger LOGGER =  LoggerFactory.getLogger(DepartmentController.class);
	
	@PostMapping("/department")
	@ApiOperation(value = "saveDepartment - Save Department data", 
					notes="Provide a department payload to save in the department table.",
					response = Department.class)
	public Department saveDepartment(@Valid @RequestBody Department department) {
		LOGGER.info("Inside saveDepartment");
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/departments")
	public List<Department> getDepartments()
	{
		LOGGER.info("Inside getDepartments");
		return departmentService.findAllDepartments();
	}
	
	@GetMapping("/department/{id}")
	public Department fetchDepartmentById(@PathVariable("id") Long departmentId ) {
		return departmentService.fetchDepartmentById(departmentId);
	}
	
	@DeleteMapping("/department/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long departmentId ) {
		return departmentService.deleteDepartmentById(departmentId);
	}
	
	@PutMapping("/department/{id}")
	public Department updateDepartmentById(@PathVariable("id") Long departmentId,
											@RequestBody Department department) {
		return departmentService.updateDepartmentById(departmentId,department);
	}
	
	@GetMapping("/department/name/{name}")
	public Department getDepartmentByName(@PathVariable("name") String departmentName) {
		return departmentService.getDepartmentByName(departmentName);
	}
}
