package OOPS;

import java.util.Scanner;

public class StrLen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=s.length();
		if(s.length()%2==0)
			System.out.println(s.substring(0,n/2));
		else
			System.out.println("null");
	}

}
