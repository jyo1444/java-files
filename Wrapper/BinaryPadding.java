package Wrapper;

import java.util.Scanner;

public class BinaryPadding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>=1 && n<=255) {
			String s=String.format("%8s",Integer.toBinaryString(n)).replace(' ', '0');
			System.out.println("Binary:"+s);
		}
	}

}
