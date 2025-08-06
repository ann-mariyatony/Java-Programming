class Book{
	String title;
	String author;
	final int bookID;
	static int bookCounter=1000;
	final static String  LIBRARY_NAME="Central Library";
Book(){
	title=("Demo");
    author=("Ann");
    bookID=bookCounter++;
    }
Book(String title,String author){
	this.title=title;
	this.author=author;
	bookID=bookCounter++;
}
 public void displayinfo(){
	System.out.println(" Book Title:"+title);
	System.out.println("Author:"+author);
	System.out.println("Book ID:"+bookID);
}
 public void displayinfo(boolean showLibrary) {
	 if(showLibrary) {
		 displayinfo();
		 System.out.println("Library Name:"+ LIBRARY_NAME);
	 }
 }
 public static void displayTotal() {
	 System.out.println("Total Books:"+ (bookCounter-1000));
 }

public class BookInfo {
   public static void main(String[] args) {
   Book book=new Book();
   book.displayinfo(true);
   book.displayinfo();
     Book.displayTotal();
}
}
}
