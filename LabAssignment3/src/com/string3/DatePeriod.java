package com.string3;
import java.time.*;
import java.util.Scanner;

public class DatePeriod
{

	public static void duration(int dd,int mm ,int yy)
	{
		LocalDate ldate = LocalDate.of(yy,mm,dd);
		LocalDate now = LocalDate.now();
		 
        Period diff = Period.between(ldate, now);
        
        System.out.println("days = " + diff.getDays());
		System.out.println("months = " + diff.getMonths());
		System.out.println("years = " + diff.getYears());
	}
	
	
	public static void main(String[] args) 
	{		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the day");
		int dd=sc.nextInt();
		
		System.out.println("enter the month");
		int mm=sc.nextInt();
		
		System.out.println("enter the year");
		int yy=sc.nextInt();
		
		duration(dd,mm,yy);
					
	}

}
