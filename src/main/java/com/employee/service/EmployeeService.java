package com.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;
import com.employee.vo.Department;
import com.employee.vo.ResponseTemplateVO;

@Service
public class EmployeeService implements EmployeeServiceInterface
{
	@Autowired
	private EmployeeRepository repository;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Employee saveEmployee(Employee empl) {
		return repository.save(empl);
	}

	public ResponseTemplateVO getEmployeeWithDepartment(Integer userId) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		
		Employee empl = repository.findByUserId(userId);
		
		Department dept = restTemplate.getForObject("http://localhost:9005/departments/" + empl.getUserId(), Department.class);
		
		vo.setEmplyoyee(empl);
		vo.setDepartment(dept);
		
		return vo;
	}
	
}
