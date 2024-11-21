package exam01;

public class TestOuterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();

		Runnable runner = outer.getRunnable(1);
		runner.run();
	}

}
