package OOPS;

import java.util.Scanner;

public class Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        String r = concat(str1, str2);
        System.out.println(r);
    }

    public static String concat(String str1, String str2) {
        String concat = str1 + str2;
        String low = concat.toLowerCase();
        String r = repeat(low);
        return r;
    }

    public static String repeat(String str) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1 || str.charAt(i) != str.charAt(i + 1)) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
	}

}
