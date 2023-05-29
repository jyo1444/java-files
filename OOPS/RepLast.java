package OOPS;

import java.util.Scanner;

public class RepLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=sc.nextInt();
		StringBuffer sb=new StringBuffer();
		String s1=s.substring(s.length()-n);
		for(int i=0;i<n;i++)
			sb.append(s1);
		System.out.println(sb.toString());
	}
}
