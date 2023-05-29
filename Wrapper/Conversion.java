package Wrapper;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==0) {
			System.out.println("Enter a integer number");
		}
		System.out.print("Given number:");
		int i=Integer.parseInt(args[0]);
		System.out.println("Binary equivalent:"+Integer.toBinaryString(i));
		System.out.println("Octal equivalent:"+Integer.toOctalString(i));
		System.out.println("Hexadecimal equivalent:"+Integer.toHexString(i));
	}

}
