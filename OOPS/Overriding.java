package OOPS;
class Fruit{
	String name;
	String taste;
	String size;
	public Fruit(String name,String taste,String size)
	{
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	public void eat() {
		System.out.println("Name:"+name);
		System.out.println("Taste:"+taste);
	}
}
class Apple extends Fruit{
	public Apple(String name, String taste, String size) {
		super(name, taste, size);
		// TODO Auto-generated constructor stub
	}

	public void eat() {
		System.out.println("Name:"+name);
		System.out.println("Taste:"+taste+" Apple class");
	}
}
class Orange extends Fruit{

	public Orange(String name, String taste, String size) {
		super(name, taste, size);
		// TODO Auto-generated constructor stub
	}
	public void eat() {
		System.out.println("Name:"+name);
		System.out.println("Taste:"+taste+" Orange class");
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit a=new Fruit("Fruit","Bitter","less");
		Apple b=new Apple("Apple","Sweet","Medium");
		Orange c=new Orange("Orange","Sweet","Medium");
		a.eat();
		b.eat();
		c.eat();
	}

}
