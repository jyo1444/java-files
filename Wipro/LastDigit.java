package Wipro;
import java.util.*;
public class LastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		lastdigit(a,b);
	}

	private static void lastdigit(int a, int b) {
		// TODO Auto-generated method stub
		int r=10;
		if(a%r==b%r)
			System.out.println("True");
		else
			System.out.println("False");
	}

}
