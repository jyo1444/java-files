package Wipro;

public class PrimeBwn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=10;i<=99;i++) {
			if(isprime(i))
				System.out.print(i+" ");		
		}
	}

	private static boolean isprime(int i) {
		// TODO Auto-generated method stub
		if(i<=1)			
			return false;
		for(int j=2;j<=Math.sqrt(i);j++)
		{
			if(i%2==0)
				return false;
		}
		return true;
	}

}
