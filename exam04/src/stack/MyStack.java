package stack;

import array.MyArray;

public class MyStack {
	
	int top; // =count
	
	MyArray stack; // import 해야함
	
	public MyStack() {
		top = 0; // 카운트역할
		stack = new MyArray(); // add, remove, insert, printAll 메소드가 있음
	}
	
	public MyStack(int size) {
		stack = new MyArray(size);
	}
	
	// add = push
	public void push(int data) {
		
		if (isFull()) {
			System.out.println("더 이상 저장할수 없음.");
			return;
		}
		
		stack.add(data);
		top++;
	}
	
	// remove = pop
	public int pop() {
		if (top == 0) {
			System.out.println("비어 있음요.");
			return stack.ERROR_NUM;
		}
		return stack.remove(--top); // 갯수를 줄이고 삭제 top값이 변함
	}
	
	public int peek() {
		if (top == 0) {
			System.out.println("비어 있음요.");
			return stack.ERROR_NUM;
		}
		return stack.get(top-1); // 마지막 인덱스 값 확인 top 값이 변하지 않음
	}
	
	public int size() {
		return top;
	}
	
	public boolean isFull() {
		return (top == stack.ARR_SIZE)?true:false;
	}
	
	public void printAll() {
		stack.printAll();
	}
}
