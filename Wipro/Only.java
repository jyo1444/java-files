package Wipro;

import java.util.Scanner;

public class Only {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println(Only14(arr));
	}

	private static boolean Only14(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=1 && arr[i]!=4)
				return false;
		}
		return true;
	}

}
