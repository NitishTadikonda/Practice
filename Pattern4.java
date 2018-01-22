package org.jsp.app.Practice;
/*
Z1 
Y2 X3 
W4 V5 U6 
T7 S8 R9 Q10 

 */
public class Pattern4 
{
	public static void main(String[] args)
	{
		char c='Z';
		int k=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+""+k+" ");
				c--;
				k++;
			}
			System.out.println();
		}
	}

}
