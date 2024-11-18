package linkedList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ItemList list = new ItemList();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.printAll();
		
		list.insert(2, "D");
		list.printAll();
		
		list.remove(0);
		list.printAll();
		
		list.remove(1);
		list.printAll();
	}

}
