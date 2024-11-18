package exam06;

import java.util.ArrayList;

// 상속과 인터페이스 둘다 사용하기
public class Shelf {
	
//	ArrayList : 배열과 같은 구조의 리스트
//	자바에서 제공하는 자료구조 중 하나
	
	protected ArrayList<String> shelf;

	public ArrayList<String> getShelf() {
		return shelf;
	}
	public void setShelf(ArrayList<String> shelf) {
		this.shelf = shelf;
	}
	
	public Shelf() {
		shelf = new ArrayList<String>();
	}

	
	
}
