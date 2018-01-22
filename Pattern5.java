package org.jsp.app.Practice;
/*
1 
1 0 
1 0 1 
1 0 1 0 

 */
public class Pattern5 
{
	public static void main(String[] args) 
	{
		int a =1;
		//int b=0;
		for(int i=1;i<=4;i++)
		{
			a=1;
			for(int j=1;j<=i;j++)
			{
				/*if(j%2==0)
				{
					System.out.print(b+" ");
				}
				else
				{
					System.out.print(a+" ");
				}*/
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
