package com.collection4;
import java.util.Scanner;

public class MainHashMapSquares 
{

	public static void main(String[] args) 
	{
		
	      HashMapSquares obj=new HashMapSquares();
		
		  Scanner sc=new Scanner(System.in);
		  
		  System.out.println("Enter size of array");
	      int n=sc.nextInt();
	      int a[]=new int[n];
			System.out.println("Enter elements of array: ");
			
			for(int i=0;i<n;i++)
			{
			 a[i]=sc.nextInt();
			}
			
			System.out.println("Map after squaring the array "+"elements"+obj.getSquares(a));
					
	}

}
