package Wipro;
import java.util.*;
public class SumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		while(n>0)
		{
			int r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println(sum);
	}

}
