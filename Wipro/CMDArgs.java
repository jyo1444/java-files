package Wipro;
import java.util.*;
public class CMDArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length < 2) {
            return;
        }
        
        String str1 = args[0];
        String str2 = args[1];
        System.out.println(str1 + " Technologies " + str2);
	}

}
