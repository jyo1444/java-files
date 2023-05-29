package Wipro;
import java.util.*;
public class MonthName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(args[0]);
		String month="";
		if(args.length==0)
			System.out.println("Please enter the month in numbers");
		switch(n)
		{
		case 1:
			month="January";
			break;
		case 2:
			month="Febuary";
			break;
		case 3:
			month="March";
			break;
		case 4:
			month="April";
			break;
		case 5:
			month="May";
			break;
		case 6:
			month="June";
			break;
		case 7:
			month="July";
			break;
		case 8:
			month="August";
			break;
		case 9:
			month="September";
			break;
		case 10:
			month="October";
			break;
		case 11:
			month="November";
			break;
		case 12:
			month="December";
			break;
		default:
			System.out.println("Invalid Month");
		}
		System.out.println(month);
		sc.close();
	}

}
