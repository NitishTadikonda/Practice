package org.jsp.app.Practice;

import java.util.Scanner;

public class Sample 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the character in the small letters");
		char c = sc.next().charAt(0);
		String st = "sample";
		//char ch[] = st.toCharArray();
		int index = st.indexOf(c);
		String s2="";
		if(index != -1)
		{
			for(int i=index;i<=st.length()-1;i++)
			{
				s2 = s2+st.charAt(i);
			}
			for(int j=0;j<index;j++)
			{
				s2 = s2+st.charAt(j);
			}
			System.out.println(s2);
		}
		else
		{
			System.out.println("Character not found");
		}
	}
}
