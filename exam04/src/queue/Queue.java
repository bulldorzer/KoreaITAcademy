package queue;

import linkedList.Item;
import linkedList.ItemList;

public class Queue extends ItemList implements IQueue{

	Item front; // 맨 앞에 지점
	Item rear; // 마지막 지점
	
	
	
	public Queue() {
		front = null; // 첫항목
		rear = null; // 마지막항목
	}

	
	
	@Override // 값 추가
	public void enQueue(String data) {
		Item newItem;
		if (isEmpty()) {
			newItem = add(data);
			front = newItem;
			rear = newItem;
		}else {
			newItem = add(data);
			rear = newItem; // 마지막 지점으로 지정
		}
	}

	@Override // 값 삭제
	public String deQueue() {
		
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return null;
		}
		String data = front.getData(); // 삭제데이터 백업
		
		front = front.next; // 링크변경
		
		if (front == null) { // 마지막항목
			rear = null;
		}
		return data ; // 리턴
	}
	
	@Override
	public void printAll() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return ;
		}
		Item temp = front;
		System.out.println("front"+front);
		while (temp !=null) {
			System.out.println(temp.getData()+", ");
			temp = temp.next;
		}
		System.out.println("");
	}

}
