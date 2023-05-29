package OOPS;

import java.util.Scanner;

public class Combine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		StringBuffer  sb=new StringBuffer();
		int n=Math.max(s1.length(),s2.length());
		for(int i=0;i<n;i++)
		{
			if(i<s1.length())
				sb.append(s1.charAt(i));
			if(i<s2.length())
				sb.append(s2.charAt(i));
		}
		System.out.println(sb.toString());
	}

}
