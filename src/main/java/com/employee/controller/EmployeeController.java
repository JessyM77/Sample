package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;
import com.employee.vo.ResponseTemplateVO;

@RestController
@RequestMapping("/employees")
public class EmployeeController 
{
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/")
	public Employee saveEmployee(@RequestBody Employee empl)
	{
		return service.saveEmployee(empl);
	}
	
	@GetMapping("/{id}")
	public ResponseTemplateVO getEmployeeWithDepartment(@PathVariable("id") Integer userId)
	{
		return service.getEmployeeWithDepartment(userId);
	}
}
