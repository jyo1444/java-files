package Wipro;

import java.util.Arrays;
import java.util.Scanner;

public class EvenoddArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println(Arrays.toString(evenodd(arr)));
	}

	private static int[] evenodd(int[] arr) {
		// TODO Auto-generated method stub
		int[] r=new int[arr.length];
		int e=0;
		int o=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0) {
				r[e]=arr[i];
				e++;
			}
			else {
				r[o]=arr[i];
				o--;
			}
		}
		return r;
	}

}
