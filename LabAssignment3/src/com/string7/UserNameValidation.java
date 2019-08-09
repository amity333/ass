package com.string7;
import java.util.Scanner;

public class UserNameValidation 
{
	
	public static boolean validateUserName(String str)
	{
		if(str.length()-4>=8 && str.substring(str.length()-4).equals("_job"))
			return true;
		else
			return false;
		
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter username");
		String a=sc.nextLine();
		
		if(validateUserName(a)==true)
			System.out.println("Username is valid");
		else
			System.out.println("Username is invalid");
		
	}

}
