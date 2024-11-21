package exam01;

public class TestStaticClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 외부 클래스 생성X
		// 외부, 내부클래스 변수 = new 외부.내부클래스();
		// 내부클래스의 객체 = sIn
		OutClass.InStaticClass sIn = new OutClass.InStaticClass();

		System.out.println("정적 내부 클래스 - 일반 메서드 호출");
		sIn.inTest();

		System.out.println("\n정적 내부 클래스 - 스태틱 메서드 호출");
		// 외부.내부클래스.메서드()
		OutClass.InStaticClass.sTest();
	}

}
