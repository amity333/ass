package com.cg.eis.service;
import com.cg.eis.bean.*;
import com.cg.eis.exception.*;

public class Service extends Employee implements EmployeeService
{
		
	public Service(int empId, String empName, double empSalary, String empDesignation)
	{
		super();
	}
	
	public void salaryCheck(double salary) throws EmployeeException 
	{		
		if(salary < 3000) 
		{
			throw new EmployeeException("Salary less than 3000");
		}
		else  
		{
			showData();
		}
	}
	
	@Override
	public void showData()
	{
	System.out.println("The details of employee are");	
	System.out.println("id : "+empId);
	System.out.println("name : "+empName);
	System.out.println("salary : "+empSalary);
	System.out.println("designation : "+empDesignation);
		
	}
	
	public void insuranceDetails(double salary,String designation)
	{
		
		if(salary>5000 && salary<20000 && designation.equals("SystemAssociate"))
	       System.out.println("insurance scheme chosen by"+empName+"is scheme C");
		
		else if(salary>=20000 && salary<=40000 && designation.equals("Programmer"))
           System.out.println("insurance scheme chosen by"+empName+"is scheme B");
			
		else if(salary>40000 && designation.equals("Manager"))
           System.out.println("insurance scheme chosen by"+empName+"is scheme C");
			
		else if(salary>0 && salary<=5000 & designation.equals("Clerk"))
           System.out.println("insurance scheme chosen by"+empName+"has no scheme");
		
		else
	       System.out.println("enter valid salary and designation");
	}
}
