package com.string2;
import java.util.Scanner;

public class PositiveString 
{
	public static boolean positive(String str)
	{
		boolean b=true;
		String s=str.toLowerCase();
		
		for (int i = 0; i< s.length(); i++)
		{
			int count=1;
               for (int j = i+1; j < s.length(); j++)
               {
		           if (s.charAt(i) >= s.charAt(j))
		           {
		        	 count++;	
		           }
		       }
               if(count==1)
            	   b=true;
               else 
            	   b= false;
		}
		
		return b;		
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name=sc.next();
		
		if(positive(name)==true)
		    System.out.println("string is positive");
		else
			System.out.println("string is negative");
			
	}

}
