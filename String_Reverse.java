package org.jsp.app.Practice;

public class String_Reverse 
{
	public static void main(String[] args) 
	{
		String st="java j2ee";
		String s2="";
		String s3="";
		String[] s1=st.split(" ");
		for(int i =0;i<=s1.length-1;i++)
		{
			s2=s1[i];
			for(int j=s2.length()-1;j>=0;j--)
			{ 
				s3 =s3+s2.charAt(j);
			}
			s3=s3+" ";
		}
		System.out.print(s3);
	}
}
