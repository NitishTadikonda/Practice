package org.jsp.app.Practice;

public class Pattern1 
{
	public static void main(String[] args) 
	{
		int space=2;
		int a=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=a;k++)
			{
				System.out.print("* ");
			}
			if(i<3)
			{
				space--;
				a+=2;
			}
			else
			{
				space++;
				a-=2;
			}
			System.out.println();
		}
	}
}
