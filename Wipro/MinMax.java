package Wipro;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int max;
		int min=max=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]<min)
				min=arr[i];
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("Minimum:"+min+" Maximum:"+max);
	}

}
