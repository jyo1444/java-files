package Wipro;
import java.util.*;
public class AlpConv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c=sc.nextLine().charAt(0);
		if(Character.isLowerCase(c))
			System.out.println(Character.toUpperCase(c));
		else if(Character.isUpperCase(c))
			System.out.println(Character.toLowerCase(c));
		sc.close();
	}

}
