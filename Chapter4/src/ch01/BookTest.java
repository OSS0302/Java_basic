package ch01;

class Book{
	private String title;
	private String author;
	
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	
}

public class BookTest {
	public static void main(String[] args) {
		Book book = new Book("토지1","박경리");
		System.out.println(book);
	}

}
