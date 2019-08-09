package com.string4;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class UserDatePeriod
{
	
	public static void Duration(int d1,int m1 ,int y1,int d2,int m2 ,int y2)
	{
		LocalDate ldate = LocalDate.of(y1,m1,d1);
		LocalDate adate = LocalDate.of(y2,m2,d2);
		 
        Period diff = Period.between(ldate, adate);
        
        System.out.println("days = " + diff.getDays());
		System.out.println("months = " + diff.getMonths());
		System.out.println("years = " + diff.getYears());
	}

	public static void main(String[] args)
	{
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter day1");
		int dd1=s.nextInt();
		
		System.out.println("enter month1");
		int mm1=s.nextInt();
		
		System.out.println("enter year1");
		int yy1=s.nextInt();
		
		System.out.println("enter day2");
		int dd2=s.nextInt();
		
		System.out.println("enter month2");
		int mm2=s.nextInt();
		
		System.out.println("enter year2");
		int yy2=s.nextInt();
		
		Duration(dd1,mm1,yy1,dd2,mm2,yy2);
		s.close();

	}

}
