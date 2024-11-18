package exam05;

public class TestMyclass {

	public static void main(String[] args) {
		
		Myclass me = new Myclass();
		
		X xClass = me;
		
		xClass.x();
		
		Y yClass = me;
		yClass.y();
		
		Myclass iClass = me;
		iClass.x();
		iClass.y();
		iClass.myMethod();
		
	}

}
