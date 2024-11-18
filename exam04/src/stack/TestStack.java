package stack;

public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack stack = new MyStack();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		stack.printAll();
		System.out.println("---------------------");
		System.out.println("top 요소"+stack.pop());
		System.out.println("---------------------");
		stack.printAll();
		System.out.println("---------------------");
		System.out.println("현재 개수"+stack.size());
		System.out.println("---------------------");
		System.out.println("현재 개수"+stack.peek());
	}

}
