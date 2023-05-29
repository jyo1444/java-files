package OOPS;

import java.util.Scanner;

public class WithoutFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=s.length();
		System.out.println(s.substring(1,n-1));
	}

}
