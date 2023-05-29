package OOPS;

import java.util.Scanner;

public class Calculator {
	public static int powerInt(int a,int b)
	{
		return (int)Math.pow(a,b);
	}
	public static double powerDouble(double a,int b)
	{
		return Math.pow(a,b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		double c=sc.nextDouble();
		int d=sc.nextInt();
		System.out.println("powerInt:"+powerInt(a,b));
		System.out.println("powerDouble:"+powerDouble(c,d));
		sc.close();
	}

}
