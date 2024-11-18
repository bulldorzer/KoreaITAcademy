package Test01;

import java.util.ArrayList;

public class TestToy {
	public static void main(String[] args) {
		
		ToyFactory toyF = ToyFactory.instance();
		
		ArrayList<Toy> list = new ArrayList<Toy>();
		list.add(toyF.createToy(1));
		list.add(toyF.createToy(2));
		list.add(toyF.createToy(3));
		for(Toy toy : list) {
			System.out.print(toy);
		}
	}
}
