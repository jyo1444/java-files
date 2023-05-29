package Wipro;
import java.util.*;
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean isprime = true;
		if(n<=1)
			isprime=false;
		else
		{
			 for (int i = 2; i <= Math.sqrt(n); i++) {
	                if (n % i == 0) {
	                    isprime = false;
	                    break;
	                }
	         }
		}
		if(isprime)
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");
	}

}
