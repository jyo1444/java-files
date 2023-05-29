package Wrapper;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee a=new employee(201,"Jyo","CSE");
		employee b=a.clone();
		a.setId(203);
		System.out.println("Emp Id:"+a.getId());
		System.out.println("Emp Name:"+a.getName());
		System.out.println("Emp Dept:"+a.getDept());
		//a.setId(202);
		System.out.println("Emp Id:"+b.getId());
		System.out.println("Emp Name:"+b.getName());
		System.out.println("Emp Dept:"+b.getDept());
	}

}
