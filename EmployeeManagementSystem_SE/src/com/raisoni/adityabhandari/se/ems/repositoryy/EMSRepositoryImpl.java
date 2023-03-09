package com.raisoni.adityabhandari.se.ems.repositoryy;

import java.util.HashSet;

import com.raisoni.adityabhandari.se.ems.model.Employee;

public class EMSRepositoryImpl implements EMSRepository
{
	private HashSet<Employee> employees = new HashSet<Employee>();
	
	public Employee addEmployee(Employee employee)
	{
		if( employees.contains( employee ))
			return null;
		
		employees.add(employee);
		return employee;
	}
	
	public HashSet<Employee> getAllEmployes()
	{
		return employees;
	}

}
