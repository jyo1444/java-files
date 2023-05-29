package Wipro;
import java.util.*;
public class CharVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c=sc.nextLine().charAt(0);
		if(Character.isDigit(c))
			System.out.println("Digit");
		else if(Character.isLetter(c))
			System.out.println("Alphabet");
		else
			System.out.println("Special Character");
		sc.close();
	}

}
