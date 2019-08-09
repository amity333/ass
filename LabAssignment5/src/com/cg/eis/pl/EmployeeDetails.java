package com.cg.eis.pl;
import com.cg.eis.service.*;
import com.cg.eis.exception.*;
import java.util.*;

public class EmployeeDetails {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your id");
		int id=sc.nextInt();
		
		System.out.println("Enter your name");
		String name=sc.next();
		
		System.out.println("Enter your salary");
		double salary=sc.nextDouble();
		
		System.out.println("Enter your designation");
		String designation=sc.next();
		
		
		Service se=new Service(id,name,salary,designation);
		try
		{
	     	se.salaryCheck(salary);
		}
		catch(EmployeeException ee)
		{
			System.out.println(ee.getMessage());	
		}
		
		se.insuranceDetails(salary, designation);
		
		
	}
}
