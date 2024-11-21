package exam01;

public class Outer {

	int outNum = 100;
	static int sNum = 200;

	// 메서드
	public Runnable getRunnable(int i) {
		int num = 100; // 지역변수 -> 상수로 바뀜

		class MyRunnable implements Runnable {
			int localNum = 10;

			public void run() {

				// 에러발생
				// 지역변수 -> 상수 바뀜
				// 매개변수 -> 상수 바뀜
//				num = 200;
//				i = 200;

				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);

				System.out.println("outNum = " + outNum);
				System.out.println("Outer.sNum = " + Outer.sNum);
			}
		}

		return new MyRunnable();
	}
}
