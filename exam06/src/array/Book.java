package array;

public class Book {
	
	String title;
	String author;
	
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public Book() {
		super();
	}
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book - title=" + title + ", author=" + author;
	}
	
	
	
}
