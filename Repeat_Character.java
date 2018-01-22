package org.jsp.app.Practice;

public class Repeat_Character 
{
	public static void main(String[] args) 
	{
		String st = "immosi";
		char c = 0;
		for(int i=0;i<=st.length()-1;i++)
		{
			for(int j=i+1;j<=st.length()-1;j++)
			{
			 if(st.charAt(i)==st.charAt(j))
			 {
				 if(c!=st.charAt(i))
				 {
				   c = st.charAt(j);
				   System.out.println(c+" is repeated");
			  }
			}
		}
	
	}

}
}
