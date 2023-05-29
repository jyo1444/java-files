package Wipro;
import java.util.*;
public class Numcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==0)
			System.out.println("Zero");
		if(n>0)
			System.out.println("Positive");
		if(n<0)
			System.out.println("Negative");
	}

}
