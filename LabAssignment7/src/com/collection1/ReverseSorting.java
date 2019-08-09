package com.collection1;
import java.util.Scanner;
import java.util.*;

public class ReverseSorting
{

	public static void Sorted(int a[])
	{
		int reversed = 0;
		int []b = new int[a.length];
		
		System.out.println("After reversing:");
		for(int i=0;i<a.length;i++)
		{	
			while(a[i] != 0)
			{
	            int digit = a[i] % 10;
	            reversed = reversed * 10 + digit;
	            a[i] /= 10;
	        }
			
			b[i]=reversed;
			System.out.println(reversed);
			reversed =0;
		}
		
		Arrays.sort(b);
		System.out.println("After sorting:");
		for(int i:b)
			System.out.println(i);		
		
	}
	
	
	public static void main(String ags[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter length of array : ");
		int len=sc.nextInt();
		
		int a[] = new int[len];
		System.out.println("Enter all the elements : ");
		
        for(int i = 0; i < len; i++)
        {
            a[i] = sc.nextInt();
        }
        
        Sorted(a);
 
	}
}
