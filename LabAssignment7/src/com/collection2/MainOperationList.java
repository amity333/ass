package com.collection2;
import java.util.*;
public class MainOperationList {

	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter S1: ");
		String str1=sc.next();
		
		System.out.println("Enter S2: ");
		String str2=sc.next();
		
		OperationStringObject obj1 = new OperationStringObject();
		System.out.println(obj1.Operations(str1,str2));
		
	}

}
