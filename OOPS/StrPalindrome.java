package OOPS;

import java.util.Scanner;

public class StrPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		//String s = "madam";
        String s1 = s.replaceAll("\\s", "").toLowerCase();//Removing spaces
        StringBuffer rev = new StringBuffer(s1);//creating a stringbuffer object
        rev.reverse();
        boolean isPalindrome = s1.equals(rev.toString());
        if (isPalindrome) {
            System.out.println(s + " is a palindrome.");
        } else {
            System.out.println(s + " is not a palindrome.");
        }
	}

}
