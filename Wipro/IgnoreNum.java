package Wipro;

import java.util.Scanner;

public class IgnoreNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		boolean ignorenum = false;
		for(int i=0;i<n;i++)
		{
			if(!ignorenum)
				sum=sum+arr[i];
			else if(arr[i]==6)
				ignorenum=true;
			else if(arr[i]==7)
				ignorenum=false;
			
		}
		System.out.println(sum);
	}

}
