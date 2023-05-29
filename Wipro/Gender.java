package Wipro;

public class Gender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=args[0];
		int n=Integer.parseInt(args[1]);
		if(s.equalsIgnoreCase("Female"))
		{
			if(n>=1 && n<=58)
				System.out.println("Percentage of Interest:8.2%");
			else if(n>=59 && n<=100)
				System.out.println("Percentage of Interest:9.2%");
		}
		else if(s.equalsIgnoreCase("Male"))
		{
			if(n>=1 && n<=58)
				System.out.println("Percentage of Interest:8.4%");
			else if(n>=59 && n<=100)
				System.out.println("Percentage of Interest:10.5%");
		}
		else
			System.out.println("Invalid Gender");
	}

}
