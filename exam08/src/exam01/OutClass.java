package exam01;

public class OutClass {
	private int num = 10; // 객체 생성하지 않는다면 인스턴스변수를 가져다 사용할수 없음
	private static int sNum = 20;
	private InClass inclass; // 내부 클래스 객체의 변수

	public OutClass() {
		inclass = new InClass(); // 내부 클래스의 객체 생성
	}

	public void usingClass() {
		inclass.inTest();
	}

	class InClass {
		int inNum = 100;

		void inTest() {
			// 외부 클래스 객체 생성을 안하기 때문에 num에 접근시도하면 없을수 있음
			System.out.println("외부클래스 num = " + num);
			System.out.println("외부클래스 sNum = " + sNum);
			System.out.println("내부클래스 inNum = " + inNum);
		}

	}

	// static 내부 클래스
	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 200;

		void inTest() { // 정적 클래스의 일반 메서드
//			num+=10;// 외부 클래스의 인스턴스 변수는 사용할수 없음 
//			외부 클래스 객체 생성을 안하기 때문에, num에 접근시도하면 없을 수 있다.
			System.out.println("내부 정적 inNum = " + inNum);
			System.out.println("내부 정적 sInNum  = " + sInNum);
			System.out.println("외부클래스 sNum = " + sNum);
		}

		static void sTest() {
			// num += 10; // 외부 클래스의 인스턴스 변수는 사용할수 없음
			// inNum += 10; // 내부 클래스의 인스턴스 변수는 사용할 수 없음
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
		}
	}
}
