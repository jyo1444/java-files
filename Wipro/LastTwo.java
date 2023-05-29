package Wipro;

import java.util.Arrays;
import java.util.Scanner;

public class LastTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		Arrays.sort(arr);
		int s1=arr[0];
		int s2=arr[1];
		int l1=arr[n-1];
		int l2=arr[n-2];
		System.out.println("Smallest are:"+s1+" and "+s2);
		System.out.println("largest are:"+l1+" and "+l2);
	}
}
