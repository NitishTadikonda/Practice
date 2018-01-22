package org.jsp.app.Practice;

import java.util.Scanner;

public class Complex_Number_operations 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Real number");
		int real = sc.nextInt();
		System.out.println("Enter imaginary number");
		int img = sc.nextInt();
		String complex_no1=real+"+"+img+"j";
		System.out.println("First Complex Number :"+complex_no1);
		System.out.println("Enter Real number");
		int real2 = sc.nextInt();
		System.out.println("Enter  imaginary number");
		int img2 = sc.nextInt();
		String complex_no2=real2+"+"+img2+"j";
		System.out.println("Second Complex Numbers: "+complex_no2);
		System.out.println("Addition of two complex numbers: "+"("+(real+real2)+")+"+"("+(img+img2)+")j");
		System.out.println("Subtraction of two complex numbers: "+"("+(real-real2)+")+"+"("+(img-img2)+")j");
	}
}
