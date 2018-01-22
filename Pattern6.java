package org.jsp.app.Practice;
/*
1 
0 1 
0 1 0 
1 0 1 0 

 */
public class Pattern6
{
	public static void main(String[] args) 
	{
		int a=1;
		for(int i =0;i<=3;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(a+" ");
				a--;
				if(a==-1)
				{
					a=1;
				}
			}
			System.out.println();
		}
	}
}
