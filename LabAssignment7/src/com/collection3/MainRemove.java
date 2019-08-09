package com.collection3;
import java.util.*;

public class MainRemove {

	public static void main(String[] args)
	{
		
	  removeElements obj=new removeElements();
		
      List<String> list1 = new ArrayList<String>();
      List<String> list2 = new ArrayList<String>();
		
      Scanner sc=new Scanner(System.in);
      
      String str1="";
      String str2="";
      
      System.out.println("Enter size of list 1 : ");
      int size=sc.nextInt();
		System.out.println("Enter elements of list 1 : ");
		
		for(int i=0;i<size;i++)
		{
		 str1=sc.next();
		 list1.add(str1);
		}
		
		System.out.println("Enter size of list 2");
	      int b=sc.nextInt();
			System.out.println("Enter elements of list 2: ");
			
			for(int i=0;i<b;i++)
			{
		     str2=sc.next();
		     list2.add(str2);
			}
			System.out.println("list 1 after removal of duplicate"
					+ " elements"+obj.removeTheElements(list1,list2));
			
			
	}

}
