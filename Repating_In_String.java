package org.jsp.app.Practice;

import java.util.Scanner;

public class Repating_In_String 
{
	public static void main(String[] args) 
	{
		//String st = "java";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.next();
		int count=0;
		for(int i=0;i<=st.length()-1;i++)
		{
			for(int j=i+1;j<=st.length()-1;j++)
			{
			  if(st.charAt(i)==st.charAt(j))
			  {
				 count++;
			  }
			}
		}
		if(count>=1)
		{
			System.out.println("TRUE"+" Characters are repeated");
		}
		else
		{
			System.out.println("FALSE"+" No characters are repeated");
		}
	}

}
