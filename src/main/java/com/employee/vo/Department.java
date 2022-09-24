package com.employee.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department 
{
	private int id;
	private String name;
	private int noOfEmployes;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfEmployes() {
		return noOfEmployes;
	}
	public void setNoOfEmployes(int noOfEmployes) {
		this.noOfEmployes = noOfEmployes;
	}
	
	
}
