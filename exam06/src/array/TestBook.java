package array;

public class TestBook {
	public static void main(String[] args) {
		BookArray ba = new BookArray(10);
		
		
		ba.add(new Book("해리포터1","조핸롤링k"));
		ba.add(new Book("해리포터2","조핸롤링k"));
		ba.add(new Book("해리포터3","조핸롤링k"));
		ba.printAll();
		
		ba.remove(1);
		ba.add(new Book("해리포터4","조핸롤링k"));
		ba.printAll();
		
		ba.insert(1, new Book("해리포터2","조핸롤링k"));
		ba.printAll();
	}
}
