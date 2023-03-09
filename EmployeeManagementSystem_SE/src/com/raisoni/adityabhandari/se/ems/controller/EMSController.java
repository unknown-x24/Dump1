package com.raisoni.adityabhandari.se.ems.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import com.raisoni.adityabhandari.se.ems.model.Employee;
import com.raisoni.adityabhandari.se.ems.service.EMSService;
import com.raisoni.adityabhandari.se.ems.service.EMSServiceImpl;

public class EMSController {
	
	private EMSService emsSrevice;
	
	public EMSController() {
		
		emsService= new EMSServiceImpl();
	}
	
	public void appStart()
	{
		while(true)
		{
			int selectedOption = displayMenu();
			
			switch(selectedOption) 
			{
			
			case 1: addEmployee(); break;
			case 5: viewAllEmployees(); break;
			case 9: System.exit(0); break;
			
			default:
			{
				System.out.println("Error Message: Invalid choice");
				System.exit(0);
			}
			
			
			}
		}
		
		
		
	}
	
	public void viewAllEmployees()
	{
		HashSet<Employee> employees = emsService.getAllEmployees();
		
		if (employees.isEmpty() )
		{
			System.out.println("Error: No Employees in DB");
		}
		else
		{
			Iterator<Employee> it = employees.iterator();
			
			while(it.hasNext())
				System.out.println( it.next());
		}
	}
	
	public void addEmployee()
	{
		Scanner scanner = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.println("\n\n\n********Add Employee Details********");
		System.out.println("\nEnter Employee ID");
		int id = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Enter Name");
		String name = scanner.nextLine();
		
		System.out.println("Enter Department");
		String department = scanner.nextLine();
		
		System.out.println("Enter Salary");
		double salary = scanner.nextDouble();
		
		employee.setId(id);
		employee.setName(name);
		employee.setDepartment(department);
		employee.setSalary(salary);
		
		Employee acknowledgement = emsService.addEmployee( employee );
		
		if(acknowledgement != null)
			System.out.println("Employee added successfully" + acknowledgement);
		else
			System.out.println("Error: could not add Employee");
		
	}
	
	
	public int displayMenu() {
		
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		
		System.out.println("\n\n\n *************Menu***********");
		
		System.out.println("\n1) Add Employee Details");
		System.out.println("2) Get Employee Details");
		System.out.println("3) Update Employee Details");
		System.out.println("4) Remove Employee Details");
		System.out.println("5) View All Employee Details");
		System.out.println("9) Exit Application");
		
		System.out.println("\nEnter your choice");
		choice = scanner.nextInt();
		
		return choice;
	}

}
