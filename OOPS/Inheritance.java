package OOPS;
class Animal{
	public void eat() {
		System.out.println("Animal eats");
	}
	public void sleep() {
		System.out.println("Animal sleeps");
	}
}
class Bird extends Animal{
	public void eat() {
		System.out.println("Bird eats");
	}
	public void sleep() {
		System.out.println("Bird sleeps");
	}
	public void fly() {
		System.out.println("Bird flies");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		Bird b=new Bird();
		a.eat();
		a.sleep();
		b.eat();
		b.sleep();
		b.fly();
	}

}
