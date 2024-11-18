package exam02;

import array.MyArray;

public class TestArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArray myarray = new MyArray();
		
		myarray.add(10);
		myarray.add(20);
		myarray.add(30);
		myarray.add(40);
		myarray.add(50);
		
		myarray.insert(2, 100);
		myarray.printAll();
		
		myarray.remove(2);
		myarray.printAll();
	}

}
