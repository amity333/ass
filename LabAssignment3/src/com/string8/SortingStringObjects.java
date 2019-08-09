package com.string8;
import java.util.Scanner;

public class SortingStringObjects
{	
	public static void sorting(String str[])
	{
		for(int i=0;i<str.length-1;i++)
		{
	        for(int j=i+1;j<str.length;j++)
	        {
	            if(str[i].compareTo(str[j]) >=0)
	            {
	                String temp = str[i];
	                str[i] = str[j];
	                str[j] = temp;
	            }
	        }

	    }
		if(str.length%2==1)
		{
		 for(int j=0;j<str.length/2+1;j++){
			 System.out.println(str[j].toUpperCase());
		    }
		 for(int j=str.length/2+1;j<str.length;j++){
			 System.out.println(str[j].toLowerCase());
		    }
		}
		else
		{
			for(int j=0;j<str.length/2;j++){
				 System.out.println(str[j].toUpperCase());
			    }
			 for(int j=str.length/2;j<str.length;j++){
				 System.out.println(str[j].toLowerCase());
			    }
		}
			
	}
	
	
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		 System.out.println("enter the length of String array : ");
		    int len=sc.nextInt();
		    String[] arr=new String[len];

		    for(int i=0;i<len;i++)
		    {
		        System.out.println("enter"+" String :"+(i+1));
		        arr[i]=sc.nextLine();
		    }
		    
		    sorting(arr);
		        
	}

}
