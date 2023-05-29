package OOPS;

import java.util.Scanner;

public class TwoRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String r=s.substring(0,2);
		StringBuffer sb=new StringBuffer();
		if(s.length()<2)
			System.out.println(s);
		else {
			for(int i=0;i<s.length();i++) {
				sb.append(r);
			}
			System.out.println(sb.toString());
		}
	}

}
