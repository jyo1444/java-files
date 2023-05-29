package Wipro;

import java.util.Arrays;
import java.util.Scanner;

public class MidArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr = new int[3];
		int[] brr = new int[3];
		for(int i=0;i<3;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<3;i++)
			brr[i]=sc.nextInt();
		int[] r=middleWay(arr,brr);
		System.out.println(Arrays.toString(r));
		sc.close();
	}

	private static int[] middleWay(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		int[] r=new int[2];
		r[0]=arr[1];
		r[1]=brr[1];
		return r;
	}

}
