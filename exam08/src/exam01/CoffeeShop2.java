package exam01;

// 클래스 내부에 interface 만드는 경우 public 붙이지 않음

// 람다식을 위한 인터페이스는 함수형 인터페이스
//애노테이션붙이기
//추상메소드 1개만 만들기
@FunctionalInterface
interface Baristar {
//	void makeCoffe(String menu);
	String makeCoffe(String menu);
}

// 인터페이스 -> 구현클래스 -> 객체생성 -> 객체를 통해 호출 (기본프레임)
public class CoffeeShop2 {
	public static void main(String[] args) {

//		Baristar b = new Barista() {
//			@Override
//			public void makeCoffe(String menu) {
//				System.out.println(menu + " 만듦");
//			}
//		};

		// 중괄호 생략 가능한 경우
		// 실행할 문장 1줄일때
		// return문 만 있을때 - return과 함께 {} 생략 가능
//		Baristar baristar = (menu) -> {
//			System.out.println(menu + " 만듦");
//		};

//		Baristar baristar = (menu) -> {
//			return menu + " 제조";
//		};

		Baristar baristar = (menu) -> menu + " 제조";

		String str = baristar.makeCoffe("오곡라떼");
		System.out.println(str);
	}

	// static 메서드
	public static void orderCoffe(Barista barista) {

	}
}
