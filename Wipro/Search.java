package Wipro;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int key=sc.nextInt();
		int flag=0,a=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==key) {
				flag=1;
				a=i;
			}
		}
		if(flag==1)
			System.out.println("Index:"+a);
		else
			System.out.println("-1");
	}

}
