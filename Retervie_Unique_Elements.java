package org.jsp.app.Practice;

public class Retervie_Unique_Elements 
{
	public static void main(String[] args) 
	{
		String st = "javaj2ee";
		int count=0;
		for(int i=0;i<=st.length()-1;i++)
		{
			count=0;
			for(int j=0;j<=st.length()-1;j++)
			{
				if(st.charAt(i)==st.charAt(j))
				{
					count++;
				}
			}
			if(count<=1)
			{
				char c=st.charAt(i);
				System.out.println(c+" are unique elements");
			}
		} 
		
	}

}
