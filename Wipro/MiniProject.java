package Wipro;
import java.util.*;
public class MiniProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] employeeDetails = {
                {"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"},
                {"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},
                {"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"},
                {"1004", "Chahat", "29/01/2013", "r", "Front Desk", "12000", "6000", "2000"},
                {"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"},
                {"1006", "Suman", "01/01/2000", "e", "Manufacturing", "23000", "9000", "4400"},
                {"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"}
        };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the employee ID: ");
        String empId = scanner.nextLine();

        // Find the employee in the array based on the employee ID
        int index = -1;
        for (int i = 0; i < employeeDetails.length; i++) {
            if (employeeDetails[i][0].equals(empId)) {
                index = i;
                break;
            }
        }

        // Check if employee exists
        if (index != -1) {
            System.out.println("Emp No: " + employeeDetails[index][0]);
            System.out.println("Emp Name: " + employeeDetails[index][1]);
            System.out.println("Department: " + employeeDetails[index][4]);
            System.out.println("Designation: " + getDesignation(employeeDetails[index][3]));
            System.out.println("Salary: " + calculateSalary(employeeDetails[index]));
        } else {
            System.out.println("There is no employee with empid: " + empId);
        }
        scanner.close();
    }

    public static String getDesignation(String designationCode) {
        switch (designationCode) {
            case "e":
                return "Engineer";
            case "c":
                return "Consultant";
            case "r":
                return "Receptionist";
            case "m":
                return "Manager";
            case "k":
                return "Clerk";
            default:
                return "Unknown Designation";
        }
    }

    public static int calculateSalary(String[] employee) {
        int basic = Integer.parseInt(employee[5]);
        int hra = Integer.parseInt(employee[6]);
        int da = getDA(employee[3]);
        int it = Integer.parseInt(employee[7]);
        return basic + hra + da - it;
    }

    public static int getDA(String designationCode) {
        switch (designationCode) {
            case "e":
                return 20000;
            case "c":
                return 32000;
            case "r":
                return 12000;
            case "m":
                return 40000;
            case "k":
                return 12000;
            default:
                return 0;
        }
	}
}