package linkedList;

//LinkedList 특징
//동일한 데이터 타입을 순서에 따라 관리하는 자료 구조
//자료를 저장하는 노드(Item)에는 자료와 다음 요소를 가리키는 링크(포인터)가 있음
//자료가 추가 될때 노드(Item) 만큼 메모리를 할당 받고
//이전 노드 (Item)의 링크로 연결함 (정해진 크기가 없음)
//연결 리스트의 i 번째 요소가 찾는게 걸리는 시간은 요소의 개수에 비례
//->갯수가 많을수록 느려짐

//링크드 리스트 - 문자열
public class Item {
	
	private String data;
	public Item next; // 다음 노드(아이템)를 가리키는 주소값
	
	public Item() {
		this.data = null;
		this.next = null;
	}
	public Item(String data) {
		this.data = data;
		this.next = null;
	}
	public Item(String data, Item next) {
		this.data = data;
		this.next = next;
	}
	public String getData() {
		return data;
	}
	
	
}
