package OOPS;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=s.indexOf('*');
		if(n!=-1)
		{
			int st=n-1;
			int end=n+1;
			if(st>=0) {
				s=s.substring(0,st)+s.substring(end+1);
				System.out.println(s);
			}
			else {
				s=s.substring(end+1);
				System.out.println(s);
			}
		}
	}

}
