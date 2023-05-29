package OOPS;

import java.util.Scanner;

public class Box {
	double w;
	double h;
	double d;
	public Box(double w,double h,double d)
	{
		this.w=w;
		this.h=h;
		this.d=d;
	}
	public double Vol()
	{
		return w*h*d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double w=sc.nextDouble();
		double h=sc.nextDouble();
		double d=sc.nextDouble();
		Box b=new Box(w,h,d);
		System.out.println("Volume:"+b.Vol());
		sc.close();
	}

}
