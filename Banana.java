package org.jsp.app.Practice;

import java.util.Scanner;

public class Banana 
{
	public static void main(String[] args) 
	{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the string");
		String st=sc.next();
		String s2="";
		int count=0;
		for(int i=st.length()-1;i>=0;i--)
		{
			if(st.charAt(i)=='e'&& count ==0)
			{
				s2 = "X"+st.charAt(i)+s2;
				count++;
			}
			else if(st.charAt(i)=='a')
			{
				s2 = "X"+st.charAt(i)+s2;
			}
			else
			{
				s2 = st.charAt(i)+s2;
			}
		}
		System.out.println(s2);
	}
}
