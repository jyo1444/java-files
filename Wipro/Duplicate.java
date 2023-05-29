package Wipro;

import java.util.*;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int[] r = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            boolean isDup = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDup = true;
                    break;
                }
            }
            if (!isDup) {
                r[k] = arr[i];
                k++;
            }
        }
        r = Arrays.copyOf(r, k);
        System.out.println(Arrays.toString(r));
	}

}
