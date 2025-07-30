package ann;
class Book{
	String title;
	String author;
	double price;
	int quantity;
	double totalValue;
	Book(String title,String author,double price,int quantity){
		this.title=title;
		this.author=author;
		this.price=price;
		this.quantity=quantity;
	}
	public void calaculateTotalValue() {
		totalValue=(price*quantity);
	}
	public void displayDetails() {
		System.out.println("Title:"+ title);
		System.out.println("Author:"+ author);
		System.out.println("Price:"+price);
		System.out.println("Quantity:"+quantity);
		System.out.println("Total Value:"+ totalValue);
}
public class BookStore {
	public static void main(String[] args) {
		 Book b1=new Book("dora","buji",209,3);
		 b1.calaculateTotalValue();
		 b1.displayDetails();
		 Book b2=new Book("Micky","bukki",204,2);
		 b2.calaculateTotalValue();
		 b2.displayDetails();
	}
}
}
	
