package exam01;

// 함수형 인터페이스
@FunctionalInterface
interface Calc {

	int plus(int num1, int num2);
}

// 이름을 받으면, ~"님" 글자를 반환
// sirName() 메소드, 이름을 매개변수로 받음

@FunctionalInterface
interface SirName {
	String getName(String name);
}

public class TestCalculator {

	public static void main(String[] args) {

		// 인터페이스 객체명 = (매개변수) -> {}; // 기능정의
		// 호출 : 객체명.메서드명(매개변수);
		Calc calc = (num1, num2) -> num1 + num2;
		int result = calc.plus(1, 2);
		System.out.println("num1+num2 = " + result);

		// 매개변수 1개이면 () 괄호 생략 가능
		SirName sirname = (name) -> name + "님";
		String sayName = sirname.getName("최진우");
		System.out.println(sayName);
	}

	// filter - 조건에 맞는 데이터만 걸러낸다.
	// map - 내가 적용하고 하는 데이터로 변환한다 -> 새로운 목록 생성
	// sum, count, forEach 연산을 추가적으로 수행해줘야한다.
}
