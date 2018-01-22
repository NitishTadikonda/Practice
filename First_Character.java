package org.jsp.app.Practice;

public class First_Character 
{
	public static void main(String[] args) 
	{
		String st ="abc bat cat";
		String s1[]=st.split(" ");
		String s2 = "";
		String s3= "";
		for(int i=0;i<=s1.length-1;i++)
		{
			s2=s1[i];
			for(int j=0;j<1;j++)
			{
				s3=s3+s2.charAt(j);
			}
		}
		System.out.println(s3);
	}

}
