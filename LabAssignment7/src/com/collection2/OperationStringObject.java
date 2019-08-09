package com.collection2;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class OperationStringObject 
{	
	public ArrayList<String> Operations(String str1,String str2)
	{
		
		ArrayList<String> list = new ArrayList<String>();
		String str3=str1;
		String str4="";
		int k=0;

		for(k=1;k<str3.length();k+=2)
		{
			str3.replace(str3.substring(k,k+1),str2);
		}
		list.add(str3);
		
		int j = 0;
		Pattern p = Pattern.compile(str2);
		Matcher m = p.matcher(str1);
		while (m.find()) 
		{
		    j++;
		}
		
		if(j>1)
		{			
			int start = str1.lastIndexOf(str2);
			StringBuilder builder = new StringBuilder();
			builder.append(str1.substring(0, start));
			for(int i=str2.length()-1;i>=0;i--)
			{
				str4=str4+str2.charAt(i);
			}
			builder.append(str4);
			builder.append(str1.substring(start + str4.length()));
			String str5=builder.toString();  
			list.add(str5);
		}
		else
			list.add(str1.concat(str2));
		
		//THIRD OPERATION
		int j1 = 0;
		Pattern p1 = Pattern.compile(str2);
		Matcher m1 = p1.matcher(str1);
		while (m1.find()) {
		    j1++;
		}
		
		if(j1>1) 
		{
			 String str6=str1.replace(str2,str1);
			 list.add(str6);
		}
		else
			list.add(str1);                                                                      
		
		//FOURTH OPERATION
		String str7="";
		String str8="";
		String str9="";
		String str10="";
		str7=str2.substring(0,str2.length()/2);
		str8=str2.substring(str2.length()/2);
		str9=str7.concat(str1);
		str10=str9.concat(str8);
		list.add(str10);
		
		//FIFTH OPERATION
		String str11="";
		for(int i=0;i<str1.length()-2;i++) 
		{
			if(str1.substring(i, i+str2.length()).equals(str2))
			{
				str11=str1.replace(str1.substring(i, i+str2.length()),"*");
			}
		}
		list.add(str11);
		
		return list;
	}
}
