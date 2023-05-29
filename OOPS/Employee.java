package OOPS;

public class Employee extends Person {
	private double ann;
	private int yr;
	private String ins;
	public Employee(String name,double ann,int yr,String ins) {
		super(name);
		this.ann=ann;
		this.yr=yr;
		this.ins=ins;
	}
	public double getAnn() {
		return ann;
	}
	public int getYr() {
		return yr;
	}
	public String getIns() {
		return ins;
	}
}
