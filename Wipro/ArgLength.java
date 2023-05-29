package Wipro;

public class ArgLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==0)
			System.out.println("No Values");
		else
			System.out.println(String.join(",",args));
	}

}
