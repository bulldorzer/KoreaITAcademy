package array;

public class TestObject {
	public static void main(String[] args) {
		ObjectArray list = new ObjectArray(10);
		
		
		list.add(new Movie("기생충","봉준호"));
		list.add(new Music("DRIP","베이비몬스터"));
		list.add(new Book("해리포터","조핸롤링k"));
		list.printAll();
		
	}
}
