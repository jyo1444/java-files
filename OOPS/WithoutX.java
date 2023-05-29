package OOPS;

import java.util.Scanner;

public class WithoutX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(s.charAt(0)=='x' || s.charAt(s.length()-1)=='x')
		{
			s=s.substring(1,s.length()-1);
			System.out.println(s);
		}
		else
			System.out.println(s);
	}

}
