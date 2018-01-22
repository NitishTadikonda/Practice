package org.jsp.app.Practice;
/*
    *   
  *   *   
*   *   *   

 */
public class Pattern2 
{
	public static void main(String[] args) 
	{
		int star=1;
		int space=2;
		for(int i=1;i<=3;i++)
		{
			for(int k=1;k<=space;k++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("* "+"  ");
			}
			System.out.println();
			star++;
			space--;
			
		}
	}
}
