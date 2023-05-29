package Wrapper;

public class employee implements Cloneable {
	private int id;
	private String name;
	private String dept;
	public employee(int id, String name, String dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public employee clone() {
		try {
			return (employee) super.clone();
		}
		catch(CloneNotSupportedException e) {
			//System.out.println(e);
			return null;
		}
	}
}
