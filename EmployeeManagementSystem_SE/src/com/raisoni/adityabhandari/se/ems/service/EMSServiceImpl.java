package com.raisoni.adityabhandari.se.ems.service;

import java.util.HashSet;

import com.raisoni.adityabhandari.se.ems.model.Employee;
import com.raisoni.adityabhandari.se.ems.repositoryy.EMSRepository;
import com.raisoni.adityabhandari.se.ems.repositoryy.EMSRepositoryImpl;

public class EMSServiceImpl implements EMSService {
	
	private EMSRepository emsRepository;
	
	public EMSServiceImpl() {
		
		emsRepository = new EMSRepositoryImpl();
	}
	
	
	
    @Override
	public Employee addEmployee(Employee employee)
	{
		return emsRepository.addEmployee(employee);
	}
    
    @Override
    public HashSet<Employee> getAllEmployees()
    {
    	return emsRepository.getAllEmployees();
    }

}
