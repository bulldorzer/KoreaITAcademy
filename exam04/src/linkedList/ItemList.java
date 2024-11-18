package linkedList;

public class ItemList {
	private Item head; // 시작
	int count;
	
	final static int ERROR_NUM = -9999;
	
	public ItemList() {
		head = null;
		count = 0;
	}
	
	public Item add (String data) {
		
		Item newItem = null;
		
		if (head == null) { // head가 비어있을때 데이터저장
			newItem = new Item(data);
			head = newItem;
		}else {
			
			newItem = new Item(data);
			Item temp = head; // 시작 주소 temp에 복사
			
			while(temp.next != null) {
				// null이면 좋료 (next가 null값이 아닐때까지 반복한다)
				temp = temp.next;
			}
			temp.next = newItem; // null인 부분을 찾으면 새로 생성된 객체 주소 연결
				
		}
		count++;
		return newItem;
	}
	
	public Item insert(int index, String data) {
		Item temp = head;
		Item newItem = new Item(data);
		
		// 인덱스 번호 오류
		if (index>count || index<0) {
			System.out.println("인덱스번호 오류");
			return null; // 반환 객체 없을시
		}
		if (index == 0) {
			System.out.println(head);
			newItem.next = head;
			head = newItem;
		}else {
			Item prev = null; // 이전위치를 저장하는 변수
			for(int i =0; i<index;i++) {
				prev = temp;
				temp = temp.next;
			}
			
			newItem.next = prev.next;
			prev.next = newItem;
		}
		count++;
		return newItem;
	}
	
	public Item remove(int index) { // 링크를 뺴는게 삭제
		Item temp = head;
		if (index>=count) {
			System.out.println("삭제할 위치 오류");
			return null;
		}
		
		if (index == 0) {
			head = temp.next;
		}else {
			
			Item prev = null; // 이전위치를 저장하는 변수
			for(int i =0; i<index;i++) {
				prev = temp;
				temp = temp.next;
			}
			prev.next = temp.next;
		}
		
		count--;
		System.out.println(index+"번째 항목 삭제");
		return temp;  // 삭제된 항목 리턴
	}
	
	public Item getItem(int index) {
		Item temp = head;
		
		if (index >= count) {
			System.out.println("검색 위치 오류 현재 리스트의 개수는 "+ count + "개");
			return null;
		}
		
		if (index == 0) {
			return head;
		}
		
		for (int i = 0; i < index; i++) {
			temp = temp.next; // 다음링크로 이동
		}
		return temp;
	}
	
	public String getElement(int index) {
		Item temp = head;
		
		if (index >= count) {
			System.out.println("검색 위치 오류 현재 리스트의 개수는 "+ count + "개");
			return null;
		}
		
		if (index == 0) {
			return head.getData();
		}
		
		for (int i = 0; i < index; i++) {
			temp = temp.next; // ekdmafldzmfh dlehd
		}
		return temp.getData();
	}
	
	public int size() {
		return count;
	}
	
	public void printAll() {
		if (count == 0) {
			System.out.println("출력할 내용 없음");
			return;
		}
		Item temp = head;
		
		while (temp!=null) {
			System.out.print(temp.getData());
			
			temp = temp.next; // 다음링크 이동
			
			if (temp!=null) {
				System.out.print("->");
			}
		}
		
		System.out.println("\n--------------");
		
	}
	
	public boolean isEmpty() {
		return (head == null) ? true : false;
	}
	
}
