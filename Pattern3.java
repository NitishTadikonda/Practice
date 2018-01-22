package org.jsp.app.Practice;
/*
      * 
    * * * 
  * * * * * 
* * * * * * * 
  *   *   *   
    *   *   
      *  
 */
public class Pattern3 
{
	public static void main(String[] args)
	{
		int space=3;
		int star=1;
		int star1=3;
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=star;k++)
			{
				if(i>4)
				{
				 System.out.print("* "+"  ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			if(i<4)
			{
				space--;
				star+=2;
			}
			else
			{
				star=star1;
				space++;
				star1--;
			}
			System.out.println();
		}
	}

}
