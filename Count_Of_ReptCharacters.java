package org.jsp.app.Practice;

public class Count_Of_ReptCharacters 
{
	public static void main(String[] args) 
	{
		String st = "javaaaa";
		char c = 0;
		int count;
		for(int i=0;i<=st.length()-1;i++)
		{
			count=1;
			for(int j=i+1;j<=st.length()-1;j++)
			{
			 if(st.charAt(i)==st.charAt(j))
			 {
				 if(c!=st.charAt(i))
				 {
				   c = st.charAt(j);
				   count++;
			  }
				 System.out.println(c+" is repeated for "+count+" Times");
			}
			
	}
		}
	}
}
	
