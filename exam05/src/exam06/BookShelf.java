package exam06;

public class BookShelf extends Shelf implements Queue{

	// Queue 구조 -> FIFO 구조
	
	@Override
	public void enQueue(String title) {
		shelf.add(title); // 마지막에 추가 , arrayList 메소드
	}

	@Override
	public String deQueue() {
		// 삭제된 값을 반환
		return shelf.remove(0); // 맨 앞에 있는 데이터만 삭제 arrayList 메소드
	}

	@Override
	public int size() {
		return shelf.size(); // arrayList 메소드
	}

}
