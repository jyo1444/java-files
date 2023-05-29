package Wipro;

public class RevArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 4) {
            System.out.println("Please enter 4 integer numbers");
            return;
        }
		int[][] arr = new int[2][2];
        int n = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = Integer.parseInt(args[n]);
                n++;
            }
        }
        System.out.println("The given array is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
       
        int temp=0;
        temp=arr[0][0];
        arr[0][0]=arr[1][1];
        arr[1][1]=temp;
        temp=arr[0][1];
        arr[0][1]=arr[1][0];
        arr[1][0]=temp;
        System.out.println("The reverse array is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
	}

}
