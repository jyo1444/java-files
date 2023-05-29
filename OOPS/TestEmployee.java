package OOPS;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em=new Employee("Jyo",200.99,2023,"82468933");
		System.out.println("Employee Name: " + em.getName());
        System.out.println("Annual Salary: $" + em.getAnn());
        System.out.println("Start Year: " + em.getYr());
        System.out.println("National Insurance Number: " + em.getIns());
	}

}
