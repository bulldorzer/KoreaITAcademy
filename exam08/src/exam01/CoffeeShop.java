package exam01;

// 클래스 내부에 interface 만드는 경우 public 붙이지 않음
interface Barista {
	void makeCoffe();
}

// 인터페이스 -> 구현클래스 -> 객체생성 -> 객체를 통해 호출 (기본프레임)
public class CoffeeShop {
	public static void main(String[] args) {

		Barista b = new Barista() {
			@Override
			public void makeCoffe() {
				System.out.println("아이스 아메리카노 만듦");
			}
		};

		b.makeCoffe();
		orderCoffe(b);
	}

	// static 메서드
	public static void orderCoffe(Barista barista) {

	}
}
