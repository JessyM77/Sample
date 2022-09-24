package com.employee.vo;

import com.employee.entity.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO 
{
	private Employee empl;
	private Department dept;
	public void setEmplyoyee(Employee empl) {
		// TODO Auto-generated method stub
		
	}
	
	public void setDepartment(Department department)
	{
		
	}
}
