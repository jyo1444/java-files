package OOPS;
class Author
{
	private String name;
	private String email;
	private char gender;
	public Author(String name,String email,char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	//Methods for Author class
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public char getGender() {
		return gender;
	}
}
class Book{
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	public Book(String name,Author author,double price,int qtyInStock) {
		this.name=name;
		this.author=author;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	//Methods for Book class
	public String getName() {
		return name;
	}
	public Author getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public int getqtyInStock() {
		return qtyInStock;
	}
}
public class Books {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author author=new Author("jyo","jyo@gmail.com",'M');
		Book book=new Book("Jyo Bio",author,20.0,200);
		 System.out.println("Book Details:");
	        System.out.println("Title: " + book.getName());
	        System.out.println("Author: " + book.getAuthor().getName());
	        System.out.println("Email: " + book.getAuthor().getEmail());
	        System.out.println("Gender: " + book.getAuthor().getGender());
	        System.out.println("Price: $" + book.getPrice());
	        System.out.println("Quantity in Stock: " + book.getqtyInStock());

	}

}
