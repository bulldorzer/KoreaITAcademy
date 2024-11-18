package exam04;

public class Customer implements Sell,Buy{

	@Override
	public void buy() {
		System.out.println("Customer buy");
	}

	@Override
	public void sell() {
		System.out.println("Customer sell");
	}

	@Override
	public void order() {
		// 디폴트 메서드 중복 -> 구현 클래스 재정의
		System.out.println("customer order");
	}

}
