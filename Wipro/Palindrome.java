package Wipro;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0;
		int temp=n;
		while(n>0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(temp==rev)
			System.out.println(temp+" is a palindrome");
		else
			System.out.println(temp+" is not a palindrome");
	}

}
