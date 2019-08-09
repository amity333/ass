package com.collection5;
import java.util.*;

public class ProductSortingArrayList
{

	public static void main(String args[])
	{
		
	  ArrayList<String> product = new ArrayList<String>();
	
	  Scanner sc=new Scanner(System.in);
	
	  System.out.println("Enter size of list");
      int n=sc.nextInt();
      String S1;
      
		System.out.println("Enter elements of array: ");
		
		for(int i=0;i<n;i++) 
		{
			S1=sc.next();
	        product.add(S1);
		}
		
		System.out.println("Before sorting: ");
		  for(String var: product)
		  {
				System.out.println(var);
		  }
		
		Collections.sort(product);
		
		System.out.println("After sorting: ");
		 for(String var: product)
		 {
				System.out.println(var);
		 }
		
	}
	
}
