package exam01;

public class TestInnerClass {

	public static void main(String[] args) {

		// 외부 클래스 객체 선언
		// 내부 클래스 객체선언을 위해 외부 클래스를 반드시 객체화시켜야함
		// 인스턴스 내부 클래스
		OutClass out = new OutClass();
		out.usingClass();

		// 내부클래스 객체선언 - 외부클래스.내부클래스 객체명 = 외부객체.new 내부클래스()
		// 외부 클래스의 객체를 반드시 선언후 그 객체를 통해서 내부클래스 객체를 만든다
		OutClass.InClass in = out.new InClass();
		in.inTest();
	}

}
