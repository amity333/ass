package com.cg.eis.bean;

public class Employee 
{
	
	public int empId;
	public String empName;
	public double empSalary;
	public String empDesignation;
	public String insuranceScheme;
	
	public Employee()
	{
		empName="";
		empDesignation="";
		insuranceScheme="";
		empSalary=0;
	}
	
	public Employee(int id, String name, double salary, String designation) 
	{
	
		this.empId = id;
		this.empName = name;
		this.empSalary = salary;
		this.empDesignation = designation;
	}
	
	
	
	
}
