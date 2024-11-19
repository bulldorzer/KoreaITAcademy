package generic;

import java.util.ArrayList;
import java.util.List;

import array.Book;

public class Test01 {
	public static void main(String[] args) {
//		자바에서 미리 만들어둔 배열스타일의 자료구조
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("해리포터1","조앤롤링k"));
		library.add(new Book("해리포터2","조앤롤링k"));
		library.add(new Book("해리포터3","조앤롤링k"));
		
		for(Book book : library) {
			System.out.println(book);
		}
		
		FruitBox<String> f1 = new FruitBox<>();
		f1.add("pitch");
		FruitBox<Integer> f2 = new FruitBox<>();
		f2.add(123);
		FruitBox<Double> f3 = new FruitBox<>();
		f3.add(3.14);
		
		System.out.println(f1.get());
		System.out.println(f2.get());
		System.out.println(f3.get());
	}
}

class FruitBox<T>{
	List<T> fruits = new ArrayList<>();
	
	public void add(T fruit) {
		fruits.add(fruit);
	}
	
	public T get() {
		return fruits.get(0);
	}
}
