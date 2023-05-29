package Wipro;

import java.util.Arrays;
import java.util.Scanner;

public class NoTens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println(Arrays.toString(Notens(arr)));
	}

	private static int[] Notens(int[] arr) {
		// TODO Auto-generated method stub
		int[] r=new int[arr.length];
		int a=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=10)
			{
				r[a]=arr[i];
				a++;
			}
		}
		return r;
	}

}
